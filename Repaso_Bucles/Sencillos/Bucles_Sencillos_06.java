package Repaso_Bucles.Sencillos;

/*Ejercicio 6 B
Escribe un programa que calcule la media de un conjunto de números
positivos introducidos por teclado. A priori, el programa no sabe
cuántos números se introducirán. El usuario indicará que ha terminado
de introducir los datos cuando meta un número negativo.*/


import java.util.Scanner;

public class Bucles_Sencillos_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numerosIngresados; //con el for inicia en 1
        double suma = 0;
        int contador = 0;
        boolean finalizar = false;

        //Mi código
        /*for (int i = 0; i < numerosIngresados; i++) {
            numerosIngresados = sc.nextInt();

            if (numerosIngresados > 0) {
                suma += numerosIngresados;
                contador++;
            }
            if (numerosIngresados < 0) {
                System.out.println("La medía de los números ingresados es: " + suma / contador);
                break;
            }
        }*/

        //Corregido correcto
        while (!finalizar) {
            numerosIngresados = sc.nextDouble();

            if (numerosIngresados >= 0) {
                suma += numerosIngresados;
                contador++;
            } else {
                finalizar = true;
            }
        }
        if (contador > 0) {
            System.out.println("La medía de los números ingresados es: " + suma / contador);
        } else {
            System.out.printf("No se ingresaron números positivos.");
        }
    }
}
