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
public class Ej05 {
    
    public static void main(String[] args) {
	
	int num;
	
	System.out.println("Introduce un número: ");
	num=Entrada.entero();
	
	if (num<0) {
	    System.out.println("El número es negativo.");
	} else {
	    //consideramos el cero como positivo.
	    System.out.println("El número es positivo");
	}
	
    }
    
}
