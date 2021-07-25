package Optionals;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Valor opcional");

        System.out.println("IsPresent: " + optionalString.isPresent());
        System.out.println("IsEmpty: " + optionalString.isEmpty());

        optionalString.ifPresent(System.out::println);
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Valor não está presente"));
        optionalString.map((valor) -> valor.concat("****")).ifPresent(System.out::println);
    }
}
