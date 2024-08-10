package Repaso_Bucles;

/*2. Suma de números pares hasta 20:
   Enunciado: Crea un programa que calcule la suma de todos los números pares desde 2 hasta 20 (inclusive) y muestre
   el resultado.
   Consejo: Puedes usar un bucle for para esto. Piensa en cómo puedes asegurarte de que solo sumes los números pares
   (pista: puedes empezar en 2 e incrementar de 2 en 2).
*/

public class Bucles_02 {
    public static void main(String[] args) {

        int suma = 0;
        for (int i = 2; i <= 20; i = i + 2) {
            suma += i;
        }
        System.out.println("La suma de los números pares desde el número 2 hasta 20 es: " + suma);
    }
}
