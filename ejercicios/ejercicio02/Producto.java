package ejercicios.ejercicio02;

public class Producto {
    private String nombreProducto;
    private Double precio;

    public Producto() {

    }

    public Producto(String nombreProducto, Double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
