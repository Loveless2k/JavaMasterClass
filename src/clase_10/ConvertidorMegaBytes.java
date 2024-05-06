package clase_10;

public class ConvertidorMegaBytes {

    public static void main(String[] args) {

        // Pruebas del primer bloque
        imprimirMegaBytesYKiloBytes(2500);
        imprimirMegaBytesYKiloBytes(-1024);
        imprimirMegaBytesYKiloBytes(5000);
    }

    public static void imprimirMegaBytesYKiloBytes(int kiloBytes){

        // Validación del valor de kiloBytes
        if (kiloBytes < 0){
            System.out.println("Valor inválido");
            return;
        }

        // Cálculo de megabytes y kilobytes restantes
        int megaBytes = kiloBytes / 1024;
        int kiloBytesRestantes = kiloBytes % 1024;

        // Resultado de impresión
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB y " + kiloBytesRestantes + " KB");
    }
}
