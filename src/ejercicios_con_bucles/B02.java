/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_bucles;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class B02 {
    
    
    public static void main(String[] args) {
	System.out.println("PROGRAMA QUE LLE UN NÚMERO Y SUMA LOS MÚLTIPLOS DE 3 DESDE 0 HASTA ÉL.");
	int intNumero, intSuma=0;
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduzca un número: ");
	intNumero=teclado.nextInt();
	 for (int i = 0; i <= intNumero; i++) {
	     
	     if (i%3==0) {
	     
	     intSuma+=i;
		 
	     }
	     
	    
	}
	System.out.println("La suma de los múltiplos de 3 es: "+intSuma);
	
	
	
    }
    
}
