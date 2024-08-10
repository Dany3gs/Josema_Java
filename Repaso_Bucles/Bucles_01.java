package Repaso_Bucles;

/*1. Contar del 1 al 10 usando while:
   Enunciado: Escribe un programa que imprima los números del 1 al 10 en la consola, uno por línea.
   Consejo: Este es un buen ejercicio para practicar el bucle while. Recuerda inicializar tu variable contadora antes
    del bucle y actualizarla dentro del bucle.
*/

public class Bucles_01 {
    public static void main(String[] args) {

        int num = 1;

        while (num <= 10) {
            System.out.println(num);
             num++;
        }
    }
}
