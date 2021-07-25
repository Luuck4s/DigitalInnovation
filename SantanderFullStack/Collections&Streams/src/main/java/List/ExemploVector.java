package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        // Adiciona item ao Vector
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handbol");

        // Recebe o index e coloca um novo valor no lugar
        esportes.set(2, "Ping Pong");

        // Recebe o index e remove o item
        esportes.remove(2);

        // Recebe o index e retorna o que tem
        System.out.println(esportes.get(0));

        System.out.println("\n*Percorrendo o Vector (For each)*\n");

        for(String esporte:esportes){
            System.out.println(esporte);
        }
    }
}
