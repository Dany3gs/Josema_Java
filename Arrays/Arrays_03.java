/*Ejercicio Array 3
Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media
de los negativos y contar el número de ceros.*/

package Arrays;

import java.util.Scanner;

public class Arrays_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        int mediaPositivos = 0;
        int mediaNegagtivos = 0;
        int ceros = 0;
        int numeroCeros = 0;
        double contadorPositivos = 0, contadorNegativos = 0;


        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            int positivos = num[i];
            if (positivos > 0) {
                mediaPositivos += positivos;
                contadorPositivos ++;
            }
        }
        for (int i = 0; i < num.length; i++) {
            int negativos = num[i];
            if (negativos < 0) {
                mediaNegagtivos += negativos;
                contadorNegativos++;
            }
        }
        if (mediaPositivos > 0) {
            System.out.println("La media de números positivos es: " + mediaPositivos / contadorPositivos);
        }
        if (mediaNegagtivos < 0) {
            System.out.println("La media de números negativos es: " + mediaNegagtivos / contadorNegativos);
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] == ceros) {
                numeroCeros++;
            }
        }
        System.out.println("El número de ceros es: " + numeroCeros);
    }
}
