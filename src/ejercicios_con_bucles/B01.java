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


public class B01 {

    public static void main(String[] args) {
	System.out.println("PROGRAMA QUE LEE UN NÚMERO Y SUMA DESDE 1 HASTA ÉL.");
	int intNumero, intSuma=0;
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduzca un número: ");
	intNumero=teclado.nextInt();
	
	for (int i = 1; i<=intNumero; i++) {
	    
	    intSuma+=i;
	    //intSuma=intSuma+i;
	       
	}
	
	System.out.print("La suma total es: "+intSuma+".   ");
	
    }
  
}
