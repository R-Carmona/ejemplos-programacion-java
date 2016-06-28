/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidada08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author ruben
 */
public class NumerosAleatorios {
    
    public static void main(String[] args) throws IOException {
        
        String strLinea;
        String strFichero = "ejercicio07.txt";
        File fichero = new File(strFichero);
        //El archivo se generará dentro de la carpeta del proyecto.
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(strFichero));
        
        for (int i = 0; i < 5000; i++) {
            
            bw.write((int)(Math.random()*100000+1) + "\n");
                       
        }
        
        bw.close();
        
        int[] datosArchivo = new int[5000];
        
        BufferedReader br = new BufferedReader(new FileReader(strFichero));
        
        
        
        for (int i = 0; i < datosArchivo.length; i++) {
            
            
            datosArchivo[i]=Integer.parseInt(br.readLine());
           
            
        }
        
        br.close();
        
        Arrays.sort(datosArchivo);
        
        BufferedWriter bw2 = new BufferedWriter(new FileWriter(strFichero));
        
        for (int i = 0; i < datosArchivo.length; i++) {
            
            bw2.write(datosArchivo[i] + "\n");
            
        }
        
        bw2.close();
        
        
        
    }
    
    
    
    
}
