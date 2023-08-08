package ejercicios;
import java.util.Scanner;

/*1.	Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.*/
public class n1 {

	public static void main(String[] args) {
		
		int n1 = 0;
		int n2 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		n1 = scanner.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		n2 = scanner.nextInt();
		System.out.println("Suma: "+(n1+n2));
		System.out.println("Resta: "+(n1-n2));
		System.out.println("Multiplicacion: "+(n1*n2));
		float D12 = (float) n1/n2;
		System.out.println("Division: "+D12);
		
		
	}

}
