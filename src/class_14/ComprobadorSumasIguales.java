package class_14;

public class ComprobadorSumasIguales {

    public static void main(String[] args) {
        System.out.println(tieneSumaIgual(1, 1, 1)); // false
        System.out.println(tieneSumaIgual(1, 1, 2)); // true
        System.out.println(tieneSumaIgual(1, -1, 0)); // true
    }

    public static boolean tieneSumaIgual(int numero1, int numero2, int numero3) {
        return (numero1 + numero2) == numero3;
    }
}
