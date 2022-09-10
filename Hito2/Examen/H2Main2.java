package H2Defensa;

public class H2Main2 {
    public static void main(String[] args) {
        Provincia pr1 = new Provincia("MK");
        Provincia pr2 = new Provincia("jjk");
        Provincia pr3 = new Provincia("hf");
        Provincia pr4 = new Provincia("jk");

        Provincia[] prov = new Provincia[4];
        prov[0] = pr1;
        prov[1] = pr2;
        prov[2] = pr3;
        prov[3] = pr4;

        Departamento dep1 = new Departamento("Santa cruz",2,prov);
        Departamento dep2 = new Departamento("Oruro",2,prov);

        Departamento [] dep = new Departamento[2];
        dep[0] = dep1;
        dep[1] = dep2;

        Pais pais1 = new Pais("Bolivia",2,dep);
        pais1.mostrarPais();
    }
}
