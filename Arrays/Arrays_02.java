/*Ejercicio Array 2
Leer 5 números y mostrarlos en orden inverso al introducido.*/

package Arrays;

import java.util.Scanner;

public class Arrays_02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.print(num[0] + i + ", ");
        }
        sc.close();
    }
}