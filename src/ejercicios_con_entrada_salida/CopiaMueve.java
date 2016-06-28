/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_entrada_salida;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author ruben
 */
public class CopiaMueve {
    
    public static void copia(String origen, String destino) throws IOException{
        
        Path DESDE=Paths.get(origen);
        Path HACIA=Paths.get(destino);
        
        CopyOption[] opciones= new CopyOption[]{
            StandardCopyOption.REPLACE_EXISTING,
            StandardCopyOption.COPY_ATTRIBUTES
        };
        
       Files.copy(DESDE,HACIA,opciones);
        
        
    }
    
    public static void main(String[] args) throws IOException {
        
        CopiaMueve.copia("/home/ruben/hola.txt", "/home/ruben/Descargas");
    }
    
}
