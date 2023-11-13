import java.util.Scanner;

public class Dueno {
    public String nombreDueno;
    public String apellidoDueno;

    public void recibirDatosDueno(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nombre: ");
        nombreDueno = scanner.nextLine();
        nombreDueno = nombreDueno.toLowerCase();
        nombreDueno = nombreDueno.substring(0, 1).toUpperCase() + nombreDueno.substring(1);

        System.out.print("Apellido: ");
        apellidoDueno= scanner.nextLine();
        apellidoDueno=apellidoDueno.toLowerCase();
        apellidoDueno=apellidoDueno.substring(0,1).toUpperCase() + apellidoDueno.substring(1);
    }
    public void comprobarDatosDueno(){
        System.out.println("Dueño");
        System.out.println("Nombre: " + nombreDueno);
        System.out.println("Apellido: " + apellidoDueno);
    }
}
