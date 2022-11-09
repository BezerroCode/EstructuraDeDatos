package ManejoDeColasHito4.ColaNumeros;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros(5);
        numeros.insertar(10);
        numeros.insertar(100);
        numeros.insertar(200);
        numeros.insertar(400);
        numeros.insertar(500);
        //numeros.mostrar();
        numeroMenor(numeros);
    }
    //obtener el numero menor
    public static void numeroMenor(Numeros numeros){
        Numeros aux =new Numeros(100);
        int menor =100;
        int valorExtraidoDeLaPila=0;
        while(numeros.esVacio()==false ){
            valorExtraidoDeLaPila=numeros.eliminar();
            if (valorExtraidoDeLaPila<menor){
                menor=valorExtraidoDeLaPila;
            }
            aux.insertar(valorExtraidoDeLaPila);
        }
        numeros.vaciar(aux);
        System.out.println("\nEl numero menor es: " + menor);
    }

}

