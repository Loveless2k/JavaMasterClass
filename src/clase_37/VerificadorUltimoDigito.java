package clase_37;

public class VerificadorUltimoDigito {

    public static void main(String[] args) {
        System.out.println(tienenMismoUltimoDigito(41, 22, 71));
        System.out.println(tienenMismoUltimoDigito(23, 32, 42));
        System.out.println(tienenMismoUltimoDigito(9, 99, 999));
    }

    public static boolean esValido(int numero) {
        return (numero >= 10 && numero <= 1000);
    }

    public static boolean tienenMismoUltimoDigito(int primerNumero, int segundoNumero, int tercerNumero) {
        if (!esValido(primerNumero) || !esValido(segundoNumero) || !esValido(tercerNumero)) {
            return false;
        }

        int ultimoDigitoPrimero = primerNumero % 10;
        int ultimoDigitoSegundo = segundoNumero % 10;
        int ultimoDigitoTercero = tercerNumero % 10;

        return (ultimoDigitoPrimero == ultimoDigitoSegundo) ||
                (ultimoDigitoPrimero == ultimoDigitoTercero) ||
                (ultimoDigitoSegundo == ultimoDigitoTercero);
    }
}

