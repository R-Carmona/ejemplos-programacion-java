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
public class B12 {

    public static void main(String[] args) {

	System.out.println("PROGRAMA QUE PIDE EL USUARIO SI QUIERE CALCULAR EL SUMATORIO O BIEN EL FACTORIAL DEL NÚMERO QUE INTRODUCIRÁ");

	double intNumero, intContador, intSuma=0, intFactorial, intMenu;

	Scanner teclado = new Scanner(System.in);
System.out.println("PULSE 1 - FACTORIAL ------ PULSE 2 - SUMATORIO");
	System.out.println("Selecione si desea sacar el Factorial del Número dado o el Sumatorio");
	
	intMenu = teclado.nextInt();

	if (intMenu == 1) {

	    System.out.println("Introduzca un número para saber su Factorial: ");
	    intNumero = teclado.nextInt();

	    if (intNumero == 0) {
		
	    } else {

		intFactorial = 1;

		for (intContador = 2; intContador <= intNumero; intContador++) {

		    intFactorial = intFactorial * intContador;

		}
		
		System.out.println("El Fatorial del número es: " + intFactorial);

	    }

	}
	
	if (intMenu ==2) {
	    
	    System.out.println("Introduzca un número para saber su sumatorio: ");
	    
	    intNumero=teclado.nextInt();
	    
	    
	    for (int i = 0; i <=intNumero; i++) {
		
		
		intSuma=intSuma+i;
		
		
	    }
	    
	    System.out.println("El sumatorio es: "+intSuma);
	    
	    
	    
	}

    }

}
