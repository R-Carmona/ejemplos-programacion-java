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
public class B10 {
    
    public static void main(String[] args) {
	
	Scanner teclado= new Scanner(System.in);
	
	System.out.println("PROGRAMA QUE CALCULA EL MCD DE DOS NÚMEROS MEDIANTE EL ALGORITMO DE EUCLIDES, QUE DICE: EL MCD D A U B ES A SI B ES CERO O BIEN EL MCD DE B Y A MOD B.");
	
	int intNumeroA, intNumeroB, intT;
	
	System.out.println("Introduzca primer número: ");
	intNumeroA=teclado.nextInt();
	
	System.out.println("Introduzca el segundo número: ");
	intNumeroB=teclado.nextInt();
	
	if (intNumeroB==0) {
	    
	    System.out.println("El resultado es: "+ intNumeroA);
	    
	    
	} else {
	    
	    while (intNumeroB!=0) {

		intT=intNumeroA;
		intNumeroA=intNumeroB;
		intNumeroB=intT%intNumeroB;
		
	    }
	    
	    System.out.println("El resultado es :"+ intNumeroA);
	    
	    
	}
	
	
	
	
	
	
    }
    
    
    
    
}
