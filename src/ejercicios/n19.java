package ejercicios;

import java.util.Scanner;

/* 19. Escribe un programa que solicite al usuario 
 * su nombre y luego lo imprima en mayúsculas y minúsculas */
public class n19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("Nombre en minúsculas: " + nombre.toLowerCase());
    }
}
