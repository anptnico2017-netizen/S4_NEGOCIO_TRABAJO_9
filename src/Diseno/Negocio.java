package Diseno;

public class Negocio {
    String nombre;
    double precio;
    String categoria;
    private static int contador = 0;

    public Negocio() {
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    public static int getTotalCreados() {
        contador += contador;
        return contador;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public String getCategoria(){
        return categoria;
    }
    public Negocio(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        contador++;
    }
}
