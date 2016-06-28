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
public class Eje03
{

    static void rellenar(int[][] array, int intMin, int intMax)
    {

	if (intMin == intMax)
	{
	    
	    for (int i = 0; i < array.length; i++)
	    {
		for (int j = 0; j < array[i].length; j++)
		{
		   
		    array[i][j]=intMin;	    
		    
		    
		}
	    }
	    
	    
	    
	    
	} else
	{
	    for (int i = 0; i < array.length; i++)
	    {

		for (int j = 0; j < array[i].length; j++)
		{

		    array[i][j] = (int) (Math.random() * (intMin-intMax)+intMax);

		}

	    }

	}

    }
    
    
    //Para generar un número entre un número que deseemos a otro ,
    //debemos escribir *(num_minimo-num_maximo)+num_maximo, por ejemplo, Math.random()*(5-20)+20. 
    
    

    public static void main(String[] args)
    {

	int[][] tabla = new int[4][4];

	
	Eje03.rellenar(tabla,5,7);
	Eje02.mostrar(tabla);

    }

}
