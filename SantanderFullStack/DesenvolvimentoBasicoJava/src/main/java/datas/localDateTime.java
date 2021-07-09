package datas;

import java.time.LocalDateTime;

public class localDateTime {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        System.out.printf("Agora: %s\n", agora);

        agora = agora.plusHours(2).plusDays(1);
        System.out.printf("Amanhã + 2 horas: %s\n", agora);
    }
}
