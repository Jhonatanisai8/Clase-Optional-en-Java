package ejemplo;

import java.util.*;

public class MetodosOptinal {

    public static void main(String[] args) {
        new MetodosOptinal();
    }

    public MetodosOptinal() {
        // Crea un Optional si el valor no es null.
        System.out.println("USO DEL Optional.of(miNombre);");
        String miNombre = "fernando";
        Optional<String> miOptionalNombre = Optional.of(miNombre);
        System.out.println("Optional: " + miOptionalNombre);
        System.out.println("------------------------");

        // Crea un Optional que puede ser null. Si el valor es null, el Optional estará
        // vacío.
        System.out.println("USO DEL Optional.ofNullable(ciudad); ");
        String ciudad = null;
        Optional<String> optionalCiudad = Optional.ofNullable(ciudad);
        System.out.println(optionalCiudad);
        System.out.println("------------------------");
        
        System.out.println("USO DEL Optional.empty()");
        // Crea un Optional vacío.
        Optional<String> vacOptional = Optional.empty();
        System.out.println(vacOptional);
        System.out.println("------------------------");
    }
}