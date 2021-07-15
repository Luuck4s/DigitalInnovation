package ParadigmaFuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Oliveira", "Lucas", "Java"};
        Integer[] numeros = {1,2,3,4,5};

        imprimirNomesFiltrados("Lucas", nomes);

        System.out.println("\nTodos os nomes\n");

        imprimirTodosNomes(nomes);

        System.out.println("\nO Dobro de cada número\n");

        imprimirODobroDeCadaItem(numeros);


        // Outra forma de chamar a api de Stream
        System.out.println("\n");
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Gerente");
        profissoes.add("QA");

        profissoes.forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String filtro, String... nomes){
        String result = Stream.of(nomes)
                .filter(nome -> nome.equals(filtro))
                .collect(Collectors.joining());

        System.out.println(result);

    }

    // ... significa array, mesma coisa de passar []
    public static void imprimirTodosNomes(String... nomes){
        Stream.of(nomes).forEach(System.out::println);
    }

    public static void imprimirODobroDeCadaItem(Integer... numeros){

        Stream.of(numeros)
                .map(numero -> numero * 2)
                .forEach(System.out::println);
    }
}
