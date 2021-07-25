package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        // Os elementos que estão dentro do treeSet são ordenados
        // de forma para serem acessados no estilo de árvore binária
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");

        System.out.println("Capitais: " + treeCapitais);

        System.out.println("First: " + treeCapitais.first());

        System.out.println("Last: " + treeCapitais.last());

        // Retorna a primeira capital abaixo na árvore da capital informada
        System.out.println("Lower: " + treeCapitais.lower("São Paulo"));

        // Retorna a primeira capital acima na árvore da capital informada
        System.out.println("higher: " + treeCapitais.higher("Curitiba"));

        // Retona a primeira capital no topo da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        // Retona a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();

        System.out.println("\n -- Iterator while --\n");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n -- Iterator foreach --\n");
        for(String capital:treeCapitais){
            System.out.println(capital);
        }
    }
}
