package ejercicios;
import java.util.Scanner;
import java.util.Arrays;

public class n27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        String[] palabras = frase.split(" ");

        Arrays.sort(palabras);

        System.out.println("Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
