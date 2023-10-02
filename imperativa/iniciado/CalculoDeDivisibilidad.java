package imperativa.iniciado;

public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 4;
        int suma = numero1 + numero2;
        boolean esDivisible = (numero1 % numero2 == 0);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual a " + suma);

        if (esDivisible) {
            System.out.println(numero1 + " es divisible por " + numero2);
        } else {
            System.out.println(numero1 + " no es divisible por " + numero2);
        }
    }
}
