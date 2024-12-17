package ejercicios.ejercicio02;

import java.util.Optional;

/*
Ejercicio 2: Validación con filter
Crea una clase Producto con los atributos nombre y precio.

Crea un método que devuelva un Optional<Producto>.
Aplica una condición usando filter para verificar que el precio sea mayor que 0.
Si la condición se cumple, muestra el nombre del producto; si no, muestra un mensaje que indique "Precio inválido".
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Optional<Producto> producto = devolverProducto();
        // aplicamos el filter segun la condicion
        producto.filter(t -> t.getPrecio() > 0)
                .ifPresentOrElse(
                        t -> System.out.println("Nombre del producto: " + t.getNombreProducto()),
                        () -> System.out.println("Precio Invalido."));
        // ejemplo con un producto nulo
        Optional<Producto> productoNulo = Optional.ofNullable(null);
        productoNulo.filter(t -> t.getPrecio() > 0)
                .ifPresentOrElse(
                        t -> System.out.println("Nombre: " + t.getNombreProducto()),
                        () -> System.out.println("Producto no disponible...."));
    }

    public static Optional<Producto> devolverProducto() {
        return Optional.ofNullable(new Producto("Galletas", 12.3));
    }
}