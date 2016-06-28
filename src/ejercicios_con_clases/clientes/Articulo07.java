/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_clases.clientes;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Articulo07
{
    
    int intCodBa;
    String strDescripcion;
    double dblPrecioCom, dblPrecioVen;
    double dblPrecioFinal;
    
    Scanner teclado=new Scanner(System.in);

    public void altaArticulo()
    {
	System.out.println("Introduzca Descripción del Artículo: ");
	strDescripcion=teclado.next();
	
	System.out.println("Introduzca Código de Barras: ");
	intCodBa=teclado.nextInt();
	
	System.out.println("Introduzca Precio de Compra: ");
	dblPrecioCom=teclado.nextDouble();
	
	System.out.println("Introduzca Precio de Venta");
	dblPrecioVen=teclado.nextDouble();
	
	if (dblPrecioCom>dblPrecioVen)
	{
	    
	    System.out.println("Introduzca Precio de Venta Superior al de Compra");
	dblPrecioVen=teclado.nextDouble();
	    
	}	
	
    }
    
    
    
    
    /// REVISAR EL PRECIO FINAL, NO EJECUTA BIEN................
    
    public void precioFinal(Cliente cliente){
	
	String tipo=cliente.getStrTipo();
	
	dblPrecioFinal=dblPrecioVen;
	
	if (dblPrecioFinal>dblPrecioCom)
	{
	    if (tipo.equalsIgnoreCase("vip"))
	    {
		dblPrecioFinal=dblPrecioVen*0.80;
	    }
	    
	    
	    if (tipo.equalsIgnoreCase("normal"))
	    {
		dblPrecioFinal=dblPrecioVen*0.90;
	    }
	    
	    
	    if (tipo.equalsIgnoreCase("ocasional"))
	    {
		dblPrecioFinal=dblPrecioVen*0.95;
	    }
	    
	    
	}
	
	if (dblPrecioFinal<=dblPrecioCom)
	{
	    if (tipo.equalsIgnoreCase("vip"))
	    {
		dblPrecioFinal=dblPrecioVen*1.05;
	    }
	    
	    
	    if (tipo.equalsIgnoreCase("normal"))
	    {
		dblPrecioFinal=dblPrecioVen*1.10;
	    }
	    
	    
	    if (tipo.equalsIgnoreCase("ocasional"))
	    {
		dblPrecioFinal=dblPrecioVen*1.20;
	    }
	    
	    
	}
	
	
	
    }
    
    public void impresion(){
	
	System.out.println(strDescripcion + "\n" + dblPrecioCom + "\n" + dblPrecioVen + "\n" + dblPrecioFinal);
	
	
	
	
	
    }
    
    
   
    
    
    
    
    
    
    
}
