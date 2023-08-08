package ejercicios;
/*32.	Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).*/
public class n32 {
    public static void main(String[] args) {
        int[] arreglo = { 10, 20, 30, 40, 50 };

        int numeroBuscado = 30;

        int indice = buscarNumero(arreglo, numeroBuscado);
        if (indice != -1) {
            System.out.println("El número " + numeroBuscado + " se encuentra en el índice " + indice);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }

    public static int buscarNumero(int[] arreglo, int numero) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                return i; 
            }
        }
        return -1; 
    }
}
