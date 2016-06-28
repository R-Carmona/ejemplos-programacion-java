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
public class B09 {

    public static void main(String[] args) {
	System.out.println("PROGRAMA QUE LEE UN NÚMERO Y SUMA PARES O IMPARES, SEGÚN SEA LE MISMO NÚMERO INTRODUCIDO, DESDE 0 HATA EL.");

	Scanner teclado = new Scanner(System.in);

	int intNumero, intSumaPosi = 0, intSumaNega = 0;

	System.out.println("Introduzca un número: ");
	intNumero = teclado.nextInt();

	for (int i = 0; i <= intNumero; i++) {

	    if (i % 2 == 0) {

		intSumaPosi += i;

	    } else {

		intSumaNega += i;

	    }

	}
	
	 if (intNumero % 2 == 0) {
		    System.out.println("La suma de los positivos es: "+intSumaPosi);
	    } else {

		    System.out.println("La suma de los negativos es: "+intSumaNega);

	    }

    }
}
