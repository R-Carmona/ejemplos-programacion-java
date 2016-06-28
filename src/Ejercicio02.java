/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class Ejercicio02
{

    public static void main(String[] args)
    {

	boolean menu = true;
	int intSuma, intContador = 1;

	int intNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));

	while (menu == true)
	{

	    do
	    {
		intContador++;
		intSuma = intNumero % intContador;

	    } while (intSuma != 0);

	    if ((intNumero % 4 == 1) && (intContador == intNumero))
	    {

		int potenciaUno, potenciaDos, intSumaPoten = 0, i, j = 0;

		for (i = 0; i < 10; ++i)
		{

		    if (intSumaPoten == intNumero)
		    {
			i--;
			break;
		    }

		    for (j = 0; j < 10; ++j)
		    {

			intSumaPoten = i * i + j * j;

			if (intSumaPoten == intNumero)
			{
			    break;
			}

		    }

		}

		JOptionPane.showMessageDialog(null, "Las potencias son: " + i + "*" + i + "+" + j + "*" + j + "=" + intNumero);
		menu = false;

	    } else
	    {

		intNumero = Integer.parseInt(JOptionPane.showInputDialog("ERROR - Introduzca OTRO número:"));
		intContador = 2;

	    }

	}

    }

}
