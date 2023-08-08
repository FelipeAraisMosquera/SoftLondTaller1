package ejercicios;
import java.util.Scanner;

/*3.	Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.*/
public class n3 {
	
	public static void main(String[] args) {
		

		int radio = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el radio del circulo: ");
		radio = scanner.nextInt();
		double pi= Math.PI;
		double area= Math.pow(radio, 2)*pi;
		double Perimetro = 2*pi*radio;
		
		System.out.println("El Area del circulo es: "+ area +"\ny su perimetro: "+ Perimetro);

		
		
		
		
		
	}

}
