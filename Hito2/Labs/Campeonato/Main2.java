package Campeonato;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        String nombre1,apellidos1,ci1;
        int edad1;
        System.out.println("Ingrese datos de jugadores");

        System.out.println("Ingresar nombre del jugador: ");
        nombre1 = scanner1.next();

        System.out.println("Ingresar apellido del jugador");
        apellidos1 = scanner1.next();

        System.out.println("Ingresar Ci del jugador");
        ci1 = scanner1.next();

        System.out.println("Ingresar edad del jugador");
        edad1 = scanner1.nextInt();

        Jugador j1 = new Jugador();
        j1.setNombre(nombre1);
        j1.setApellido(apellidos1);
        j1.setCi(ci1);
        j1.setEdad(edad1);

        j1.mostrarJugador();
        //THIS PERMITE ACEDER A TODOS LOS PARAMETROS

    }
}
