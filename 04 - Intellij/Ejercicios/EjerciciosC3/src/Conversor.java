import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un valor en pesos ");
        double pesos = leer.nextDouble();

        double dolares= pesos/383;

        System.out.println("El valor ingresado de: $"+ pesos + " en dolares es de: $" + dolares);
    }

}
