package exceptions;

public class Program {

    public static void main(String[] args) {

        // Capturando uma exception de erro aritmético
        try{
            var div = 2 / 0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }

        // Capturando um erro genérico
        // O erro é estourado porém não temos tanto controle de qual erro foi
        try{
            var div = 5 / 0;
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
