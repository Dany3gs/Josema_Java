package Repaso_Bucles.Sencillos;

/*Ejercicio 3 B
Realiza el ejercicio 2 B usando un bucle do while.*/

public class Bucles_Sencillos_03 {
    public static void main(String[] args) {

        int num = 0;
        do {
            if (num % 5 == 0) {
                System.out.println(num);
            }
            num += 5; //consejo
        }
        while (num <= 100);
    }
}

