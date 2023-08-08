package ejercicios;

import java.util.Scanner;

/*7.	Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.*/
public class n7 {

	public static void main(String[] args) {
		int numero = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entero positivo: ");
		numero = scanner.nextInt();
		int n = 0;
		while(n<=10) {
			System.out.println(numero+"*"+n+"="+numero*n);
			n++;
		}

	}

}
