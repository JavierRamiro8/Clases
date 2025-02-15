package Programacion.LecturaFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainFicheros {
    public static void main(String[] args) throws IOException {

        String fichero1 = "./Programacion/Ficheros/fichero1.txt";
        String fichero2 = "./Programacion/Ficheros/fichero2.txt";

        BufferedReader br = new BufferedReader(new FileReader(fichero1));
        BufferedReader br2 = new BufferedReader(new FileReader(fichero2));

        String fichero1Content;
        String fichero2Content;
        boolean sonIguales=true;

        while ((fichero1Content = br.readLine()) != null && (fichero2Content = br2.readLine()) != null && sonIguales==true) {
            System.out.println("Fichero 1:" + fichero1Content);
            System.out.println("Fichero 2:" + fichero2Content);
        }
        if (sonIguales) {
            System.out.println("El fichero son iguales");
        }else{
            System.out.println("El fichero son diferentes");
        }

        br.close();
        br2.close();
    }
}
