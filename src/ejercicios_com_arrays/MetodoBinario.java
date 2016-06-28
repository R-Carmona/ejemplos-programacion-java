/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_com_arrays;

/**
 *
 * @author ruben
 */
public class MetodoBinario
{
 
    
    
    public static void main(String[] args)
    {
	
	
	//Debe de estar ordenado el array para que la búsqueda funcione.
	
	int myArray[]={1,2,3,4,5,6,7,8,9,10};
	
	int intNumBus=2
		;
	
	int intPosIni=0;
	
	int intPosFin=myArray.length-1;
	
	int intPosCentro;
	
	
	while (intPosIni<=intPosFin)
	{	    
	    intPosCentro=(intPosFin+intPosIni)/2;
	    
	    if (myArray[intPosCentro] == intNumBus)
	    {
		
		System.out.println("Dato encontrado, entre posición " + intPosIni + " y " + intPosFin);
		break;
		
	    }else if (intNumBus<myArray[intPosCentro]) {
		
		intPosFin=intPosCentro-1;
		
		
		
		
		
	    }else {
		
		
		intPosIni=intPosCentro+1;
		
	    }
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
    }
    
    
    
    
    
    
    
    
    
    
    
}
