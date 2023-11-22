public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Leo", 10000000, 5000000);
        DesarrolladorFrontend desarrollador1 = new DesarrolladorFrontend("Lucas", 101000,"Html");
        DesarrolladorBackend desarrollador2 = new DesarrolladorBackend("Lucho", 100000,"Java");

        // Llamada a los métodos
        gerente.mensaje();
        gerente.calcularSalarioAnual();
        System.out.println(" ");
        desarrollador1.mensaje();
        desarrollador1.calcularSalarioAnual();
        System.out.println(" ");
        desarrollador2.mensaje();
        desarrollador2.calcularSalarioAnual();
        System.out.println(" ");
        gerente.supervisar(desarrollador1,desarrollador2);

    }
}
