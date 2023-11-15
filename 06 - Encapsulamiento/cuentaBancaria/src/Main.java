import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la primera cuenta
        System.out.println("Creando la primera cuenta");
        System.out.println("Ingrese el nombre del propietario de la primera cuenta:");
        String nombrePropietario1 = scanner.nextLine().replace("ñ", "n");
        System.out.println("Ingrese el saldo inicial de la primera cuenta:");
        double saldoInicial1 = scanner.nextDouble();
        System.out.println("Ingrese la contrasena de la primera cuenta:");
        String contrasena1 = scanner.next();

        Cuenta cuenta1 = new Cuenta(saldoInicial1, nombrePropietario1, contrasena1);

        // Crear la segunda cuenta
        System.out.println("\nCreando la segunda cuenta");
        System.out.println("Ingrese el nombre del propietario de la segunda cuenta:");
        scanner.nextLine(); // Limpiar el buffer
        String nombrePropietario2 = scanner.nextLine().replace("ñ", "n");
        System.out.println("Ingrese el saldo inicial de la segunda cuenta:");
        double saldoInicial2 = scanner.nextDouble();
        System.out.println("Ingrese la contrasena de la segunda cuenta:");
        String contrasena2 = scanner.next();

        Cuenta cuenta2 = new Cuenta(saldoInicial2, nombrePropietario2, contrasena2);

        System.out.println("\nBienvenido al sistema bancario");

        int opcion;
        int cuentaActiva = 1; // Indicador de la cuenta activa (1 o 2)

        do {
            System.out.println("\nIngrese una opcion");
            System.out.println("1: Ver saldo");
            System.out.println("2: Ingresar Dinero");
            System.out.println("3: Retirar Dinero");
            System.out.println("4: Transferir entre cuentas");
            System.out.println("5: Cambiar de cuenta");
            System.out.println("6: Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actual es: $" + getCuentaActiva(cuenta1, cuenta2, cuentaActiva).getMonto());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero que quiere ingresar:");
                    double ingreso = scanner.nextDouble();
                    getCuentaActiva(cuenta1, cuenta2, cuentaActiva).depositar(ingreso);
                    System.out.println("Deposito exitoso. Nuevo saldo: $" + getCuentaActiva(cuenta1, cuenta2, cuentaActiva).getMonto());
                    break;
                case 3:
                    // Implementa logica para retirar dinero
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de dinero que quiere transferir:");
                    double cantidadTransferir = scanner.nextDouble();
                    System.out.println("Ingrese el numero de cuenta destino (1 o 2):");
                    int cuentaDestino = scanner.nextInt();
                    transferirEntreCuentas(getCuentaActiva(cuenta1, cuenta2, cuentaActiva),
                            getCuentaActiva(cuenta1, cuenta2, cuentaDestino), cantidadTransferir);
                    break;
                case 5:
                    System.out.println("Ingrese la contrasena para cambiar de cuenta:");
                    String contrasena = scanner.next();
                    if (verificarContrasena(cuenta1, cuenta2, cuentaActiva, contrasena)) {
                        cuentaActiva = (cuentaActiva == 1) ? 2 : 1; // Cambiar entre cuentas activas
                        System.out.println("Ahora esta trabajando con la cuenta " + cuentaActiva);
                    } else {
                        System.out.println("Contrasena incorrecta. No se puede cambiar de cuenta.");
                    }
                    break;
                case 6:
                    System.out.println("Gracias, vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }

    // Metodo para obtener la cuenta activa actual
    private static Cuenta getCuentaActiva(Cuenta cuenta1, Cuenta cuenta2, int cuentaActiva) {
        return (cuentaActiva == 1) ? cuenta1 : cuenta2;
    }

    // Metodo para transferir dinero entre cuentas
    private static void transferirEntreCuentas(Cuenta cuentaOrigen, Cuenta cuentaDestino, double cantidad) {
        cuentaOrigen.retirar(cantidad);
        cuentaDestino.depositar(cantidad);
        System.out.println("Transferencia exitosa. Nuevo saldo de la cuenta origen: $" + cuentaOrigen.getMonto());
        System.out.println("Nuevo saldo de la cuenta destino: $" + cuentaDestino.getMonto());
    }

    // Metodo para verificar la contrasena al cambiar de cuenta
    private static boolean verificarContrasena(Cuenta cuenta1, Cuenta cuenta2, int cuentaActiva, String contrasena) {
        Cuenta cuenta = (cuentaActiva == 1) ? cuenta1 : cuenta2;
        return cuenta.getContrasena().equals(contrasena);
    }
}