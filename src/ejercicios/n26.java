package ejercicios;
import java.util.Scanner;

public class n26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        scanner.close();


        int caracteresSinEspacios = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                caracteresSinEspacios++;
            }
        }

        System.out.println("La cadena tiene " + caracteresSinEspacios + " caracteres sin contar los espacios en blanco.");
    }
}
