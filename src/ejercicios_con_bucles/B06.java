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
public class B06 {

    public static void main(String[] args) {
	System.out.println("PROGRAMA QUE LEE NÚMEROS Y SUMA LOS PARES, HASTA TECLEAR UN 0.");
	int intSuma=0, intNumero;
	Scanner teclado = new Scanner(System.in);

	do {
	    System.out.println("Introduzca un número:");
	    intNumero = teclado.nextInt();
	    if (intNumero % 2 == 0) {
		intSuma += intNumero;
	    }
	} while (intNumero != 0);

	System.out.println("La suma es: " + intSuma);

    }

}
