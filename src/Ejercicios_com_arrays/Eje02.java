/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_com_arrays;

/**
 *
 * @author ruben
 */
public class Eje02
{
 
    
    //Puedo hacer que char? sea un parámetro?
    static void mostrar(int [][] tabla){
       
       
       for (int i = 0; i < tabla.length; i++)
       {
	   
	   System.out.println();
	   
	   for (int j = 0; j < tabla[i].length; j++)
	   {
	       
	       System.out.print(tabla[i][j]);
	       System.out.print(" ");
	   }
		   
	   
       }
       
       System.out.println();
       
       
   } 
    
    //Para sobrecargar el método, repetimos y cambiamos el int por los datos correspondientes.
    
    static void inicializarArray (int[][] array){
	
	
	
	for (int i = 0; i < array.length; i++)
	{
	    
	    
	    for (int j = 0; j < array[i].length; j++)
	    {
		
		
		array[i][j]=(int)(Math.random()*100);
		
		
		
	    }
	    
	    
	    
	    
	}
	
	
	
	
    }
    
    
    
    public static void main(String[] args)
    {
	
	int [][] arrayChar = new int[10][10];
	
	//Inicializar el Array.
	Eje02.inicializarArray(arrayChar);
	//Imprimir el Array.
	Eje02.mostrar(arrayChar);
	
	
	
	
	
    }
}
