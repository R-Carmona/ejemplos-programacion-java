/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_herencia;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Vehiculos
{

    static Vehiculos[] controlVehiculos;
    static int intContadorArray;
    String strTipoV;

    int intMatricula,
	    intDiasAlquiler,
	    intTamanoArray;

    double dblPrecioBase;

    Vehiculos(int intMatricula)
    {

	this.intMatricula = intMatricula;

	setDblPrecioBase(50);
	
	controlVehiculos[intContadorArray]=this;

	intContadorArray++;

    }

    public static void inicializarArray(int intTamanoArray)
    {

	controlVehiculos = new Vehiculos[intTamanoArray];

    }

    public static void altaEnArray(Vehiculos v)
    {

	controlVehiculos[intContadorArray] = v;

    }

    @Override
    public String toString()
    {
	return "\n" + "Tipo Vehiculo=" + strTipoV + ", Matricula=" + intMatricula
		+ ", Dias Alquiler="
		+ intDiasAlquiler + ", Precio Base=" + dblPrecioBase + "€";
    }

    public double dimeAlquiler()
    {

	return getDblPrecioBase() * intDiasAlquiler;

    }

    static void busquedaVehiculo(int intMatricula)
    {

	for (Vehiculos controlVehiculo : controlVehiculos)
	{

	    if (intMatricula == controlVehiculo.intMatricula)
	    {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca días de alquiler: ");

	    } else
	    {

		System.out.println("No se encuentra en la BBDD la "
			+ "matrícula introducida.");

	    }

	}
  
    }
    public void setIntDiasAlquiler(int intDiasAlquiler)
    {
	this.intDiasAlquiler = intDiasAlquiler;
    }

    public double getDblPrecioBase()
    {
	return dblPrecioBase;
    }

    public void setDblPrecioBase(double dblPrecioBase)
    {
	this.dblPrecioBase = dblPrecioBase;
    }

}

class TransportePersonas extends Vehiculos
{

    @Override
    public String toString()
    {
	return super.toString() + ", Plazas=" + intPlazasTP;
    }

    int intPlazasTP;

    public int getIntPlazasTP()
    {
	return intPlazasTP;
    }

    public void setIntPlazasTP(int intPlazasTP)
    {
	this.intPlazasTP = intPlazasTP;
    }

    public TransportePersonas(int intMatricula, int intPlazas)
    {
	super(intMatricula);

	intPlazasTP = intPlazas;

	this.dblPrecioBase = super.dblPrecioBase + (1.5 * intPlazas);
    }

}

class TransporteMercancias extends Vehiculos
{

    @Override
    public String toString()
    {
	return super.toString() + ", PMA=" + intPMA + "Kg";
    }

    int intPMA;

    public TransporteMercancias(int intMatricula, int intPMA)
    {
	super(intMatricula);

	this.intPMA = intPMA;

	dblPrecioBase = (super.dblPrecioBase + (20 * (this.intPMA / 1000)));

    }

}

class Coche extends TransportePersonas
{

    public Coche(int intMatricula, int intPlazas)
    {
	super(intMatricula, intPlazas);
	strTipoV = "Coche";

	//controlVehiculos[intContadorArray]=this.Coche;
    }

}

class Microbuses extends TransportePersonas
{

    public Microbuses(int intMatricula, int intPlazas)
    {
	super(intMatricula, intPlazas);
	strTipoV = "Microbus";

    }

    @Override
    public double dimeAlquiler()
    {

	return (getDblPrecioBase() * intDiasAlquiler) + (2 * intPlazasTP);

    }

}

class Furgoneta extends TransporteMercancias
{

    public Furgoneta(int intMatricula, int intPMA)
    {
	super(intMatricula, intPMA);
	strTipoV = "Furgoneta";
    }

}

class Camion extends TransporteMercancias
{

    public Camion(int intMatricula, int intPMA)
    {
	super(intMatricula, intPMA);
	strTipoV = "Camión";
    }

    @Override
    public double dimeAlquiler()
    {

	return (getDblPrecioBase() * intDiasAlquiler) + 40;

    }

}

class Main
{

    public static void main(String[] args)
    {

	int intMenu = 0,
		intTipo = 0,
		intMatricula = 0,
		intPlazas = 0,
		intPMA = 0;

	Scanner teclado = new Scanner(System.in);

	System.out.println("-ALQUILER VEHÍCULOS-");
	System.out.println(" Introduzca número de vehículos a gestionar: ");
	Vehiculos.inicializarArray(teclado.nextInt());
	//System.out.println(Vehiculos.controlVehiculos.length);

	do
	{
	    System.out.println("--------MENÚ--------");
	    System.out.println("-BBDD de " + Vehiculos.controlVehiculos.length + " Vehículos-");
	    System.out.println("-ELIJA UNA OPCIÓN-");
	    System.out.println("1 - Alta Vehículo");
	    System.out.println("2 - Obtener Alquiler");
	    System.out.println("3 - Obtener todos los Alquileres");
	    System.out.println("4 - Salir");
	    intMenu = teclado.nextInt();

	    switch (intMenu)
	    {

		case 1:

		    System.out.println("Elija tipo de vehículo: ");
		    System.out.println("1- Coche");
		    System.out.println("2- Microbus");
		    System.out.println("3- Furgoneta");
		    System.out.println("4- Camión");
		    intTipo = teclado.nextInt();

		    switch (intTipo)
		    {

			case 1:
			    System.out.println("COCHE");
			    System.out.println("Introduzca Matrícula:");
			    intMatricula = teclado.nextInt();

			    System.out.println("Introduzca Número Plazas:");
			    intPlazas = teclado.nextInt();

			    new Coche(intMatricula, intPlazas);

			    break;

			case 2:
			    System.out.println("MICROBUS");
			    System.out.println("Introduzca Matrícula:");
			    intMatricula = teclado.nextInt();

			    System.out.println("Introduzca Número Plazas:");
			    intPlazas = teclado.nextInt();

			    new Microbuses(intMatricula, intPlazas);

			    break;
			case 3:
			    System.out.println("FURGONETA");
			    System.out.println("Introduzca Matrícula:");
			    intMatricula = teclado.nextInt();

			    System.out.println("Introduzca Número Plazas:");
			    intPlazas = teclado.nextInt();

			    System.out.println("Introduzca PMA en Kilogramos");
			    intPMA = teclado.nextInt();

			    new Furgoneta(intMatricula, intPMA);

			    break;
			case 4:
			    System.out.println("CAMIÓN");
			    System.out.println("Introduzca Matrícula:");
			    intMatricula = teclado.nextInt();

			    System.out.println("Introduzca Número de Plazas:");
			    intPlazas = teclado.nextInt();

			    System.out.println("Introduzca PMA en Kilogramos:");
			    intPMA = teclado.nextInt();

			    new Camion(intMatricula, intPMA);

			    break;

			default:

			    System.out.println("Error al elegir el número.");
			    break;
		    }
		    break;

		case 2:

		    System.out.println("OBTENER ALQUILER");
		    System.out.println("Introduzca Matrícula del Vahículo:");
		    intMatricula = teclado.nextInt();

		    for (int i = 0; i < Vehiculos.controlVehiculos.length; i++)
		    {

			if (intMatricula == Vehiculos.controlVehiculos[i].intMatricula)
			{

			    System.out.println("Introduzca dias de alquiler:");
			    Vehiculos.controlVehiculos[i].intDiasAlquiler=teclado.nextInt();
			    System.out.println(Vehiculos.controlVehiculos[i]);
			    System.out.println("Precio Alquiler: " + 
				    Vehiculos.controlVehiculos[i].dimeAlquiler()
				    +"€");
			    System.out.println("");

			} else
			{

			    System.out.println("No se encuentra el vehiculo en nuestra BBDD");

			}

		    }

		    break;
		    
		    
		case 3:
		    
		    System.out.println("Introduzca dias de alquiler para todos los vehículos:");
		    int intDiasAlquilerTodos=teclado.nextInt();
		    
		    for (int i = 0; i < Vehiculos.controlVehiculos.length; i++)
		    {
			
			Vehiculos.controlVehiculos[i].intDiasAlquiler=intDiasAlquilerTodos;
			System.out.println(Vehiculos.controlVehiculos[i]);
			    System.out.println("Precio Alquiler: " + 
				    Vehiculos.controlVehiculos[i].dimeAlquiler()
				    +"€");
			    System.out.println("");
			
				
		    }
		    
		    
		    break;
		    
		case 4:
		    
		    intMenu=99;
		    break;

		default:

		    System.out.println("Error al elegir el número.");
		    break;

	    }

	} while (intMenu != 99);

    }

}

/*
	Vehiculos.setIntTamanoArray(4);
	
	Coche miCoche=new Coche(225566,5);	
	
	System.out.println(miCoche.toString());
	
	Microbuses miMicrobus=new Microbuses(666555,50);
	
	System.out.println(miMicrobus.toString());
	
	Furgoneta miFurgoneta=new Furgoneta(444111,3500);
	
	System.out.println(miFurgoneta.toString());
	
	Camion miCamion=new Camion(117788,22000);
	
	System.out.println(miCamion.toString());
	
	//miCoche.setIntDiasAlquiler(10);
	
	//System.out.println(miCoche.dimeAlquiler());
	
		
	for (Vehiculos v : Vehiculos.controlVehiculos)
	{
	    
	    System.out.println(v.toString());
	}
	
 */
