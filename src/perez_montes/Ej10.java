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
public class Ej10 {

    public static void main(String[] args) {
	System.out.println("10. Pedir tres números y mostrarlos ordenados de mayor a menor.");

	int a, b, c;

	System.out.println("Introduzca primer número");
	a = Entrada.entero();

	System.out.println("Introduzca segundo número");
	b = Entrada.entero();

	System.out.println("Intoduzca tercer número");
	c = Entrada.entero();

	if (a > b && b > c) {
	    System.out.println(a + ", " + b + ", " + c);
	} else if (a > c && c > b) {
	    System.out.println(a + ", " + c + ", " + b);
	} else if (b > a && a > c) {
	    System.out.println(b + ", " + a + ", " + c);
	} else if (b > c && c > a) {
	    System.out.println(b + ", " + c + ", " + a);
	} else if (c > a && a > b) {
	    System.out.println(c + ", " + a + ", " + b);
	} else if (c > b && b > a) {
	    System.out.println(c + ", " + b + ", " + a);
	}
    }}
