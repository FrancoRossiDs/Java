package Modulos;

public abstract class Producto implements Vendible {
    private String nombre;
    private double precioBase;
    private int unidades;

    public Producto(String nombre, double precioBase, int unidades) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.unidades = unidades;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getUnidades() {
        return unidades;
    }

    public abstract double calcularPrecio();
}

