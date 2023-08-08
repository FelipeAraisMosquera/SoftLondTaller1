package ejercicios;
/*33.	Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.*/
import java.util.HashMap;
import java.util.Map;

public class n33 {
    public static void main(String[] args) {
        // Arreglo de enteros
        int[] arreglo = { 1, 2, 3, 2, 1, 4, 3, 5, 1, 4 };

        // Llamar al método de conteo e imprimir el resultado
        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);
        for (int elemento : frecuencia.keySet()) {
            int cantidad = frecuencia.get(elemento);
            System.out.println("El elemento " + elemento + " aparece " + cantidad + " veces.");
        }
    }

    public static Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();

        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }

        return frecuencia;
    }
}
