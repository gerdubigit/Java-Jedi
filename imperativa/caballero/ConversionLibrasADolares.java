package imperativa.caballero;

import java.util.Scanner;
public class ConversionLibrasADolares {
    public static void main(String[] args) {
        double tasaCambio = 1.40;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en libras esterlinas: ");
        double librasEsterlinas = scanner.nextDouble();
        double dolares = librasEsterlinas * tasaCambio;
        System.out.println(librasEsterlinas + " libras esterlinas equivalen a " + dolares + " dólares.");
        scanner.close();
    }
}
