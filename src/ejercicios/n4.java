package ejercicios;
import java.util.Scanner;

/*4.	Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad*/
public class n4 {

	public static void main(String[] args) {
		
		int edad = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer numero: ");
		edad = scanner.nextInt();
		if(edad>=18) {
			System.out.println("usted es mayor de edad.");
		}else {
			System.out.println("Usted es menor de edad.");
		}
		
	}
}
