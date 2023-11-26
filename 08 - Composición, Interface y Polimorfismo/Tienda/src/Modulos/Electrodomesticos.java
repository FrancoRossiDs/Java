package Modulos;

public class Electrodomesticos extends  Producto implements Vendible{
    private final String marca;
    private double consumo;
    private int anio;

    public Electrodomesticos(String nombre, double precio_base,int unidades,String marca,double consumo, int anio){
        super(nombre,precio_base,unidades);
        this.marca=marca;
        this.consumo=consumo;
        this.anio=anio;
    }

    @Override
    public double calcularPrecio() {
        return getPrecioBase() * getUnidades();
    }


    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}

