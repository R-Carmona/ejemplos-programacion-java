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
public class B05 {

    public static void main(String[] args) {
	System.out.println("PROGRAMA QUE LEE NÚMEROS Y SUMA LOS POSITIVOS, HASTA TECLEAR UN 0");
	int intSuma = 0, intNumero = 1;

	Scanner teclado = new Scanner(System.in);

	do {

	    System.out.println("Introduzca un núemro: ");
	    intNumero = teclado.nextInt();

	    if (intNumero > 0) {
		intSuma += intNumero;
	    }

	} while (intNumero != 0);

	System.out.println("La suma total es: " + intSuma);

    }

}
