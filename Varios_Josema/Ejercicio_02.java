package Varios_Josema;

/*Ejercicio 2
Pedir dos números y decir cuál es el mayor o si son iguales.*/

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca dos números: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 < num2){
            System.out.println(num2 + " es mayor que " + num1);
        } else {
            System.out.println(num1 + " y " + num2 + " son iguales");
        }
        sc.close();
    }
}
