package Arrays;

/*Ejercicio Array 1
Leer 5 números y mostrarlos en el mismo orden introducido*/

import java.util.Scanner;

public class Arrays_01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
            System.out.print(num[i] + ", ");
        }
    }
}