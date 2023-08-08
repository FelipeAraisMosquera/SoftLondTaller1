package ejercicios;

import java.util.Scanner;

/* 21. Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella */
public class n21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.println("Ingrese la letra a buscar: ");
        char letra = scanner.next().charAt(0);

 
        int cantidadApariciones = contarApariciones(cadena, letra); 
        System.out.println("La letra '" + letra + "' aparece " + cantidadApariciones + " veces en la cadena.");
    }

    public static int contarApariciones(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}
