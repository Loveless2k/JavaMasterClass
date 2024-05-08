package clase_19;

public class CalculadoraDeMinutosAnhiosYDias {

    public static void main(String[] args) {
        imprimirAnhiosYDias(525600);   // Convertir minutos a años y días
        imprimirAnhiosYDias(1051200);  // Convertir minutos a años y días
        imprimirAnhiosYDias(561600);   // Convertir minutos a años y días
    }

    public static void imprimirAnhiosYDias(long minutos) {
        if (minutos < 0) {
            System.out.println("Valor inválido");
            return;
        }

        long horas = minutos / 60;
        long dias = horas / 24;
        long anhios = dias / 365;
        long diasRestantes = dias % 365;

        System.out.println(minutos + " min = " + anhios + " a y " + diasRestantes + " d");
    }
}
