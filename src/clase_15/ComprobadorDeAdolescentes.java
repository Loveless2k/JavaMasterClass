package clase_15;

public class ComprobadorDeAdolescentes {

    public static void main(String[] args) {
        System.out.println(tieneAdolescente(9, 99, 19));   // true
        System.out.println(tieneAdolescente(23, 15, 42));  // true
        System.out.println(tieneAdolescente(22, 23, 34));  // false
    }

    public static boolean esAdolescente(int edad){
        return (edad >= 13 && edad <= 19);
    }

    public static boolean tieneAdolescente(int edad1, int edad2, int edad3){
        return (esAdolescente(edad1) || esAdolescente(edad2) || esAdolescente(edad3));
    }
}
