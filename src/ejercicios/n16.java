package ejercicios;

import java.util.Scanner;

/*16.	Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. */
public class n16 {


		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Cantidad de repeticion que desea del Fibonacci");			
			int numeros = scanner.nextInt();;
			
			System.out.println("Los primeros "+ numeros + " numeross de la serie Fibonacci son:");
			int[] miArreglo = new int[numeros];
			miArreglo[0] = 0;
			miArreglo[1] = 1;
			for(int i=2;i<numeros;i++) {
				miArreglo[i]=miArreglo[i-1]+miArreglo[i-2];
			}
			
			for(int i=0;i<numeros;i++) {
				System.out.println(miArreglo[i]);
			}

		}

}
