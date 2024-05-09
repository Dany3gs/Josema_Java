//Ejercicio01 **Este es el que vi primero, que estaba fuera de la lista, lo marque como el primero**

/* Crea un programa en java que muestre el nombre de un día de la semana a
partir de su número (del 1 al 7) introducido por el usuario, usando "if".
Por ejemplo, si el usuario introduce el número "2", tu programa deberá responder "martes".
Si introduce un número menor que 1 o mayor que 7, deberá decir "día no válido"*/


import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué número de día de la semana es hoy?");

        int numeroDiaSemana = scanner.nextInt();

        if (numeroDiaSemana == 1) {
            System.out.println("Lunes");
        } else if (numeroDiaSemana == 2) {
            System.out.println("Martes");
        } else if (numeroDiaSemana == 3) {
            System.out.println("Miércoles");
        } else if (numeroDiaSemana == 4) {
            System.out.println("Jueves");
        } else if (numeroDiaSemana == 5) {
            System.out.println("Viernes");
        } else if (numeroDiaSemana == 6) {
            System.out.println("Sábado");
        } else if (numeroDiaSemana == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia no valido");
        }
    }
}
