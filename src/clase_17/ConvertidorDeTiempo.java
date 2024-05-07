package clase_17;

public class ConvertidorDeTiempo {

    public static void main(String[] args) {
        System.out.println(obtenerDuracionEnFormato(65));
        System.out.println(obtenerDuracionEnFormato(3945));
        System.out.println(obtenerDuracionEnFormato(0, 59));
        System.out.println(obtenerDuracionEnFormato(65, 45));
        System.out.println(obtenerDuracionEnFormato(0, 0));
    }

    public static String obtenerDuracionEnFormato(int segundos) {
        if (segundos < 0) {
            return "Parámetro inválido 'segundos'. Debe ser mayor o igual a 0.";
        }
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;
        return obtenerDuracionEnFormato(minutos, segundosRestantes);
    }

    public static String obtenerDuracionEnFormato(int minutos, int segundos) {
        if (minutos < 0) {
            return "Parámetro inválido 'minutos'. Debe ser mayor o igual a 0.";
        }
        if (segundos < 0 || segundos > 59) {
            return "Parámetro inválido 'segundos'. Debe ser entre 0 y 59.";
        }
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        return String.format("%02dh %02dm %02ds", horas, minutosRestantes, segundos);
    }
}