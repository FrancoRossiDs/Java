public class Empleado {
    private String nombre;
    private double salario;

    Empleado(String nombre,double salario){
        this.nombre=nombre;
        this.salario=salario;
    }
    public void calcularSalarioAnual(){

        double salarioAnual=salario*12;
    }
}
