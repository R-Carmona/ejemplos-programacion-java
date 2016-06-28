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
class Clase2 {
    
    int valor;
    
    Clase2(int valor){
        
        this.valor=valor;       
        
    }
    
}
    
public class   ExamenValores{
        
        int a=5;
        static int s=0;
        
        int primera(int x, int y){
            
            int i;
            for (i = 0; i < y; i++) {
                
                x*=x;
                
               
                        }
             return x;
        }
        
        void segunda (Clase2 x, Clase2 y){
            
            //Contador p; //texto original el objeto se llama "Contador2", no compila.
            Clase2 p;
            
            p=x; x=y; y=p;
            
            
        }
        
        void tercera(){
            
            System.out.println(""+(++s));
            System.out.println(""+a);
            
        }
        
        public static void main(String[] args) {
        
            int p=3, z=2, i;
            ExamenValores e=new ExamenValores();
            Clase2 c1=new Clase2(8);
            Clase2 c2=new Clase2(4);
            
            for (int j = 0; j < e.a; j++) {
                
                System.out.println(" " + e.primera(p,z));
                System.out.println("Hola ");
                e.segunda(c1,c2);
                e.tercera();
                System.out.println(" " + c1.valor + " " + c2.valor);
               
            }
            
    }
}
  
        
        
        
    
    
    
    

