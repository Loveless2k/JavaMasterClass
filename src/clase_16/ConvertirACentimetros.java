package clase_16;

public class ConvertirACentimetros {

    private static final double CENTIMETRO = 2.54;
    private static final int UN_PIE_EN_PULGADAS = 12;

    public static void main(String[] args) {
        System.out.println(convertirACentimetros(6));         // Convertir solo pulgadas a centímetros
        System.out.println(convertirACentimetros(6, 5));     // Convertir pies y pulgadas a centímetros
    }

    private static double convertirACentimetros(int pulgadas) {
        return pulgadas * CENTIMETRO;
    }

    private static double convertirACentimetros(int pies, int pulgadas) {
        int totalPulgadas = (pies * UN_PIE_EN_PULGADAS) + pulgadas;
        return convertirACentimetros(totalPulgadas);
    }
}
