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
public class Ej04 {

    public static void main(String[] args) {
	int n1, n2;

	System.out.println("Introduce un número: ");
	n1 = Entrada.entero();

	System.out.println("Introduce otro número: ");
	n2 = Entrada.entero();

	if (n1 == n2) {
	    System.out.println("Son iguales");
	} else {
	    System.out.println("No son iguales");
	}
    }
}
