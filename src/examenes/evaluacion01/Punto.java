/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion01;
import java.util.Scanner;

/**
 *
 * @author psulfo
 */
public class Punto {
    
    
    //CAMPOS
    private int intX,intY;
    static int intMedioX,intMedioY;
    
    
    
    //CONSTRUCTORES

   Punto(){
        
       
               
    }
    
    Punto(int valor){
        
        intX=valor;
        intY=valor;
        
    }
    
    Punto (int intX, int intY){
        
        intX=this.intX;
        intY=this.intY;
               
        
    }
    
    //MÉTODOS
    
    public void pidePunto(){
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca el valor de X:");
        intX=teclado.nextInt();
        System.out.println("Introduzca el valor de Y");
        intY=teclado.nextInt();
                       
    }
    
    public void visualizaPunto(){
        System.out.println("(" + intX + "," + intY + ")" );
               
    }
    
    public void setPunto(int intX,int intY){
     
        intX=this.intX;
        intY=this.intY;
               
    }
    
    public int getX(){
        
        return intX;
               
    }
    
    public int getY(){
        
        return intY;
               
    }
    
    
    //************ Revisar la comparación de este método.......
    public boolean igual(Punto p){
        
        if (p.getX() == this.getX() && p.getY() == this.getY()) {
     
        return true;
        }else
        {
                return false;
                }
        
    }
    
    
    public double distancia (Punto p){
        
        
       
     return Math.sqrt((p.intX-this.intX)*(p.intX-this.intX)+(p.intY-this.intY)*(p.intY-this.intY));
        
        
        
    }
    
    public static Punto puntoMedio(Punto a, Punto b){
        
        intMedioX=((a.intX + b.intX))/2;
        intMedioY=((a.intY + b.intY))/2;
        
        return new Punto(intMedioX,intMedioY);
    }
    
    public int cuadrante (){
        
        if (intY>0 && intX>0) {
            return 1;
        }else if (intY>0 && intX<0) {
            return 2;
        }else if (intY<0 && intX>0) {
            return 4;
        }else if (intY<0 && intX<0) {
            return 3;
        }else{
            return 0;
        }
            
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
