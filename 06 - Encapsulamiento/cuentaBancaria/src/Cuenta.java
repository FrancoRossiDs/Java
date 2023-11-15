import java.util.ArrayList;
import java.util.Date;
class Cuenta {
    private double monto;
    private String nombre;
    private String contrasena;
    private ArrayList<String> transacciones;

    public Cuenta(double monto, String nombre, String contrasena) {
        this.monto = monto;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.transacciones = new ArrayList<>();
        registrarTransaccion("Saldo inicial: $" + monto);
    }

    public double getMonto() {
        return monto;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.monto += cantidad;
            registrarTransaccion("Deposito de $" + cantidad + ". Nuevo saldo: $" + this.monto);
        } else {
            System.out.println("La cantidad del deposito debe ser mayor que cero.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= this.monto) {
            this.monto -= cantidad;
            registrarTransaccion("Retiro de $" + cantidad + ". Nuevo saldo: $" + this.monto);
        } else {
            System.out.println("Cantidad de retiro no valida.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
        System.out.println("Contrasena cambiada exitosamente.");
    }

    // Metodo para mostrar transacciones
    public void mostrarTransacciones() {
        System.out.println("Historial de transacciones:");
        for (String transaccion : transacciones) {
            System.out.println(transaccion);
        }
        System.out.println("Fin historial de transacciones");
    }

    // Metodo para registrar transacciones
    private void registrarTransaccion(String mensaje) {
        transacciones.add(mensaje);
    }
}
