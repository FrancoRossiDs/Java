public class Gerente extends Empleado{
    private double bonoAnual;

    public double getBonoAnual() {
        return bonoAnual;
    }

    public void setBonoAnual(double bonoAnual) {
        this.bonoAnual = bonoAnual;
    }
    @Override
    public void calcularSalarioAnual(double salario){
        double salarioAnual=salario*12;
    }
}
