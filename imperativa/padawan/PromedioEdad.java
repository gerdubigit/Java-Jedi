package imperativa.padawan;

public class PromedioEdad {
    public static void main(String[] args) {
        int edad1 = 25;
        int edad2 = 30;
        int edad3 = 35;
        int edad4 = 40;
        int edad5 = 45;

        String nombre1 = "Juan";
        String nombre2 = "María";
        String nombre3 = "Pedro";
        String nombre4 = "Laura";
        String nombre5 = "Carlos";

        double sumaEdades = edad1 + edad2 + edad3 + edad4 + edad5;
        double promedioEdades = sumaEdades / 5;
        
        System.out.println("Información de las personas:");
        System.out.println("Nombre: " + nombre1 + ", Edad: " + edad1);
        System.out.println("Nombre: " + nombre2 + ", Edad: " + edad2);
        System.out.println("Nombre: " + nombre3 + ", Edad: " + edad3);
        System.out.println("Nombre: " + nombre4 + ", Edad: " + edad4);
        System.out.println("Nombre: " + nombre5 + ", Edad: " + edad5);
        
        System.out.println("Promedio de edades: " + promedioEdades);
    }
}
