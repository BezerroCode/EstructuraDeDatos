package H2Defensa;

public class Pais {
    private String nombre;
    private int nroDeps;
    private Departamento[] departamentos;

    public Pais(){
        this.nombre ="";
        this.nroDeps =0;
        this.departamentos = new Departamento[0];
    }
    public Pais(String nombre, int nroDeps, Departamento[] departamentos) {
        this.nombre = nombre;
        this.nroDeps = nroDeps;
        this.departamentos = departamentos;
    }

    //GET
    public String getNombre() {
        return nombre;
    }

    public int getNroDeps() {
        return nroDeps;
    }
    public Departamento[] GetDepartamentos() {
        return departamentos;
    }

    //set

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public void setNroDeps(int nuevoNroDeps) {
        nroDeps = nuevoNroDeps;
    }
    public void setNroDeps(Departamento[] nuevoDepartamentos){
        this.departamentos = nuevoDepartamentos;
    }

    //mostrar pais
    public void mostrarPais() {
        System.out.println("mostrar Pais");
        System.out.println("Nombre pais: "+ getNombre());
        System.out.println("Mostrar nroDeps: "+getNroDeps());
        System.out.println("Mostrar departamentos: "+GetDepartamentos());
    }
}
