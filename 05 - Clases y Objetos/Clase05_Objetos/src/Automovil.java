import java.util.Scanner;

public class Automovil {
    private String marca;
    private String modelo;
    private int velocidadActual;

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = 0;
    }

    public void acelerar(int cantidad) {
        if (cantidad > 0) {
            velocidadActual += cantidad;
            System.out.println("Acelerando. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("Error: La cantidad de aceleración debe ser mayor que 0.");
        }
    }

    public void frenar(int cantidad) {
        if (cantidad > 0 && cantidad <= velocidadActual) {
            velocidadActual -= cantidad;
            System.out.println("Frenando. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("Error: Velocidad no válida para frenar o cantidad no válida.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la marca del automóvil: ");
        String marca = input.nextLine();

        System.out.print("Ingrese el modelo del automóvil: ");
        String modelo = input.nextLine();

        Automovil automovil = new Automovil(marca, modelo);

        System.out.println("Automóvil creado. Marca: " + marca + ", Modelo: " + modelo);
        System.out.print("Ingrese la cantidad para acelerar: ");
        int aceleracion = input.nextInt();
        automovil.acelerar(aceleracion);

        System.out.print("Ingrese la cantidad para frenar: ");
        int frenado = input.nextInt();
        automovil.frenar(frenado);

        automovil.mostrarInformacion();

        input.close();
    }
}

