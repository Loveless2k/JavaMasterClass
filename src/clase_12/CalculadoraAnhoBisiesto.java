package clase_12;

public class CalculadoraAnhoBisiesto {

    public static void main(String[] args) {
        System.out.println(esAnhoBisiesto(-1600)); // false
        System.out.println(esAnhoBisiesto(1600));  // true
        System.out.println(esAnhoBisiesto(2017));  // false
        System.out.println(esAnhoBisiesto(2000));  // true
    }

    public static boolean esAnhoBisiesto(int anho) {
        if (anho < 1 || anho > 9999) {
            return false;
        }
        return (anho % 4 == 0 && anho % 100 != 0) || (anho % 400 == 0);
    }
}

