import java.util.Scanner;
public class Tres_Numeros {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1=leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2=leer.nextInt();
        System.out.print("Ingrese el tercero número: ");
        int num3=leer.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El mayor número es " + num1);
        } else if (num2> num1 && num2>num3) {
            System.out.println("El mayor número es " +num2);
        }else {
            System.out.println("El mayor número es " +num3);
        }
    }
}
