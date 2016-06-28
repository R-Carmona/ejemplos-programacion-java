/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion01;

import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class Racional
{

    int intA, intB;

    Racional()
    {

    }

    Racional(int intNumero)
    {

	intB = intNumero;
	intA = intNumero;

    }

    Racional(int intA, int intB)
    {

	intA = this.intA;
	intB = this.intB;

    }
 
    void pideRacional(){
	
	intA=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número para el valor A:"));
	intB=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor para B:"));
	
	
    }
    
    void visualizarRacional(){
	
	System.out.println("("+intA+"/"+intB+")");
    }
    
    void setNumerador(int intNumerador){
	
	intA=intNumerador;
	
	
    }
    
    void setDenominador(int intDenominador){
	
	intB=intDenominador;
    }
    
    int getNumerador(){
	
	return intA;
	
    }
    
    int getDenominador(){
	
	return intB;
	
    }
    
    boolean esIgual(Racional Relacional){
	
	
	return Relacional.getNumerador() == this.getNumerador() && Relacional.getDenominador() == this.getDenominador();

    }
    
    Racional suma(Racional objeto)
    {

	Racional objetoRacional = new Racional();

	if (objeto.getDenominador() == this.getDenominador())
	{

	    objetoRacional.setDenominador(objeto.getDenominador());
	    objetoRacional.setNumerador((objeto.getNumerador() + this.getNumerador()));

	    return objetoRacional;

	} else
	{

	    objetoRacional.setNumerador(objeto.getNumerador() * this.getDenominador() + objeto.getDenominador() * this.getNumerador());
	    objetoRacional.setDenominador(objeto.getDenominador() * this.getDenominador());

	    return objetoRacional;
	}

    }
    
    Racional resta(Racional objeto)
    {

	Racional objetoRacional = new Racional();

	if (objeto.getDenominador() == this.getDenominador())
	{

	    objetoRacional.setDenominador(objeto.getDenominador());
	    objetoRacional.setNumerador((objeto.getNumerador() - this.getNumerador()));

	    return objetoRacional;

	} else
	{

	    objetoRacional.setNumerador(objeto.getNumerador() * this.getDenominador() - objeto.getDenominador() * this.getNumerador());
	    objetoRacional.setDenominador(objeto.getDenominador() * this.getDenominador());

	    return objetoRacional;
	}

    }
    
    Racional producto(Racional objeto)
    {

	Racional objetoRacional = new Racional();

	if (objeto.getDenominador() == this.getDenominador())
	{

	    objetoRacional.setDenominador(objeto.getDenominador());
	    objetoRacional.setNumerador((objeto.getNumerador() * this.getNumerador()));

	    return objetoRacional;

	} else
	{

	    objetoRacional.setNumerador((objeto.getNumerador() * this.getDenominador()) * (objeto.getDenominador() * this.getNumerador()));
	    objetoRacional.setDenominador(objeto.getDenominador() * this.getDenominador());

	    return objetoRacional;
	}

    }
    
    Racional division(Racional objeto)
    {

	Racional objetoRacional = new Racional();

	if (objeto.getDenominador() == this.getDenominador())
	{

	    objetoRacional.setDenominador(objeto.getDenominador());
	    objetoRacional.setNumerador((objeto.getNumerador() / this.getNumerador()));

	    return objetoRacional;

	} else
	{

	    objetoRacional.setNumerador((objeto.getNumerador() * this.getDenominador()) / (objeto.getDenominador() * this.getNumerador()));
	    objetoRacional.setDenominador(objeto.getDenominador() / this.getDenominador());

	    return objetoRacional;
	}

    }
    
    int compareTo(Racional objeto){
	
	int compare=5;
	
	if ((objeto.intA/objeto.intB)==(this.intA/this.intB))
	{
	    compare=0;
	    
	}else if((objeto.intA/objeto.intB)>(this.intA/this.intB)){
	    
	    compare=-1;
	}else if((this.intA/this.intB)>(objeto.intA/objeto.intB)){
	    
	    compare=1;
	    
	    
	}
		
	
	return compare;
	
    }
    
    Racional simetrico(Racional objeto){
	
	return objeto;   
	
    }
    
   
  public String toString(){
      
      return intA + "/" + intB;
      
      
  }  
  
    public static void main(String[] args)
    {
	
	Racional objetoUno=new Racional();
	Racional objetoDos=new Racional();
	
	
	System.out.println("Introduzca datos del primer racional.");
	objetoUno.pideRacional();
	
	System.out.println("Introduzca datos para el segundo racional.");
	objetoDos.pideRacional();
	
	System.out.println("Objeto Uno.");
	System.out.println(objetoUno.toString());
	
	System.out.println("Objeto Dos.");
	System.out.println(objetoDos.toString());
	
	
	objetoUno.suma(objetoDos).visualizarRacional();
	objetoUno.resta(objetoDos).visualizarRacional();
	objetoUno.producto(objetoDos).visualizarRacional();
	objetoUno.division(objetoDos).visualizarRacional();
		
	System.out.println("Comparamos los Objetos.");
	System.out.println(objetoUno.compareTo(objetoDos));
	
	
	
    }
  
  
	  
    
    
}
