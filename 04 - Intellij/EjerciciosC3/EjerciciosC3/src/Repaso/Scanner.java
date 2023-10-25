import java.util.Scanner;
package scanner;

public class Repaso {
    public static void main(String[] args) {
        java.util.Scanner leer = new java.util.Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String name = leer.nextLine();
        System.out.println("Tu nombre es: " + name);
        System.out.print("Ingresa un numero : ");
        int numero = leer.nextInt();
        System.out.println("El numero que ingresaste es: " + numero);
    }
}

