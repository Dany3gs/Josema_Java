package Varios_Josema01;/*Ejercicio 08

Crea un programa en java que pida al usuario un número entero y responda 
si es un número positivo, negativo o cero, usando "if" y "else".
*/

import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        System.out.println("Indique un número entero: ");

@SuppressWarnings("resource")        

        Scanner numEntero = new Scanner(System.in);

        int num;

        num = numEntero.nextInt();

        if (num < 0) {
            System.out.println("El número es negativo.");
        } else if (num > 0) {
            System.out.println("El número es positivo.");
        }else {
            System.out.println("El número es cero.");
        }

    }
}
