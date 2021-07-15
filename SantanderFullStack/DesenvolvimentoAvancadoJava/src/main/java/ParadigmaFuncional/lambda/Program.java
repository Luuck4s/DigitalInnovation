package ParadigmaFuncional.lambda;


public class Program {
    public static void main(String[] args) {
        // Estrutura da lambda
        // InterfaceFuncional nomeVariavel = parametro -> logica

        // Usando a Lambda de maneira default
        Funcao gerarUmaSaida = valor -> valor;

        System.out.println(gerarUmaSaida.gerar("teste"));


        // Usando a Lambda com uma modificação
        Funcao gerarUmaSaidaModificada = valor -> "Lambda -> " + valor;

        System.out.println(gerarUmaSaidaModificada.gerar("teste"));


        // Como a interface tem retorno void posso colocar o sout
        Funcao1 funcao1 = valor -> System.out.println(valor);

        funcao1.gerar("João");


        // Quando necessitamos de mais de 1 linha dentro da logica abrimos chaves
        Funcao1 funcao1Modficada = valor -> {
            System.out.println(valor);
            System.out.println(valor);
        };

        funcao1Modficada.gerar("Lucas");

    }
}

/**
 * Interface funcional que por conta do @functionInterface
 * tem apenas um método abstrato
 */
@FunctionalInterface
interface  Funcao {
    String gerar(String valor);
}

interface Funcao1 {
    void gerar(String valor);
}
