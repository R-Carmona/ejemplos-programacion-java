/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion03;

import java.beans.Introspector;

/**
 *
 * @author ruben
 */
public class RecursivoPotencia {
    
    int intNumero;
    int intResultado;
    
     public static void main(String[] args) {

         RecursivoPotencia misPotencias = new RecursivoPotencia();
         
              
         System.out.println(misPotencias.factorial(5));
         
      
    }

    public static int factorial(int n) {
        {
            int intResultado;

            if (n == 0)
            {
                intResultado = 1;
                
            } else 
                
            {
                intResultado = n * factorial(n - 1);
            }
            return intResultado;
        }
    }
    
}

