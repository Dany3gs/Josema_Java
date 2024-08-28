package Varios_Josema01;/*Ejercicio 07

Crea un programa que permita calcular longitudes de circunferencias. 
El usuario introducirá el radio y se le responderá algo como 
"La longitud de un circunferencia de radio 2 m es de 12,56 m2". 
 Recuerda que la fórmula es L = 2 * PI * radio. 

*/

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        System.out.println("Indique el radio para calcular la longitud de su circunferencia.");

@SuppressWarnings("resource")

        Scanner radioScanner = new Scanner(System.in);

        int radio;

        radio = radioScanner.nextInt();

        double circunferencia = (2 * Math.PI * radio);
        
        /*Para limitar la longitud del número que nos da la circunferencia, se puede poner dónde se desee que se represente en la cadena string, usando "printf" como limitador de
        espaciadores de formato para imprimir un valor numérico de manera esepcífica dentro de una cadena de texto, usando "%3.2f":
        
         * "%" Indica el inicio de un especificador de formato.
         * "3" Nº opcional que indica el ancho min del campo, significa que el nº entero tendrá al menos 3 caracteres de ancho, si es menor, se rellena con espacios a la izq.
         * ".2" Nº exacto de dígitos que se muestran después del punto decimal.
         * "f" Indica que el nº es de punto flotante, (float o double).
         */

        System.out.printf("La longitud de una circunferencia de radio " + radio + " m es de %3.2f m2" , circunferencia);
    }
    
}
