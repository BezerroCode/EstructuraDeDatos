package Vehiculos;

import Vehiculos.Vehiculo;

public class MainVehiculo {
    public static void main(String[] args) {
        // instanciando vehiculo desde el constructor sin parametros
        Vehiculo v1= new Vehiculo();

        v1.GDerecha();
        v1.CambiarCarril();
        v1.frenar();
        //instanciado un vehiculo con todos los parametros
        Vehiculo v2= new Vehiculo("Hyonda","rojo","fast","4x4","Nissan");
        v2.mover();
        //crear un metodo que permite mostrar todos los parametros
        v2.MostrarVehiculo();

        v2.setColor("AZUL");
        v2.MostrarVehiculo();
        v2.GetNombreVehiculo();
    }
}
