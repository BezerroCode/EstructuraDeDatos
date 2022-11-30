package ColaDeClientes;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Saul", "Dani", 20, "Brasil", "Masculino", "Silver");
        Cliente c2 = new Cliente("Dania", "Aliel", 30, "Chile", "Femenino", "Gold");
        Cliente c3 = new Cliente("Marcos", "Castaneda", 80, "Mexico", "Masculino", "Vip");
        Cliente c4 = new Cliente("Daniel", "Orivaldo", 50, "Paraguay", "Masculino", "Silver");
        Cliente c5 = new Cliente("Ana", "Gomez", 65, "Bolivia", "Femenino", "Gold");


        ColaDeClientes colaCli = new ColaDeClientes(100);
        colaCli.insertar(c1);
        colaCli.insertar(c2);
        colaCli.insertar(c3);
        colaCli.insertar(c4);
        colaCli.insertar(c5);


        Cliente c6 = new Cliente("Carlos", "Grimes", 20, "Brasil", "Masculino", "Silver");
        Cliente c7 = new Cliente("gistavo", "ariel", 30, "Chile", "Femenino", "Gold");
        Cliente c8 = new Cliente("Jao", "neida", 80, "Mexico", "Masculino", "Vip");
        Cliente c9 = new Cliente("Gui", "Silva", 50, "Paraguay", "Masculino", "Silver");
        Cliente c10 = new Cliente("Maria", "Salazar", 65, "Brasil", "Femenino", "Gold");

        ColaDeClientes colaCli2 = new ColaDeClientes(100);
        colaCli2.insertar(c6);
        colaCli2.insertar(c7);
        colaCli2.insertar(c8);
        colaCli2.insertar(c9);
        colaCli2.insertar(c10);

        //colaCli.mostrar();

        //cambiarTipoCliente(colaCli, "Bolivia", "Gold");
        //mover_Clientes_Por_Edad(colaCli, 60);

        //mover_Clientes_Por_Nombre(colaCli,colaCli2,"Saul");
    }

//13.Promoción para usuarios de Bolivia.
//○ En el mes de diciembre a todos los clientes de Bolivia se les dará una promoción
//    en cuanto a precios en viajes a nivel nacional.
//■ A todos los clientes que sean de nacionalidad boliviana y además el tipo
//    de cliente GOLD, convertir a estos clientes en VIP
//■ Es decir si es de Bolivia y es GOLD deberá ser ahora un cliente VIP
//○ El método estático dentro de la clase MAIN recibe 3 atributos
//■ La cola de clientes
//■ El tipo de cliente
//■ La nacionalidad del cliente.

    public static void cambiarTipoCliente(ColaDeClientes colaCli, String nacionalidad, String tipoCliente) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getPais().equals(nacionalidad) && c.getTipo().equals(tipoCliente)) {
                c.setTipo("VIP");
                colaAux.insertar(c);
            } else {
                colaAux.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        colaCli.mostrar();
    }

//14.Moviendo clientes en la cola.
//○ Mover al inicio todos los clientes mayores a 60 años.
//■ Es decir si el cliente es mayor a 60 deberá de moverlo al inicio de la cola.
//            ○ El método recibe 2 parámetros
//■ La Cola de Clientes
//■ El valor(int) de la edad.

    public static void mover_Clientes_Por_Edad(ColaDeClientes colaCli, int edad) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        ColaDeClientes colaAux2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getEdad() > edad) {
                colaAux.insertar(c);
            } else {
                colaAux2.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        while (!colaAux2.esVacio()) {
            colaCli.insertar(colaAux2.eliminar());
        }
        colaCli.mostrar();
    }

//15.Moviendo clientes entre 2 colas.
//○ Por razones de promociones de vuelo, es necesario cambiar de vuelo a ciertos
//    clientes.
//■ Crear 2 colas con 5 clientes.
//■ Todos los clientes cuyo nombre sea Saul deberán ser agregados a la  cola B.

    public static void mover_Clientes_Por_Nombre(ColaDeClientes colaCli, ColaDeClientes colaCli2, String nombre) {
        ColaDeClientes colaAux = new ColaDeClientes(100);
        ColaDeClientes colaAux2 = new ColaDeClientes(100);
        while (!colaCli.esVacio()) {
            Cliente c = colaCli.eliminar();
            if (c.getNombre().equals(nombre)) {
                colaCli2.insertar(c);
            } else {
                colaAux.insertar(c);
            }
        }
        while (!colaAux.esVacio()) {
            colaCli.insertar(colaAux.eliminar());
        }
        colaCli.mostrar();
        colaCli2.mostrar();
    }

}


