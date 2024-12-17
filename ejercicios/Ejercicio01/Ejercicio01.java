package ejercicios.Ejercicio01;

import java.util.Optional;

/*
Crea una clase Persona que tenga dos atributos: nombre y correo. Luego:

Declara una variable Optional<String> para el nombre y otra para el correo.
Simula un método que devuelva un Optional vacío para el correo.
Usa orElse para mostrar un valor por defecto si el correo no está presente.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("daniel");

        Optional<String> nombre = Optional.ofNullable(p1.getNombre());
        nombre.ifPresent(t -> System.out.println("Nombre: " + t));

        Optional<String> correoOptional = devolverCorreoVacio();

        String correo = correoOptional.orElse("Valor por defecto");
        System.out.println("Correo: " + correo);
        System.out.println("___________________________________________F");
    }

    public static Optional<String> devolverCorreoVacio() {
        return Optional.empty();

    }

}
