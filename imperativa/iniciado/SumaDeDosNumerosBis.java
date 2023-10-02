package imperativa.iniciado;

public class SumaDeDosNumerosBis {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 4;
        int suma = numero1 + numero2;
        
        String paridad = (suma % 2 == 0) ? "par" : "impar";
        String mensaje = "El resultado es " + suma + " y es " + paridad + ".";
        
        System.out.println(mensaje);
    }
}
