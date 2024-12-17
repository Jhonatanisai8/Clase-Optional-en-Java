package metodos;

import java.util.Optional;

// flatMap() Similar a map, pero la función debe devolver un Optional.
public class flatMap {
    public static void main(String[] args) {
        Optional<String> myOptional = Optional.of("mundo");
        Optional<Integer> resultado = myOptional.flatMap(t -> Optional.of(t.length()));
        System.out.println("Resultado Final => " + resultado);
    }
}
