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
public class CamposStatic15 {
    
    static String strInicio="Inicio Uno";
    
    
    static {
        
       String strInicioDos="Inicio Dos";
        
    }
    
    static void impresion (){
        
        System.out.println(strInicio + " - " );
    }
    
    public static void main(String[] args) {
        
        CamposStatic15 camposStatic = new CamposStatic15();
        camposStatic.impresion();
	
        
        
        
    }
    
    
}
