package metodos;

import java.util.Optional;

// orElseThrow() Lanza una excepción si el Optional está vacío.
public class orElseThrow {
    public static void main(String[] args) {
        System.out.println("Uso del orElseThrow()");
        Optional<Integer> numerOptional = Optional.ofNullable(null);
        int valor = numerOptional.orElseThrow(() -> new IllegalArgumentException("Valor no Presente"));
        System.out.println("Resultado: " + valor);
    }
}
