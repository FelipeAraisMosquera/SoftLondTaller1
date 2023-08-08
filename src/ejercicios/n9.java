package ejercicios;


import java.util.Scanner;

/*9.	Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.*/
public class n9 {

	public static void main(String[] args) {
		
		int fact = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entero positivo: ");
		int numero = scanner.nextInt();
		
		for(int i=numero;i>=1;i--) {
			fact *=i;
			System.out.print(i);
			if(i!=1) {
				System.out.print("*");
			}
			
		}
		System.out.println("=" + fact);
	}
}
