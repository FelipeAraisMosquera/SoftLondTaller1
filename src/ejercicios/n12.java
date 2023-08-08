package ejercicios;

import java.util.Scanner;

/*12.	Realiza un programa que pida al usuario un número entero y determine si es un número primo o no*/
public class n12 {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese lado numero 1°");
		int numero = scanner.nextInt();
		int raiz = (int) Math.sqrt(numero);
		for(i = 2; i<=raiz;i++) {
			if(numero % i == 0) {
				System.out.println("NO es un numero primo, es divisible entre "+i);
				break;
			}
		}
		if(i>raiz) {
			System.out.println("Es un numero primo.");
		}
		
	}

}
