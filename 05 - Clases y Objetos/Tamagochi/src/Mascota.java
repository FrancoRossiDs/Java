import java.util.Scanner;

public class Mascota {
    String nombre = "Rufus";
    double energia = 50.0;
    double peso = 50.0;
    boolean dormir = false;
    int humor;
    int cantidadComer;
    int tiempoTotalSueno = 0;
    int limiteSueno = 8;
    int umbralEnergiaparaDormir = 80;

    // Método para ver el estado de la mascota
    void verEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Energía: " + energia);
        System.out.println("Peso: " + peso);
        System.out.println("Humor " + humor);

        if (dormir) {
            System.out.println(nombre + " está dormido.");
            return;
        }
    }

    // Método para dar de comer a la mascota
    void darDeComer(Scanner input) {
        System.out.println("Tipos de comida");
        System.out.println("1: Galletas: ↑20 Energía");
        System.out.println("2: Carne: ↑15 Energía");
        System.out.println("3: Pollo: ↑10 Energía");
        System.out.println("4: Fruta: ↑5 Energía ↓5 Humor");
        System.out.println("5: Verdura: ↑3 Energía ↓10 Humor");
        System.out.println("6: Cancelar");

        int opcionComida = input.nextInt();
        int energiaComida = 0;

        if (peso >= 100 || energia <= 0) {
            System.out.println("Verifique a " + nombre);
        } else if (dormir) {
            System.out.println(nombre + " está dormido. No puede comer.");
            return;
        } else {
            switch (opcionComida) {
                case 1:
                    energiaComida = 20;
                    peso += 10;
                    break;
                case 2:
                    energiaComida = 15;
                    peso += 5;
                    break;
                case 3:
                    energiaComida = 10;
                    break;
                case 4:
                    energiaComida = 5;
                    humor -= 5;
                    break;
                case 5:
                    energiaComida = 3;
                    humor -= 10;
                    break;
                case 6:
                    System.out.println("Cancelando");
                    return;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }
            energia += energiaComida;
            peso += 5;
            cantidadComer++;
            humor += 5;  // Aumenta el humor por defecto
            System.out.println("Has dado de comer a " + nombre);
        }
    }

    // Método para hacer dormir a la mascota (con relación 1.5)
    void hacerDormir(Scanner input) {
        if (peso >= 100 || energia <= 0) {
            System.out.println("Verifique a " + nombre);
        } else if (dormir) {
            System.out.println(nombre + " ya está durmiendo.");
            return;
        } else {
            System.out.println("¿Cuántas horas quieres que duerma?");
            int tiempoSueno = input.nextInt();

            if (tiempoSueno <= 0) {
                System.out.println("Número ingresado no válido.");
                return;
            }

            if (energia >= umbralEnergiaparaDormir) {
                System.out.println("No quiero dormir :P");
                return;
            }

            // Ajusta el tiempo de sueño con la relación (1.5 segundos en la vida real por hora en el juego)
            tiempoSueno *= 3600 * 1.5;

            tiempoTotalSueno += tiempoSueno;
            dormir = true;

            // Ajusta la fórmula para un aumento más gradual de energía
            int horasDescansadas = (int) (tiempoSueno / 3600);
            int energiaAumentada = horasDescansadas * 4; // Aumento de energía más gradual
            energia += energiaAumentada;

            System.out.println(nombre + " está durmiendo durante " + tiempoSueno / 3600 / 1.5 + " horas.");

            // Despierta automáticamente después de alcanzar el límite de sueño
            new java.util.Timer().schedule(
                    new java.util.TimerTask() {
                        @Override
                        public void run() {
                            despertar();
                        }
                    },
                    tiempoSueno
            );
        }
    }


    void despertar() {
        if (peso >= 100 || energia <= 0) {
            System.out.println("Verifique a " + nombre);
        } else if (dormir) {
            dormir = false;
            tiempoTotalSueno = 0; // Resetea el tiempo total de sueño
            System.out.println(nombre + " se ha despertado.");
        } else {
            System.out.println(nombre + " ya está despierto.");
        }
    }

    void hacerCaminar() {
        if (peso >= 100 || energia <= 0) {
            System.out.println("Verifique a " + nombre);
        } else if (dormir) {
            System.out.println(nombre + " está dormido. No puede caminar.");
        } else {
            if (energia >= 5 && peso >= 5) {
                energia -= 10;
                peso -= 10;
                System.out.println(nombre + " ha caminado. Energía disminuida en 5 y peso disminuido en 5.");
            } else {
                System.out.println(nombre + " no tiene suficiente energía o está demasiado ligero para caminar.");
            }
        }
    }

    void hacerCorrer() {
        if (peso >= 100 || energia <= 0) {
            System.out.println("Verifique a " + nombre);
        } else if (dormir) {
            System.out.println(nombre + " está dormido. No puede correr.");
            return;
        } else {
            if (energia >= 10 && peso >= 10) {
                energia -= 20;
                peso -= 20;
                System.out.println(nombre + " ha corrido. Energía disminuida en 10 y peso disminuido en 10.");
            } else {
                System.out.println(nombre + " no tiene suficiente energía o está demasiado ligero para correr.");
            }
        }
    }

    void verificarEstado() {
        System.out.println("Estado actual de " + nombre + ":");
        System.out.println("Energía: " + energia);
        System.out.println("Peso: " + peso);
        System.out.println("Humor: " + humor);

        // Verificar si la mascota ha muerto
        if (energia <= 0 || peso >= 100) {
            System.out.println(nombre + " ha muerto. ¡Game over!");
            System.exit(0); // Salir del programa
        }
    }

    void resetearMascota(Scanner input) {
        System.out.println("¿Quieres cambiar el nombre de tu mascota? (Sí/No)");
        String cambiarNombre = input.next().toLowerCase();

        if (cambiarNombre.equals("si")) {
            System.out.println("Ingresa el nuevo nombre para tu mascota:");
            nombre = input.next();
        }

        energia = 50.0;
        peso = 50.0;
        dormir = false;
        humor = 0;
        cantidadComer = 0;
        tiempoTotalSueno = 0;
        System.out.println(nombre + " ha sido reseteado a los valores originales.");
    }
}

