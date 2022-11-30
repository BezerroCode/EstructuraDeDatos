package defensa_colas_hito4;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Saul", "Dani", 20, "Brasil", "Masculino", "Silver");
        Cliente c2 = new Cliente("Dania", "Aliel", 30, "Chile", "Femenino", "Gold");
        Cliente c3 = new Cliente("Marcos", "Castaneda", 80, "Mexico", "Masculino", "Vip");
        Cliente c4 = new Cliente("Daniel", "Orivaldo", 50, "Paraguay", "Masculino", "Silver");
        Cliente c5 = new Cliente("Ana", "Gomez", 65, "Brasil", "Femenino", "Gold");

        Cliente c6 = new Cliente("Carlos", "Grimes", 20, "Brasil", "Masculino", "Silver");
        Cliente c7 = new Cliente("gistavo", "ariel", 30, "Chile", "Femenino", "Gold");
        Cliente c8 = new Cliente("Jao", "neida", 80, "Mexico", "Masculino", "Vip");
        Cliente c9 = new Cliente("Gui", "Silva", 50, "Paraguay", "Masculino", "Silver");
        Cliente c10 = new Cliente("Maria", "Salazar", 65, "Brasil", "Femenino", "Gold");


        ColaDeClientes colaCli = new ColaDeClientes(100);
        colaCli.insertar(c1);
        colaCli.insertar(c2);
        colaCli.insertar(c3);
        colaCli.insertar(c4);
        colaCli.insertar(c5);

        ColaDeClientes colaCli2 = new ColaDeClientes(100);
        colaCli2.insertar(c6);
        colaCli2.insertar(c7);
        colaCli2.insertar(c8);
        colaCli2.insertar(c9);
        colaCli2.insertar(c10);

        //colaCli.mostrar();
        //convertirClientes(colaCli);
        moverSaul(colaCli, colaCli2);
    }
    //determinar cuantos clientes son deel pais Brasil
    public static void clientesPais(ColaDeClientes colaCli){
        int cont=0;
        while(!colaCli.esVacio()){
            Cliente c = colaCli.eliminar();
            if(c.getPais().equals("Brasil")){
                cont++;
            }
        }
        System.out.println("Hay "+cont+" clientes de Brasil");
    }
    //mover al inicio de la cola Cli2 el que se llama saul de la colaCli
    public static void moverSaul(ColaDeClientes colaCli, ColaDeClientes colaCli2){
        while(!colaCli.esVacio()){
            Cliente c = colaCli.eliminar();
            if(c.getNombre().equals("Saul")){
                colaCli2.insertar(c);
            }else{
                colaCli2.insertar(c);
            }
        }
        colaCli2.mostrar();
    }
}
