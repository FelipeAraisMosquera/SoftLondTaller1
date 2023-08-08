package ejercicios;

import java.util.Scanner;

/*13.	Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales */
public class n13 {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Ingrese numero decimal: ");
	        double numero = scanner.nextDouble();

	        System.out.println("Ingrese el número de decimales para redondear: ");
	        int numDecimales = scanner.nextInt();

	        double valorRedondeado = redondear(numero, numDecimales);
	        System.out.println("Numero redondeado: " + valorRedondeado);
	    }

	    public static double redondear(double valor, int numDecimales) {
	        double factor = Math.pow(10, numDecimales);
	        return Math.round(valor * factor) / factor;
	    }

}
