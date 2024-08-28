package Repaso_Bucles;

/*5. Contador regresivo:
   Enunciado: Escribe un programa que pida al usuario un número y luego haga una cuenta regresiva desde ese número
   hasta 0, imprimiendo cada número. Al llegar a 0, debe imprimir "¡Despegue!".
   Consejo: El bucle for será lo forma más fácil, pero prueba a hacerlo con Do While y un contador.*/

import java.util.Scanner;

public class Bucles_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número para comenzar la cuenta atrás: ");
        int numero;
        numero = sc.nextInt();

        do {
            System.out.println(numero);
            numero--;

        } while (numero >= 0);
        System.out.println("¡Despegue!");

        sc.close();
    }
}
