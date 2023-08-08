package ejercicios;

import java.util.Scanner;

/* 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci. 
 * La serie Fibonacci se forma sumando los dos números 
 * anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …*/
public class n10 {

	public static void main(String[] args) {
		
		int numeros = 20;
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
