/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package ejercicios_con_entrada_salida;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;

/**
 *
 * @author ruben
 */
public class MoverRenombrar {

    public static void main(String[] args) throws IOException {

        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String nom_file_orig, nom_file_dest;
        System.out.print("Nombre de fichero, con la ruta: ");
        nom_file_orig = kb.readLine();
        File forig = new File(nom_file_orig);

        if (forig.exists()) {
            System.out.println("El fichero " + nom_file_orig + " existe");
            System.out.print("Nombre de fichero nuevo: ");
            nom_file_dest = kb.readLine();
            File fdest = new File(nom_file_dest);
            forig.renameTo(fdest);
        } else {
            System.out.print("El fichero " + nom_file_orig + " no existe.");
        }

    }
}
