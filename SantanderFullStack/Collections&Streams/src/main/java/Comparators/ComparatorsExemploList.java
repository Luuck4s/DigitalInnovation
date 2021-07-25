package Comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExemploList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 20));
        estudantes.add(new Estudante("Lucas", 22));
        estudantes.add(new Estudante("João", 18));
        estudantes.add(new Estudante("Larissa", 21));
        estudantes.add(new Estudante("Amanda", 19));


        System.out.println("Ordem de inserção");
        System.out.println(estudantes + "\n");

        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println("Ordem natural dos números - idade");
        System.out.println(estudantes + "\n");

        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println("Ordem reversa dos números - idade");
        System.out.println(estudantes + "\n");

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("Ordem natural dos números - idade (Method reference)");
        System.out.println(estudantes + "\n");

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("Ordem reversa dos números - idade (Method reference)");
        System.out.println(estudantes + "\n");

        Collections.sort(estudantes);
        System.out.println("Ordem natural dos números - idade (interface comparable)");
        System.out.println(estudantes + "\n");

        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator());
        System.out.println("Ordem reversa dos números - idade (interface comparator)");
        System.out.println(estudantes + "\n");
    }
}
