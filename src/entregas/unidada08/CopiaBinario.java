/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidada08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author ruben
 */
public class CopiaBinario {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File origen=new File("ejercicio07.txt");
        File destino=new File("copia_ejercicio07.txt");
        
        InputStream in = new FileInputStream(origen);
        OutputStream out = new FileOutputStream(destino);
        
    byte[] buf = new byte[1024];
    int len;
     
    while ((len = in.read(buf)) > 0) {
      out.write(buf, 0, len);
    }
        
        
    }
    
}
