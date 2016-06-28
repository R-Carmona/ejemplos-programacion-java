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
public class Cuenta04
{

    //  public static Scanner teclado;
    private float saldoCuenta, incresoCuenta, retiradaCuenta;
    private String strNombre;

    Scanner teclado = new Scanner(System.in);

    public void setSaldoCuenta(float saldoCuenta)
    {
	this.saldoCuenta = saldoCuenta;
    }

    public void setIncresoCuenta(float incresoCuenta)
    {
	this.incresoCuenta = incresoCuenta;
    }

    public void setStrNombre(String strNombre)
    {
	this.strNombre = strNombre;
    }

    public void incrementaSaldo()
    {

	System.out.println("Introduzca Ingremento de Saldo:");
	incresoCuenta = teclado.nextFloat();

	saldoCuenta += incresoCuenta;

	System.out.println("Saldo Actual:" + saldoCuenta);
    }

    public void decrementoSaldo()
    {

	System.out.println("Introduzca Decremento de Saldo:");
	retiradaCuenta = teclado.nextFloat();

	saldoCuenta -= retiradaCuenta;

	System.out.println("Saldo Actual: " + saldoCuenta);
    }

    public void altaCuenta()
    {

	System.out.println("Introduzca Nombre Cliente: ");
	setStrNombre(teclado.next());

	System.out.println("Introduzca saldo inicial:");
	setSaldoCuenta(teclado.nextFloat());

    }

    public static void main(String[] args)
    {

	Cuenta04 clienteUno = new Cuenta04();

	clienteUno.altaCuenta();

	clienteUno.incrementaSaldo();

	clienteUno.decrementoSaldo();
	
	System.out.println("Cliente: " + clienteUno.strNombre);

    }

}
