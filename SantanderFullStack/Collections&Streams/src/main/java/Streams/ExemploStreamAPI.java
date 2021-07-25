package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Lucas");
        estudantes.add("João");
        estudantes.add("Amanda");
        estudantes.add("Jorge");

        System.out.println("Contagem: " + estudantes.stream().count());

        System.out.println("\nMaior número de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor número de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("\n3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("\n-- Mapeando com Foreach -- ");
        estudantes.stream().forEach(System.out::println);
    }
}
