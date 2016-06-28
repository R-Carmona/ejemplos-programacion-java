/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_clases;

import java.util.Scanner;

/*
 *
 * @author psulfo
 */
public class Circulo01 {

    //Declaramos la variable para la entrada de datos.
    public static Scanner teclado;

    //Declaramos la variable estática.
    final static float PI = 3.14159f;

    //Declaramos variable float para introducir el rádio.
    private float floRadio;

    //Método uno...
    public float resultadoArea() {

        return PI * floRadio * floRadio;
    }

    //Método dos...    
    public float resultadoPerimetro() {

        return 2 * PI * floRadio;

    }

    //Clase a ejecutar con el método main.
    public static void main(String[] args) {
        
        //Creamos un objeto de nuestra propia clase, llamado datoscirculo.
        Circulo01 datoscirculo= new Circulo01();
        
        teclado = new Scanner(System.in);
        System.out.println("PROGRAMA QUE CALCULA EL ÁREA Y PERÍMETO DE UNA CIRCUFERENCIA");
        System.out.println("Introduzca radio: ");
        
        //Damos valor a la variable floRadio, dentro del objeto creado.
        datoscirculo.floRadio=teclado.nextFloat();
        
        System.out.println("El area es: " + datoscirculo.resultadoArea());
        System.out.println("El perímetro es: "+ datoscirculo.resultadoPerimetro());
        
        
    }
    
   

}
