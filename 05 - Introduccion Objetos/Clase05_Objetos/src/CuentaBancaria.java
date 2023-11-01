import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Error: El monto del depósito debe ser mayor que 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("Error: Fondos insuficientes o cantidad no válida para retiro.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Creación de una instancia de CuentaBancaria con saldo inicial de $1000
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0);

        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double montoDeposito = input.nextDouble();
                    cuenta.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double montoRetiro = input.nextDouble();
                    cuenta.retirar(montoRetiro);
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro servicio.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
        input.close();
    }
}
