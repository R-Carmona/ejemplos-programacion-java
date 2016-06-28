/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidad07;

/**
 * 
 * @author psulfo
 */
public class RecursivoMCD {

    private int intNumeroA, intNumeroB;

    public static int getMCD(int intNumeroA, int intNumeroB) {

        if (intNumeroB == 0) {

            return intNumeroA;

        } else {

            return getMCD(intNumeroB, intNumeroA % intNumeroB);

        }

    }
    
    public static void main(String[] args) {
        
        System.out.println(RecursivoMCD.getMCD(25, 5));
        System.out.println(RecursivoMCD.getMCD(44, 18));
    }

}
