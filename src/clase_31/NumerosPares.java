package clase_31;

public class NumerosPares {

    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 20;
        int contadorPares = 0;
        int contadorImpares = 0;

        while (numeroInicio <= numeroFin && contadorPares < 5) {
            if (esNumeroPar(numeroInicio)) {
                System.out.println("Número par encontrado: " + numeroInicio);
                contadorPares++;
            } else {
                contadorImpares++;
            }
            numeroInicio++;
        }

        System.out.println("Total de números pares encontrados: " + contadorPares);
        System.out.println("Total de números impares encontrados: " + contadorImpares);
    }

    public static boolean esNumeroPar(int numero) {
        return numero % 2 == 0;
    }
}
