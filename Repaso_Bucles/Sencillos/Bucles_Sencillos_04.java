package Repaso_Bucles.Sencillos;

/*Ejercicio 4 B
Muestra los números del 320 al 160, contando de 20 en 20 hacia
atrás utilizando un bucle for. */

public class Bucles_Sencillos_04 {
    public static void main(String[] args) {

        for (int i = 320; i >= 160; i = i - 20) {
            System.out.println(i);
        }
    }
}
