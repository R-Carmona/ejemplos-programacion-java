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
public class Ecuacion2Grado06
{
 
    double floCampoA,floCampoB,FloCampoC,floCampoD,x1,x2;
    Scanner teclado=new Scanner(System.in);

   public void iniciarEcu(){
       
       System.out.println("Introduzca primer coeficiente: ");
       floCampoA=teclado.nextFloat();
       
       System.out.println("Introduzca segundo coeficiente: ");
       floCampoB=teclado.nextFloat();
       
       System.out.println("Introduzca tercer coeficiente: ");
       FloCampoC=teclado.nextFloat();
       
       if (floCampoD < 0) {
	    System.out.println("No existen soluciones reales");
	} else {
		
	    
	    //Calculamos el determinante
	floCampoD = ((floCampoB * floCampoB) - 4 * floCampoA * FloCampoC);
	    
	     
	    
	    
	}
       
   }
    
   public void numeroSoluciones(){
       
       System.out.println("Las solucinones posibles son: ");
       System.out.println("Solución Uno: " + solucionUno());
	System.out.println("Solución Dos: " + solucionDos());

       
       
       
   }
   
   double solucionUno(){
       
      return (-floCampoB + Math.sqrt(floCampoD)) / (2 * floCampoA);
       
   }
   
   double solucionDos(){
       
       return (-floCampoB - Math.sqrt(floCampoD)) / (2 * floCampoA);
   }
	 
    
    public static void main(String[] args)
    {
	Ecuacion2Grado06 ecu=new Ecuacion2Grado06();
	
	ecu.iniciarEcu();
	ecu.numeroSoluciones();
	
	
	
    }
    
    
    
}
