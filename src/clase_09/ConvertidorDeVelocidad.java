package clase_09;

public class ConvertidorDeVelocidad {

    public static void main(String[] args) {

        // Prueba del primer bloque
        imprimirConversion(1.5);
        imprimirConversion(10.25);
        imprimirConversion(-5.6);
        imprimirConversion(25.42);
        imprimirConversion(75.144);
    }

    public static long convertirAKilometrosPorHora(double millasPorHora){

        if (millasPorHora < 0){
            return -1;
        }

        return Math.round(millasPorHora * 1.609);
    }

    public static void imprimirConversion(double millasPorHora){
        if (millasPorHora < 0){
            System.out.println("Valor inválido");
        } else {
            long kilometrosPorHora = convertirAKilometrosPorHora(millasPorHora);
            System.out.println(millasPorHora + " mi/h = " + kilometrosPorHora + " km/h");
        }
    }
}
