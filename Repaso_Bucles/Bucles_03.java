package Repaso_Bucles;

/*3. Tabla de multiplicar:
   Enunciado: Desarrolla un programa que pida al usuario un número y luego muestre la tabla de multiplicar de ese
   número del 1 al 10.
   Consejo: El bucle do-while es útil aquí porque quieres que el código se ejecute al menos una vez. Recuerda usar
   Scanner para la entrada del usuario.
*/

import java.util.Scanner;

public class Bucles_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Introduzca un número para mostrar la tabla de multiplicar hasta el 10.");
        num = sc.nextInt();
        int multiplicador = 0;
        int resultado;

        do {
            multiplicador++;
            resultado = num * multiplicador;
            System.out.println("El resultado de multiplicar " + num + " x " + multiplicador + " es: " + resultado);
        } while (multiplicador < 10);
    }
}
