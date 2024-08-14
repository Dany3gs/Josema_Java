package Varios_Josema01;/*
Ejercicio 03

Determine el valor final de resultado la variable después de ejecutar todas estas
instrucciones:

int resultado = 4;
resultado += 3;
resultado *= 2;
resultado--;
resultado %= 4;
*/

//Solución

// El cálculo que se ejecuta con esta secuencia es el siguiente ((4+3)*2-1)Mod4 = 1 "resto de la división"

public class Ejercicio03 {

     public static void main(String[] args) {

         int resultado = 4;
        resultado += 3;
        resultado *= 2;
        resultado--;
        resultado %= 4;

        System.out.println(resultado);
    }
}
