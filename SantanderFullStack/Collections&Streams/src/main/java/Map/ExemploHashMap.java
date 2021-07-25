package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        // Informamos dois tipos para indicar que é
        // 1 da chave e o outro do valor armazenado
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);

        System.out.println("Campeoes Mundial: " + campeoesMundialFifa);

        // Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println("Campeoes Mundial: " + campeoesMundialFifa);

        System.out.println("Value Argentina: " + campeoesMundialFifa.get("Argentina"));

        System.out.println("Existe França: " + campeoesMundialFifa.containsKey("França"));
        System.out.println("Existe Brasil: " + campeoesMundialFifa.containsKey("Brasil"));

        campeoesMundialFifa.remove("Alemanha");

        System.out.println("Campeoes Mundial: " + campeoesMundialFifa);

        System.out.println("Size: " + campeoesMundialFifa.size());

        System.out.println("\n-- Navegando pelos registros --");
        for (Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\n-- Navegando pelos registros (Outra forma) --");
        for(String key:campeoesMundialFifa.keySet()){
            System.out.println(key + " - " + campeoesMundialFifa.get(key));
        }
    }
}
