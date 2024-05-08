package clase_18;

public class CalculadoraDeArea {

    public static void main(String[] args) {
        System.out.println(calcularArea(5.0));       // Área de un círculo
        System.out.println(calcularArea(-1));        // Error en el área del círculo
        System.out.println(calcularArea(5.0, 4.0));  // Área de un rectángulo
        System.out.println(calcularArea(-1.0, 4.0)); // Error en el área del rectángulo
    }

    public static double calcularArea(double radio) {
        if (radio < 0) {
            return -1.0;
        }
        return Math.PI * radio * radio;  // Simplificado el cálculo de área del círculo
    }

    public static double calcularArea(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;  // Área de un rectángulo
    }
}