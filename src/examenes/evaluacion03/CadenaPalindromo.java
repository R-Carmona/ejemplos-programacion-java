/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion03;

/**
 *
 * @author ruben
 */
public class CadenaPalindromo {

    public static void main(String[] args) {

        CadenaPalindromo.verificaPalindromo("LarutaNatural");

    }

    public static void verificaPalindromo(String cadena) {

        cadena = cadena.toLowerCase();

        if (cadena.length() == 0 || cadena.length() == 1) {            
            

            System.out.println("Es un palíndromo.");
        } else if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            verificaPalindromo(cadena.substring(1, cadena.length() - 1));
        } else {
            System.out.println("No es un palíndromo.");
        }

    }

}
