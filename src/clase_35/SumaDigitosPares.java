package clase_35;

public class SumaDigitosPares {

    public static void main(String[] args) {
        System.out.println(obtenerSumaDigitosPares(123456789));
        System.out.println(obtenerSumaDigitosPares(252));
        System.out.println(obtenerSumaDigitosPares(-22));
    }

    public static int obtenerSumaDigitosPares(int numero) {
        if (numero < 0) {
            return -1;
        }

        int sumaDigitosPares = 0;
        while (numero > 0) {
            int digitoActual = numero % 10;
            if (esPar(digitoActual)) {
                sumaDigitosPares += digitoActual;
            }
            numero /= 10;
        }

        return sumaDigitosPares;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
