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
public class Eje01
{

    int[][] myArray = new int[0][0];

    void inicializar(int intT1, int intT2)
    {

	myArray = new int[intT1][intT2];

    }

    public static void main(String[] args)
    {

	Eje01 array = new Eje01();

	array.inicializar(12,10);
	
	
	

	for (int[] myArray1 : array.myArray)
	{
	    System.out.println();
	    
	    for (int j = 0; j < myArray1.length; j++)
	    {
		System.out.print(myArray1[j] + " ");
	    }
	}

    }

}
