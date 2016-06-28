/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ruben
 */
public class AlumnosArrayList {
    
    public static void main(String[] args) {
        
        Alumno alumno01 = new Alumno("Rubén", "Carmona", 40);
        Alumno alumno02 = new Alumno("Alejandro", "Tomás", 55);
        Alumno alumno03 = new Alumno("Vicente", "Hernández", 48);
        Alumno alumno04 = new Alumno("Juan", "Pérez", 22);
        Alumno alumno05 = new Alumno("Julia", "Robert", 35);
        
        
        System.out.println("SIN ORDENAR");
        System.out.println(Alumno.listaAlumnos);
        
        
        
        System.out.println("ORDENADO POR NOMBRE ASCENDENTE");
        Collections.sort(Alumno.listaAlumnos, Alumno.nombreAscendente());
        System.out.println(Alumno.listaAlumnos);
        
        System.out.println("ORDENADO POR NOMBRE DESCENDENTE");
        Collections.sort(Alumno.listaAlumnos, Alumno.nombreDescendente());
                System.out.println(Alumno.listaAlumnos);

        
        System.out.println("ORDENADO POR APELLIDOS ASCENDENTE");
        Collections.sort(Alumno.listaAlumnos, Alumno.apellidoAscendente());
                System.out.println(Alumno.listaAlumnos);

        
        System.out.println("ORDENADO POR APELLIDOS DESCENDENTE");
        Collections.sort(Alumno.listaAlumnos, Alumno.apellidoDescendente());
                System.out.println(Alumno.listaAlumnos);

        
        System.out.println("ORDENADO POR EDAD ASCENDENTE");
        Collections.sort(Alumno.listaAlumnos, Alumno.edadAscendente());
                System.out.println(Alumno.listaAlumnos);

        
        System.out.println("ORDENADO POR EDAD DESCENDENTE");
        Collections.sort(Alumno.listaAlumnos, Alumno.edadDescendente());
                System.out.println(Alumno.listaAlumnos);

        
        
        
        
        
    }
    
    
    

}


class Alumno{
    
    private String strNombre;
    private String strApellidos;
    private int intEdad;
    public static ArrayList<Alumno> listaAlumnos=new ArrayList<Alumno>();
    
    
;
    

    public Alumno(String strNombre, String strApellidos, int intEdad) {
        
        
        this.strNombre = strNombre;
        this.strApellidos = strApellidos;
        this.intEdad = intEdad;
        
        listaAlumnos.add(this);
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrApellidos() {
        return strApellidos;
    }

    public void setStrApellidos(String strApellidos) {
        this.strApellidos = strApellidos;
    }

    public int getIntEdad() {
        return intEdad;
    }

    public void setIntEdad(int intEdad) {
        this.intEdad = intEdad;
    }

    @Override
    public String toString() {
        return "Nombre=" + strNombre + " Apellidos=" + strApellidos + " Edad=" + intEdad + "\n";
    }
    
    public static Comparator nombreAscendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                String strObj1 = ((Alumno) obj1).getStrNombre();
                String strObj2 = ((Alumno) obj2).getStrNombre();

                 return (strObj1.compareTo(strObj2));

            }

        };
    }
    
     public static Comparator nombreDescendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                String strObj1 = ((Alumno) obj1).getStrNombre();
                String strObj2 = ((Alumno) obj2).getStrNombre();

                 return (strObj2.compareTo(strObj1));

            }

        };
    }
     
     public static Comparator apellidoAscendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                String strObj1 = ((Alumno) obj1).getStrApellidos();
                String strObj2 = ((Alumno) obj2).getStrApellidos();

                 return (strObj1.compareTo(strObj2));

            }

        };
    }
    
     public static Comparator apellidoDescendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                String strObj1 = ((Alumno) obj1).getStrApellidos();
                String strObj2 = ((Alumno) obj2).getStrApellidos();

                 return (strObj2.compareTo(strObj1));

            }

        };
    }
     
    public static Comparator edadAscendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Alumno) obj1).getIntEdad();
                int intObj2 = ((Alumno) obj2).getIntEdad();

                if (intObj1 < intObj2) {
                    return -1;
                }

                if (intObj1> intObj2) {
                    return 1;
                }
                return 0;

            }

        };
    }

    public static Comparator edadDescendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Alumno) obj1).getIntEdad();
                int intObj2 = ((Alumno) obj2).getIntEdad();

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
    
    
    
    
}
