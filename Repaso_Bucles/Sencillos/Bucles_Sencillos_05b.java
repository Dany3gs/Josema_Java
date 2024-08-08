package Repaso_Bucles.Sencillos;
/*Ejercicio resuelto con consejos de Josema por los siguientes motivos:
- Utiliza una lógica más clara con el bucle while y el contador de intentos. Por no saber en qué iteración saldrá del
  bucle.
- Maneja explícitamente la situación de bloquear la tarjeta después de 4 intentos fallidos con un mensaje final.
- Es más fácil de leer y entender debido al uso de una variable booleana para controlar el flujo.*/
import java.util.Scanner;

public class Bucles_Sencillos_05b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinacion = 1234;
        int codigo;
        int intentos = 0; //tener en cuenta los contadores
        boolean correcto = false;
        while (!correcto && intentos < 4) {
            codigo = sc.nextInt();
            if (codigo == combinacion) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                correcto = true;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
                intentos++;
                if (intentos == 4) {
                    System.out.println("Tarjeta bloqueada");
                }
            }
        }
    }
}
