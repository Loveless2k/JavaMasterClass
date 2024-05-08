package clase_22;

public class CalculadorDeTrimestre {

    public static void main(String[] args) {

        // Se pone a prueba el switch tradicional
        System.out.println("Se obtiene el trimestre con el switch tradicional:");
        System.out.println(obtenerTrimestreSwitchTradicional("ENERO"));
        System.out.println(obtenerTrimestreSwitchTradicional("Mayo"));
        System.out.println(obtenerTrimestreSwitchTradicional("octubre"));
        System.out.println(obtenerTrimestreSwitchTradicional("DICIEMBRE"));
        System.out.println(obtenerTrimestreSwitchTradicional("DICIEMBBRE"));

        agregaSaltoLinea();

        // Se pone a prueba switch híbrido entre tradicional y de expresión.
        System.out.println("Se obtiene el trimestre con el switch híbrido:");
        System.out.println(obtenerTrimestreSwitchHibrido("ENERO"));
        System.out.println(obtenerTrimestreSwitchHibrido("Mayo"));
        System.out.println(obtenerTrimestreSwitchHibrido("octubre"));
        System.out.println(obtenerTrimestreSwitchHibrido("DICIEMBRE"));
        System.out.println(obtenerTrimestreSwitchHibrido("DICIEMBBRE"));

        agregaSaltoLinea();

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

    // Usando un switch tradicional
    public static String obtenerTrimestreSwitchTradicional(String mes){

        String trimestre = "";

        switch (mes.toUpperCase()){
            case ENE, FEB, MAR:
                trimestre = "1er trimestre";
                break;
            case ABR, MAY, JUN:
                trimestre = "2do trimestre";
                break;
            case JUL, AGO, SEP:
                trimestre = "3do trimestre";
                break;
            case OCT, NOV, DIC:
                trimestre = "4do trimestre";
                break;
            default:
                trimestre = "Mes inválido";
        }

        return trimestre;
    }

    // usando un switch híbrido (tradicional-expresión)
    public static String obtenerTrimestreSwitchHibrido(String mes) {

        switch (mes.toUpperCase()) {
            case ENE, FEB, MAR:
                return "1er trimestre";
            case ABR, MAY, JUN:
                return "2do trimestre";
            case JUL, AGO, SEP:
                return "3er trimestre";
            case OCT, NOV, DIC:
                return "4to trimestre";
            default:
                return "Mes inválido";
        }
    }

    // Usando el switch mejorado
    public static String obtenerTrimestreMejorado(String mes) {

        return switch (mes.toUpperCase()){
            case ENE, FEB, MAR -> "1er trimestre";
            case ABR, MAY, JUN -> "2do trimestre";
            case JUL, AGO, SEP -> "3er trimestre";
            case OCT, NOV, DIC -> "4to trimestre";
            default -> "Mes inválido";
        };
    }

    public static void agregaSaltoLinea(){
        System.out.println("\n");
    }
}
