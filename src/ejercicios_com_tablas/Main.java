/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_com_tablas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Rubén
 */
class Tablas {

    static int[][] nuevaTabla;
    static int[][] nuevaTablaRotada;
    static int intFilas, intColumnas;
    static double dblMediaAlumnos;

    private static int intMayor = -1, intSuma, intMenor = 150, intMediaFila, intMediaColumna, intPosA, intPosB, intPosC, intPosD;

    //Método para inicalizar los arrays con datos y el tamaño.
    public static void autoRellenar() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("VALORES DEL ARRAY");
        System.out.println("Introduzca número Filas:");
        intFilas = teclado.nextInt();

        System.out.println("Introduzca número de Columnas:");
        intColumnas = teclado.nextInt();

        nuevaTabla = new int[intFilas][intColumnas];
        nuevaTablaRotada = new int[intColumnas][intFilas];

        for (int i = 0; i < nuevaTabla.length; i++) {
            for (int j = 0; j < nuevaTabla[i].length; j++) {

                nuevaTabla[i][j] = (int) (Math.random() * 100);

            }
        }

    }

    public static void mayorMenor(int[][] nuevaTabla) {

        intFilas = (int) nuevaTabla.length;
        intColumnas = (int) nuevaTabla[0].length;

        for (int i = 0; i < nuevaTabla.length; i++) {

            for (int j = 0; j < nuevaTabla[i].length; j++) {

                if (nuevaTabla[i][j] >= intMayor) {

                    intMayor = nuevaTabla[i][j];
                    intPosA = i + 1;
                    intPosB = j + 1;

                }

                if (nuevaTabla[i][j] <= intMenor) {

                    intMenor = nuevaTabla[i][j];
                    intPosC = i + 1;
                    intPosD = j + 1;

                }

                System.out.print(nuevaTabla[i][j] + " ");

                intSuma += nuevaTabla[i][j];

                intMediaFila = intSuma / (nuevaTabla[j].length + 1);

            }

            System.out.println("Media Fila:" + intMediaFila);
            System.out.println("");
            intMediaFila = 0;
            intSuma = 0;
        }

        System.out.println("Media Columnas");

        for (int j = 0; j < nuevaTabla[0].length; j++) {
            intMediaColumna = 0;
            for (int i = 0; i < nuevaTabla.length; i++) {
                intMediaColumna += nuevaTabla[i][j];
            }
            System.out.println((j + 1) + " -"
                    + intMediaColumna / nuevaTabla[0].length);
        }

        System.out.println("Posición Mayor, Fila:" + intPosA + " Columna: " + intPosB);
        System.out.println("Posición Menor, Fila:" + intPosC + " Columna: " + intPosD);

    }

    //Damos valores a un array de una dimensión.
    public static void rellenarUnaDimension(int[] tabla) {

        for (int i = 0; i < tabla.length; i++) {

            tabla[i] = (int) (Math.random() * 100);

        }

    }

    public static void rellenarTresDimesiones(double[][][] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                for (int k = 0; k < tabla[i][j].length; k++) {

                    tabla[i][j][k] = (Math.random() * 10);

                }
            }

        }

    }

    public static void rellenarDosDimensiones(int[][] tabla) {

        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[i].length; j++) {

                tabla[i][j] = (int) ((Math.random() * 100));

            }
        }

    }

    public static void ordena(int[] tabla) {

        int intSumatorio = 0;

        for (int i = 0; i < tabla.length - 1; i++) {

            for (int j = 0; j < tabla.length - 1 - 0; j++) {
                if (tabla[j] > tabla[j + 1]) {
                    intSumatorio = tabla[j];
                    tabla[j] = tabla[j + 1];
                    tabla[j + 1] = intSumatorio;
                }
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

    }

    public static void buscaSecuencial(int[] tabla, int intAdivinar) {

        boolean blAcierto = false;

        for (int i = 0; i < tabla.length; i++) {

            if (intAdivinar == tabla[i]) {

                System.out.println("Perfecto, Acerto. Posición: " + (i + 1));
                blAcierto = true;

            }

        }

        if (blAcierto == false) {

            System.out.println("Lo sentimos busqueda Secuencial - ERROR.");

        }

    }

    //Busqueda Dicatómica o Binária.
    public static void buscaBinaria(int[] tabla, int intNumero) {

        ordena(tabla);

        boolean blEstado = false;
        int intCentro = 0;
        int intSuperior = tabla.length - 1;
        int intInferior = 0;

        while (intInferior <= intSuperior && blEstado == false) {

            intCentro = ((intSuperior - intInferior) / 2) + intInferior;

            if (tabla[intCentro] == intNumero) {
                blEstado = true;
            } else if (intNumero < tabla[intCentro]) {
                intSuperior = intCentro - 1;
            } else {
                intInferior = intCentro + 1;
            }

        }

        if (blEstado) {
            System.out.println("El numero " + intNumero + " esta en la posicion " + (intCentro + 1));
        } else {
            System.out.println("Lo sentimos, búsqueda Binaria - ERROR.");
        }
    }

    public static void mediaNotas(double[][][] tabla) {

        DecimalFormat decimal = new DecimalFormat("0.00");

        double notaMediaAlumno = 0;
        double notaMediaCurso = 0;
        double notaMediaModulo = 0;
        double dblSumaCurso1 = 0;
        int i = 0, j = 0, k = 0;

        for (i = 0; i < tabla.length; i++) {

            System.out.println("Curso " + (i + 1));

            for (j = 0; j < tabla[0].length; j++) {
                //System.out.println("Módulo " + (j+1));

                notaMediaModulo = 0;

                for (k = 0; k < tabla[0][0].length; k++) {
		    //System.out.println("Notas " + (k+1));

                    //System.out.println(tabla[i][j][k]);
                    notaMediaModulo += tabla[i][j][k];

                }

                notaMediaModulo = notaMediaModulo / (k + 1);

                System.out.println("Nota Média del Módulo " + (1 + j) + " es: " + decimal.format(notaMediaModulo));

                notaMediaCurso += notaMediaModulo;

            }

            System.out.println("Nota Média Curso: " + decimal.format(notaMediaCurso / j));
            System.out.println("");
            notaMediaCurso = 0;

        }

        int numeroDos = 0;
        int l = 0, n = 0, m = 0;

        for (l = 0; l < tabla.length; l++) {

            System.out.println("");
            System.out.println("MEDIAS CURSO: " + (l + 1));

            for (m = 0; m < tabla[0][0].length; m++) {

                for (n = 0; n < tabla[0].length; n++) {

                    dblMediaAlumnos += tabla[l][n][m];
                    //System.out.println(tabla[l][n][m]);

                }

                dblMediaAlumnos = dblMediaAlumnos / n;

                System.out.println("Media Alumno: " + (m + 1) + " es: " + decimal.format(dblMediaAlumnos));

                dblMediaAlumnos = 0;

            }

        }

    }

}

public class Main {

    public static void main(String[] args) {

        int menu = 0, intNumeroBuscar;

        int[] unDimension = new int[25];
        int[][] dosDimensiones = new int[10][5];
        //Debe de ser el primer valor mayor que el segundo.

        double[][][] tresDimensiones = new double[2][4][25];

        Tablas.rellenarUnaDimension(unDimension);
        Tablas.rellenarDosDimensiones(dosDimensiones);
        Tablas.rellenarTresDimesiones(tresDimensiones);

        Scanner teclado = new Scanner(System.in);

        while (menu != 7) {
            System.out.println("");
            System.out.println("******************************");
            System.out.println("ELIJA UNA OPCIÓN:");
            System.out.println("1- Mayor Menor.");
            System.out.println("2- Ordena.");
            System.out.println("3- Busca Secuencial.");
            System.out.println("4- Busca Binaria.");
            System.out.println("6- Media Notas.");
            System.out.println("7- Salir");
            System.out.println("******************************");
            System.out.println("");

            menu = teclado.nextInt();

            switch (menu) {

                case 1:
                    Tablas.mayorMenor(dosDimensiones);
                    System.out.println("-------------------------");
                    break;
                case 2:
                    Tablas.ordena(unDimension);
                    System.out.println("-------------------------");
                    break;
                case 3:
                    System.out.println("Introduzca número a buscar en el Array: ");
                    intNumeroBuscar = teclado.nextInt();
                    Tablas.buscaSecuencial(unDimension, intNumeroBuscar);
                    System.out.println("-------------------------");
                    break;
                case 4:
                    System.out.println("Introduzca número a buscar en el Array: ");
                    intNumeroBuscar = teclado.nextInt();
                    Tablas.buscaBinaria(unDimension, intNumeroBuscar);
                    System.out.println("-------------------------");
                    break;
                case 5:
                    Tablas.mediaNotas(tresDimensiones);
                    System.out.println("-------------------------");
                    break;
                case 6:
                    Tablas.mediaNotas(tresDimensiones);
                    System.out.println("-------------------------");
                case 7:
                    break;
                default:
                    System.out.println("ELIJA UNA OPCIÓN CORRECTA:");
                    System.out.println("1- Mayor Menor.");
                    System.out.println("2- Ordena.");
                    System.out.println("3- Busca Secuencial.");
                    System.out.println("4- Busca Binaria.");
                    System.out.println("6- Media Notas.");
                    System.out.println("7- Salir");
                    menu = teclado.nextInt();
                    break;

            }

        }

    }

}
