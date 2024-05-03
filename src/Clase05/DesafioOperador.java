package Clase05;

public class DesafioOperador {

    public static void main(String[] args) {

        // Declaración de variables
        double primerValor = 20.00d;
        double segundoValor = 80.00d;

        // Suma de primer y segundo valor, luego multiplicados por 100.00
        double tercerValor = (primerValor + segundoValor) * 100.00d;
        System.out.println("TercerValor = " + tercerValor);

        // Cálculo del resto con 40.00
        double resto = tercerValor % 40.00d;
        System.out.println("Resto = " + resto);

        // Cálculo booleano
        boolean sinResto = (resto == 0.00d);
        System.out.println("sinResto = " + sinResto);

        // Imprimiendo el resultado
        if (!sinResto){
            System.out.println("Quedó algún resto");
        }
    }
}
