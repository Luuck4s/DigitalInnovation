package Map;

import java.util.Iterator;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeCapitais = new TreeMap<>();

        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianópolis");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");

        System.out.println("Capitais: " + treeCapitais);

        System.out.println("First: " + treeCapitais.firstKey());

        System.out.println("Last: " + treeCapitais.lastKey());

        // Retorna a primeira capital abaixo na árvore da capital informada
        System.out.println("Lower: " + treeCapitais.lowerKey("SP"));

        // Retorna a primeira capital acima na árvore da capital informada
        System.out.println("higher: " + treeCapitais.higherKey("RS"));

        System.out.println("Capitais: " + treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();

        System.out.println("\n-- Navegando pelos registros (while) --");
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key + " - " + treeCapitais.get(key));
        }

        System.out.println("\n-- Navegando pelos registros (Foreach) --");
        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " - " + treeCapitais.get(capital));
        }
    }
}
