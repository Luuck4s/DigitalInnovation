package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Amanda");
        nomes.add("João");
        nomes.add("Pedro");

        System.out.println(nomes);

        // Ordenação simples
        Collections.sort(nomes);

        System.out.println(nomes);

        // Set recebe um indice e um valor para realizar a substituição
        nomes.set(3, "Pedro Alberto");

        System.out.println(nomes);

        // Recebe o indice do elemento a ser removido
        nomes.remove(3);
        // Ou pode receber o objeto que vai ser removido
        nomes.remove("João");

        System.out.println(nomes);

        // Retorna o indice do elemento na lista
        int posicao = nomes.indexOf("Lucas");
        System.out.println("Index do elemento Lucas: " + posicao);

        // Recebe um indice e retorna o valor
        String nome = nomes.get(1);
        System.out.println("O que tem na posição 1: " + nome);

        // Retorna o tamanho da lista
        int tamanho = nomes.size();

        System.out.println("Tamanho: "+ tamanho);

        // Retorna um boolean procurando o elemento passado
        boolean temLucas = nomes.contains("Lucas");
        System.out.println("Tem Lucas na lista: " + temLucas);

        // verifica se a lista tá vazia
        boolean listaVazia = nomes.isEmpty();
        System.out.println("Lista tá vazia: " + listaVazia);


        System.out.println("\n*Percorrendo a lista (For each)*\n");

        for (String item:nomes){
            System.out.println(item);
        }

        System.out.println("\n*Percorrendo a lista (Iterator)*\n");

        // Retorna o elementos
        Iterator<String> iterator =  nomes.iterator();

        // Retorna um booelan verificando se tem próximo item
        while(iterator.hasNext()){
            // Retorna o próximo item
            System.out.println(iterator.next());
        }
    }
}
