package datas;

import java.time.LocalTime;

public class localTime {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        System.out.printf("Agora: %s\n", agora);

        agora = agora.plusHours(2);
        System.out.printf("2 horas no futuro: %s\n", agora);
    }
}
