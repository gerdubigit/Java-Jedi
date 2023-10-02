package imperativa.maestro;

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        double velocidadInicial = 0.0;
        double aceleracionGravedad = 9.81;
        double tiempoTranscurrido = 5.0;
        double velocidadFinal = velocidadInicial + (aceleracionGravedad * tiempoTranscurrido);
        System.out.println("La velocidad final del objeto es: " + velocidadFinal + " m/s.");
    }
}
