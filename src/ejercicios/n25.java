package ejercicios;
import java.util.Scanner;

public class n25 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        scanner.close();

        String[] palabras = frase.split(" ");

        System.out.println("Palabras separadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
