/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion01;

/**
 *
 * @author psulfo
 */
public class Vector {
    
    Punto puntoA,puntoB;
    
    
    Vector(){
        
    }

    Vector(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }
    
    
    public void pideVector(){
        
        puntoA.pidePunto();
        puntoB.pidePunto();
               
    }
    
    
    public void visualizarVector(){
        
        puntoA.visualizaPunto();
        System.out.print("->");
        puntoB.visualizaPunto();
        
    }
    
    public void setVector(Punto a, Punto b){
        
        setPuntoA(a);
        
        setPuntoB(b);
               
    }
    
    public double modulo(){
        
        return puntoA.distancia(puntoB);
        
    }
    
    public boolean simetrico(Vector v){
	
	if ((this.getPuntoA()==v.getPuntoB())&&((this.getPuntoB()==v.getPuntoA())))
	{
	    return true;
	}else{
	    
	    return false;
	}
	
	
	
	
    }
    
  
    
    
    
    
    //PRUEBAS
    
    public static void main(String[] args) {
    
        Punto a=new Punto();
        Punto b=new Punto();
        
        System.out.println("Introduzca valor del Punto a:");
        a.pidePunto();
        System.out.println("Introduzca valor del Punto b:");
        b.pidePunto();
        
        System.out.println("La distancia entre los Puntos es:");
        System.out.println(a.distancia(b));
        
        System.out.println("PUNTO MEDIO ES:");
        Punto.puntoMedio(a,b).visualizaPunto();
        
        Vector VectorA=new Vector(a, b);
        
        System.out.println("El módulo del vector es:");
        System.out.println(VectorA.modulo());
        
        
        
        
    }
    
    
    
    
    
    
    
}
