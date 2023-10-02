package imperativa.maestro;

public class CalculoFuerzaCentripeta {
    public static void main(String[] args) {
        double masa = 5.0;
        double velocidadAngular = 2.0;
        double radio = 10.0;
        double fuerzaCentripeta = (masa * Math.pow(velocidadAngular, 2)) / radio;
        System.out.println("La fuerza centrípeta necesaria es: " + fuerzaCentripeta + " newtons.");
    }
}
