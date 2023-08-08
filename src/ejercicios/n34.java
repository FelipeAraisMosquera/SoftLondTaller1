package ejercicios;
/*34.	Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.*/
public class n34 {
    public static void main(String[] args) {

        int[] arreglo = { 1, 2, 3, 4, 5, 6, 7 };

        int[] resultadoIzquierda = rotarIzquierda(arreglo, 2);

        int[] resultadoDerecha = rotarDerecha(arreglo, 3);

        System.out.println("Arreglo original: " + arrayToString(arreglo));
        System.out.println("Arreglo rotado hacia la izquierda: " + arrayToString(resultadoIzquierda));
        System.out.println("Arreglo rotado hacia la derecha: " + arrayToString(resultadoDerecha));
    }

    public static int[] rotarIzquierda(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            int nuevaPosicion = (i - posiciones + n) % n;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }

    public static int[] rotarDerecha(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            int nuevaPosicion = (i + posiciones) % n;
            resultado[nuevaPosicion] = arreglo[i];
        }

        return resultado;
    }

    public static String arrayToString(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
