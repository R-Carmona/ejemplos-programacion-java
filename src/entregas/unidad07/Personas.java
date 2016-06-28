/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidad07;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ruben
 */
public class Personas {
    
    private String strNombre;
    private String strDireccion;
    private float floDNI;
    
    static Set <Personas> todaspersonas = new HashSet<Personas>();

    public Personas(String strNombre, String strDireccion, float floDNI) {
        this.strNombre = strNombre;
        this.strDireccion = strDireccion;
        this.floDNI = floDNI;
        
        todaspersonas.add(this);
        
    }

    @Override
    public String toString() {
        return "HashCode: " + this.hashCode() + ", Personas{" + "strNombre=" + strNombre + ", strDireccion=" + strDireccion + ", floDNI=" + floDNI + '}';
    }

  
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Float.floatToIntBits(this.floDNI);
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
        final Personas other = (Personas) obj;
        if (Float.floatToIntBits(this.floDNI) != Float.floatToIntBits(other.floDNI)) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        Personas p1=new Personas("Rubén", "San José", 33444555);
        Personas p2=new Personas("Pepe", "San Benito", 33444000);
        Personas p3=new Personas("Andres", "San Roque", 33444111);
        Personas p4=new Personas("Rubén", "San Andrés", 33444555);
        
        for (Personas listperson : todaspersonas) {
            System.out.println(listperson.toString());
        }
        
    }
    
    
    
    
    
    
    
    
    
}
