package clase_32;

public class DesafioSumaDeDigitos {

    public static void main(String[] args) {
        System.out.println("La suma de los dígitos de " + 125 + " = " + sumarDigitos(125));
        System.out.println("La suma de los dígitos de " + 1000 + " = " + sumarDigitos(1000));
        System.out.println("La suma de los dígitos de " + 5 + " = " + sumarDigitos(5));
    }

    public static int sumarDigitos(int numero) {
        if (numero < 0) {
            return -1;
        }

        int sumaDeDigitos = 0;
        while (numero > 0) {
            // Sumar el último dígito al total
            sumaDeDigitos += numero % 10;
            // Remover el último dígito
            numero /= 10;
        }

        return sumaDeDigitos;
    }
}