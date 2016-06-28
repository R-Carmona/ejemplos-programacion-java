/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion01;

import java.util.Scanner;

/**
 *
 * @author psulfo
 */
public class NumerosPerfectos
{

    public static void main(String[] args)
    {

	int suma;

	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca un número entero positivo: ");
	int numero = teclado.nextInt();

	for (int i = 1; i <= numero; i++)
	{

	    suma = 0;

	    for (int j = 1; j <= i / 2; j++)
	    {

		if (i % j == 0)
		{
		    suma += j;
		}

	    }
	    if (suma == i)
	    {
		System.out.println(i + " es un número perfecto.");

	    }

	}

    }

}
