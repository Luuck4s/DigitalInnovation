package Thread;

import java.util.stream.IntStream;

public class PararelStreamExemplo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorial(num));
        long end = System.currentTimeMillis();

        System.out.println("(Serial) Tempo de execução: " + (end - start));


        /**
         * É interessante utilizar o pararel Stream quando
         * temos um grande número de objetos que não dependem
         * um do outro
         */
        start = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorial(num));
        end = System.currentTimeMillis();

        System.out.println("(Parallel)Tempo de execução: " + (end - start));


    }

    public static long fatorial(long num){
        long fat = 1;

        for(long i = 2; i <= num; i++){
            fat *= i;
        }

        return fat;
    }
}
