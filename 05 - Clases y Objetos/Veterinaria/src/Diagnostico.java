import java.util.Scanner;

public class Diagnostico {
    private String dia = "";
    private String mes = "";
    private String ano = "";
    private String hora = "";
    private String minutos = "";
    public String descripcion;
    public String mascotaAsociada;
    public String horario;
    public String fecha;

    public static boolean esFechaValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        int maxDias = obtenerMaxDiasEnMes(mes, ano);
        return dia <= maxDias;
    }

    private static int obtenerMaxDiasEnMes(int mes, int ano) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return esAnoBisiesto(ano) ? 29 : 28;
            default:
                return 31;
        }
    }

    private static boolean esAnoBisiesto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static boolean esHorarioValido(int hora, int minutos) {
        return hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59;
    }

    public void recibirDatosDiagnostico(Mascota mascota) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Fecha");

            System.out.print("Año: ");
            ano = scanner.nextLine();

            System.out.print("Mes: ");
            mes = scanner.nextLine();
            if (mes.length() == 1) {
                mes = "0" + mes;
            }

            System.out.print("Día: ");
            dia = scanner.nextLine();
            if (dia.length() == 1) {
                dia = "0" + dia;
            }

            if (!esFechaValida(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(ano))) {
                System.out.println("La fecha no es válida");
            }
        } while (!esFechaValida(Integer.parseInt(dia), Integer.parseInt(mes), Integer.parseInt(ano)));

        do {
            System.out.println("Horario en el que se atendió");
            System.out.print("Hora: ");
            hora = scanner.nextLine();
            if (hora.length() == 1) {
                hora = "0" + hora;
            }

            System.out.print("Minutos: ");
            minutos = scanner.nextLine();
            if (minutos.length() == 1) {
                minutos = "0" + minutos;
            }

            if (!esHorarioValido(Integer.parseInt(hora), Integer.parseInt(minutos))) {
                System.out.println("El horario no es válido");
            }
        } while (!esHorarioValido(Integer.parseInt(hora), Integer.parseInt(minutos)));

        System.out.println("Descripción ");
        descripcion = scanner.nextLine();
        descripcion = descripcion.toLowerCase();
        descripcion = descripcion.substring(0, 1).toUpperCase() + descripcion.substring(1);
        mascotaAsociada = mascota.nombreMascota;

        horario = hora + ":" + minutos;
        fecha = dia + "/" + mes + "/" + ano;
    }


    public void comprobarDatosDiagnostico() {
        System.out.println("Diagnóstico");
        System.out.println("Fecha: " + fecha);
        System.out.println("Horario " + horario);
        System.out.println("Descipcion: " + descripcion);
        System.out.println("Mascota: " + mascotaAsociada);
    }
}




