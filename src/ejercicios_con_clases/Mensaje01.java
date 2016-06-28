/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_clases;

/**
 *
 * @author psulfo
 */
public class Mensaje01 {
    
    
    public void mostrar(String mensaje){
        
               
        System.out.println(mensaje);
        
    }
    
    public static void main(String[] args) {
       
        Mensaje01 mensaje=new Mensaje01();
        
        mensaje.mostrar("Hola España");
        
        
    }
    
    
}
