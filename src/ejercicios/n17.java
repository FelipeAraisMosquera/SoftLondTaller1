package ejercicios;

import java.util.Scanner;

/* 17. Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.*/
public class n17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Números primos en el rango: ");
        mostrarPrimosEnRango(numero1, numero2);
    }

    public static void mostrarPrimosEnRango(int inicio, int fin) {
        for (int numero = inicio; numero <= fin; numero++) {
            if (esPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
