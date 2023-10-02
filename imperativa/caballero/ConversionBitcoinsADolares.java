package imperativa.caballero;

import java.util.Scanner;
public class ConversionBitcoinsADolares {
    public static void main(String[] args) {
        double tasaCambio = 50000.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en bitcoins: ");
        double bitcoins = scanner.nextDouble();
        double dolares = bitcoins * tasaCambio;
        System.out.println(bitcoins + " bitcoins equivalen a " + dolares + " dólares.");
        scanner.close();
    }
}
