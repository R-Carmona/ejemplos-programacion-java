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
public class Cliente {
    
    
    private String strNombre,strEmail, strLetraDNI;
    private int intDNI,intTelefono,intLetra;
    public static String strTipo;
      

    

    public String getStrNombre() {
	return strNombre;
    }

    public void setStrNombre(String strNombre) {
	this.strNombre = strNombre;
    }

    public String getStrEmail() {
	return strEmail;
    }

    public void setStrEmail(String strEmail) {
	this.strEmail = strEmail;
    }

    public String getStrTipo() {
	return strTipo;
    }

    public void setStrTipo(String strTipo) {
	this.strTipo = strTipo;
    }

    public String getStrLetraDNI() {
	return strLetraDNI;
    }

    public void setStrLetraDNI(String strLetraDNI) {
	this.strLetraDNI = strLetraDNI;
    }

    public int getIntDNI() {
	return intDNI;
    }

    public void setIntDNI(int intDNI) {
	this.intDNI = intDNI;
    }

    public int getIntTelefono() {
	return intTelefono;
    }

    public void setIntTelefono(int intTelefono) {
	this.intTelefono = intTelefono;
    }

    public int getIntLetra() {
	return intLetra;
    }

    public void setIntLetra(int intLetra) {
	this.intLetra = intLetra;
    }
    
    public void imprimirCliente(){
	
	System.out.println("SU NUEVO CLIENTE ES:");
        System.out.println("Nombre: " + strNombre);
        System.out.println("Teléfono: " + intTelefono);
        System.out.println("DNI: " + intDNI + letraDNI());
        System.out.println("Email: " + strEmail);
        System.out.println("Tipo: " + strTipo); 
		
	
	
    }
    
    public String letraDNI(){
        
        intLetra=intDNI%23;
        
        String [] letrasNif={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        strLetraDNI=letrasNif[intLetra];
                
        return (strLetraDNI);
        
    }
   
    
    public void altaCliente(){
	
	
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("PROGRAMA QUE DA DE ALTA UN CLIENTE Y LO MUESTRA");
        
        System.out.println("Introduzca Nombre: ");
        setStrNombre(teclado.nextLine());
        
        System.out.println("Introduzca Teléfono: ");
        setIntTelefono(teclado.nextInt());
		
        System.out.println("Introduzca DNI: ");
        setIntDNI(teclado.nextInt());
        
        System.out.println("Introduzca Email: ");
        setStrEmail(teclado.next());
        
        System.out.println("Introduzca Tipo de Cliente (vip, normal, ocasional(MINÚSCULAS)");
        setStrTipo(teclado.next());
	
	
	
	
    }
    
    
}
