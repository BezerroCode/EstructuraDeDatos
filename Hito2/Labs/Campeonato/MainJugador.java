package Campeonato;

public class MainJugador {
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        j1.setApellido("Rafael");
        j1.mostrarJugador();

        Jugador j2 = new Jugador("Daniel","Zepulvida","637547-Lp",18);
        j2.getApellido();

        Jugador [] jugadores= new Jugador[2];
        jugadores[0]=j1;
        jugadores[1]=j2;

        Equipo equi1= new Equipo("Sao Paulo", "varones",jugadores);
        equi1.mostrarEquipo();

        Equipo [] equipos = new Equipo[1];
        equipos[0]=equi1;

        Campeonato cam1 = new Campeonato("Barcelona",equipos);
        cam1.mostrarCampeonato();

    }
}
