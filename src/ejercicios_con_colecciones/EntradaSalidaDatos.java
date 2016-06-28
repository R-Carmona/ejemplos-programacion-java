package ejercicios_con_colecciones;


import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ruben
 */
public class EntradaSalidaDatos {

    public static void main(String[] args) {

        int intDirectorios = 0,
                intArchivos = 0,
                intEjecutable = 0,
                intTamaño = 0;
        
        String strRuta;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca directorio a examinar: ");
        strRuta = teclado.next();

        File lee_ruta = new File(strRuta);

        File[] ficheros = lee_ruta.listFiles();

        for (int i = 0; i < ficheros.length; i++) {

            if (ficheros[i].isDirectory()) {
                intDirectorios++;
                
                
                
            } else if (ficheros[i].canExecute()) {
                intEjecutable++;
                intTamaño+=ficheros[i].length();
            } else {
                intArchivos++;
                intTamaño+=ficheros[i].length();
            }
            System.out.println(ficheros[i].length());
        }
        
        System.out.println("Número Archivos:" + intArchivos);
        System.out.println("Número de Directorios:" + intDirectorios);
        System.out.println("Número de Ejecutables:" + intEjecutable);
        System.out.println("Tamaño:" + (intTamaño/1024) + "KByte");
    }
}

