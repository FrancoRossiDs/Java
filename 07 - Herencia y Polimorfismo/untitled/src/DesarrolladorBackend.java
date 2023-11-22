public class DesarrolladorBackend extends Desarrollador implements Identificacion{
    String tecnologiasBackend;
    DesarrolladorBackend(String nombre, double salario,String tecnologiasBackend){
        super(nombre,salario);
        this.tecnologiasBackend=tecnologiasBackend;
    }
    @Override
    void calcularSalarioAnual(){
        System.out.println("El salario anual de "+ getNombre()+" es de " + getSalario() *12 + "$ trabajando con " + tecnologiasBackend);
    }

    @Override
    public void mensaje() {
        System.out.println("Soy el desarrollador Backend " + getNombre());
    }
}
