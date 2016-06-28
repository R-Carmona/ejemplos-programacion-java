/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_constructores;

/**
 *
 * @author psulfo
 */
public class DosConstructores10 {

    public DosConstructores10() {
        
	this(5);
	System.out.println("Primer Constructor");
	
        
    }
    
    public DosConstructores10(int i){
        System.out.println("Segundo Constructor con int: " + i);
    }
    
    public static void main(String[] args) {
	
        DosConstructores10 dosConstructores=new DosConstructores10();
        
        
        
        
    }
    
}
