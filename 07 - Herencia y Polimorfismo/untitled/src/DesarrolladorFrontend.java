public class DesarrolladorFrontend extends Desarrollador implements Identificacion{
    String tecnologiasFrontEnd;
    DesarrolladorFrontend(String nombre, double salario,String tecnologiasFrontEnd){
        super(nombre,salario);
        this.tecnologiasFrontEnd=tecnologiasFrontEnd;
    }
    @Override
    void calcularSalarioAnual(){
        System.out.println("El salario anual de "+ getNombre()+" es de " + getSalario() *12 + "$ trabajando con "+ tecnologiasFrontEnd);
    }

    @Override
    public void mensaje() {
        System.out.println("Soy el desarrollador FrontEnd " +getNombre());
    }
}
