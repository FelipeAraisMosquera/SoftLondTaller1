package ejercicios;
import java.util.Arrays;

public class n30 {
    public static void main(String[] args) {
 
        int[] arreglo = { 1, 2, 2, 3, 4, 4, 5, 6, 6, 7 };

        int longitudOriginal = arreglo.length;
        int nuevaLongitud = 0;

        for (int i = 0; i < longitudOriginal; i++) {
            boolean duplicado = false;
            for (int j = i + 1; j < longitudOriginal; j++) {
                if (arreglo[i] == arreglo[j]) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                arreglo[nuevaLongitud] = arreglo[i];
                nuevaLongitud++;
            }
        }

        arreglo = Arrays.copyOf(arreglo, nuevaLongitud);

        System.out.println("Arreglo sin elementos duplicados: " + Arrays.toString(arreglo));
    }
}
