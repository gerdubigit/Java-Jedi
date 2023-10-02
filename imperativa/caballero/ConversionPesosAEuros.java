package imperativa.caballero;

import java.util.Scanner;
public class ConversionPesosAEuros {
    public static void main(String[] args) {
        double tasaCambio = 20.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en pesos: ");
        double pesos = scanner.nextDouble();
        double euros = pesos / tasaCambio;
        System.out.println(pesos + " pesos equivalen a " + euros + " euros.");
        scanner.close();
    }
}
