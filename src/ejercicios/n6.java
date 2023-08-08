package ejercicios;

import java.util.Scanner;

/*6.	Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero*/
public class n6 {

	public static void main(String[] args) {
		
		int numero = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el un numero: ");
		numero = scanner.nextInt();
		if(numero>0) {
			System.out.println("El numero es positivo.");
		}else if(numero<0) {
			System.out.println("El numero es negativo.");
		}else {
			System.out.println("El numero es cero.");
		}
	}
}
