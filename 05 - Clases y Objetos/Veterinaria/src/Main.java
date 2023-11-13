import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dueno dueno = new Dueno();
        Mascota mascota = new Mascota();
        Veterinario veterinario = new Veterinario();
        Diagnostico diagnostico = new Diagnostico();

        System.out.println("Bienvenido al sistema de la Veterinaria");
        System.out.println(" ");

        System.out.println("Ingrese la datos del Dueño");
        dueno.recibirDatosDueno();
        System.out.println(" ");

        System.out.println("Ingrese la datos de la Mascota");
        mascota.recibirDatosMascota();
        System.out.println(" ");

        System.out.println("Ingrese los datos del Veterinario");
        veterinario.recibirDatosVeterinario();
        System.out.println(" ");

        System.out.println("Ingrese los datos del diagnóstico");
        diagnostico.recibirDatosDiagnostico(mascota);
        System.out.println(" ");

        while (true) {
            System.out.println("Son los datos ingresados correctos? Si/No");
            System.out.println(" ");
            dueno.comprobarDatosDueno();
            System.out.println(" ");
            mascota.comprobarDatosMascota();
            System.out.println(" ");
            veterinario.comprobarDatosVeterinario();
            System.out.println(" ");
            diagnostico.comprobarDatosDiagnostico();
            System.out.println(" ");

            String sn = scanner.nextLine().toLowerCase();
            System.out.println(" ");

            if (sn.equals("no")) {
                System.out.println("Ingrese de qué sección quiere cambiar los datos");
                System.out.println(" ");
                System.out.println("1: Datos Dueño");
                System.out.println("2: Datos Mascota");
                System.out.println("3: Datos Veterinario");
                System.out.println("4: Datos Diagnóstico");
                System.out.println("5: Los datos están correctos");
                System.out.println(" ");

                String opcion = scanner.nextLine();
                System.out.println(" ");

                switch (opcion) {
                    case "1":
                        dueno.recibirDatosDueno();
                        break;
                    case "2":
                        mascota.recibirDatosMascota();
                        break;
                    case "3":
                        veterinario.recibirDatosVeterinario();
                        break;
                    case "4":
                        diagnostico.recibirDatosDiagnostico(mascota);
                        break;
                    case "5":
                        break;
                    default:
                        System.out.println("Opción ingresada incorrecta");
                }
            } else {
                System.out.println("Hora " + diagnostico.horario + " de la fecha " + diagnostico.fecha);
                System.out.println(" ");
                mascota.ingresarMascota();
                System.out.println("De raza " + mascota.razaMascota);
                System.out.println(" ");
                System.out.println("Del dueño/a " + dueno.nombreDueno + " " + dueno.apellidoDueno);
                System.out.println(" ");
                System.out.println("Es atendido/a por el Veterinario " + veterinario.nombreVeterinario + " " + veterinario.apellidoVeterinario);
                System.out.println("Matrícula " + veterinario.matriculaVeterinario);
                System.out.println(" ");
                System.out.println("Se hace tratamiento de rutina y " + mascota.nombreMascota + " es retirado/a al día siguiente");
                mascota.retiroMascota();
                break;
            }
        }
    }
}
