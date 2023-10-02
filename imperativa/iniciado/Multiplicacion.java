package imperativa.iniciado;

public class Multiplicacion {
    public static void main(String[] args) {
        double numeroReal1 = 2.5;
        double numeroReal2 = 3.5;
        double resultadoReal = numeroReal1 * numeroReal2;
        int numeroEntero1 = 5;
        int numeroEntero2 = 2;
        int resultadoEntero = numeroEntero1 * numeroEntero2;
        double resultadoFinal = resultadoReal + resultadoEntero;
        System.out.println("Suma de las dos multiplicaciones: " + resultadoFinal);
        
        // El resultado final se almacena como un número real de tipo double porque una de las operaciones involucra números reales,
        // y en Java, las operaciones aritméticas entre números enteros y reales resultan en números reales.
    }
}
