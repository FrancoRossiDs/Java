import java.util.ArrayList;
import java.util.Date;
public class Cuenta {
    private double monto;
    private String name;
    private ArrayList<String>transacciones;

    public Cuenta(double monto, String name) {
        this.monto = monto;
        this.name = name;
        this.transacciones = new ArrayList<>();
    }

    public double getMonto() {
        transacciones.add("Se revisó el saldo " + " " + new Date());
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void depositar(double ingreso){
        if (monto>0){
            this.monto+=ingreso;
            System.out.println("Se ingresado los $" + ingreso + " de manera exitosa");
            transacciones.add("Se ingresaron $" + ingreso + " " + new Date());
            System.out.println(" ");
        }else{
            System.out.println("El monto no puede ser menor a cero");
            System.out.println(" ");
        }

    }
    public void extraer(double extraccion){
        if (extraccion<this.monto){
            monto-=extraccion;
            System.out.println("Se extrajeron $" + extraccion + " de manera exitosa");
            transacciones.add("Se retiraron $" +extraccion + " " + new Date());
            System.out.println(" ");
        }else {
            System.out.println("Saldo insuficiente");
            System.out.println(" ");
        }
    }
    public void historial(){
        if (transacciones.isEmpty()){
            System.out.println("Todavía no hay registros");
        }else {
            System.out.println("Historial de transacciones:");
            System.out.println(" ");
            for (String transaccion : transacciones) {
                System.out.println(transaccion);
            }
        }
        System.out.println("Fin historial de transacciones");
        System.out.println(" ");
    }

}
