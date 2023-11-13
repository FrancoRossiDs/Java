import java.util.Locale;
import  java.util.Scanner;
public class Veterinario {
    public String nombreVeterinario;
    public String apellidoVeterinario;
    public String matriculaVeterinario;

    public void recibirDatosVeterinario(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nombre: ");
        nombreVeterinario= scanner.nextLine();
        nombreVeterinario=nombreVeterinario.toLowerCase();
        nombreVeterinario=nombreVeterinario.substring(0,1).toUpperCase()+nombreVeterinario.substring(1);
        System.out.print("Apellido: ");
        apellidoVeterinario=scanner.nextLine();
        apellidoVeterinario=apellidoVeterinario.toLowerCase();
        apellidoVeterinario=apellidoVeterinario.substring(0,1).toUpperCase()+apellidoVeterinario.substring(1);
        System.out.print("Matricula: ");
        matriculaVeterinario=scanner.nextLine();
    }
    public void comprobarDatosVeterinario(){
        System.out.println("Datos Veterinario");
        System.out.println("Nombre: " + nombreVeterinario);
        System.out.println("Apellido " + apellidoVeterinario);
        System.out.println("Matricula " + matriculaVeterinario);
    }
}
