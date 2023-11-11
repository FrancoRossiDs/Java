import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Mascota mascota=new Mascota();
        int opcion;
        do {
            System.out.println("\nMenú de opciones ");
            System.out.println("1. Ver estado");
            System.out.println("2. Dar de comer");
            System.out.println("3. Hacer Dormir");
            System.out.println("4. Despertar");
            System.out.println("5. Hacer caminar");
            System.out.println("6. Hacer correr");
            System.out.println("7. Verificar Estado");
            System.out.println("8. Resetear Mascota");
            System.out.println("9. Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    mascota.verEstado();
                    break;
                case 2:
                    mascota.darDeComer(input);
                    break;
                case 3:
                    mascota.hacerDormir(input);
                    break;
                case 4:
                    mascota.despertar();
                    break;
                case 5:
                    mascota.hacerCaminar();
                    break;
                case 6:
                    mascota.hacerCorrer();
                    break;
                case 7:
                    mascota.verificarEstado();
                    break;
                case 8:
                    mascota.resetearMascota(input);
                    break;
                case 9:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion!=9);

        input.close();
    }
}