package ejercicios;

public class n29 {
    public static void main(String[] args) {

        int[] arreglo = { 10, 5, 25, 15, 20 };

        int maximo = arreglo[0]; 

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El número más grande en el arreglo es: " + maximo);
    }
}
