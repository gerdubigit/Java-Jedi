package imperativa.maestro;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0; 
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("La hipotenusa del triángulo rectángulo es: " + h);
    }
}
