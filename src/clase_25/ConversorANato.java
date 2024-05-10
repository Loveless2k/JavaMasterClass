package clase_25;

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
        return switch (letra) {
            case 'A' -> "A - Alfa";
            case 'B' -> "B - Bravo";
            case 'C' -> "C - Charlie";
            case 'D' -> "D - Delta";
            case 'E' -> "E - Eco";
            default -> "No encontrado";
        };
    }
}
