package H2Defensa;

public class Provincia {

    private String nombre;

    public Provincia (){
        this.nombre="";
    }
    public Provincia (String nombre) {
        this.nombre=nombre;
    }

    //get
    public String getNombre() {
        return this.nombre;
    }
    //set
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    //mostrar
    public void mostrarProvincia(){
        System.out.println("Mostrar Provincia");
        System.out.println("nombre provincia: "+getNombre());
    }

}
