package ejercicios;

import java.util.Scanner;

/*15.	Crea un programa que pida al usuario un número entero
 *  y determine si es un número capicúa.
 *   Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.*/
public class n15 {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Ingrese un número entero: ");
		        int numero = scanner.nextInt();

		        if (esCapicua(numero)) {
		            System.out.println(numero + " es un número capicúa.");
		        } else {
		            System.out.println(numero + " no es un número capicúa.");
		        }
		    }

		    public static boolean esCapicua(int numero) {
		        // Convertimos el número a cadena para poder comparar caracteres
		        String numeroStr = String.valueOf(numero);
		        
		        // Comparamos el primer carácter con el último, el segundo con el penúltimo, y así sucesivamente
		        int izquierda = 0;
		        int derecha = numeroStr.length() - 1;
		        while (izquierda < derecha) {
		            if (numeroStr.charAt(izquierda) != numeroStr.charAt(derecha)) {
		                return false; 
		            }
		            izquierda++;
		            derecha--;
		        }
		        return true; // 
		    }
		


}
