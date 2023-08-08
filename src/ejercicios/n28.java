package ejercicios;
/*28.	Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.*/
public class n28 {
    public static void main(String[] args) {

        int[] arreglo = { 5, 10, 15, 20, 25 };

        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }

        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }
}
