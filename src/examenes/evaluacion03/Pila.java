/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion03;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ruben
 */
public class Pila {
    
    
    RandomAccessFile archivoRandom;
    private long longPosiciones;
    
    Pila(){
        
        try {
            archivoRandom=new RandomAccessFile("randomChar.txt","rw");
            try {
                archivoRandom.setLength(longPosiciones);
                archivoRandom.close();
               
            } catch (IOException ex) {
                System.out.println("Imposible obtener tamaño archivo.");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no ha sido creado.");
        }
        
        
    }
    
    
    
    public void push(char c){
        
         try {
            archivoRandom=new RandomAccessFile("randomChar.txt","rw");
            try {
                archivoRandom.seek(longPosiciones);
                archivoRandom.write(c);
                longPosiciones=archivoRandom.getFilePointer();
                archivoRandom.close();
               
            } catch (IOException ex) {
                System.out.println("Imposible grabar datos en archivo.");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no ha sido abierto.");
        }
         
            
        
    }
    
    public Object pop(){
        
        char chrRetorno='a';
        
        try {
            archivoRandom=new RandomAccessFile("randomChar.txt","rw");
            try {
                
                
                archivoRandom.seek(archivoRandom.length()-1);
                longPosiciones=archivoRandom.length()-1;

                chrRetorno=(char)archivoRandom.readByte();
                push(' ');
                archivoRandom.close();
                
                
                
               
                
               
            } catch (IOException ex) {
                System.out.println("Imposible leer datos en archivo.");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no ha sido abierto.");
        }
        
        longPosiciones-=1;
        
        return chrRetorno;
        
    }
    
    public boolean isEmpty(){
        
        if (longPosiciones==0) {
            return  false;
        }else{
            return true;
        }
        
    }
    
    
   
    public static void main(String[] args) {
        
        Pila pila=new Pila();
        
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        pila.push('e');
      
        
        System.out.println(pila.pop());
        
        System.out.println(pila.isEmpty());
        
        pila.push('f');
        pila.push('g');

        
        
        
        
    }
    
    
}
