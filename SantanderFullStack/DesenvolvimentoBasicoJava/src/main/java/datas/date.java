package datas;

import java.util.Date;

public class date {
    public static void main(String[] args) {

        // Data sem construtor
        Date data = new Date();
        System.out.println(data);

        // Data com construtor passando o número em float
        Date novaData = new Date(System.currentTimeMillis());
        System.out.println(novaData);

        // Métodos úteis
        System.out.println("\n\nMÉTODOS DATE\n");

        // Comparação de datas
        Date dataPassado = new Date(1513124887691L);
        Date dataFuturo = new Date(1613124887691L);

        System.out.printf("Data passado é maior que data futuro: %b\n",dataPassado.after(dataFuturo));
        System.out.printf("Data passado é menor que data futuro: %b\n",dataPassado.before(dataFuturo));

        System.out.printf("\nGet time data passado: %s\n", dataPassado.getTime());

        System.out.printf("\nTo instant data passado: %s\n", dataPassado.toInstant());
    }
}
