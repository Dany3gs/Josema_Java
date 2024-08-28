package Repaso_Bucles.Sencillos;

/*Ejercicio 5 B
 Realiza el control de acceso a una caja fuerte. La combinación
 será un número de 4 cifras. El programa nos pedirá la combinación
 para abrirla. Si no acertamos, se nos mostrará el mensaje
 “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 oportunidades para abrir la caja fuerte.

 Con un contador y bucle while es mas claro el código y legible, rehecho en ejercicio 5b
 */

import java.util.Scanner;

public class Bucles_Sencillos_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("********************************************************");
        System.out.println("Introducir la combinación para acceder a la caja fuerte.\n");
        System.out.println("Tiene 4 intentos.");

        int combinacion = 1234;
        int codigo;
        for (int i = 0; i < 4 ; i++) {
            codigo= sc.nextInt();
            if (codigo == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }  else {
                System.out.println("Lo siento, esa no es la combinación");
            }
        }sc.close();
    }
}
