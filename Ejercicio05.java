/*Ejercicio 05

Escribe un programa en Java que pida al usuario un número entero y determine
si es par o impar. El programa debe imprimir un mensaje indicando si el número
introducido es par o impar. Consejo: Recuerda, un número es par si es divisible
por 2 sin dejar residuo o resto.*/



import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        System.out.print("Escriba un número entero: ");

        Scanner numEntero = new Scanner(System.in);
            int numero;
            numero = numEntero.nextInt();

//Usando el comando % indica el resto de la división, al ser diferente a 0, determinamos que es impar.

        if (numero % 2 != 0 ) {
            System.out.print("El numero " + numero + " es impar");
        } else {
            System.out.print("El número " + numero + " es par");
        }
    }
}
