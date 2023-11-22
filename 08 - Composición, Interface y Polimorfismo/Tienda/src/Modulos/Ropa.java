package Modulos;

public class Ropa extends Producto implements Vendible{
    private String material;
    private String marca;
    private String disenador;

    Ropa(String nombre, double precio_base,int unidades,String material,String marca, String disenador){
        super(nombre,precio_base,unidades);
        this.material=material;
        this.marca=marca;
        this.disenador=disenador;
    }

    @Override
    public void calcularPrecio() {
        System.out.println("Precio de " +getNombre()+ " es " + (getPrecio_base()*getUnidades()));
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDisenador() {
        return disenador;
    }

    public void setDisenador(String disenador) {
        this.disenador = disenador;
    }
}
