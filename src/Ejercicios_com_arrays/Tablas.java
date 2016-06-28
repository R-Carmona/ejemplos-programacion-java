/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_com_arrays;


import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Tablas
{

    public static int[] tabla01D = new int[50];
    public static int[][] tabla02D = new int[50][50];
    public static int[][][] tabla03D = new int[50][50][50];

    Tablas()
    {

	for (int i = 0; i < tabla01D.length; i++)
	{
	    tabla01D[i] = (int) (Math.random() * 100);
	}

	for (int i = 0; i < tabla02D.length; i++)
	{
	    for (int j = 0; j < tabla02D[i].length; j++)
	    {
		tabla02D[i][j] = (int) (Math.random() * 100);
	    }
	}

	for (int i = 0; i < tabla03D.length; i++)
	{
	    for (int j = 0; j < tabla03D[i].length; j++)
	    {
		for (int k = 0; k < tabla03D[i][j].length; k++)
		{

		    tabla03D[i][j][k] = (int) (Math.random() * 100);

		}
	    }
	}

    }

    void mayorMenor(int[][] tabla02D)
    {

    }

    void ordena(int[] tabla01D)
    {

    }

    void buscaSecuencial(int[] tabla01D)
    {

    }

    void buscaBinaria(int[] tabla01D)
    {

    }

    void mediaNotas(int[][][] tabla)
    {

    }

    public static void main(String[] args)
    {

	int menu = 0;

	;
	Tablas tablas = new Tablas();
	
	Scanner teclado = new Scanner(System.in);
	System.out.println("ELIJA UNA OPCIÓN:");
	System.out.println("1- Mayor Menor.");
	System.out.println("2- Ordena.");
	System.out.println("3- Busca Secuencial.");
	System.out.println("4- Busca Binaria.");
	System.out.println("6- Media Notas.");
	menu = teclado.nextInt();

	switch (menu)
	{

	    case 1:
		tablas.mayorMenor(tabla02D);
		break;
	    case 2:
		tablas.ordena(tabla01D);
		break;
	    case 3:
		tablas.buscaSecuencial(tabla01D);
		break;
	    case 4:
		tablas.buscaBinaria(tabla01D);
		break;
	    case 5:
		tablas.mediaNotas(tabla03D);
		break;
	    default:
		System.out.println("ELIJA UNA OPCIÓN CORRECTA:");
		System.out.println("1- Mayor Menor.");
		System.out.println("2- Ordena.");
		System.out.println("3- Busca Secuencial.");
		System.out.println("4- Busca Binaria.");
		System.out.println("6- Media Notas.");
		menu = teclado.nextInt();
		break;

	}

	for (int i = 0; i < tablas.tabla01D.length; i++)
	{
	    
	    System.out.println(tabla01D[i]);
	    
	    
	}
	
    }
    

}
