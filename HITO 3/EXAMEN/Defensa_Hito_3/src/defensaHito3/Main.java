package defensaHito3;

public class Main {
    public static void main(String[] args) {
        PilaEstudiantes pila = new PilaEstudiantes(5);
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", 24, "Cochabamba", 15, "123456");
        Estudiante estudiante2 = new Estudiante("Maria", "Gomez", 23, "Cochabamba", 15, "123456");
        Estudiante estudiante3 = new Estudiante("Pedro", "Perez", 22, "Cochabamba", 15, "123456");
        Estudiante estudiante4 = new Estudiante("Luis", "Perez", 21, "Cochabamba", 51, "123456");
        Estudiante estudiante5 = new Estudiante("Ana", "Perez", 51, "Cochabamba", 15, "123456");

        pila.adicionar(estudiante1);
        pila.adicionar(estudiante2);
        pila.adicionar(estudiante3);
        pila.adicionar(estudiante4);
        pila.adicionar(estudiante5);
        //pila.mostrar();
        //mayor50(pila,50,"Cochabamba");
        mayor501(pila,50,"Cochabamba");
        //muevePosition2(pila,estudiante2);
}

    public static void mayor50(PilaEstudiantes pila,int cantidad,String nombre){

        PilaEstudiantes aux = new PilaEstudiantes(10);
        Estudiante estudianteElimimnado= null;
        String valor = "";
        int mayor=0;
        while(!pila.esVacio()){
            estudianteElimimnado=pila.eliminar();

            if(estudianteElimimnado.getEdad()>cantidad | valor==nombre){
                mayor=mayor+1;
            }
            aux.adicionar(estudianteElimimnado);
        }
        pila.vaciar(aux);
        System.out.println("Cantidad mayor a 50 es: "+mayor);
    }

    public static void muevePosition2(PilaEstudiantes pila,Estudiante elemento) {
        PilaEstudiantes aux = new PilaEstudiantes(10);
        Estudiante valorExtraidoDeLaPila=null;
        while (pila.esVacio()==false){
            valorExtraidoDeLaPila=pila.eliminar();
            if (valorExtraidoDeLaPila!=elemento) {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(elemento);
        pila.mostrar();
    }

    public static void cambiaSentido(PilaEstudiantes pila){
        PilaEstudiantes aux= new PilaEstudiantes(10);
        Estudiante ultimoEliminado = pila.eliminar();
        Estudiante estudianteEliminado = null;
        Estudiante primerEliminado = null;

        while(!pila.esVacio()){
            estudianteEliminado=pila.eliminar();
            aux.adicionar(estudianteEliminado);
        }

        primerEliminado = aux.eliminar();
        aux.adicionar(ultimoEliminado);
        pila.vaciar(aux);
        pila.adicionar(primerEliminado);
        pila.mostrar();
    }

    public static void muevePosition(PilaEstudiantes pila,Estudiante elemento) {
        PilaEstudiantes aux = new PilaEstudiantes(10);
        Estudiante valorExtraidoDeLaPila=null;
        int min=0;
        while (pila.esVacio()==false){
            valorExtraidoDeLaPila=pila.eliminar();
            if (valorExtraidoDeLaPila!=elemento) {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(elemento);
        pila.mostrar();
    }

    public static void mayor501(PilaEstudiantes pila,int cantidad,String nombre){

        PilaEstudiantes aux = new PilaEstudiantes(10);
        Estudiante estudianteElimimnado= null;
        String valor = "";
        int mayor=0;
        while(!pila.esVacio()){
            estudianteElimimnado=pila.eliminar();

            if(estudianteElimimnado.getNotaFinal()>cantidad && estudianteElimimnado.getSede()==nombre){
                estudianteElimimnado.mostrarEstudiante();
            }
            aux.adicionar(estudianteElimimnado);
        }
        pila.vaciar(aux);
    }

}
