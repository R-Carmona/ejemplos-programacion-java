/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_clases.clientes;



/**
 *
 * @author ruben
 */
public class Menu {
    
    public static void main(String[] args) {
	
			
	Cliente nuevoClienteUno = new Cliente();
	
	nuevoClienteUno.altaCliente();
	
	// nuevoClienteUno.imprimirCliente();
	
	Articulo07 articulo=new Articulo07();
	
	articulo.altaArticulo();
	
	articulo.precioFinal(nuevoClienteUno);
	
	nuevoClienteUno.imprimirCliente();
	
	articulo.impresion();
	
	
	
		
    }
    
    
    
    
    
}
