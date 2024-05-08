package clase_21;

public class GatoJugando {

    public static void main(String[] args) {
        System.out.println(estaJugandoElGato(true, 10));   // Falso, demasiado frío incluso en verano
        System.out.println(estaJugandoElGato(false, 36));  // Falso, demasiado caliente para no ser verano
        System.out.println(estaJugandoElGato(false, 35));  // Verdadero, temperatura máxima permitida fuera de verano
    }

    public static boolean estaJugandoElGato(boolean esVerano, int temperatura) {
        int limiteSuperior = esVerano ? 45 : 35; // Operador ternario para definir el límite superior de temperatura
        return temperatura >= 25 && temperatura <= limiteSuperior;
    }
}

