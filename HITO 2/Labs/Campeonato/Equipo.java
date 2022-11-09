package Campeonato;

public class Equipo {

    private String nombreEquipo;
    private String categoria;
    private Jugador[] jugadores1;

    public Equipo(String nombreEquipo, String categoria, Jugador[] jugadores1) {
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.jugadores1 = jugadores1;
    }
        //vacion sin nada
    public Equipo() {
        Jugador[] jugadores1= new Jugador[0];
        this.nombreEquipo ="";
        this.categoria ="";
        this.jugadores1=jugadores1;
    }

    public String getNombreEquipo() {
        return this.nombreEquipo;
    }
    public String getCategoria() {
        return this.categoria;
    }
    public Jugador[] getJugadores1(){
        return this.jugadores1;
    }

    public void setNombreEquipo(String NuevonombreEquipo) {
        this.nombreEquipo= NuevonombreEquipo;
    }
    public void setCategoria(String nuevoCategoria) {
        this.categoria= nuevoCategoria;
    }
    public void setjugadores(Jugador[] nuevoJugadores1){
        this.jugadores1=nuevoJugadores1;
    }

    public void mostrarEquipo(){
        System.out.println("--------------------------Datos del Equipo--------------------------------------");
        System.out.println("Nombre de equipo: "+this.getNombreEquipo());
        System.out.println("Categoria: "+this.getCategoria());

        for(int i=0;i<this.getJugadores1().length;i++){
            this.getJugadores1()[i].mostrarJugador();
        }
    }

}
