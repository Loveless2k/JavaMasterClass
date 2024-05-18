package clase_36;

public class DigitoCompartido {

    public static void main(String[] args) {
        System.out.println(tieneDigitoCompartido(12, 24));
        System.out.println(tieneDigitoCompartido(9, 99));
        System.out.println(tieneDigitoCompartido(15, 55));
    }

    public static boolean tieneDigitoCompartido(int primerNumero, int segundoNumero) {
        if ((primerNumero > 99 || primerNumero < 10) ||
                segundoNumero > 99 || segundoNumero < 10) {
            return false;
        }

        int segundoNumeroOriginal = segundoNumero;

        while (primerNumero > 0) {
            int digitoActualPrimerNumero = primerNumero % 10;
            segundoNumero = segundoNumeroOriginal;

            while (segundoNumero > 0) {
                int digitoActualSegundoNumero = segundoNumero % 10;
                if (digitoActualPrimerNumero == digitoActualSegundoNumero) {
                    return true;
                }
                segundoNumero /= 10;
            }
            primerNumero /= 10;
        }

        return false;
    }
}

