package clase_38;

public class TodosLosFactores {
    public static void main(String[] args) {
        imprimirFactores(6);
        imprimirFactores(32);
        imprimirFactores(10);
        imprimirFactores(-1);
    }

    public static void imprimirFactores(int numero) {
        if (numero < 1) {
            System.out.println("Valor inválido");
            return;
        }

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
    }
}

