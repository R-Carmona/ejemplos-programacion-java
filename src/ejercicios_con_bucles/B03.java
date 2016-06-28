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
public class B03 {
    
    public static void main(String[] args) {
	
	System.out.println("PROGRAMA QUE LLE UN NÚMERO Y UN TOPE, Y SUMA LOS MÚLTIPLOS DESDE 0 HASTA EL TOPE.");
	
	int intSuma=0, intNumero=0, intTope=0;
	Scanner teclado=new Scanner(System.in);
	System.out.println("Introduzca un número: ");
	intNumero=teclado.nextInt();
	System.out.println("Introduzca un tope: ");
	intTope=teclado.nextInt();
	
	
	for (int i = 0; i <=intTope; i++) {
	    
	    if (i%intNumero==0) {
		intSuma+=i;		
	    }	    
	}
	System.out.println("La suma de sus múltiplos es: "+intSuma);
    }
    
       
    
    
}

