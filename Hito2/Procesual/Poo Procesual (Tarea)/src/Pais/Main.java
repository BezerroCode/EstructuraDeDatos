package Pais;

public class Main {
    public static void main(String[] args) {
        //INSTANCIAR PROVINCIA
        Provincia p1 = new Provincia("Achocalla");
        Provincia p2 = new Provincia("Dentista");
        Provincia p3 = new Provincia("Tiradentes");
        Provincia p4 = new Provincia("Guarulhos");

        Provincia[] pro1 = new Provincia[2];
        pro1[0] = p1;
        pro1[1] = p2;

        Provincia[] pro2 = new Provincia[2];
        pro2[0] = p3;
        pro2[1] = p4;


        //INSTANCIAR DEPARTAMENTOS

        Departamento dep1 = new Departamento("La Paz", pro1);
        Departamento dep2 = new Departamento("Oruro", pro2);

        Departamento[] dep = new Departamento[2];
        dep[0] = dep1;
        dep[1] = dep2;

        //INSTANCIAR PAIS
        Pais pais1 = new Pais();
        pais1.agregaNuevoDepartamento(dep);
        pais1.mostrarPais();

    }
}



