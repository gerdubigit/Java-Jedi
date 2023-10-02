package imperativa.maestro;

public class CalculoEnergiaCinetica {
    public static void main(String[] args) {
        double masa = 5.0; 
        double velocidad = 10.0;
        double energiaCinetica = (1.0 / 2.0) * masa * Math.pow(velocidad, 2);
        System.out.println("La energía cinética del objeto es: " + energiaCinetica + " joules.");
    }
}
