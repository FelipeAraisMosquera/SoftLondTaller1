package ejercicios;

import java.util.Random;

/* 18. Crea un programa que genere una contraseña aleatoria de 
 * 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos. 
 * Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.*/
public class N18 {

    public static void main(String[] args) {
        String password = generarContrasenaAleatoria(8);
        System.out.println("Contraseña generada: " + password);
    }

    public static String generarContrasenaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contraseña = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            contraseña.append(caracterAleatorio);
        }

        return contraseña.toString();
    }
}
