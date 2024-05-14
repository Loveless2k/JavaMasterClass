package clase_28;

public class DesafioBucleFor {

    public static void main(String[] args) {
        // Contador de números primos inicializado en 0
        int contador = 0;

        // Recorremos los números del 1 al 1000.
        for (int i = 1; i <= 1000; i++) {
            // Si el número es primo, incrementamos el contador.
            if (esPrimo(i)) {
                contador++;
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
        }

        System.out.println("El número de primos del 1 al 1000 es: " + contador + " números.");
    }

    public static boolean esPrimo(int numero) {
        // Cualquier número menor o igual a 1 no es primo por definición.
        if (numero <= 1) {
            return false;
        }

        // 2 es el único número primo par.
        if (numero == 2) {
            return true;
        }

        // Descarta todos los números pares mayores que 2.
        if (numero % 2 == 0) {
            return false;
        }

        // Verifica la divisibilidad solo con números impares hasta la raíz cuadrada de 'numero'.
        for (int divisor = 3; divisor <= Math.sqrt(numero); divisor += 2) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
