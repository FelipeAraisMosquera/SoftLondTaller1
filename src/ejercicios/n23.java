package ejercicios;

import java.util.Scanner;

/* 23. Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene */
public class n23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una oración: ");
        String oracion = scanner.nextLine();

        int cantidadPalabras = contarPalabras(oracion);
        System.out.println("La oración contiene " + cantidadPalabras + " palabras.");
    }

    public static int contarPalabras(String oracion) {
        String[] palabras = oracion.trim().split("\\s+");
        return palabras.length;
    }
}
