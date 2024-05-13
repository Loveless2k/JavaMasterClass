package clase_26;

public class NumeroEnPalabra {

    public static void main(String[] args) {
        imprimirNumeroEnPalabra(0);
        imprimirNumeroEnPalabra(1);
        imprimirNumeroEnPalabra(2);
        imprimirNumeroEnPalabra(3);
        imprimirNumeroEnPalabra(4);
        imprimirNumeroEnPalabra(5);
        imprimirNumeroEnPalabra(6);
        imprimirNumeroEnPalabra(7);
        imprimirNumeroEnPalabra(8);
        imprimirNumeroEnPalabra(9);
        imprimirNumeroEnPalabra(10);
        imprimirNumeroEnPalabra(-4);
    }

    public static void imprimirNumeroEnPalabra(int numero) {
        String numeroEnPalabra = switch (numero) {
            case 0 -> "CERO";
            case 1 -> "UNO";
            case 2 -> "DOS";
            case 3 -> "TRES";
            case 4 -> "CUATRO";
            case 5 -> "CINCO";
            case 6 -> "SEIS";
            case 7 -> "SIETE";
            case 8 -> "OCHO";
            case 9 -> "NUEVE";
            default -> "OTRO";
        };

        System.out.println(numeroEnPalabra);
    }
}
