package clase_08;

public class VerificarNumero {

    public static void main(String[] args) {
        verificarNumero(5);
        verificarNumero(-5);
        verificarNumero(0);
    }

    public static void verificarNumero(int numero){
        if (numero > 0){
            System.out.println("positivo");
        } else if (numero < 0){
            System.out.println("negativo");
        } else {
            System.out.println("cero");
        }
    }
}
