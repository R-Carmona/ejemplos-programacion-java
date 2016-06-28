/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidada08;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ContenidoDirectorio {
    
     static   int intTotalFicheros = 0;
     static   int intTotalDirectorios = 0;
     static   long longTotalKilobytes = 0;

    public static void main(String[] args) {

        String strDir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la dirección de un directorio:");
        strDir = teclado.next();

        File f1 = new File(strDir);
        getListaDirectorio(f1, strDir);
        
        System.out.println("Total directorios : " + intTotalDirectorios);
        System.out.println("Total archivos : " + intTotalFicheros);
        System.out.println("Total Kilobytes : " + longTotalKilobytes);
        System.out.println("Total Megabytes :" + longTotalKilobytes/1024);
        System.out.println("Total Gygaabytes :" + (longTotalKilobytes/1024)/1024);
    }

    //Generamos un método recursivo para que liste el contenido total.
    public static void getListaDirectorio(File f, String c) {

        

        if (f.isDirectory()) {

            File[] s = f.listFiles();

            for (int i = 0; i < s.length; i++) {

                if (s[i].isDirectory()) {
                    intTotalDirectorios++;
                    getListaDirectorio(s[i], c + "");
                } else if (s[i].isFile()) {

                    intTotalFicheros++;
                    longTotalKilobytes += s[i].length();
                }

            }

        }
        
        
        
       
                
                

    }
    
    

}
