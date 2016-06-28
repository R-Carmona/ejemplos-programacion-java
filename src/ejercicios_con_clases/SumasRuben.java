/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_clases;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class SumasRuben
{
    
    
    
    public static void main(String[] args)
    {
	
	
	int intA,intB,intResult;
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("Hola Palote, introduce número y se suman");
	
	System.out.println("Primer número:");
	intA = teclado.nextInt();
	
	
	
	System.out.println("Segundo número:");
	intB = teclado.nextInt();
	
	System.out.println("Resultoado: " + (intA+intB));
	
	
	
	
	
    }
    
    
    
    
}
