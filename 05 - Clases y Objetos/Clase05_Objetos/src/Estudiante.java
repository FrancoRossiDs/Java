import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int edad;
    private int[] calificaciones;

    public Estudiante(String nombre, int edad, int[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        if (calificaciones.length == 0) {
            return 0.0;
        }

        int sumaCalificaciones = 0;
        for (int calificacion : calificaciones) {
            sumaCalificaciones += calificacion;
        }

        return (double) sumaCalificaciones / calificaciones.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad = input.nextInt();

        System.out.print("Ingrese el número de calificaciones: ");
        int numCalificaciones = input.nextInt();
        int[] calificaciones = new int[numCalificaciones];

        for (int i = 0; i < numCalificaciones; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = input.nextInt();
        }

        Estudiante estudiante = new Estudiante(nombre, edad, calificaciones);

        double promedio = estudiante.calcularPromedio();
        System.out.println("Nombre del estudiante: " + estudiante.nombre);
        System.out.println("Edad del estudiante: " + estudiante.edad);
        System.out.println("Promedio de calificaciones: " + promedio);

        input.close();
    }
}

