package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        // mantêm a ordem que você insere os elementos
        // porém perde em perfomance
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println("Sequencia: " + sequenciaNumerica);

        sequenciaNumerica.remove(4);

        System.out.println("Sequencia: " + sequenciaNumerica);

        System.out.println("Size: " + sequenciaNumerica.size());

        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        System.out.println("\n -- Iterator while --\n");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\n -- Iterator foreach --\n");
        for(Integer numero:sequenciaNumerica){
            System.out.println(numero);
        }
    }
}
