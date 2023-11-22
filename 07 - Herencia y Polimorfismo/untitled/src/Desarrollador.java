public class Desarrollador extends Empleado{
    Desarrollador(String nombre, double salario){
        super(nombre, salario);
    }
    @Override
    void calcularSalarioAnual(){
        System.out.println("El salario anual es de " + getSalario() *12);
    }
}
