package Varios_Josema01;/*Ejercicio 04

Cree un programa llamado Edades.java que:
• Define dos variables byte para almacenar tu edad y la edad de un amigo.
• Define otra variable byte para almacenar la suma de ambas edades (es
posible que deba encasillar el resultado)
• Define una variable float para almacenar el promedio de estas edades,
incluidos los dígitos de las fracciones.
• Imprime el mensaje “El promedio de edad es” seguido del promedio
calculado en el paso anterior
 */


public class Edades {

    public static void main(String [] args) {

    byte miEdad = 42;
    byte amigoEdad = 11;
    byte sumaEdades = (byte) (miEdad + amigoEdad);

    float avgEdad = (sumaEdades / 2f);

        System.out.println("El promedio de edad es "+ avgEdad);

    }
}
