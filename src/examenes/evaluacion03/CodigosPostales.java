/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import static java.util.Spliterators.iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.get;

/**
 *
 * @author ruben
 */
public class CodigosPostales {

    private BufferedReader br;
    private String strCodigosPostales,
            strPoblacion,
            strLinea;
    private String[] miArray;
    private Map<Object,Object> miMapa=new HashMap<Object,Object>();
    

    public CodigosPostales() {

        try {
            FileReader fr = new FileReader("codigos postales.txt");
            br = new BufferedReader(fr);

        } catch (FileNotFoundException ex) {
            System.out.println("Error de lectura del archivo.");
        }

        try {
            while ((strLinea = br.readLine()) != null) {

                miArray = strLinea.split(":");             
               
                strPoblacion = miArray[1];
                strCodigosPostales = miArray[0];
                 
                 
                 if (miMapa.containsKey(miArray[0])) {
                     
                    strPoblacion+="\n" + miMapa.get(miArray[0]);
                     
                     miMapa.replace(miArray[0], strPoblacion);
                     
                    
                }else{
                     
                     
                     miMapa.put(miArray[0],miArray[1]);
                     
                 }
                

            }
        } catch (IOException ex) {
            System.out.println("Error al coger los datos.");
        }

    }

    public void imprimirDatos() {
        
        FileReader fr;
        try {
            fr = new FileReader("codigos postales.txt");
             br = new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CodigosPostales.class.getName()).log(Level.SEVERE, null, ex);
        }
           

        try {
            while (br.readLine() != null) {

                System.out.println(br.readLine());

            }
        } catch (IOException ex) {
            System.out.println("Error al imprimir los datos");
        }
        
        try {
            br.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar el archivo");
        }
        
        

    }
    
    public void obtenerDatos(String s){
        
       
       
        System.out.println(miMapa.get(s));
        
        
        
    }

    public static void main(String[] args) {

        CodigosPostales misCodigosPostales = new CodigosPostales();
               
        misCodigosPostales.obtenerDatos("30412");
        

    }

}

class PrimareKey{

    public String getStrCodigoPostal() {
        return strCodigoPostal;
    }
    String strCodigoPostal;

    public PrimareKey(String strCodigoPostal) {
        this.strCodigoPostal = strCodigoPostal;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.strCodigoPostal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PrimareKey other = (PrimareKey) obj;
        if (!Objects.equals(this.strCodigoPostal, other.strCodigoPostal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return strCodigoPostal;
    }
    
    
    
}

class Poblaciones{
    String strPoblaciones;

    public Poblaciones(String strPoblaciones) {
        this.strPoblaciones = strPoblaciones;
    }

    @Override
    public String toString() {
        return " " + strPoblaciones;
    }
    
    
    
}
