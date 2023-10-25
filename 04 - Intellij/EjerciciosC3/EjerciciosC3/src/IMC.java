import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de su Altura en metros: ");
        double altura = leer.nextDouble();
        System.out.print("Ingrese el valor de su Peso en kilogramos: ");
        double peso = leer.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("Indice de masa corporal: " + imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}
