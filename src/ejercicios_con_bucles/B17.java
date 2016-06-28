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
public class B17 {

    public static void main(String[] args) {
	System.out.println("PROGRAMA QUE DIVIDE DOS NÚMEROS MEDIANTE SUCESIVAS RESTAS DE A-B. EL COCIENTE ES EL NÚMERO DE RESTAS Y EL RESTO LO QUE QUEDA EN A(<B) AL FINALIZAR");
	
	Scanner teclado=new Scanner (System.in);
	
	int fltNumero=0, fltNumeroDos=0, fltCociente=0, fltResto;
	
	System.out.println("Introduzca el primer número: ");
	fltNumero=teclado.nextInt();
	
	System.out.println("Introduzca el segundo número: ");
	fltNumeroDos=teclado.nextInt();
	
	while (fltNumero>=fltNumeroDos) {

		fltNumero=fltNumero-fltNumeroDos;
		fltCociente=fltCociente+1;
		
		   System.out.println("Restas: "+fltNumero);
	}
	
	
	fltResto=fltNumeroDos-fltNumero;
		
	
	System.out.println("El resultado es, Cociente: "+fltCociente+ " Resto: "+fltResto);
    }


    
}
