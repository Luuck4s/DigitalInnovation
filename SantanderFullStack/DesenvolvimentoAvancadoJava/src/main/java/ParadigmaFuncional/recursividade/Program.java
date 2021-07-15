package ParadigmaFuncional.recursividade;

import java.util.HashMap;
import java.util.Map;

public class Program {

    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {

        long I = System.nanoTime();
        fatorial(15);
        long F = System.nanoTime();
        System.out.println("Recursividade Padrão: " + (F - I));

        I = System.nanoTime();
        fatorial(15);
        F = System.nanoTime();
        System.out.println("Recursividade Padrão 2 chamada: " + (F - I));

        System.out.println("\n");

        I = System.nanoTime();
        fatorialTailCall(15, 1);
        F = System.nanoTime();
        System.out.println("Recursividade Tail Call: " + (F - I));
        I = System.nanoTime();
        fatorialTailCall(15, 1);
        F = System.nanoTime();
        System.out.println("Recursividade Tail Call 2 chamada: " + (F - I));

        System.out.println("\n");

        I = System.nanoTime();
        fatorialComMemorization(15);
        F = System.nanoTime();
        System.out.println("Recursividade Memorization: " + (F - I));

        I = System.nanoTime();
        fatorialComMemorization(15);
        F = System.nanoTime();
        System.out.println("Recursividade Memorization 2 Chamada: " + (F - I));
    }

    public static int fatorial (int valor){
        if (valor == 1){
            return valor;
        }else {
            return valor * fatorial(valor - 1);
        }
    }

    public static int fatorialTailCall (int valor, int numero){
        if (valor == 0){
            return numero;
        }
        return fatorialTailCall(valor - 1, numero * valor);
    }

    public static int fatorialComMemorization (Integer valor){
        if(valor == 1){
            return valor;
        }else {
            if(MAPA_FATORIAL.containsKey(valor)){
                return MAPA_FATORIAL.get(valor);
            }else {
                Integer resultado = valor * fatorialComMemorization(valor -1);
                MAPA_FATORIAL.put(valor, resultado);
                return resultado;
            }
        }
    }
}
