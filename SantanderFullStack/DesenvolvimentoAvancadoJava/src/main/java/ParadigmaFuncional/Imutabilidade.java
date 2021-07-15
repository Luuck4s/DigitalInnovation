package ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;

        // O valor não é modificado pela função lambda
        UnaryOperator<Integer> retornarDobro = v -> v * 2;

        System.out.println(retornarDobro.apply(valor));
        System.out.println(valor); // Valor não foi alterado
    }
}
