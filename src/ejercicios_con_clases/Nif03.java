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
public class Nif03 {
    
    static long lngNumero;
    static String strLetra;
    static int intLetra;

    
    
    
    public Nif03(long lngNumero) {
        this.lngNumero = lngNumero;
        Nif03.calculaLetra();
    }
    
    

    public long getLngNumero() {
        return lngNumero;
    }

    public void setLngNumero(long lngNumero) {
        this.lngNumero = lngNumero;
    }

    public String getStrLetra() {
        return strLetra;
    }

    public void setStrLetra(String strLetra) {
        this.strLetra = strLetra;
    }
    
       
     static String calculaLetra(){
        
        intLetra=(int)lngNumero%23;
        
        String [] letrasNif={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        strLetra=letrasNif[intLetra];
                
        return (strLetra);
        
    }
     
     String getNIF(){
         
         return lngNumero+strLetra;
         
         
     }
     
     public static void main(String[] args) {
        
         Nif03 nif=new Nif03(48393610);
         
         System.out.println(nif.getNIF());
         
         
         
         
    }
     
     
    
    
    
    
    
    
    
    
    
    
}
