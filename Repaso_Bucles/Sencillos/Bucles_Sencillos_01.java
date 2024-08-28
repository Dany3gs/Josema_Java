package Repaso_Bucles.Sencillos;

/*Ejercicio 1 B
Enunciado: Múltiplos de 5
Escribe un programa en Java que imprima todos los múltiplos de 5 desde 0 hasta 100 (inclusive). El programa debe
utilizar un bucle for para generar estos números y mostrarlos en la consola, uno por línea.
Requisitos:

1.-El programa debe comenzar en 0 y terminar en 100.
2.-Debe imprimir solo los números que son múltiplos de 5.
3.-Utiliza un bucle for para generar los números.
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
Consejo: Piensa en cómo puedes usar el incremento del bucle for para saltar directamente al siguiente múltiplo de 5 en
cada iteración.*/

public class Bucles_Sencillos_01 {
    public static void main(String[] args) {

        //consejo, incremento i en el nª que queramos saber los múltiplos para ahorrar iteraciones y me ahorro el if=?¿?
        for (int i = 0; i <= 100; i = i +5 ) {

                System.out.println(i);
        }
    }
}
