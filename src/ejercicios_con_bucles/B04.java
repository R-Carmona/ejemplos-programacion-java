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
public class B04 {
    public static void main(String[] args) {
	System.out.println("PROGRAMA QUE LEE NÚMEROS Y LOS SUMA, MIENTERAS SEAN POSITIVOS.");
	
	int intSuma=0, intNumero=1;
	Scanner teclado=new Scanner(System.in);
	
	while (intNumero>0) {	    
	    System.out.println("Introduzca un número: ");
	    intNumero=teclado.nextInt();
	    intSuma+=intNumero;
	}
	
	System.out.println("La suma total es: "+intSuma);
    }
    
}
