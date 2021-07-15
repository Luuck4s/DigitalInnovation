package ParadigmaFuncional.interfacesInternas;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        // Suppliers não recebe parâmetros e só retorna algo
        Supplier<Pessoa> suppliers = Pessoa::new;

        // Utilizamos o .get para execução
        System.out.println(suppliers.get());
    }
}

class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Lucas";
        idade = 19;
    }

    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
