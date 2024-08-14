package Varios_Josema01;/*
Ejercicio 06

Crea una clase llamada DivisionYResto en Java. Esta clase debe tener un método principal (main)
que realice las siguientes tareas:
Solicita al usuario que introduzca dos números enteros.
Realiza la división entera del primer número entre el segundo número y guarda el resultado.
Calcula el resto de la división del primer número entre el segundo número y guarda el resultado.
Muestra en la consola el resultado de la división y el resto en el siguiente formato:
“El resultado de dividir {primer número} entre {segundo número} es {resultado de la división}, con resto {resto}”.

Por ejemplo, si el primer número es 10 y el segundo número es 3, el programa debe imprimir:
“El resultado de dividir 10 entre 3 es 3, con resto 1”.
 */


import java.util.Scanner;

public class DivisionYResta {
    public static void main(String [] args) {
        System.out.print("Introduzca dos números enteros: ");

        Scanner num = new Scanner(System.in);

        int num1 = num.nextInt();

        System.out.print("Introduzca el segundo número: ");

        int num2 = num.nextInt();
        int resultado = num1 / num2;
        double resto = num1 % num2;

        System.out.println("El resultado de dividir " + num1 + " entre " + num2 + " es " + resultado + "," + " y el resto es " + resto);

    }
}
