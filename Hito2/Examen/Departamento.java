package H2Defensa;

public class Departamento {
    private String nombre;
    private int nroProv;
    private Provincia[] provincias;

    public Departamento(){
        this.nombre = "";
        this.nroProv =0;
        this.provincias = new Provincia[0];
    }
    public Departamento(String nombre,int nroProv, Provincia[] provincias){
        this.nombre = nombre;
        this.nroProv = nroProv;
        this.provincias = provincias;
    }

    //get
    public String getNombre(){
        return nombre;
    }
    public int getNroProv(){
        return nroProv;
    }
    public Provincia[] getProvincias(){
        return provincias;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setNroProv(int nuevoNroProv){
        this.nroProv = nuevoNroProv;
    }
    public void setProvincias(Provincia[] nuevoProvincias){
        this.provincias = nuevoProvincias;
    }

    public void mostrarDepartamento(){
        System.out.println("nombre departamento: "+getNombre());
        System.out.println("nro provincia: "+getNroProv());
        System.out.println("Provincia: "+getProvincias());

    }

}
