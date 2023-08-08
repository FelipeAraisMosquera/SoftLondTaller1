package ejercicios;

import java.util.Scanner;

/* 24. Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra */
public class n24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Ingrese la letra a reemplazar: ");
        String letraBuscarStr = scanner.nextLine();

        System.out.println("Ingrese la letra de reemplazo: ");
        String letraReemplazoStr = scanner.nextLine();

        if (letraBuscarStr.length() != 1 || letraReemplazoStr.length() != 1) {
            System.out.println("Por favor, ingrese solo una letra para buscar y una letra para reemplazar.");
            return;
        }


        char letraBuscar = letraBuscarStr.charAt(0);
        char letraReemplazo = letraReemplazoStr.charAt(0);

        String cadenaReemplazada = reemplazarLetra(cadena, letraBuscar, letraReemplazo);

        System.out.println("Cadena reemplazada: " + cadenaReemplazada);
    }

    public static String reemplazarLetra(String cadena, char letraBuscar, char letraReemplazo) {
        return cadena.replace(letraBuscar, letraReemplazo);
    }
}
