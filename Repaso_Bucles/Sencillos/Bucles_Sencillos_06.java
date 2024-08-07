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

        double numerosIngresados = Integer.MAX_VALUE;
        double suma = 0;
        int contador = 0;

        for (int i = 0; i < numerosIngresados; i++) {
            numerosIngresados = sc.nextInt();

            if (numerosIngresados > 0) {
                suma += numerosIngresados;
                contador++;
            }
            if (numerosIngresados < 0) {
                System.out.println("La medía de los números ingresados es: " + suma / contador);
                break;
            }
        }
    }
}
