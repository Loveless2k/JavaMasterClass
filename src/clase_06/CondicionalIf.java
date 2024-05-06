package clase_06;

public class CondicionalIf {

    public static void main(String[] args) {

        // Declaración de variables
        boolean juegoTerminado = true; // Se utiliza directamente el valor primitivo 'true'
        int puntuacion = 10000;
        int nivelCompletado = 8;
        int bonificacion = 200;

        // Calculo de la puntuación final
        if (juegoTerminado) {
            int puntuacionFinal = puntuacion + (nivelCompletado * bonificacion);
            System.out.println("La puntuación final es = " + puntuacionFinal);
        }
    }
}
