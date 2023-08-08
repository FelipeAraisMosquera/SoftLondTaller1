package ejercicios;
/*31.	Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.*/
public class n31 {
    public static void main(String[] args) {
        int[] arreglo = { 64, 34, 25, 12, 22, 11, 90 };

        ordenarBurbuja(arreglo);

        System.out.println("Arreglo ordenado:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}
