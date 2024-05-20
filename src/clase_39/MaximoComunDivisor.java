package clase_39;

public class MaximoComunDivisor {

    public static void main(String[] args) {
        System.out.println(obtenerMaximoComunDivisor(25, 15));
        System.out.println(obtenerMaximoComunDivisor(12, 30));
        System.out.println(obtenerMaximoComunDivisor(9, 18));
        System.out.println(obtenerMaximoComunDivisor(81, 153));
    }

    public static int obtenerMaximoComunDivisor(int primero, int segundo) {
        if (primero < 10 || segundo < 10) {
            return -1;
        }

        // Usando el algoritmo de Euclides para MCD.
        while (primero != segundo) {
            if (primero > segundo) {
                primero -= segundo; // Reduce el valor de 'primero' restando 'segundo' de él
            } else {
                segundo -= primero; // Reduce el valor de 'segundo' restando 'primero' de él
            }
        }
        // Cuando salga del bucle, 'primero' y 'segundo' serán iguales, representando el MCD
        return primero;
    }
}
