package ManejoDeColasHito4.ColaNumeros;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(5);
        numeros.insertar(10);
        numeros.insertar(5);
        numeros.insertar(50);
        numeros.insertar(37);
        numeros.insertar(10);
        numeros.insertar(50);
        //numeros.mostrar();
        //numeroMenor(numeros);
        //numeroMayor(numeros);
        //menorValorAlPrincipio(numeros);
        //mostrarValoresNoRepetidos(numeros);
        mostrarValoresNoRepetidos(numeros);
    }

    //obtener el numero menor
    public static int numeroMenor(Numeros numeros) {
        Numeros aux = new Numeros(100);
        int menor = 100;
        int valorExtraidoDeLaPila = 0;
        while (numeros.esVacio() == false) {
            valorExtraidoDeLaPila = numeros.eliminar();
            if (valorExtraidoDeLaPila < menor) {
                menor = valorExtraidoDeLaPila;
            }
            aux.insertar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero menor es: " + menor);
        return menor;
    }

    //obtener el numero mayor
    public static void numeroMayor(Numeros numeros) {
        Numeros aux = new Numeros(100);
        int mayor = 0;
        int valorExtraidoDeLaPila = 0;
        while (numeros.esVacio() == false) {
            valorExtraidoDeLaPila = numeros.eliminar();
            if (valorExtraidoDeLaPila > mayor) {
                mayor = valorExtraidoDeLaPila;
            }
            aux.insertar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero mayor es: " + mayor);
    }

    //menor valor al principio
    public static void menorValorAlPrincipio(Numeros numeros) {
        int menorValor=numeroMenor(numeros);
        int valorEliminado=0;
        Numeros aux = new Numeros(100);
        while (numeros.esVacio() == false) {
            valorEliminado = numeros.eliminar();
            if (menorValor != valorEliminado) {
                aux.insertar(valorEliminado);
            }
        }
        numeros.insertar(menorValor);
        numeros.vaciar(aux);
        numeros.mostrar();
    }


    //mostrar los valores que no se repiten en la cola
    public static void mostrarValoresNoRepetidos(Numeros numeros) {
        int valorEliminado=0;
        Numeros aux = new Numeros(100);
        while (numeros.esVacio() == false) {
            valorEliminado = numeros.eliminar();
            if (numeros.buscar(valorEliminado) == false) {
                aux.insertar(valorEliminado);
                numeros.eliminar();
            }

        }
        numeros.vaciar(aux);
        numeros.mostrar();
    }


}


