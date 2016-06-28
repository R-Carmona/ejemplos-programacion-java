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
public class Hipoteca05
{
    
    Scanner teclado=new Scanner(System.in);
    
    float floCapital,floInteres,floInterTotal,floCuota;
    int intMeses;

   public void Hipoteca05(){
       
       floCapital=0;
       floInteres=0;
	    
   } 
    
    
    

    public void setFloCapital(float floCapital)
    {
	this.floCapital = floCapital;
    }

    public void setFloInteres(float floInteres)
    {
	this.floInteres = floInteres;
    }
    
    public void setIntMeses(int meses){
	
	intMeses = meses;
	
    }
    
    
    public void altaPrestamo(){
	
	System.out.println("Introduzca Capital Amortización: ");
	setFloCapital(teclado.nextFloat());
	
	
	System.out.println("Introduzca Interés Aplicable: ");
	setFloInteres(teclado.nextFloat());
	
	System.out.println("Introduzca Tiempo en Meses: ");
	setIntMeses(teclado.nextInt());
	
	floInterTotal=(floCapital*(floInteres/100))*(intMeses/12);
	

	
    }
    
    public void impresion(){
	
	System.out.println("Sus interes totales son: " + floInterTotal);
	// System.out.println("Sus cuotas Mensuales son: " + ((floInterTotal+floCapital)/intMeses));
	
	for (int i = 1; i<= intMeses; i++)
	{
	    
	    System.out.println("Mes número: " + i + " Cuota a pagar: " + ((floInterTotal+floCapital)/intMeses));
	    
	    
	    
	}
    }
    
    
    public static void main(String[] args)
    {
	
	Hipoteca05 prestamo=new Hipoteca05();
	
	prestamo.altaPrestamo();
	prestamo.impresion();
	
	
	
	
	
	
    }
    
    
}
