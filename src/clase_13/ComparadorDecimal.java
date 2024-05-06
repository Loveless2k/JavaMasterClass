package clase_13;

public class ComparadorDecimal {

    public static void main(String[] args) {
        // Pruebas
        System.out.println(sonIgualesPorTresDecimales(-3.1756, -3.175));
        System.out.println(sonIgualesPorTresDecimales(3.175, 3.176));
        System.out.println(sonIgualesPorTresDecimales(3.0, 3.0));
        System.out.println(sonIgualesPorTresDecimales(-3.123, 3.123));
    }

    public static boolean sonIgualesPorTresDecimales(double primerValor, double segundoValor){
        // Multiplicamos por 1000 y convertimos a entero para conservar solo tres decimales
        int primerValorConTresDecimales = (int) (primerValor * 1000);
        int segundoValorConTresDecimales = (int) (segundoValor * 1000);

        // Comparamos y retornamos el resultado
        return (primerValorConTresDecimales == segundoValorConTresDecimales);
    }
}
