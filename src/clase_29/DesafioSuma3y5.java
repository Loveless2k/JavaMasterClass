package clase_29;

public class DesafioSuma3y5 {

    public static void main(String[] args) {
        int contadorDeCoincidencias = 0;  // Inicializa el contador de coincidencias a 0
        int sumaDeCoincidencias = 0;      // Inicializa la suma de coincidencias a 0

        // Recorre los números del 15 al 1000
        for (int numero = 15; numero <= 1000; numero++) {
            // Verifica si el número es múltiplo de 3 y 5
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("Encontrada una coincidencia: " + numero);
                sumaDeCoincidencias += numero;
                contadorDeCoincidencias++;

                // Si se han encontrado 5 coincidencias, termina el bucle
                if (contadorDeCoincidencias == 5) {
                    break;
                }
            }
        }

        System.out.println("Suma de las coincidencias: " + sumaDeCoincidencias);
    }
}
