/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregas.unidad07;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Objects;

/**
 *
 * @author ruben
 */
class Palabra {

    String[] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private int intLongitud;

    private String strPalabra;

    public Palabra(int intLongitud) {

        this.intLongitud = intLongitud;
        strPalabra = "";

        for (int i = 0; i < intLongitud; i++) {

            int intRandon = (int) Math.round(Math.random() * (abecedario.length-1));

            strPalabra += abecedario[intRandon];

        }

    }

    public String getStrPalabra() {
        return strPalabra;
    }

    @Override
    public String toString() {
        return "Palabra:" + strPalabra + " Longitud:" + intLongitud + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.strPalabra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Palabra other = (Palabra) obj;
        if (!Objects.equals(this.strPalabra, other.strPalabra)) {
            return false;
        }
        return true;
    }

    public static Comparator palabrasAscendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Palabra) obj1).getStrPalabra().length();
                int intObj2 = ((Palabra) obj2).getStrPalabra().length();

                if (intObj1 < intObj2) {
                    return -1;
                }

                if (intObj1 > intObj2) {
                    return 1;
                }
                return 0;

            }

        };
    }

    public static Comparator palabrasDescendente() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {
                int intObj1 = ((Palabra) obj1).getStrPalabra().length();
                int intObj2 = ((Palabra) obj2).getStrPalabra().length();

                if (intObj1 < intObj2) {
                    return 1;
                }

                if (intObj1 > intObj2) {
                    return -1;
                }
                return 0;

            }

        };
    }

    public static Comparator palabrasABC() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {

                String strObj1 = ((Palabra) obj1).getStrPalabra();
                String strObj2 = ((Palabra) obj2).getStrPalabra();

                return (strObj1.compareTo(strObj2));

            }

        };
    }

    public static Comparator palabrasCBA() {

        return new Comparator() {

            public int compare(Object obj1, Object obj2) {

                String strObj1 = ((Palabra) obj1).getStrPalabra();
                String strObj2 = ((Palabra) obj2).getStrPalabra();

                return (strObj2.compareTo(strObj1));

            }

        };
    }

}

public class PruebaPalabra {

    public static void main(String[] args) {

        Palabra conjunto_palabras[] = new Palabra[50];

        for (int i = 0; i < conjunto_palabras.length; i++) {

            conjunto_palabras[i] = new Palabra((int) Math.round(Math.random() * 20));

        }

        System.out.println("ASCENDENTE POR LINGITUD-----------------------------------");
        Arrays.sort(conjunto_palabras, Palabra.palabrasAscendente());
        System.out.println(Arrays.toString(conjunto_palabras));

        System.out.println("DESCENDENTE POR LONGITUD-----------------------------------");
        Arrays.sort(conjunto_palabras, Palabra.palabrasDescendente());
        System.out.println(Arrays.toString(conjunto_palabras));

        System.out.println("ORDEN ALFABÉTICO ASCENDENTE-----------------------------------");
        Arrays.sort(conjunto_palabras, Palabra.palabrasABC());
        System.out.println(Arrays.toString(conjunto_palabras));

        System.out.println("ORDEN ALFABÉTICO DESCENDENTE-----------------------------------");
        Arrays.sort(conjunto_palabras, Palabra.palabrasCBA());
        System.out.println(Arrays.toString(conjunto_palabras));

    }
}
