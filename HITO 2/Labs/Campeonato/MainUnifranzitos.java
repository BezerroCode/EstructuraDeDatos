package Campeonato;

import java.util.Scanner;

public class MainUnifranzitos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nJugadores = 3;
        Jugador[] jugadores = new Jugador[nJugadores];

        for (int i = 0; i < nJugadores; i++) {
            System.out.println("Ingresar nombre de Jugador: " + (i + 1) + ": ");
            String nombre = scanner.next();
            System.out.println("apellido de Jugador: " + (i + 1) + ": ");
            String apellido = scanner.next();
            System.out.println("CI de Jugador: " + (i + 1) + ": ");
            String ci = scanner.next();
            System.out.println("edad de Jugador: " + (i + 1) + ": ");
            int edad = scanner.nextInt();

            Jugador j1 = new Jugador();
            j1.setNombre(nombre);
            j1.setApellido(apellido);
            j1.setCi(ci);
            j1.setEdad(edad);
            j1.mostrarJugador();
            jugadores[i] = j1;

        }

        int nEquipos = 2;
        Equipo[] equipos = new Equipo[nEquipos];

        for (int j = 0; j < nEquipos; j++) {
            System.out.println("Ingresar nombre de equipo: " + (j + 1) + ": ");
            String nombreEquipo = scanner.next();
            System.out.println("Ingresar categoria de equipo: " + (j + 1) + ": ");
            String categoria = scanner.next();


            Equipo equ1 = new Equipo();
            equ1.setNombreEquipo(nombreEquipo);
            equ1.setCategoria(categoria);
            equ1.setjugadores(jugadores);

            equ1.mostrarEquipo();
            equipos[j] = equ1;

        }
        int nCampeonatos=1;
        Campeonato[] campeonatos = new Campeonato[nCampeonatos];
        for (int j = 0; j < nCampeonatos; j++){
            System.out.println("Ingresar nombre de campeonatos: " + (j + 1) + ": ");
            String nombreCampeonato = scanner.next();

            Campeonato camp1 = new Campeonato();
            camp1.setNombreCampeonato(nombreCampeonato);
            camp1.setEquipos(equipos);
            camp1.mostrarCampeonato();
            campeonatos[j] = camp1;
        }


        //Campeonato cam1 = new Campeonato("Unifranzitos", equipos);
        //cam1.mostrarCampeonato();
    }
}
