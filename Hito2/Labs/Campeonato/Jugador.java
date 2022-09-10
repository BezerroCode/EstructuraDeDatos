package Campeonato;

public class Jugador {

    private String nombre;
    private String apellido;
    private String ci;
    private int edad;

    public Jugador(String nombre, String Apellido, String ci,int edad) {
        this.nombre = nombre;
        this.apellido = Apellido;
        this.ci = ci;
        this.edad = edad;
    }

    public Jugador() {

    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        System.out.println("Este es el apellido");
        return this.apellido;
    }
    public String getCi() {
        return this.ci;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }
    public void setCi(String nuevoCi) {
        this.ci = nuevoCi;
    }
    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    public void mostrarJugador(){
        System.out.println("---------------Mostar datos del Jugador---------------");
        System.out.println("Nombre del Jugador: "+this.getNombre());
        System.out.println("Apelludo del Jugador: "+this.getApellido());
        System.out.println("Ci del Jugador: "+this.getCi());
        System.out.println("Edad del Jugador: "+this.getEdad());
    }
}

