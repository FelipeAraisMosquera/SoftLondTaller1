package ejercicios;

import java.util.Scanner;

/*8.	Realiza un programa que simule un juego de adivinar un número. 
 * El programa debe generar un número aleatorio entre 1 y 100, y el 
 * usuario debe adivinarlo. El programa debe indicar si el número ingresado 
 * es mayor o menor que el número a adivinar.*/
public class n8 {

	public static void main(String[] args) {
		int numero = 0;
		int  n = 0;
		int intentos = 5;
		Scanner scanner = new Scanner(System.in);
		int numRandom = (int) (Math.random()*100);
		//System.out.println(numRandom);
		while(n<=intentos) {
			System.out.println("Ingrese un número entero positivo: ");
			numero = scanner.nextInt();
			if(numRandom>numero) {
				System.out.println("MAYOR");
			}else if(numRandom<numero) {
				System.out.println("MENOR");
			}else {
				System.out.println("¡FELICIDADES ADIVINASTE! " + numRandom);
				break;
			}
			n++;
			System.out.println("intento "+n+" de "+intentos);
			if(n==intentos) {
				System.out.println("Perdiste :(, el numero era: " +numRandom);
				break;
			}
		}
		
	}
}
