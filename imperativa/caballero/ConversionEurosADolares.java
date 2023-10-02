package imperativa.caballero;

import java.util.Scanner;
public class ConversionEurosADolares {
    public static void main(String[] args) {
        double tasaCambio = 1.20;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();
        double dolares = euros * tasaCambio;
        System.out.println(euros + " euros equivalen a " + dolares + " dólares.");
        scanner.close();
    }
}
