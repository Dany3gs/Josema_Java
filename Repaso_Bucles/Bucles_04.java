package Repaso_Bucles;

/*4. Imprimir elementos de un array:
   Enunciado: Crea un array de strings con al menos 5 nombres de frutas. Luego, escribe un programa que imprima cada
    fruta en una nueva línea.
   Consejo: Este es un caso perfecto para usar un bucle for-each. Es más simple y legible que un for tradicional cuando
    solo necesitas recorrer todos los elementos.
*/

public class Bucles_04 {
    public static void main(String[] args) {

        String[] frutas = {"Pera", "Manzana", "Plátano", "Melón", "Naranja"};
        for (String myArrays : frutas) {
            System.out.println(myArrays);
        }
    }
}
