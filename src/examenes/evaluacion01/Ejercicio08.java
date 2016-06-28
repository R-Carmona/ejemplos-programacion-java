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
public class Ejercicio08 {

    
    
    //Array de tipo double, bidemnsional, dos elementos.
    double[][] tabla;
    
    /////////////////////////////////

    void inicializa(int fila, int col, int max, int min) {

	
	// Inicializamos el array tabla.
        tabla = new double[fila][col];
	
	
        for (int i = 0; i < tabla.length; i++)
	{

	    for (int j = 0; j < tabla[0].length; j++)
	    {

		tabla[i][j] = Math.random() * (max - min) + min;

	    }

	}

    }

    void muestra() {

        for (int i = 0; i < tabla.length; i++) {
	    
	    for (int j = 0; j < tabla[0].length; j++)
	    {
		 System.out.println(" " + tabla[i][j]);
	    }

            

        }

        System.out.println("");
    }

    void mayorMenor() {

        double max = tabla[0][0], min = tabla[0][0];

        int posXMax = 0, posXMin = 0, posYMax = 0, posYMin = 0, i, j;

        for (i = 0; i < tabla.length; i++) {

            for (j = 0; j < tabla.length; j++) {

                if (tabla[i][j] < min) {

                    min = tabla[i][j];
                    posXMin = i;
                    posXMin = j;

                }
                if (tabla[i][j] > max) {
                    max = tabla[i][j];
                    posXMax = i;
                    posXMax = j;

                }

            }

        }
        
        System.out.println("Máximo = " + max + " en " + posXMax + "," + posYMax);
	System.out.println("Mínimo = " + min + " en " + posXMin + "," + posYMin);
    }
    
    public static void main(String[] args)
    {
	
	
	
	Ejercicio08 ej8=new Ejercicio08();
	ej8.inicializa(5, 8, 2, 10);
	ej8.muestra();
	ej8.mayorMenor();
	
	
    }
    
    
    
    
    
    
}
