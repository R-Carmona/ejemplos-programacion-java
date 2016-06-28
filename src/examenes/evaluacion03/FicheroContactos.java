/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class FicheroContactos {

    private BufferedReader br;
    private String strNombre,
            strEmail,
            strTelefono,
            strMovil,
            strLinea;

    int intContSinMail,
            intConSinTelefonos,
            intContNull;
    
    
    ArrayList<Contacto> listaDefinitiva = new ArrayList<Contacto>();

    private String miArray[] = new String[4];

    private HashSet<Contacto> contactosArchivo = new HashSet<Contacto>();

    public FicheroContactos() {

        try {
            FileReader fr = new FileReader("contactos.txt");
            br = new BufferedReader(fr);

        } catch (FileNotFoundException ex) {
            System.out.println("Error al cargar el archivo");
        }

        try {
            while ((strLinea = br.readLine()) != null) {

                miArray = strLinea.split(":");

                //No he podido solucinar una excepción en el array, he puesto un if
                //para poder seguir con el ejercicio.
                if (miArray.length == 4) {

                    strMovil = miArray[3];
                    strTelefono = miArray[2];
                    strEmail = miArray[1];
                    strNombre = miArray[0];

                }

                contactosArchivo.add(new Contacto(strNombre, strEmail, strTelefono, strMovil));

            }
        } catch (IOException ex) {
            System.out.println("Error de lectura del buffer.");
        }
        
        try {
            br.close();
        } catch (IOException ex) {
            System.out.println("Error al cerrar el archivo");
        }
        
        for (Iterator<Contacto> iterator = contactosArchivo.iterator(); iterator.hasNext();) {
            Contacto next = iterator.next();
            
            listaDefinitiva.add(next);
            
            
        }
        
        
        
        

    }
    
    public void leerLista(){
        
         for (Iterator<Contacto> iterator = listaDefinitiva.iterator(); iterator.hasNext();) {
            Contacto next = iterator.next();
            System.out.println(next.toString());

        }
        
    }

    public static void main(String[] args) {

        FicheroContactos miListaContactos = new FicheroContactos();
               
        miListaContactos.listaDefinitiva.sort(Contacto.nombreAscendente());
        
        miListaContactos.leerLista();
        
        
        

    }
    
    public void datosFichero(){
        
        for (Iterator<Contacto> iterator = contactosArchivo.iterator(); iterator.hasNext();) {
            Contacto next = iterator.next();
            System.out.println(next);
            
        }
    }
    
    public void grabarDatos(){
        
       FileWriter fw = null;
        try {
            fw = new FileWriter("contactos.txt");
        } catch (IOException ex) {
            System.out.println("Error al crear archivo para guardar datos ordenados.");
        }
        
        BufferedWriter bw = new BufferedWriter(fw);             
      
        
        for (Iterator<Contacto> iterator = listaDefinitiva.iterator(); iterator.hasNext();) {
            Contacto next = iterator.next();
            
         //fw.write(next);
            
        }
        
        
        
    }
    
    

}

class Contacto implements Comparable<Contacto> {

    private String strNombre,
            strEmail;
    private int intTelefono,
            intMovil;

    @Override
    public String toString() {
        return "Contacto{" + "strNombre=" + strNombre + ", strEmail=" + strEmail + ", intTelefono=" + intTelefono + ", intMovil=" + intMovil + '}';
    }

    public int getIntTelefono() {
        return intTelefono;
    }

    public void setIntTelefono(int intTelefono) {
        this.intTelefono = intTelefono;
    }

    public int getIntMovil() {
        return intMovil;
    }

    public void setIntMovil(int intMovil) {
        this.intMovil = intMovil;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public Contacto(String strNombre, String strEmail, String strTelefono, String strMovil) {
        this.strNombre = strNombre;
        this.strEmail = strEmail;
        this.intTelefono = Integer.parseInt(strTelefono);
        this.intMovil = Integer.parseInt(strMovil);
    }

    @Override
    public int compareTo(Contacto o) {
        return this.strEmail.compareTo(o.strEmail);
    }

    public static Comparator nombreAscendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                String strObj1 = ((Contacto) obj1).getStrNombre();
                String strObj2 = ((Contacto) obj2).getStrNombre();

                return (strObj1.compareTo(strObj2));

            }

        };
    }

    public static Comparator nombreDescendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                String strObj1 = ((Contacto) obj1).getStrNombre();
                String strObj2 = ((Contacto) obj2).getStrNombre();

                return (strObj2.compareTo(strObj1));

            }

        };
    }

    public static Comparator movilAscendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Contacto) obj1).getIntMovil();
                int intObj2 = ((Contacto) obj2).getIntMovil();

                if (intObj1 < intObj2) {
                    return -1;
                }

                if (intObj1 > intObj2) {
                    return 1;
                }
                return 0;

            }

        };
    }

    public static Comparator movilDescendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Contacto) obj1).getIntMovil();
                int intObj2 = ((Contacto) obj2).getIntMovil();

                if (intObj1 < intObj2) {
                    return 1;
                }

                if (intObj1 > intObj2) {
                    return -1;
                }
                return 0;

            }

        };

    }

    public static Comparator fijoAscendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Contacto) obj1).getIntTelefono();
                int intObj2 = ((Contacto) obj2).getIntTelefono();

                if (intObj1 < intObj2) {
                    return -1;
                }

                if (intObj1 > intObj2) {
                    return 1;
                }
                return 0;

            }

        };
    }

    public static Comparator fijoDescendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Contacto) obj1).getIntTelefono();
                int intObj2 = ((Contacto) obj2).getIntTelefono();

                if (intObj1 < intObj2) {
                    return 1;
                }

                if (intObj1 > intObj2) {
                    return -1;
                }
                return 0;

            }

        };

    }
    
    class ComparaNombresAscendentes implements Comparable<Contacto>{

        @Override
        public int compareTo(Contacto o) {
            return 1;
        }
        
        
    }

}
