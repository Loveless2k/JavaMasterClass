package clase_40;

public class NumeroPerfecto {
    public static void main(String[] args) {
        System.out.println(esNumeroPerfecto(6));
        System.out.println(esNumeroPerfecto(28));
        System.out.println(esNumeroPerfecto(5));
        System.out.println(esNumeroPerfecto(-1));
    }

    public static boolean esNumeroPerfecto(int numero) {
        if (numero < 1) {
            return false;
        }

        int sumaDivisoresPropiosPositivos = 0;
        int limite = numero / 2;

        for (int i = 1; i <= limite; i++) {
            if (numero % i == 0) {
                sumaDivisoresPropiosPositivos += i;
            }
        }

        return numero == sumaDivisoresPropiosPositivos;
    }
}