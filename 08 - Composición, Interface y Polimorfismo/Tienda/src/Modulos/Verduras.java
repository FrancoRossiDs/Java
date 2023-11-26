package Modulos;

public class Verduras extends Producto implements Vendible{
    private int vencimiento;
    private int calorias;
    private String granja;

    public Verduras(String nombre, double precio_base,int unidades,int vencimiento,int calorias, String granja){
        super(nombre,precio_base,unidades);
        this.vencimiento=vencimiento;
        this.calorias=calorias;
        this.granja=granja;
    }



    @Override
    public double calcularPrecio() {
        return getPrecioBase() * getUnidades();
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }
}
