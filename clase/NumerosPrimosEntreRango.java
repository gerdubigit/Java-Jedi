public class NumerosPrimosEntreRango {
    public static void main(String[] args) {
        // Rango
        int inicio = 10; 
        int fin = 100;   

        System.out.println("Números primos entre " + inicio + " y " + fin + ":");

        for (int numero = inicio; numero <= fin; numero++) {
            // Los números menores o iguales a 1 no son primos
            if (numero <= 1) {
                continue;
            }

            boolean esPrimo = true;

            // Devuelve False y Breakea cada ves que no se cumple la condicion de que el numero sea divisible y el resto sea 0
            for (int divisor = 2; divisor * divisor <= numero; divisor++) {
                if (numero % divisor == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.print(numero + " ");
            }
        }
    }
}
