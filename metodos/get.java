package metodos;

import java.util.Optional;

public class get {
    public static void main(String[] args) {
        System.out.println("Uso del get()");
        Optional<String> miOptional = Optional.of("admin");
        System.out.println("Valor: " + miOptional.get());
        System.out.println("_________________");
    }
}
