package Practica_1;

public class Principal {

    public static void main(String[] args) {
        long puntosTotales = 1000000;
        double piAproximado = Matematicas.generarNumeroPi(puntosTotales);
        System.out.println("Aproximación a pi con " + puntosTotales + " puntos: " + piAproximado);
    }
}
