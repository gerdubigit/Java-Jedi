package imperativa.maestro;

public class ConversionCelsiusAFahrenheit {
    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
    }
}