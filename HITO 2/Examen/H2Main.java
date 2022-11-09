package H2Defensa;

import java.util.Scanner;

public class H2Main {

     public static void main(String[] args) {

            Scanner lectura=new Scanner(System.in);
            int nPais =1;
            Pais[] pais = new Pais[nPais];

            for(int i=0;i<nPais;i++){
                System.out.println("Ingresar pais "+(i+1)+": ");
                String nombrePais = lectura.nextLine();
                System.out.println("Ingresar nro deps "+(i+1)+": ");
                int nroDep = lectura.nextInt();

                Pais pais1 = new Pais();
                pais1.setNombre(nombrePais);
                pais1.setNroDeps(nroDep);
                pais[i] = pais1;

                pais1.mostrarPais();

                int nDepartamento =2;
                Departamento[] departamentos = new Departamento[nDepartamento];

                for(int j=0;j<nDepartamento;j++){

                    System.out.println("Ingresar departamento "+(j+1)+": ");
                    String nombreDepartamento = lectura.nextLine();
                    System.out.println("nro Provencias "+(j+1)+": ");
                    int nroProve = lectura.nextInt();

                    Departamento dep1 = new Departamento();
                    dep1.setNombre(nombreDepartamento);
                    dep1.setNroProv(nroProve);
                    departamentos[j] = dep1;

                    dep1.mostrarDepartamento();

                    int nProvincia=2;
                    Provincia[] provincias = new Provincia[nProvincia];

                    for(int k=0;k<nProvincia;k++){

                        System.out.println("Ingresar provincia "+(k+1)+": ");
                        String nombrePovincia = lectura.nextLine();

                        Provincia pr1 = new Provincia();
                        pr1.setNombre(nombrePovincia);
                        provincias[k] = pr1;

                        pr1.mostrarProvincia();
                        dep1.mostrarDepartamento();
                        pais1.mostrarPais();

                    }

                }

            }


        }


}
