package Varios_Josema01;

/*Ejercicio 09
Escribe un programa en Java que imprima todos los números primos hasta un número n dado por el usuario.
Un número primo es un número mayor que 1 que no tiene otros divisores positivos aparte de 1 y él mismo.*/

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numP;
        numP = sc.nextInt();

        for (int i = 1; i <= numP; i++) {
            if (i % 2 != 0 || i <= 1){
                System.out.println(i);
            }
        }
    }
}
