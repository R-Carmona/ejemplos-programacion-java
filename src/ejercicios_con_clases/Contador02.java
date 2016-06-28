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
public class Contador02 {

    int valor;

    int getValor() {

        return valor;

    }

    void setValor(int valor) {

        this.valor = valor;
    }

    void incrementear() {

        valor++;
    }

    void decrementar() {
        valor--;
    }

    void impresion() {
        System.out.println("El valor actual es: " + valor);
    }
    
    public static void main(String[] args) {
        
        Contador02 valor=new Contador02();
        
       
        valor.setValor(10);
        System.out.println(valor.getValor());
        valor.incrementear();
        valor.impresion();
        valor.incrementear();
        valor.impresion();
        valor.decrementar();
        valor.impresion();
        
        
        
        
    }
}
