package Campeonato;

import java.util.Scanner;

public class MainPrueba {
    public static void main(String[] args) {
        //crear dos campeonatos
        //dps equipos
        //dos jugadores
        Scanner scanner = new Scanner(System.in);
        int nCampeonatos = 2;

        Campeonato[] campeonatos = new Campeonato[nCampeonatos];
        Equipo[] equipos = new Equipo[nCampeonatos];

        for (int j = 0; j < nCampeonatos; j++) {
            System.out.println("Ingresar nombre de campeonatos: " + (j + 1) + ": ");
            String nombreCampeonato = scanner.next();

            String nombreEquipo, categoriaEquipo;
            int nEquipos = 2;

            for (int i = 0; i < nEquipos; i++) {
                System.out.println("ingrese nombre del equipo" + (i + 1) + ": ");
                nombreEquipo = scanner.next();
                System.out.println("ingrese categoria del equipo" + (i + 1) + ": ");
                categoriaEquipo = scanner.next();

                String nombreCompleto, apellidos, ci;
                int edad;
                int njugadores = 2;
                Jugador[] jugadores = new Jugador[njugadores];


                for (int k = 0; k < njugadores; k = k + 1) {

                    System.out.println("ingrese nombre del jugador: " + (i + 1) + ": ");
                    nombreCompleto = scanner.next();
                    System.out.println("ingrese apellidos del jugador1: " + (i + 1) + ": ");
                    apellidos = scanner.next();
                    System.out.println("ingrese ci del jugador1: " + (i + 1) + ": ");
                    ci = scanner.next();
                    System.out.println("ingrese edad del jugador1: " + (i + 1) + ": ");
                    edad = scanner.nextInt();

                    Jugador jug = new Jugador();
                    jug.setNombre(nombreCompleto);
                    jug.setApellido(apellidos);
                    jug.setCi(ci);
                    jug.setEdad(edad);
                    jug.mostrarJugador();
                    jugadores[k] = jug;

                }



            }

        }
    }
}