/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perez_montes;

/**
 *
 * @author ruben
 */
public class Ej07 {
    
    public static void main(String[] args) {
	
	System.out.println("7. Pedir números hasta que se introduzca uno negativo, y calcular la media.");
	
	int num,suma;
	
	suma=0;
	num=10;
	
	
	do {
	    
	    System.out.println("Intoduzca número: ");
	    num=Entrada.entero();
	    
	    suma+=num;
	    
	} while (num!=0);
	
	
	System.out.println("La suma total es: " + suma);
	
    }
    
    
}
