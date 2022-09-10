package Vehiculos;

public class Vehiculo {

    private String nombre;
    private String color;
    private String modelo;
    private String tamaño;
    private String marca;

    //soy el constructor con todos los parametros
    public Vehiculo(String nombre, String color, String modelo, String tamaño, String marca) {
        this.nombre = nombre;
        this.color = color;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.marca = marca;
    }
    //constructor sin parametos
    public Vehiculo() {

    }
    //metodos estos deben tener void o retornar un valor
    public void mover(){
        System.out.println("soy un metodod que permite Mover");
    }

    public void frenar(){
        System.out.println("soy un metod que permite frenar");
    }

    public void GIzquierda(){
        System.out.println("soy un metodod que permite GIzquierda");
    }

    public void GDerecha(){
        System.out.println("soy un metodod que permite GDerecha");
    }

    public void CambiarCarril(){
        System.out.println("soy un metodod que permite CambiarCarril");
    }

    //crear un metodo para mostrar

    public void MostrarVehiculo(){
        System.out.println("Nombre Vehiculo: "+this.nombre);
        System.out.println("Mostrar Color: "+this.color);
        System.out.println("Mostrar Modelo: "+this.modelo);
        System.out.println("Mostrar Tamaño: "+this.tamaño);
        System.out.println("Mostrar Marca: "+this.marca);
    }

    //metodo para obtener el nombre
    public String GetNombreVehiculo(){
        return this.nombre;
    }
    //establecer un nuevoColor
    public void SetColores(String NuevoColor){
        this.color = NuevoColor;
    }


    public void setColor(String NuevoColor) {
        this.color = NuevoColor;
    }
}


