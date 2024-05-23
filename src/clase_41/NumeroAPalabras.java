package clase_41;

public class NumeroAPalabras {
    public static void main(String[] args) {
        System.out.println(obtenerCuentaDigitos(0));
        System.out.println(obtenerCuentaDigitos(123));
        System.out.println(obtenerCuentaDigitos(-12));
        System.out.println(obtenerCuentaDigitos(5200));

        System.out.println(reverso(-121));
        System.out.println(reverso(1212));
        System.out.println(reverso(1234));
        System.out.println(reverso(100));

        numeroAPalabras(123);
        System.out.println();
        numeroAPalabras(1010);
        System.out.println();
        numeroAPalabras(1000);
        System.out.println();
        numeroAPalabras(-12);
    }

    public static int obtenerCuentaDigitos(int numero) {
        if (numero < 0) {
            return -1;
        }

        if (numero == 0) {
            return 1;
        }

        int cuentaDigitos = 0;
        while (numero != 0) {
            cuentaDigitos++;
            numero /= 10;
        }

        return cuentaDigitos;
    }

    public static int reverso(int numero) {
        int numeroReverso = 0;
        while (numero != 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        return numeroReverso;
    }

    public static void numeroAPalabras(int numero) {
        if (numero < 0) {
            System.out.println("Valor inválido");
        } else if (numero == 0) {
            System.out.println("CERO");
        } else {
            int numeroReverso = reverso(numero);
            int cuentaDigitosOriginal = obtenerCuentaDigitos(numero);
            int cuentaDigitosReverso = obtenerCuentaDigitos(numeroReverso);

            while (numeroReverso != 0) {
                int digito = numeroReverso % 10;
                switch (digito) {
                    case 0 -> System.out.print("Cero ");
                    case 1 -> System.out.print("Uno ");
                    case 2 -> System.out.print("Dos ");
                    case 3 -> System.out.print("Tres ");
                    case 4 -> System.out.print("Cuatro ");
                    case 5 -> System.out.print("Cinco ");
                    case 6 -> System.out.print("Seis ");
                    case 7 -> System.out.print("Siete ");
                    case 8 -> System.out.print("Ocho ");
                    case 9 -> System.out.print("Nueve ");
                }
                numeroReverso /= 10;
            }

            for (int i = 0; i < cuentaDigitosOriginal - cuentaDigitosReverso; i++) {
                System.out.print("Cero ");
            }
        }
    }
}

