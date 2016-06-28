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
public class Ej02 {
    
    public static void main(String[] args) {
	
	double a,r; //área y rádio
	
	System.out.println("Introduce el radio de un círculo: ");
	r=Entrada.real();
	
	a=Math.PI*(r*r); // para elevar al cuadrado otra opcion es: Math.pow (r,2)
	
	System.out.println("El área de una circunferencia de radio " + r+ " es: " +a);
	
	
	
    }
    
    
    
    
    
    
}
