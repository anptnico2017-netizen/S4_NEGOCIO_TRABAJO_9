package Diseno;

public class Main {
    public static void main(String[] args) {
        Negocio prod1 = new Negocio("Camiseta", 25.50, "Ropa");

        Negocio prod2 = new Negocio();
        prod2.setNombre("Zapatos");
        System.out.println("Producto 1: " + prod1.getNombre() + " - Precio: $" + prod1.getPrecio());
        System.out.println("Producto 2: " + prod2.getNombre());

        System.out.println("Total de negocios/productos creados: " + Negocio.getTotalCreados());
    }
}
