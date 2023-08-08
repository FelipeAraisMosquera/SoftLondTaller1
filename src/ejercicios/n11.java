package ejercicios;

import java.util.Scanner;

/*11.	Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.*/
public class n11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese lado numero 1°");
		int a = scanner.nextInt();
		System.out.println("Ingrese lado numero 2°");
		int b = scanner.nextInt();
		System.out.println("Ingrese lado numero 3°");
		int c = scanner.nextInt();
		
		double s = (a+b+c)/2;
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("el area del triangulo es: "+ area);
	}

}
