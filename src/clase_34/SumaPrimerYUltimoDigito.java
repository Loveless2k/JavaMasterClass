package clase_34;

public class SumaPrimerYUltimoDigito {

    public static void main(String[] args) {
        System.out.println(sumarPrimerYUltimoDigito(252));
        System.out.println(sumarPrimerYUltimoDigito(257));
        System.out.println(sumarPrimerYUltimoDigito(0));
        System.out.println(sumarPrimerYUltimoDigito(5));
        System.out.println(sumarPrimerYUltimoDigito(-10));
    }

    public static int sumarPrimerYUltimoDigito(int numero) {
        if (numero < 0) {
            return -1; // Retorna -1 para números negativos
        }

        if (numero < 10) {
            return numero * 2; // Si el número tiene un solo dígito, se duplica su valor
        }

        int ultimoDigito = numero % 10; // Obtiene el último dígito
        while (numero >= 10) {
            numero /= 10; // Elimina el último dígito en cada iteración
        }
        int primerDigito = numero; // Ahora, 'numero' contiene el primer dígito

        return primerDigito + ultimoDigito;
    }
}
