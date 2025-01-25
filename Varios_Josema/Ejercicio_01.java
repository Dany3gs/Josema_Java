package Varios_Josema;

/*Ejercicio 1
Pedir dos números y decir si son iguales o no.*/

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Escribir dos números: ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("los números " + num1 + " y " + num2 + " son iguales");
        } else {
            System.out.println("los números " + num1 + " y " + num2 + " no son iguales");
        }
    }
}
