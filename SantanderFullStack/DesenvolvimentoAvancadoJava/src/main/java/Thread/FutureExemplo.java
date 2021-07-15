package Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    private static final ExecutorService threadPai = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());

        List<? extends Future<String>> collect = new CopyOnWriteArrayList<>(casa.obterAFazeresDoComodo()
                .stream()
                .map(atividade -> threadPai.submit(() -> {
                        try{
                            return atividade.realizar();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        return null;
                    })
                )
                .collect(Collectors.toList()));

        while(true){
            int numeroDeAtividadesRealizadas = 0;

            for(Future<?> futuro: collect){
                if(futuro.isDone()){
                    try{
                        System.out.printf("\nParabens você terminou: %s \n\n", futuro.get());
                        collect.remove(futuro);
                    }catch (InterruptedException | ExecutionException e){
                        e.printStackTrace();
                    }

                }else {
                    numeroDeAtividadesRealizadas++;
                }
            }

            if(collect.stream().allMatch(Future::isDone)){
                break;
            }

            System.out.println("Número de atividades não finalizadas: " + numeroDeAtividadesRealizadas);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        threadPai.shutdown();
    }
}

class Casa {

    private List<Comodo> comodos;

    Casa(Comodo... comodos) {
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAFazeresDoComodo() {
        return this.comodos.stream().map(Comodo::obterAFazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (total, atividades) -> {
                    total.addAll(atividades);
                    return total;
                });
    }
}

interface Atividade {
    String realizar() throws InterruptedException;
}

abstract class Comodo {
    abstract List<Atividade> obterAFazeresDoComodo();
}

class Quarto extends Comodo {
    List<Atividade> obterAFazeresDoComodo() {
        return Arrays.asList(
                this::getArrumarACama,
                this::varrerQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String getArrumarACama() throws InterruptedException {
        Thread.sleep(5000);
        return "arrumar a cama";
    }

    private String varrerQuarto() throws InterruptedException {
        Thread.sleep(7000);
        return "varrer quarto";
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(2000);
        return "arrumar o guarda roupa";
    }
}


