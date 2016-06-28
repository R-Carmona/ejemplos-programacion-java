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
public class Complejo
{

    float flA, flB;

    //CONSTRUCTORES
    Complejo()
    {

    }

    Complejo(float valor)
    {

	flA = valor;
	flB = valor;

    }

    Complejo(float flA, float flB)
    {

	this.flA = flA;
	this.flB = flB;

    }

    //MÉTODOS
    void pideComplejo()
    {

	flA = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número para el valor Real:"));
	flB = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número para el valor Imaginario:"));

    }

    void visualizarComplejo()
    {

	System.out.println("(" + flA + "/" + flB + ")");
    }

    void setReal(float x)
    {

	flA=x;

    }

    void setImaginaria(float x)
    {

	flB=x;
    }

    float getReal()
    {

	return flA;

    }

    float getImaginaria()
    {

	return flB;

    }

    boolean esIgual(Complejo c)
    {

	return (this.getReal() == c.getReal()) && (this.getImaginaria() == c.getImaginaria());

    }

    Complejo suma(Complejo objeto)
    {

	Complejo objetoDos = new Complejo();

	objetoDos.setReal(this.getReal() + objeto.getReal());
	objetoDos.setImaginaria(this.getImaginaria() + objeto.getImaginaria());
	
	return objetoDos;
	
	
	
	
	

    }

    Complejo resta(Complejo objeto)
    {

	Complejo objetoDos = new Complejo();

	objetoDos.setReal(this.getReal() - objeto.getReal());
	objetoDos.setImaginaria(this.getImaginaria() - objeto.getImaginaria());

	return objetoDos;

    }

    Complejo producto(Complejo objeto)
    {

	Complejo objetoDos = new Complejo();
	
	objetoDos.setReal(this.getReal()*objeto.getReal()-this.getImaginaria()*objeto.getImaginaria());
	objetoDos.setImaginaria(this.getReal() * objeto.getImaginaria() + this.getImaginaria() * objeto.getReal());

	return objetoDos;

    }

    Complejo division(Complejo objeto)
    {
	
	Complejo objetoDos = new Complejo();

	objetoDos.setReal((this.getReal()*objeto.getReal()) / ((this.getReal()*this.getReal()) ) + ((objeto.getImaginaria()*objeto.getImaginaria())));
	
	objetoDos.setImaginaria((this.getImaginaria()*objeto.getReal()) - (this.getReal()*objeto.getImaginaria()  / ((this.getReal()*this.getReal()) ) + ((objeto.getImaginaria()*objeto.getImaginaria()))));
	
	return objetoDos;

    }

    
    
    Complejo escalar(float flNumero){
	
	Complejo objetoDos = new Complejo();
	
	objetoDos.setReal(flNumero*this.getReal());
	objetoDos.setImaginaria(flNumero*this.getImaginaria());
	
	return objetoDos;
	
    }
    
    
    
    
   
    public String toString()
    {

	return "(" + flA + "/" + flB + ")";

    }

    public static void main(String[] args)
    {

	Complejo complejoUno=new Complejo();
	Complejo complejoDos=new Complejo();
	
	JOptionPane.showMessageDialog(null, "DATOS PARA EL COMPLEJO UNO");
	complejoUno.pideComplejo();
	
	JOptionPane.showMessageDialog(null, "DATOS PARA EL COMPLEJO DOS");
	complejoDos.pideComplejo();
	
	complejoUno.suma(complejoDos).visualizarComplejo();
	complejoUno.resta(complejoDos).visualizarComplejo();
	complejoUno.producto(complejoDos).visualizarComplejo();
	
	complejoUno.division(complejoDos).visualizarComplejo();
	
	
	System.out.println(complejoUno.esIgual(complejoDos));
	
	System.out.println(complejoUno.escalar(11));
	
	
	
    }

}
