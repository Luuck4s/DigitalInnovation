package ParadigmaFuncional.interfacesInternas;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args) {
        // Predicate serve para realizar alguma operacão lógica e retornar uma boolean
        Predicate<String> estaVazio = String::isEmpty;

        // Utilizamos o .test para executar
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("AAAA"));
    }
}
