package Clase03;

public class LibrasAKilogramos {

    // Factor de conversión de libras a kilogramos
    private static final double FACTOR_CONVERSION_LIBRAS_A_KILOGRAMOS = 0.45359237;

    public static void main(String[] args) {
        // La cantidad de libras que queremos convertir
        double libras = 200;

        // Llamada a la función que realiza la conversión
        double kilogramosConvertidos = convertirLibrasAKilogramos(libras);

        // Mostrar el resultado de la conversión
        System.out.println("Kilogramos convertidos = " + kilogramosConvertidos);
    }

    /**
     * Convierte un peso de libras a kilogramos.
     * @param libras El peso en libras a convertir.
     * @return El peso convertido en kilogramos.
     */
    public static double convertirLibrasAKilogramos(double libras) {
        return libras * FACTOR_CONVERSION_LIBRAS_A_KILOGRAMOS;
    }
}
