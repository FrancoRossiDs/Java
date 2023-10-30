//para poder importar
package Repaso;
import java.util.Scanner;
public class Repaso {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Scanner leer = new Scanner(System.in);

        //Tipo de datos
        //Cadena o Caracter
        String cadena = "Hola"; // Para cadena se una "" si o si
        char letra = 'a'; //Para char se usa '' si o si

        //Tipo numérico
        int numero = 01;  //hasta 10 carácteres
        float fnum = 10.5F;
        long lNum = 1000000L;
        short sNum;
        byte bNum; // -128 a 127
        double dNum;

        //Tipo lógico
        boolean Verdadero = true;
        boolean Falso = false;

        //Condicionales
        if (5 < 10) {
            System.out.println("Cumple");
        } else if (5 > 6) {
            //Segunda Condicional
        } else {
        }

        //Según
        /*switch (nombre) {
            case =="opcion":
                break;
            case option2:
                break;
            case option3:
                break;
            case option4:
                break;
        }

        //bucles
        /*int num = 0;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        //do el contenido se ejecuta almenos una vez
        /*do {
        } while ();

        //Para/INI/Condicion/Incremento-Decremento
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        //Operadores matemáticos:
        // +; -; *; /; %; Math.pow(a,b); Math.sqpt(a)
        //                Potencia       Raiz

        //Operadores Comparacion:
        //<; >; <=; >=; ==; !=

        //Operadores Lógicos:
        //y-&&, or-||, negación-!true

        //Operadores Math:
        //Math.ceil(); - Redondea hacia arriba
        //Math.floor(); - Redondea hacia abajo
        //Math.round(); - Redondea al mas cercano
        //Math.man(); - Devuelve el máximo de dos valores
        //Math.min(); - Devuelve el mínimo de dos valores

        /*var nombre="Hola";
        nombre.length();// 4*/
    }
}
