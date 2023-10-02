package imperativa.caballero;

import java.util.Scanner;
public class ConversionDolaresAPesos {
    public static void main(String[] args) {
        double tasaCambio = 20.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();
        double pesos = dolares * tasaCambio;
        System.out.println(dolares + " dólares equivalen a " + pesos + " pesos.");
        scanner.close();
    }
}
