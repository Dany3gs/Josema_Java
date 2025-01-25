package Arrays;
/*Ejercicio Array 6 Crea un array de 10 posiciones de números con valores pedidos por teclado.
 Muestra por consola el índice y el valor al que corresponde.
 */

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrays = new int[10];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = sc.nextInt();
        }

        System.out.println("Indices: ");
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = i;
            System.out.print(arrays[i] + ", ");
        }

        System.out.println(" ");
        System.out.println("Valores: ");
        for (int j = 0; j < arrays.length; j++) {
            arrays[j] = j + 1;
            System.out.print(arrays[j] + ", ");
        }
    }
}
