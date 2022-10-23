package PilaDeClientes;

public class Main {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Juan", "Perez", 20, "Acre", "Masculino");
        Clientes cliente2 = new Clientes("Maria", "Gomez", 25, "Mirapiranga", "Femenino");
        Clientes cliente3 = new Clientes("Pedro", "Gonzales", 30, "Distrito federal", "Masculino");
        Clientes cliente4 = new Clientes("Luis", "Perez", 35, "Rio de janeiro", "Masculino");
        Clientes cliente5 = new Clientes("Ana", "Gomez", 40, "Avenida tiradentes", "Femenino");

        PilaCliente pila = new PilaCliente(5);
        pila.insertar(cliente1);
        pila.insertar(cliente2);
        pila.insertar(cliente3);
        pila.insertar(cliente4);
        pila.insertar(cliente5);
        //pila.mostrar();

        //mayoresCiertaEdad(pila, 20);
        //moverKesimo(pila, cliente3);
        //asignarDireccion(pila, "Av. Siempre Viva 123");
        reordenaPila(pila);

    }

//12.Determinar cuántos CLIENTES son mayores de 20 años.
// El método deberá llamarse mayoresCiertaEdad(Pila, edadMayor)
// El método debe ser creado en la clase MAIN como un método estático.
// El método recibe 2 parámetros
// -La Pila de Clientes
// -El valor de la edad.

    public static void mayoresCiertaEdad(PilaCliente pila, int edadMayor){
        int contador = 0;
        Clientes elem = null;
        if(pila.esvacio()){
            System.out.println("La pila esta vacia");
        } else {
            while(!pila.esvacio()){
                elem = pila.eliminar();
                if(elem.getEdad() > edadMayor){
                    contador++;
                }
            }
        }
        System.out.println("Hay " + contador + " clientes mayores de " + edadMayor + " años");
    }

//13.Mover el k-ésimo elemento al final de la pila.
// El método deberá llamarse moverKesimo(Pila, k)
// El método debe ser creado en la clase MAIN como un método estático.
// El método recibe 2 parámetros
// -La Pila de Clientes
// -El valor de k
    public static void moverKesimo(PilaCliente pila, Clientes k){
        PilaCliente aux = new PilaCliente(10);
        Clientes valorExtraidoPila=null;
        while(!pila.esvacio()){
            valorExtraidoPila = pila.eliminar();
            if(valorExtraidoPila!= k){
                aux.insertar(valorExtraidoPila);
            }
        }
        pila.vaciar(aux);
        pila.insertar(k);
        pila.mostrar();
    }
//14.Cambiar la dirección de algunos CLIENTES de la PILA.
// El método deberá llamarse asignarDireccion(Pila, nuevaDireccion)
// El método debe ser creado en la clase MAIN como un método estático.
// El método recibe 2 parámetros
// -La Pila de Clientes
// -La nueva dirección
//Cambiar la dirección del cliente siempre y cuando el género sea FEMENINO.

    public static void asignarDireccion(PilaCliente pila, String nuevaDireccion){
      PilaCliente aux= new PilaCliente(10);
        Clientes valorExtraidoPila=null;
        while(!pila.esvacio()){
            valorExtraidoPila = pila.eliminar();

            if(valorExtraidoPila.getGenero().equals("Femenino")){
                valorExtraidoPila.setDireccion(nuevaDireccion);
                valorExtraidoPila.mostrarDatos();
            }
            aux.insertar(valorExtraidoPila);
        }
        pila.vaciar(aux);
    }
//15.Mover ÍTEMS de la PILA.
//El método deberá llamarse reordenaPila(Pila)
//El método debe ser creado en la clase MAIN como un método estático.
//El método recibe 1 parámetro
// -La Pila de Clientes
//El método debe reordenar la pila de tal manera que los clientes de género FEMENINO queden al final de la pila.

    public static void reordenaPila(PilaCliente pila){
        PilaCliente aux= new PilaCliente(10);
        Clientes valorExtraidoPila=null;
        while(!pila.esvacio()){
            valorExtraidoPila = pila.eliminar();
            if(valorExtraidoPila.getGenero().equals("Femenino")){
                valorExtraidoPila.mostrarDatos();}
            else{
                aux.insertar(valorExtraidoPila);
            }

        }
        pila.vaciar(aux);
        pila.mostrar();
    }

}
