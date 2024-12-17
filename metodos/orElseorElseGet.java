package metodos;

import java.util.Optional;

public class orElseorElseGet {
    public static void main(String[] args) {
        System.out.println("Uso del orElse() y orElseGet()");
        Optional<String> miOptional = Optional.ofNullable(null);
        // con orElse
        System.out.println("Valor del Optional: " + miOptional);
        String resultado = miOptional.orElse("Valor por defecto.");
        System.out.println("Valor del Optional: " + resultado);
        System.out.println("____________________");

        // con orElseGet
        String resultado02 = miOptional.orElseGet(() -> "Generado Dinamicamente");
        System.out.println("Valor del Optional: " + resultado02);
        System.out.println("____________________");
    }
}
