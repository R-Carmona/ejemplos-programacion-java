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
public class Circulo05 {
    
    double dblRadio;
    final static double PI = 3.14159;
    
    Circulo05 (double a){
        
        if (a>0) {
            dblRadio=a;
        }else{
            System.out.println("Introduzca un radio mayor que CERO."); 
            //Scanner teclado=new Scanner(System.in);
            //Circulo05(teclado.nextDouble());
        }
        
    }
    
    double area(){
        
        return PI * dblRadio * dblRadio;
          }
    
    double perimetro(){
        
        return 2 * PI * dblRadio;
        
    }
    
    double radio(){
        return dblRadio;
    }
    
    public static void main(String[] args) {
        
        Circulo05 circulo=new Circulo05(5);
        System.out.println(circulo.radio());
        System.out.println(circulo.area());
        System.out.println(circulo.perimetro());
        
        
    }
}
