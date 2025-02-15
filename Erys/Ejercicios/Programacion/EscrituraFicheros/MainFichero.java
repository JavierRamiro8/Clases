package Programacion.EscrituraFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainFichero {
    private final static int VECESESCRITAS=3;
    public static void main(String[] args) throws IOException {
        String ficheroNuevecito="./Programacion/EscrituraFicheros/fichero3.txt";
        String ficheroCopia="./Programacion/EscrituraFicheros/Copia_de_fichero3.txt";
        
        BufferedWriter bw=new BufferedWriter(new FileWriter(ficheroNuevecito));
        BufferedReader br=new BufferedReader(new FileReader(ficheroNuevecito));
        BufferedWriter bwCopia=new BufferedWriter(new FileWriter(ficheroCopia));
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<VECESESCRITAS;i++){
            System.out.println("Escribe lo que quieras para añadir al archivo.");
            String content=sc.nextLine();
            bw.write(content);
            bw.newLine();
        }
        bw.close();
        String contentReader="";
        System.out.println("Realizando archivo copia....");
        while ((contentReader=br.readLine())!=null) {
            bwCopia.write(contentReader);
            bwCopia.newLine();
        }
        bwCopia.close();
        br.close();
        sc.close();
    }
}
