import java.util.Scanner;
public class Contrasena {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Ingrese su contraseña: ");
        String contrasena= leer.nextLine();

        System.out.print("Repita la contraseña: ");
        String contrasena2= leer.nextLine();

        if(!contrasena.equals(contrasena2)){
            System.out.println("Las contraseñas no concuerdan");
        }else {
            System.out.println("Las contraseñas concuerdan");

            if (contrasena.length()<8){
                System.out.print("Su contraseña es demasiado pequeña");
            } else if ( contrasena.length()>50) {
                System.out.print("Su contraseña es demasiado grande");
            }else {
                System.out.print("Contraseña Válida");
            }
        }
    }
}
