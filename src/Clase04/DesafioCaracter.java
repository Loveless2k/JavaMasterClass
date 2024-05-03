package Clase04;

public class DesafioCaracter {

    public static void main(String[] args) {

        // Declaración de variables
        char miCaracterSimple = '?';
        char miCaracterUnicode = '\u003F';
        char miCaracterDecimal = (char) 63;

        // Imprimiendo todas las variables en la misma oración
        System.out.println("Mis valores son " + miCaracterSimple + " para caracter simple, " +
                miCaracterUnicode + " para caracter Unicode, " +
                miCaracterDecimal + " para caracter decimal.");
    }
}
