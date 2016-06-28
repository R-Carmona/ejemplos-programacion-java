/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenes.evaluacion02;

/**
 *
 * @author ruben
 */
public class Tablas {

    static void rellena(int[] t, int min, int max) {

        for (int i = 0; i < t.length; i++) {

            //Genermao un aleatorio con un valor mínimo y máximo.
            t[i] = (int) (Math.random() * (min - max) + max);

        }

    }

    static void rellena(int[][] t, int min, int max) {

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = (int) (Math.random() * (min - max) + max);
            }
        }

    }

    static void muestra(int[] t) {

        for (int i = 0; i < t.length; i++) {

            System.out.print(t[i] + ",");

        }

    }

    static void muestra(int[][] t) {

        for (int i = 0; i < t.length; i++) {
            System.out.println("");

            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + ",");
            }
        }

    }

    static void sinRepetidos(int[] t) {

        for (int i = 0; i < t.length; i++) {
            int duplicados = 0;

            for (int j = 0; j < t.length; j++) {

                if (t[i] == t[j]) {
                    duplicados++;
                }

                if (t[i] == t[j] && duplicados >= 2) {

                    t[i] = 0;

                }

            }

        }

    }

    static void trnspuesta(int[][] t) {

        int[][] b = t;
        
        if (t.length == t[0].length) {

            for (int i = 0; i < t[0].length; i++) {
                
                System.out.println("");

                for (int j = 0; j < t.length; j++) {

                    //System.out.print(t[i][j] + ",");
                    
                    b[i][j]=t[j][i];
                    System.out.print(b[i][j] + ",");
                    
                }

            }

        } else {

            System.out.println("La tabla no es cuadrada");

        }
        
        //Asignamos la nueva referencia al array anteriro.
        t=b;
        
        

    }

    public static void main(String[] args) {

        int[] myArray = new int[20];

        int[][] myArray2D = new int[10][10];

        Tablas.rellena(myArray, 5, 20);

        System.out.println("TABLA UNA DIMENSIÓN");
        System.out.println("");

        Tablas.muestra(myArray);
        Tablas.sinRepetidos(myArray);

        System.out.println("");
        System.out.println("");
        System.out.println("TABLA UNA DIMENSIÓN SIN REPETIDOS");
        System.out.println("");

        Tablas.muestra(myArray);

        Tablas.rellena(myArray2D, 10, 100);

        System.out.println("");
        System.out.println("");
        System.out.println("TABLA DOS DIMENSIONES");

        Tablas.muestra(myArray2D);

        System.out.println("");
        System.out.println("");
        System.out.println("TRANSPUESTA DE LA TABLA DOS DIMENSIONES");

        Tablas.trnspuesta(myArray2D);

        //System.out.println("");
    }

}
