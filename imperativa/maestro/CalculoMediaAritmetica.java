package imperativa.maestro;

public class CalculoMediaAritmetica {
    public static void main(String[] args) {
        double numero1 = 10.5;
        double numero2 = 20.0;
        double numero3 = 30.5;
        double numero4 = 40.0;
        double numero5 = 50.5;

        double suma = numero1 + numero2 + numero3 + numero4 + numero5;

        int totalElementos = 5;
        double media = suma / totalElementos;
        
        System.out.println("Los números proporcionados son:");
        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(numero5);
        
        System.out.println("La media aritmética es: " + media);
    }
}
