package clase_20;

public class ImpresorDeIgualdad {

    public static void main(String[] args) {
        imprimirIgualdad(1, 1, 1);
        imprimirIgualdad(1, 1, 2);
        imprimirIgualdad(-1, -1, -1);
        imprimirIgualdad(1, 2, 3);
    }

    public static void imprimirIgualdad(int primerNumero, int segundoNumero, int tercerNumero) {
        if (primerNumero < 0 || segundoNumero < 0 || tercerNumero < 0) {
            System.out.println("Valor inválido");
        } else if (primerNumero == segundoNumero && segundoNumero == tercerNumero) {
            System.out.println("Todos los números son iguales");
        } else if (primerNumero != segundoNumero && segundoNumero != tercerNumero && primerNumero != tercerNumero) {
            System.out.println("Todos los números son diferentes");
        } else {
            System.out.println("Ni todos son iguales ni todos son diferentes");
        }
    }
}