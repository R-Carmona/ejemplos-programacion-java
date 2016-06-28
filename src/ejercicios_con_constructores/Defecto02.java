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
public class Defecto02 {
    
    Defecto02(){
        System.out.println("Crear un objeto de esta clase.");
    }
    
    Defecto02(String mensaje){
        
        System.out.println("Crear un objeto de esta clase.");
        System.out.println(mensaje);
        
    }
    
    public static void main(String[] args) {
        
        Defecto02 defecto=new Defecto02("Hola");
        
    }
    
    
}
