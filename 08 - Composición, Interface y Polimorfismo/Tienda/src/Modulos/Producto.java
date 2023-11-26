package Modulos;

public abstract class Producto implements Vendible {
    private final String nombre;
    private final double precioBase;
    private final int unidades;

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

