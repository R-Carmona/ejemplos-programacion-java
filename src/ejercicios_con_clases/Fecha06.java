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
public class Fecha06 {
    
    int dia,mes,anyo,dias_del_mes;
    boolean fecha_correcta=true;
    
    Fecha06(int dia,int mes,int anyo){
                    
    
    this.dia=dia;
   
    this.mes=mes;
    
    this.anyo=anyo;
    
        if (anyo==0 || dia<1 || dia>31 || mes<1 || mes>12 ) {
            fecha_correcta=false;
        }
        
        dias_del_mes=0;
        
        if (mes==2) {
            dias_del_mes=28;
        }
        if (mes==4 || mes==6 || mes==9 || mes==11) {
            dias_del_mes=30;
        }
        if (mes==1 || mes==3 ||mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
            dias_del_mes=31;
        }
        
        
        if (dia>dias_del_mes) {
            fecha_correcta=false;
        }
    
        if (fecha_correcta) {
            System.out.println(dia + "/" + mes + "/" + anyo+ ": Fecha correcta.");
        }else{
            System.out.println("Fecha incorrecta.");
        }
    
        
        
        
    }
    
    public static void main(String[] args) {
        
        Fecha06 fecha=new Fecha06(12, 1, 2000);
        
        
        
        
    }
}
