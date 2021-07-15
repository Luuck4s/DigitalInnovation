package ParadigmaFuncional.interfacesInternas;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        // Function <[Tipo do parâmetro], [Tipo do +Retorno]> = parâmetro -> logica;
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();

        Function<String, Integer> converteStringEmNumeroESomaCinco = valor -> Integer.parseInt(valor) + 5;

        // Para executar usamos o .apply
        System.out.println(retornaNomeAoContrario.apply("Lucas"));
        System.out.println(converteStringEmNumeroESomaCinco.apply("8"));
    }
}
