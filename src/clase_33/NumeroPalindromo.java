package clase_33;

public class NumeroPalindromo {

    public static void main(String[] args) {
        System.out.println(esPalindromo(-1221));
        System.out.println(esPalindromo(707));
        System.out.println(esPalindromo(11212));
    }

    public static boolean esPalindromo(int numero) {
        if (numero < 0) {
            return false; // Retorna directamente false para números negativos
        }

        int numeroOriginal = numero; // Guarda el número original para comparación posterior
        int numeroInvertido = 0;

        while (numero > 0) {
            int ultimoDigito = numero % 10; // Obtiene el último dígito
            numeroInvertido = numeroInvertido * 10 + ultimoDigito; // Construye el número invertido
            numero /= 10; // Elimina el último dígito del número original
        }

        // Compara el número original con su versión invertida
        return numeroOriginal == numeroInvertido;
    }
}
