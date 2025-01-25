package Arrays;

/*Ejercicio Array 7
Crea un array de números donde le indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por
pantalla el valor de cada posición y la suma de todos los valores*/

import java.util.Arrays; //necesario para Array.stream(variable).sum()
import java.util.Scanner;
import java.util.Random;

public class Ejercicio_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Indique el número de elementos que desee: \n (los valores serán entre el 0 y 9): ");

        int[] nums = new int[sc.nextInt()];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }

        System.out.println("Los valores resultantes son: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("");

        // 1. Formas de sumar los valores del array (for)(foreach)(Arrays.stream().sum();)
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("La suma total con for de los números indicados es = " + sum);

        /* 2. foreach; más fácil y menos código
        for (int suma : nums){
            sum += suma;
        }
        System.out.println("La suma con foreach total de los números indicados es = " + sum);

        // 3. Uso de Array.stream(variable).sum(); mejor para arrays grandes
        sum = Arrays.stream(nums).sum();

        System.out.println("La suma con Array.stream(variable).sum() total de los números indicados es = " + sum);*/
    }
}
