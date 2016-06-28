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
public class B26 {
    
    public static void main(String[] args) {
	
	int intNumero=1, intNumeroDos=2, intTope;
	
	System.out.println("PROGRAMA QUE CALCULA n TÉRMINOS DE LA SERIE DE DE FIBONACCI");
	
	System.out.println("Introduzca la cantidad de términos a ostras");
	Scanner teclado=new Scanner(System.in);
	intTope = teclado.nextInt();
	System.out.println("RESULTADO.......");
	System.out.println(intNumero);
	System.out.println(intNumeroDos);
	
	
	for (int i = 4; i <=intTope; i+=2) {
	    
	    intNumero=intNumero+intNumeroDos;
	    System.out.println(intNumero);
	    intNumeroDos=intNumeroDos+intNumero;
	    System.out.println(intNumeroDos);
	    	    
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
    }
    
    
    
    
    
    
}
