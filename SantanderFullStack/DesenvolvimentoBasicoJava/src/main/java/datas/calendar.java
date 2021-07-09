package datas;

import java.util.Calendar;

public class calendar {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println(agora);


        System.out.printf("\nA data de correta é %s\n", agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.printf("\n15 dias atrás é %s\n", agora.getTime());

        agora.add(Calendar.MONTH, 4);
        System.out.printf("\n4 meses depois é %s\n", agora.getTime());

        agora.add(Calendar.YEAR, 1);
        System.out.printf("\n1 ano depois é %s\n", agora.getTime());


        System.out.printf("\nData formatada %tc", agora.getTime());
        System.out.printf("\nData formatada %tF", agora.getTime());
        System.out.printf("\nData formatada %tD", agora.getTime());
        System.out.printf("\nData formatada %tr", agora.getTime());
        System.out.printf("\nData formatada %tT\n", agora.getTime());

        /**
         * As alterações que fazemos com são em cadeia então tiramos 15 dias
         * depois adicionamos 4 meses e depoisa adicionamos 1 ano
         */
    }
}
