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
public class Ej08 {
    
    
    public static void main(String[] args) {
	
	int num,suma,elementos;
	float media; //La média podría tener decimales.
	
	System.out.println("8. Pedir un número N, y mostrar todos los números del 1 al N.");
	
	// num: guardará los números introducidos por el usuario
	// suma: almacenará la suma de todos los números introducidos
	// elementos: será un contador que indicará el números de números 8o elementos) introducidos
	
	System.out.println("Introduzca un número: ");
	num=Entrada.entero();
	
	suma=0;
	elementos=0;
	
	while (num>=0){
	    
	    suma+=num;
	    elementos++;
	    
	    System.out.println("Introduzca otro número: ");
	    num=Entrada.entero();
	    
	}
	
	if (elementos==0){
	    
	    System.out.println("Imposible hacer la media.");
	    
	}else {
	    
	    media =(float)suma/elementos;
	    System.out.println("La média es de: " + media);
	    
	}
	
	
	
    }
    
    
    
    
    
    
}
