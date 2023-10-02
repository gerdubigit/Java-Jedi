package imperativa.iniciado;

import java.util.Scanner;
public class MiNombreYEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre y Apellido: ");
        String nombreCompleto = scanner.nextLine();
        System.out.print("Edad: ");
        String edad= scanner.nextLine();
        System.out.println("Nombre y Apellido: " + nombreCompleto + " - Edad: " + edad);
        scanner.close();
    }
}