/*Ejercicio Array 5 DIFICIL
Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º
        de B, el 2º de A, el 2º de B, etc.*/
package Arrays;
import java.util.Scanner;

public class Arrays_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numA = new int[10];
        int[] numB = new int[10];
        int[] numC = new int[numA.length + numB.length];

        for (int i = 0; i < numA.length; i++) {
            numA[i] = sc.nextInt();
        }
        for (int i = 0; i < numB.length; i++) {
            numB[i] = sc.nextInt();
        }
        //¿es válido usar una de las variables A o B como length?
        for (int i = 0; i < numB.length ; i++) {
            numC[i] = numA[i];
            System.out.print(numC[i] + ", ");
            numC[i] = numB[i];
            System.out.print(numC[i]);
            System.out.println(" ");
        }
    }
}
// no valido, revisar valores de C