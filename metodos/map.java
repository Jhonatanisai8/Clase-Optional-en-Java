package metodos;

import java.util.Optional;

// map() Transforma el valor contenido dentro del Optional.
public class map {
    public static void main(String[] args) {
        Optional<String> myOptional = Optional.of("My Optional");
        System.out.println("USO del map()");
        //trasformamos
        Optional<Integer> longitug = myOptional.map(t -> t.length());
        System.out.println(longitug.get());
        System.out.println("________________________________");
    }
}
