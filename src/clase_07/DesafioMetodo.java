package clase_07;

public class DesafioMetodo {

    public static void main(String[] args) {
        System.out.println("Para puntuación 1500 el resultado es = " + calcularPosicionPuntuacionAlta(1500));
        System.out.println("Para puntuación 1000 el resultado es = " + calcularPosicionPuntuacionAlta(1000));
        System.out.println("Para puntuación 500 el resultado es = " + calcularPosicionPuntuacionAlta(500));
        System.out.println("Para puntuación 100 el resultado es = " + calcularPosicionPuntuacionAlta(100));
        System.out.println("Para puntuación 25 el resultado es = " + calcularPosicionPuntuacionAlta(25));
    }

    public static int calcularPosicionPuntuacionAlta(int puntuacionJugador){
        if (puntuacionJugador >= 1000){
            return 1;
        } else if (puntuacionJugador >= 500){
            return 2;
        } else if (puntuacionJugador >= 100){
            return 3;
        }
        return 4;
    }
}
