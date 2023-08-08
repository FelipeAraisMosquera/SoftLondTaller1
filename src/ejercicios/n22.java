package ejercicios;

import java.util.Scanner;

/* 22. Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) */
public class n22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        if (esPalindromo(frase)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String frase) {
        frase = frase.replaceAll("\\s+", "").toLowerCase();

        int izquierda = 0;
        int derecha = frase.length() - 1;

        while (izquierda < derecha) {
            if (frase.charAt(izquierda) != frase.charAt(derecha)) {
                return false; 
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}
