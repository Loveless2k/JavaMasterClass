package clase_11;

public class PerroLadrando {

    public static void main(String[] args) {
        // Pruebas
        System.out.println(deberiaDespertarse(true, 1));
        System.out.println(deberiaDespertarse(false, 2));
        System.out.println(deberiaDespertarse(true, 8));
        System.out.println(deberiaDespertarse(true, -1));
    }

    public static boolean deberiaDespertarse(boolean estaLadrando, int horaDelDia) {
        // Validación de horaDelDia
        if (horaDelDia < 0 || horaDelDia > 23) {
            return false;
        }

        // ¿Debería despertarse?
        return estaLadrando && (horaDelDia < 8 || horaDelDia > 22);
    }
}
