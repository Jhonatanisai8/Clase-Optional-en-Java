package metodos;

import java.util.Optional;

/*
filter() Permite aplicar una condición al valor contenido. Si no cumple la condición, devuelve un Optional.empty.
 */
public class filter {
    public static void main(String[] args) {
        System.out.println("Uso del filter().");
        Optional<String> optional = Optional.of("Holas");
        optional.filter(t -> t.length() >= 5 )
        .ifPresent(t -> System.out.println("Valor: "+t));
        //en este caso el la longitud de la cadenas es mayor a 5 este la imprimi y si no devuelve un optional vacio
        System.out.println("__________________");
    }
}
