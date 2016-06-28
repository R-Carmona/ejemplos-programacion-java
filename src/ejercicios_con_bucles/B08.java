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
public class B08 {

    public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);

	int intNumero, intSumaNega = 0, intSumaPosi = 0;

	System.out.println("PROGRAMA QUE LEE NUMERO Y SUMA LOS PARES Y LOS IMPARES POR SEPARADO, DESDE 1 HASTA EL.");
	System.out.println("Introduzca un número: ");
	intNumero = teclado.nextInt();

	for (int i = 0; i<=intNumero; i++) {

	    if (i % 2 == 0) {
		intSumaPosi = i + intSumaPosi;
	    } else {
		intSumaNega = i + intSumaNega;
	    }

	}

	System.out.println("La suma de los pares es: " + intSumaPosi + " La suma de los impares es: " + intSumaNega);

    }

}
