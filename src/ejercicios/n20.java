package ejercicios;

import java.util.Scanner;

/* 20. Realiza un programa que solicite al usuario una cadena y luego invierta su orden */
public class n20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        String cadenaInvertida = invertirCadena(cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }

    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }

        return cadenaInvertida.toString();
    }
}
