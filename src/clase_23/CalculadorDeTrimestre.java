package clase_23;

public class CalculadorDeTrimestre {

    public static void main(String[] args) {

        // Se pone a prueba el switch de expresión
        System.out.println("Se obtiene el trimestre con el switch de expresión:");
        System.out.println(obtenerTrimestreMejorado("ENERO"));
        System.out.println(obtenerTrimestreMejorado("Mayo"));
        System.out.println(obtenerTrimestreMejorado("octubre"));
        System.out.println(obtenerTrimestreMejorado("DICIEMBRE"));
        System.out.println(obtenerTrimestreMejorado("DICIEMBBRE"));
    }

    // Constantes locales finales
    public static final String ENE = "ENERO";
    public static final String FEB = "FEBRERO";
    public static final String MAR = "MARZO";
    public static final String ABR = "ABRIL";
    public static final String MAY = "MAYO";
    public static final String JUN = "JUNIO";
    public static final String JUL = "JULIO";
    public static final String AGO = "AGOSTO";
    public static final String SEP = "SEPTIEMBRE";
    public static final String OCT = "OCTUBRE";
    public static final String NOV = "NOVIEMBRE";
    public static final String DIC = "DICIEMBRE";

    // Usando el switch mejorado
    public static String obtenerTrimestreMejorado(String mes) {

        return switch (mes.toUpperCase()){
            case ENE, FEB, MAR -> "1er trimestre";
            case ABR, MAY, JUN -> "2do trimestre";
            case JUL, AGO, SEP -> "3er trimestre";
            case OCT, NOV, DIC -> "4to trimestre";
            default -> {
                String errorMessage = "El input dado '" + mes + "' es incorrecto.";
                yield errorMessage;
            }
        };
    }
}
