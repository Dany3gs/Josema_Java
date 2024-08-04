package Repaso_Bucles.Sencillos;

/*Ejercicio 2 B
Realiza el ejercicio 1 B usando un bucle while.
Escribe un programa en Java que imprima todos los múltiplos de 5 desde 0 hasta 100 (inclusive). El programa debe
utilizar un bucle while para generar estos números y mostrarlos en la consola, uno por línea.
Requisitos:

1.-El programa debe comenzar en 0 y terminar en 100.
2.-Debe imprimir solo los números que son múltiplos de 5.
3.-Utiliza un bucle while para generar los números.
4.-Cada número debe ser impreso en una nueva línea.

Resultado esperado:
El programa debe imprimir los siguientes números:
0
5
10
15
...
95
100
Consejo: Piensa en cómo puedes hacer para saltar directamente al siguiente múltiplo de 5 en cada iteración con el
 bucle while.*/

public class Bucles_Sencillos_02 {
    public static void main(String[] args) {

        int num = 0;
        while (num <= 100) {

            if (num % 5 == 0) {
                System.out.println(num);
            }
            num += 5; //consejo
        }
    }
}
