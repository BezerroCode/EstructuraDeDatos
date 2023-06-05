<h1 align="center"> ESTRUCTURA DE DATOS  </h1>

<img src="https://i.ibb.co/xXm2GVW/imagen-2022-11-06-110555514.png" alt="imagen-2022-10-27-001820228" border="0">


<h1 align="center"> PORTAFOLIO</h1>



## ➤ HITO 2 
##  POO
- 📝 Repositorio del  [Hito 2](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/Hito2)
### [LABORATORIOS](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/Hito2/Labs)
### [EVALUACION PROCESUAL](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/Hito2/Procesual) 
### [EXAMEN](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/Hito2/Examen) 


## ➤ Code Example Poo in Java

```JAVA
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

```



## ➤ HITO 3  
##  PILAS (STACK)
- 📝 Repositorio del  [Hito 3](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%203)
### [LABORATORIOS](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%203/LABS/PilasPoo)
### [EVALUACION PROCESUAL](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%203/PROCESUAL) 
### [EXAMEN](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%203/EXAMEN/Defensa_Hito_3) 

## ➤ ESTRUCTURA DE UNA PILA (STACK)
```JAVA
public class PilaNumeros {
    private int tope;
    private int max;
    private int[] pilaNums;

    //constructor
    public PilaNumeros(int max) {
        this.max = max;
        this.tope = 0;
        this.pilaNums = new int[this.max + 1];
    }

    //metodos
    public boolean esVacio() {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLleno() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElementos() {
        return this.tope;
    }

    public void adicionar(int nuevoElemento) {
        if (!esLleno()) {
            this.tope = this.tope + 1;
            pilaNums[this.tope] = nuevoElemento;
        } else {
            System.out.println("Pila llena");
        }
    }

    public int eliminar() {
        int elementoEliminado = 0;
        if (!esLleno()) {
            elementoEliminado = pilaNums[this.tope];
            this.tope = this.tope - 1;
        } else {
            System.out.println("No se puede eliminar una pila vacia");
        }
        return elementoEliminado;
    }

    public void llenar() {
    }

    public void mostrar() {
        int elem;
        if (esVacio()) {
            System.out.println("Pila vacia");
        } else {
            System.out.println("-------------DATOS DE LA PILA---------------");
            PilaNumeros aux = new PilaNumeros(10);
            while (!esVacio()) {
                elem = eliminar();
                aux.adicionar(elem);
                System.out.println("Elemento: " + elem);
            }
            vaciar(aux);
        }
    }

    public void vaciar(PilaNumeros a) {
        while (!a.esVacio()) {
            adicionar(a.eliminar());
        }
    }
}
```


## ➤ HITO 4
##  COLAS (QUEUES)
- 📝 Repositorio del  [Hito 4](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%204)
### [LABORATORIOS](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%204/LABS/Colas/src/ManejoDeColasHito4/ColaNumeros)
### [EVALUACION PROCESUAL](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%204/PROCESUAL) 
### [EXAMEN](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%204/EXAMEN/Defensa_Hito_4/src/defensa_colas_hito4) 


## ➤ ESTRUCTURA DE UNA COLA (QUEUE)
```JAVA
public class Numeros {
    private int max;
    private int fin;
    private int ini;
    private int cNum[];

    public Numeros(int max){
        this.max = max;
        this.cNum= new int[this.max+1];
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacio(){
        if(this.ini==0 && this.fin==0){
            return true;
        }else {
            return false;
        }
    }

    public boolean esLleno(){
        if(this.fin==this.max){
            return true;
        }else {
            return false;
        }
    }

    public int nroElementos(){
        return fin-ini;
    }

    public void insertar(int elemento){
        if(!esLleno()){
            fin++;
            cNum[fin]=elemento;
        }else{
            System.out.println("La cola esta llena");
        }
    }
    // inicio = 0        1,2,3,4,5              final=5

    public int eliminar(){
        int elemento=0;
        if(!esVacio()){
            ini++;
            elemento=cNum[ini];
            if (ini==fin){
                ini=0;
                fin=0;
            }
        }else{
            System.out.println("La cola esta vacia");
        }
        return elemento;
    }

    public void mostrar(){
        if(esVacio()){
            System.out.println("La cola esta vacia");
        }else{
            int elementoEliminado=0;
            System.out.println("Mostrando datos de la cola");
            Numeros aux= new Numeros(this.max);
            while(!esVacio()){
                elementoEliminado=eliminar();
                System.out.println("valor: " + elementoEliminado);
                aux.insertar(elementoEliminado);
            }
            vaciar(aux);
        }
    }

    public void vaciar(Numeros aux) {
        int elementoEliminado=0;
        while(!aux.esVacio()){
            elementoEliminado=aux.eliminar();
            insertar(elementoEliminado);
        }
    }

}
```

## ➤ HITO 5
##  PROYECTO FINAL
- 📝 Repositorio del  [Hito 5](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%205)
### [CODIGO PROYECTO](https://github.com/FreddyMachaca/EstructuraDeDatos/tree/main/HITO%205/Shitpost-Game-Memory)
### [DIAPOSITIVAS](https://github.com/FreddyMachaca/EstructuraDeDatos/blob/main/HITO%205/DIAPOSITIVAS.pdf) 

