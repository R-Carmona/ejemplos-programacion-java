/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion01;

/**
 *
 * @author ruben
 */
public class NumerosAmigos
{

    int intA, intB, intSuma, resultadoB, resultadoA;
    boolean blValor;

    boolean calculo(int intA, int intB)
    {

	this.intA = intA;
	this.intB = intB;

	for (int i = 1; i < intA; i++)
	{
	    if (intA % i == 0)
	    {
		resultadoB = resultadoB + i;
	    }
	}
	
	 for (int i = 1; i < intB; i++)
	    {
		if (intB % i == 0)
		{
		    resultadoA = resultadoA + i;
		}

	    }
	 
	return resultadoA == intA && resultadoB == intB;
    }
    
    public static void main(String[] args)
    {
	NumerosAmigos amigos=new NumerosAmigos();
	
	System.out.println(amigos.calculo(284,220));
    }
    
    /*
  220, 284
 1184, 1210
 2620, 2924
 5020, 5564
 6232, 6368
10744, 10856
12285, 14595
17296, 18416 
    */
    
}
