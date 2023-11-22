abstract public class Empleado {
    private String nombre;
    private double salario;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    Empleado(String nombre, double salario){
        this.nombre=nombre;
        this.salario=salario;
    }
     void calcularSalarioAnual(){
        System.out.println("El salario anual es de " + salario*12);
    }
}
