/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_clases;

import java.util.Scanner;

/**
 *
 * @author psulfo
 */
public class Matematicas04 {
    
    //int intFactorial;
    
    

    int factorial(int intNumero) {

            //No puedo declarar intFactorial aquí....¿Por qué?....
	    
	int intFactorial=1;
    
        int intContador;
        
        if (intNumero == 0) {

        } else {

            intFactorial = 1;

            for (intContador = 2; intContador <= intNumero; intContador++) {

                intFactorial = intFactorial * intContador;

            }

        }
        return intFactorial;

    }

    int sumatorio(int intNumero) {

            int intSuma=0;
         
	    
	    for (int i = 0; i <=intNumero; i++) {
		
		
		intSuma=intSuma+i;
		
		
	    }
	    
	    return intSuma;
        
        
    }
    
    int MCD(int intNumeroA, int intNumeroB){
        
       int intT;	
	if (intNumeroB==0) {
	    
	    return intNumeroA;
	    
	    
	} else {
	    
	    while (intNumeroB!=0) {

		intT=intNumeroA;
		intNumeroA=intNumeroB;
		intNumeroB=intT%intNumeroB;
		
	    }
	    
	
	    
	    
	}
        
        
        return intNumeroA;
        
    }
    
    public static void main(String[] args) {
        
        Matematicas04 mates=new Matematicas04();
        
        
        System.out.println(mates.MCD(786,1048));
        System.out.println(mates.factorial(10));
        System.out.println(mates.sumatorio(3));
        
        
        
    }
    
    
         

}



