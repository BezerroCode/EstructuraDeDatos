package Campeonato;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese datos de jugadores");
        String nombre,apellidos,ci;
        int edad;
        int nJugadores=2;

        Jugador[] jugadores = new Jugador[nJugadores];

        for(int i=0;i<nJugadores;i++) {
            System.out.println("Ingrese nombre del jugador: "+(i+1)+": ");
            nombre = scanner1.next();
            System.out.println("ingrese apellidos del jugador: "+ (i+1) + ": ");
            apellidos = scanner1.next();
            System.out.println("ingrese ci del jugador: "+ (i+1) + ": ");
            ci = scanner1.next();
            System.out.println("ingrese edad del jugador: "+ (i+1) + ": ");
            edad = scanner1.nextInt();


            Jugador j1 = new Jugador();
            j1.setNombre(nombre);
            j1.setApellido(apellidos);
            j1.setCi(ci);
            j1.setEdad(edad);
            //j1.mostrarJugador();

            jugadores[i] = j1;
        }

        int nEquipos = 2;
        Equipo[] equipos = new Equipo[nEquipos];

        for (int j = 0; j < nEquipos; j++) {
            System.out.println("Ingresar nombre de equipo " + (j + 1) + ": ");
            String nombreEquipo = scanner1.next();
            System.out.println("Ingresar categoria de equipo " + (j + 1) + ": ");
            String categoria = scanner1.next();


            Equipo equ1 = new Equipo();
            equ1.setNombreEquipo(nombreEquipo);
            equ1.setCategoria(categoria);
            equ1.setjugadores(jugadores);

            equ1.mostrarEquipo();
            equipos[j] = equ1;

        }
        Equipo equ1 = new Equipo("Always","Varones",jugadores);
        equ1.mostrarEquipo();

    }
}
