import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qué número de día de la semana es hoy?");

        int numeroDiaSemana = scanner.nextInt();

        // for (int i = 1; i <= 7; i++) {
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