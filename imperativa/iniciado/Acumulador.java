package imperativa.iniciado;

public class Acumulador {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 3; 
        double acumulador = 0.0;

        for (int i = 1; i <= 15; i++) {
            double resultado = (double)(numero1 * numero2) / i; 
            acumulador += resultado; 
        }

        System.out.println("Acumulación de quince multiplicaciones divididas por el número de la multiplicación: " + acumulador);
    }
}
