package datas;

import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        System.out.printf("Hoje: %s\n", hoje);

        hoje = hoje.minusDays(1);
        System.out.printf("Ontem: %s\n", hoje);
    }
}
