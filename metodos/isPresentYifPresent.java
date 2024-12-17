package metodos;

import java.util.Optional;

public class isPresentYifPresent {

    public static void main(String[] args) {
        System.out.println("USO DEL isPresent().");
        Optional<String> miOptional = Optional.of("hola");
        if (miOptional.isPresent()) {
            System.out.println("Es valor presente: " + miOptional);
        }
        System.out.println("_________________________");
        
        System.out.println("USO DEL ifPresent(t -> operacion).");
        miOptional.ifPresent(t -> System.out.println("Valor: " + t));
        System.out.println("_________________________");

    }
}
