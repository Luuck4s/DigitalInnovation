package ParadigmaFuncional;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo sum = (a, b) -> a + b;
        Calculo sub = (a, b) -> a - b;
        Calculo div = (a, b) -> a / b;
        Calculo mult = (a, b) -> a * b;

        System.out.println(executarOperacao(sum, 1, 4));
        System.out.println(executarOperacao(sub, 1, 4));
        System.out.println(executarOperacao(div, 10, 2));
        System.out.println(executarOperacao(mult, 1, 4));

    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);
    }
}

interface Calculo {
    public int calcular(int a, int b);
}
