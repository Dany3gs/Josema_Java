package Arrays;

/*Ejercicio Array 8 Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100

Obtén la suma de todos ellos y la media.*/

public class Ejercicio_08 {

    public static void main(String[] args) {

        int[] num = new int[100];
        double sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] += i + 1;
        }

        for (int rango : num) {
            System.out.print(rango + ", ");
        }

        System.out.println("");

        for (int sumaTotal : num) {
            sum += sumaTotal;
        }
        System.out.println("La suma total es: " + (int) sum);
        System.out.println("La media del total es: " + (sum / num.length));

    }
}
