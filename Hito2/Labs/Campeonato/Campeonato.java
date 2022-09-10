package Campeonato;

public class Campeonato {
    private String nombreCampeonato;
    private Equipo[] equipos1;

    public Campeonato(String nombreCampeonato, Equipo[] equipos1) {
        this.nombreCampeonato = nombreCampeonato;
        this.equipos1 = equipos1;
    }

    public Campeonato() {

    }

    public String getNombreCampeonato(){
        return this.nombreCampeonato;
    }
    public Equipo[] getEquipos1(){
        return this.equipos1;
    }

    public void setNombreCampeonato(String nuevoNombreCampeonato){
        this.nombreCampeonato = nuevoNombreCampeonato;
    }
    public void setEquipos(Equipo[] nuevoEquipos1) {
        this.equipos1 = nuevoEquipos1;
    }

    public void mostrarCampeonato() {
        System.out.println("---------------------------Datos del Campeonato-------------------------------------");
        System.out.println("Nombre Del Campeonato: "+this.getNombreCampeonato());


        for (int i = 0; i < getEquipos1().length; i++) {
            this.getEquipos1()[i].mostrarEquipo();
        }
    }

}
