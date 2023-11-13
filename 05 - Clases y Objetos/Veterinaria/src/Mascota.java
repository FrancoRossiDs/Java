import java.util.Locale;
import java.util.Scanner;
public class Mascota {
    public String nombreMascota;
    public String razaMascota;
    private int opcionRaza;

    public void recibirDatosMascota(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nombre: ");
        nombreMascota=scanner.nextLine();
        nombreMascota=nombreMascota.toLowerCase();
        nombreMascota=nombreMascota.substring(0,1).toUpperCase() + nombreMascota.substring(1);
        elegirRaza();
    }
    public void comprobarDatosMascota(){
        System.out.println("Mascota");
        System.out.println("Nombre: " + nombreMascota);
        System.out.println("Raza: " + razaMascota);
    }
    public void elegirRaza() {
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Seleccione la raza de la mascota:");
            System.out.println("1. Labrador");
            System.out.println("2. Caniche");
            System.out.println("3. Shiba Inu");
            System.out.println("4. Dálmata");
            System.out.println("5. Callejero");
            System.out.println(" ");
            opcionRaza=scanner.nextInt();

            switch (opcionRaza) {
                case 1:
                    razaMascota = "Labrador";
                    break;
                case 2:
                    razaMascota = "Caniche";
                    break;
                case 3:
                    razaMascota = "Shiba Inu";
                    break;
                case 4:
                    razaMascota = "Dálmata";
                    break;
                case 5:
                    razaMascota = "Callejero";
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija nuevamente.");
            }
        } while (opcionRaza < 1 || opcionRaza > 5); // Continúa el bucle si la opción no está en el rango de 1 a 5
    }


    public void ingresarMascota(){
        System.out.println("Se ingreso a " + nombreMascota);
    }
    public void retiroMascota(){
        System.out.println("Se retiró a " + nombreMascota);
    }
}
