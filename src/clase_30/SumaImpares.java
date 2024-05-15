package clase_30;

public class SumaImpares {

    public static void main(String[] args) {
        System.out.println(sumarImpares(1, 100));
        System.out.println(sumarImpares(-1, 100));
        System.out.println(sumarImpares(100, 100));
        System.out.println(sumarImpares(13, 13));
        System.out.println(sumarImpares(100, -100));
        System.out.println(sumarImpares(100, 1000));
    }

    public static boolean esImpar(int numero) {
        return numero > 0 && numero % 2 != 0;
    }

    public static int sumarImpares(int inicio, int fin) {
        if (inicio < 0 || fin < 0 || inicio > fin) {
            return -1;
        }

        int sumaDeImpares = 0;
        for (int i = inicio; i <= fin; i++) {
            if (esImpar(i)) {
                sumaDeImpares += i;
            }
        }

        return sumaDeImpares;
    }
}