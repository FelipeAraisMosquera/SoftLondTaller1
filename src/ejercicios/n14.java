package ejercicios;

import java.util.Scanner;

/*14.	Escribe un programa que solicite al usuario un número entero positivo
 *  y verifique si es un número perfecto. Un número perfecto es aquel cuya 
 *  suma de sus divisores propios (excluyendo al propio número) es igual al número.*/
public class n14 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;
    }

}
