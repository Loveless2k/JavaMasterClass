package clase_24;

public class ConversorANato {

    public static void main(String[] args) {
        System.out.println(convertirCaracterANato('A'));
        System.out.println(convertirCaracterANato('B'));
        System.out.println(convertirCaracterANato('C'));
        System.out.println(convertirCaracterANato('D'));
        System.out.println(convertirCaracterANato('E'));
        System.out.println(convertirCaracterANato('F'));
    }

    public static String convertirCaracterANato(char letra) {
        String mensajeFinal;

        switch (letra) {
            case 'A':
                mensajeFinal = "A - Alfa";
                break;
            case 'B':
                mensajeFinal = "B - Bravo";
                break;
            case 'C':
                mensajeFinal = "C - Charlie";
                break;
            case 'D':
                mensajeFinal = "D - Delta";
                break;
            case 'E':
                mensajeFinal = "E - Eco";
                break;
            default:
                mensajeFinal = "No encontrado";
                break;
        }

        return mensajeFinal;
    }
}
