import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vamos a crear su cuenta");
        System.out.println(" ");
        System.out.print("Ingrese su nombre: ");
        String nombrePropietario=scanner.nextLine();
        System.out.print("Ingrese el saldo inicial de su cuenta: $");
        double saldoInicial=scanner.nextDouble();

        Cuenta cuentaUsuario=new Cuenta(saldoInicial,nombrePropietario);

        System.out.println("Bienvenido al cajero automatico de la nación");

        do {
            System.out.println("Ingrese una ópcion");
            System.out.println(" ");
            System.out.println("1: Ver saldo");
            System.out.println("2: Ingresar Dinero");
            System.out.println("3: Retirar Dinero");
            System.out.println("4: Ver historial de trasacciones");
            System.out.println("5: Salir");
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo que tiene es $" + cuentaUsuario.getMonto());

                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero que quiere ingresar");
                    double ingreso=scanner.nextDouble();
                    cuentaUsuario.depositar(ingreso);
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad dinero que desea retirar");
                    double egreso=scanner.nextDouble();
                    cuentaUsuario.extraer(egreso);
                    break;
                case 4:
                    System.out.println("Ingresando a historial");
                    cuentaUsuario.historial();
                    break;
                case 5:
                    System.out.println("Gracias "+ cuentaUsuario.getName() + " , vuelva pronto");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }while (opcion!=5);
        
    }
}