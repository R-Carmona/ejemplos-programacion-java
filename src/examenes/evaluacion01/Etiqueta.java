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
class Etiqueta
{

    Etiqueta(int marcador)
    {
	System.out.println("Etiqueta (" + marcador + ")");
    }

}

class Tarjeta
{
    ///////////////////////////////////////7
    //TERCERA INIZIALIZACIÓN
    Etiqueta t1 = new Etiqueta(1);
   
    
    ///////////////////////////////////////7
    //PRIMERA INIZIALIZACIÓN
        static
    {

	new Etiqueta(27);

    }
    //////////////////////////////////////	
    
    ///////////////////////////////////////7
    //QUINTA INIZIALIZACIÓN
    Tarjeta()
    {

	System.out.println("Tarjeta() Ir");
	///////////////////////////////////////7
        //SEXTA INIZIALIZACIÓN
	t3 = new Etiqueta(33);
	

    }
    
    ///////////////////////////////////////7
    //CUARTA INIZIALIZACIÓN
Etiqueta t2 = new Etiqueta(2);
    void f()
    {
	System.out.println("f()");

    }
    ////////////////////////////////////////
    //SEGUNDA INIZIALIZACIÓN
    static Etiqueta t3 = new Etiqueta(3);
    
    ///////////////////////////////////////
}

class OrdenDeInicializacion
{

    public static void main(String[] args)
    {

	Tarjeta t = new Tarjeta();
	///////////////////////////////////////7
        //SÉTIMA INIZIALIZACIÓN
	t.f();

    }

}
