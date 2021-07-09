package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat {
    public static void main(String[] args) {
        Date agora = new Date();

        // Usando o DateFormat
        /**
         *  Faz uma "instancia" do dateFormat passando o objeto de data
         *  para fazer as manipulações
         */

        String dateToSrt = DateFormat.getInstance().format(agora);

        System.out.println(dateToSrt);

        dateToSrt = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

        System.out.printf("Date To Srt: %s\n\n",dateToSrt);

        // Usando o Simple Date Format
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(agora);

        System.out.printf("Data Formatada: %s\n",dataFormatada);
    }
}
