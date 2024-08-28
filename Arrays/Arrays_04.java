/*Ejercicio Array 4
Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.*/

package Arrays;

import java.util.Scanner;

public class Arrays_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {

            System.out.print(num[i] + ",");
            System.out.print(num[9 - i] + ", ");

        }

    }
}
// ok