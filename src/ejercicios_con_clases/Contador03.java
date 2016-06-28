/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_clases;

import java.util.Scanner;

/**
 *
 * @author psulfo
 */
public class Contador03 {

    private int intNumero;
    public static Scanner teclado;

    public void incremento() {
        intNumero++;
    }

    public void decremento() {

        if (intNumero >= 0) {
            intNumero--;
        }
    }

    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        Contador03 nuevoContador = new Contador03();

        System.out.println("PROGRAMA QUE INCREMENTA Y DECREMENTA UN NÚMERO.");

        System.out.println("Introduzca un número: ");

        nuevoContador.intNumero = teclado.nextInt();

        System.out.println("Inicio valor: " + nuevoContador.intNumero);

        for (int i = 0; i < 3; i++) {

            nuevoContador.incremento();
            System.out.println("Incremento: " + nuevoContador.intNumero);
            nuevoContador.incremento();
            System.out.println("Incremento: " + nuevoContador.intNumero);
            nuevoContador.incremento();
            System.out.println("Incremento: " + nuevoContador.intNumero);
            nuevoContador.decremento();
            System.out.println("Decremento: " + nuevoContador.intNumero);
            nuevoContador.decremento();
            System.out.println("Decremento: " + nuevoContador.intNumero);

            System.out.println("Valor final: " + nuevoContador.intNumero);
        }

    }

}
