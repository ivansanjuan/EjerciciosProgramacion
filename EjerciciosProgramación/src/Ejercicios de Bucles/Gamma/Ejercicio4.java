/*
 * Proyecto Ejercicios_de_Bucles - Archivo Ejercicio4.java - Compañía DAW
 * Licencia Crative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package Gamma;

/**
 *
 * @author Iván Sanjuán Silvestre <ivansanjuansilvestre@gmail.com>
 * @version 1.0
 * @date 25 oct. 2021 21:19:42
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Escriba la última tabla que desea ver: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++) {

            System.out.println("Tabla del " + i + " :");

            for (int j = 1; j <= 10; j++) {
                int op = i * j;
                System.out.print(i + " x " + j + " = " + op);
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
