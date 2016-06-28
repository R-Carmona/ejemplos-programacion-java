/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class NumerosPrimos
{
    
    
    static int intSuma;

    static boolean primo(int intX)
    {

	
	//Metemos en un buble el valor de int, comprobamos que el resultado obtenido al dividir
	//por los numero contadores es exactamente el mismo número, que sería un número primo.
	//Iniciamos el contador en 1+1 para que no divida entre 1, que siempre sería cero.
	int intContador = 1;
	
	do
	{
	    intContador++;
	    intSuma = intX % intContador;

	} while (intSuma != 0);

	
	
	if (intX == intContador)
	{
	    return true;
	} else
	{

	    return false;
	}

    }

    static void inicializar()
    {

	int intValorUno = -1, intValorDos = -1, intValorTres = 0, intSuma = 0;
	Scanner teclado = new Scanner(System.in);

	do
	{
	    System.out.println("Intoduzca el primer número positivo: ");
	    intValorUno = teclado.nextInt();

	    if (intValorUno < 0)
	    {
		System.out.println("ERROR, INTRODUZCA NÚMERO POSITIVO");
	    }

	} while (intValorUno < 0);

	do
	{
	    System.out.println("Intoduzca el primer número positivo: ");
	    intValorDos = teclado.nextInt();

	    if (intValorDos < 0)
	    {
		System.out.println("ERROR, INTRODUZCA NÚMERO POSITIVO");
	    }

	} while (intValorDos < 0);

	if (intValorUno > intValorDos)
	{

	    intValorTres = intValorUno;

	    intValorUno = intValorDos;

	    intValorDos = intValorUno;

	}

	
	    intSuma=0;
	
	for (int i = intValorUno; i <= intValorDos; i++)
	{

	    if (NumerosPrimos.primo(i))
	    {
		System.out.println(i);
		
		intSuma+=i;
		
	    }

	}

	System.out.println("La Suma Total es: " + intSuma);
	
    }
    
    

    public static void main(String[] args)
    {

	NumerosPrimos.inicializar();

    }

}
