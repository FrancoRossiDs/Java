public class Gerente extends Empleado implements Identificacion{
    private double bonoAnual;

    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }

    Gerente(String nombre, double salario, double bonoAnual) {
        super(nombre, salario);
        this.bonoAnual=bonoAnual;
    }

    public void supervisar(DesarrolladorFrontend programador1, DesarrolladorBackend programador2){
        System.out.println("Bajo la supervisión de " +getNombre()+ " se encuentran los trabajadores " + programador1.getNombre()+ " y " + programador2.getNombre());
    }

    @Override
     void calcularSalarioAnual(){
        System.out.printf("El salario anual del gerente " + getNombre() + " mas el bono de "+ bonoAnual +"$ es de %.2f%n", (getSalario() * 12) + bonoAnual);

    }

    @Override
    public void mensaje() {
        System.out.println("Soy el gerente " + getNombre());
    }
}