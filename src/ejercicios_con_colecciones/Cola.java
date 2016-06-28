
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Cola {

    public static Queue<Integer> miQueue = new LinkedList<Integer>();
    public int numCliente = 1;

    public Cola() {

    }

    public void añadirClienteCola() {

        miQueue.offer(numCliente++);

    }

    public void eleminiarCliente() {

        miQueue.remove();
    }

    public static void imprimirCola() {

       System.out.println(miQueue);


    }

    public static void main(String[] args) {

        int intMenu = 0;

        Cola misClientes = new Cola();

        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println("---------------------");
            System.out.println("GESTINON DE COLA");
            System.out.println("1-Añadir Cliente a la Cola.");
            System.out.println("2-Eliminar y Atender Cliente de la Cola.");
            System.out.println("3-Imprimir Clientes de la Cola.");
            System.out.println("4-Salir");
            System.out.println("---------------------");
            intMenu = teclado.nextInt();

            switch (intMenu) {
                case 1:
                    misClientes.añadirClienteCola();
                    break;

                case 2:
                    misClientes.eleminiarCliente();
                    break;

                case 3:
                    misClientes.imprimirCola();
                    break;

                case 4:
                    intMenu = 4;
                    break;
                default:
                    System.out.println("Introduzca un núemro válido.");
                    break;

            }

        } while (intMenu != 4);

    }

}
