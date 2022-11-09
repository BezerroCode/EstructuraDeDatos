package Campeonato;

import java.util.Scanner;

public class Main3_Ing {
    public static void main(String[] args){
        System.out.println("main 3");


        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DE JUGADORES");

        String nombreCompleto, apellidos, ci;
        int edad;
        int njugadores = 2;

        String nombreEquipo, categoriaEquipo;
        int nEquipos = 2;

        for (int j = 0 ; j< nEquipos; j++){
            System.out.println("ingrese nombre del equipo"+ (j+1) + ": ");
            nombreEquipo = leer.next();
            System.out.println("ingrese categoria del equipo"+ (j+1) + ": ");
            categoriaEquipo = leer.next();

            Jugador[] jugadores = new Jugador[njugadores];

            for (int i=0 ; i < njugadores; i = i+1) {

                System.out.println("ingrese nombre del jugador: "+ (i+1) + ": ");
                nombreCompleto = leer.next();
                System.out.println("ingrese apellidos del jugador1: "+ (i+1) + ": ");
                apellidos = leer.next();
                System.out.println("ingrese ci del jugador1: "+ (i+1) + ": ");
                ci = leer.next();
                System.out.println("ingrese edad del jugador1: "+ (i+1) + ": ");
                edad = leer.nextInt();

                // jugador jug1= new jugador(nombreCompleto1, apellidos1, ci1, edad1);
                //jug1.mostrarJugador();

                Jugador jug = new Jugador();
                jug.setNombre(nombreCompleto);
                jug.setApellido(apellidos);
                jug.setCi(ci);
                jug.setEdad(edad);
                jug.mostrarJugador();

                jugadores[i] = jug;

            }

            Equipo eq1 = new Equipo();
            eq1.setNombreEquipo("el alto fc");
            eq1.setCategoria("varone");
            eq1.setjugadores(jugadores);
            eq1.mostrarEquipo();
        }

    }

}
