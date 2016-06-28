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

public class Ej01 {

    public static void main(String[] args) {

	double a, b, c; //coeficientes ax^2+bx+c=0
	double x1, x2, d; // soluciones y determinates

	System.out.println("Introduzca primer coeficiente (a):");
	a = Entrada.entero();

	System.out.println("Introduzca segundo coeficiente: (b)");
	b = Entrada.entero();

	System.out.println("Introduzca tercer coeficiente: (c)");
	c = Entrada.entero();

	//Calculamos el determinante
	d = ((b * b) - 4 * a * c);

	if (d < 0) {
	    System.out.println("No existen soluciones reales");
	} else {
		//Queda confirmar que a, sea distinto de 0.
	    //si a=0 nos encontramosuna division por cero.

	    x1 = (-b + Math.sqrt(d)) / (2 * a);
	    x2 = (-b - Math.sqrt(d)) / (2 * a);
	    System.out.println("Solución: " + x1);
	    System.out.println("Solución: " + x2);

	}

    }

}
