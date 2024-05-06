package clase_02;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Impresión de los rangos de valores posibles para los tipos primitivos numéricos
        System.out.println("Rango de valores para byte: de " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("Rango de valores para short: de " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("Rango de valores para int: de " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("Rango de valores para long: de " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);

        // Declaración e inicialización de variables
        byte valorByte = 50; // Inicializa una variable de tipo byte
        short valorShort = (short) (Short.MIN_VALUE + 100); // Inicializa una variable de tipo short
        int valorInt = Integer.MAX_VALUE - 1000; // Inicializa una variable de tipo int

        // Impresión de los valores de las variables byte, short e int
        System.out.println("Valor de valorByte = " + valorByte);
        System.out.println("Valor de valorShort = " + valorShort);
        System.out.println("Valor de valorInt = " + valorInt);

        // Suma de los tres valores anteriores
        int sumaDeTres = valorByte + valorShort + valorInt;
        System.out.println("La suma de valorByte, valorShort y valorInt es = " + sumaDeTres);

        // Cálculo de valorLong utilizando la suma anterior
        long valorLong = 50000L + (10L * sumaDeTres);
        System.out.println("Resultado de valorLong = " + valorLong);

        // Explicación del cálculo realizado
        System.out.println("valorLong se calcula sumando 50,000 a 10 veces la suma de valorByte, valorShort y valorInt");
    }
}
