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
public class B07 {

    public static void main(String[] args) {

	System.out.println("PROGRAMA QUE LEE NÚMEROS Y SUMA LOS POSITIVOS, HASTA TECLEAR UN CERO, MEDIANTE FOR.");

	int intSuma = 0, intNumero = 0;

	Scanner teclado = new Scanner(System.in);

	for (int i = 0; i < 10; i++, i--) {

	    System.out.println("Introduzca número: ");

	    intNumero = teclado.nextInt();

	    if (intNumero > 0) {

		intSuma = intSuma + intNumero;

	    }
	    if (intNumero == 0) {
		i = 10;
	    }
	}

	System.out.println("La suma total es: " + intSuma);

    }

}
