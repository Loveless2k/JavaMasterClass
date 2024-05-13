package clase_27;

public class NumeroDeDiasEnMes {

    public static void main(String[] args) {
        System.out.println(esAnoBisiesto(-1600));
        System.out.println(esAnoBisiesto(1600));
        System.out.println(esAnoBisiesto(2017));
        System.out.println(esAnoBisiesto(2000));

        System.out.println(obtenerDiasEnMes(1, 2020));
        System.out.println(obtenerDiasEnMes(2, 2020));
        System.out.println(obtenerDiasEnMes(2, 2018));
        System.out.println(obtenerDiasEnMes(-1, 2020));
        System.out.println(obtenerDiasEnMes(1, -2020));
    }

    public static boolean esAnoBisiesto(int ano) {
        if (ano < 1 || ano > 9999) {
            return false;
        }
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }

    public static int obtenerDiasEnMes(int mes, int ano) {
        if ((mes < 1 || mes > 12) || (ano < 1 || ano > 9999)) {
            return -1;
        }

        boolean esBisiesto = esAnoBisiesto(ano);

        return switch (mes) {
            case 1 -> 31;
            case 2 -> esBisiesto ? 29 : 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> -1;
        };
    }
}
