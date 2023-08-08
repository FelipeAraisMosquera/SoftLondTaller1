package ejercicios;
import java.util.Scanner;

/*2.	Escribe un programa que pida al usuario un número entero y determine si es par o impar.*/
public class n2 {

	public static void main(String[] args) {
		
		int n1 = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		n1 = scanner.nextInt();
		if(n1%2==0) {
			System.out.println("El numero es PAR");
		}else {
			System.out.println("El numero es IMPAR");
		}
			

	}

}
