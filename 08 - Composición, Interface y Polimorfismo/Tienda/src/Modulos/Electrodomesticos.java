package Modulos;

public class Electrodomesticos extends Producto {
    // Atributos específicos de Electrodomesticos

    public Electrodomesticos(String nombre, double precioBase, int unidades) {
        super(nombre, precioBase, unidades);
        // Inicializar atributos específicos de Electrodomesticos
    }

    @Override
    public double calcularPrecio() {
        // Implementación específica de calcularPrecio para Electrodomesticos
        return getPrecioBase() * getUnidades();
    }
}
