/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_con_bucles;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class B22 {

    public static void main(String[] args) {

	byte bteBisiesto = 0, bteDia = 0;

	String strMes = "";

	short srtAnyo = 0, srtOrdinal = 0;

	Scanner teclado = new Scanner(System.in);

	System.out.println("PROGRAMA QUE LEE UN AÑO Y UN ORDINAL DE FECHA DE ESE AÑO, Y NOS INDICA LA FECHA CORRESPONDIENTE");

	System.out.println("Introduzca un año: ");
	srtAnyo = teclado.nextShort();

	//Comprobamos si el año es bisiesto para añadir un día más.
	if (srtAnyo % 100 == 0) {

	    if (srtAnyo % 400 == 0) {
		bteBisiesto = 1;
	    } else {
		bteBisiesto = 0;
	    }
	} else if (srtAnyo % 4 == 0) {
	    bteBisiesto = 1;
	} else {
	    bteBisiesto = 0;
	}

	System.out.println("Introduzca un ordinal: ");
	srtOrdinal = teclado.nextShort();

	//Comprobamos el ordinal a que fecha corresponde.
	if ((srtOrdinal >= 0) && (srtOrdinal <= 31)) {
	    strMes = "Enero";
	    bteDia = (byte) srtOrdinal;

	}

	if ((srtOrdinal >= 32) && (srtOrdinal <= 59 + bteBisiesto)) {
	    strMes = "Febrero";
	    bteDia = (byte) (srtOrdinal - 31);
	}

	if ((srtOrdinal >= 60 + bteBisiesto) && (srtOrdinal <= 90 + bteBisiesto)) {
	    strMes = "Marzo";
	    bteDia = (byte) (srtOrdinal - (31 + 28 + bteBisiesto));
	}

	if ((srtOrdinal >= 89 + bteBisiesto) && (srtOrdinal <= 120 + bteBisiesto)) {
	    strMes = "Abril";
	    bteDia = (byte) (srtOrdinal - (90 + bteBisiesto));
	}

	if ((srtOrdinal >= 119 + bteBisiesto) && (srtOrdinal <= 151 + bteBisiesto)) {
	    strMes = "Mayo";
	    bteDia = (byte) (srtOrdinal - (120 + bteBisiesto));
	}

	if ((srtOrdinal >= 150 + bteBisiesto) && (srtOrdinal <= 181 + bteBisiesto)) {
	    strMes = "Junio";
	    bteDia = (byte) (srtOrdinal - (151 + bteBisiesto));
	}

	if ((srtOrdinal >= 180 + bteBisiesto) && (srtOrdinal <= 212 + bteBisiesto)) {
	    strMes = "Julio";
	    bteDia = (byte) (srtOrdinal - (181 + bteBisiesto));
	}

	if ((srtOrdinal >= 211 + bteBisiesto) && (srtOrdinal <= 243 + bteBisiesto)) {
	    strMes = "Agosto";
	    bteDia = (byte) (srtOrdinal - (212 + bteBisiesto));
	}

	if ((srtOrdinal >= 242 + bteBisiesto) && (srtOrdinal <= 273 + bteBisiesto)) {
	    strMes = "Septiembre";
	    bteDia = (byte) (srtOrdinal - (243 + bteBisiesto));
	}

	if ((srtOrdinal >= 272 + bteBisiesto) && (srtOrdinal <= 304 + bteBisiesto)) {
	    strMes = "Octubre";
	    bteDia = (byte) (srtOrdinal - (273 + bteBisiesto));
	}

	if ((srtOrdinal >= 303 + bteBisiesto) && (srtOrdinal <= 334 + bteBisiesto)) {
	    strMes = "Noviembre";
	    bteDia = (byte) (srtOrdinal - (304 + bteBisiesto));
	}

	if ((srtOrdinal >= 333 + bteBisiesto) && (srtOrdinal <= 365 + bteBisiesto)) {
	    strMes = "Diciembre";
	    bteDia = (byte) (srtOrdinal - (334 + bteBisiesto));
	}

	if (srtOrdinal > 366) {
	    System.out.println("El Ordinal no existe");
	}

	System.out.println("El día ordinal del año " + srtAnyo + " es el " + bteDia + " de " + strMes);

    }

}
