package ParadigmaFuncional.interfacesInternas;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        // Forma generica de utilização
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello world");

        // Method Reference
        Consumer<String> imprimirUmaFrase2 = System.out::println;
        imprimirUmaFrase2.accept("Hello world");

    }
}
