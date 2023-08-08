package ejercicios;
import java.util.Scanner;
/*5.	Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos*/


public class n5 {

	public static void main(String[] args) {
		
	
		int n1 = 0;
		int n2 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		n1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = scanner.nextInt();
		if(n1>n2) {
			System.out.println(n1 + " es el numero mayor!");
		}else {
			System.out.println(n2 + " es el numero mayor!");
		}
	}
}
