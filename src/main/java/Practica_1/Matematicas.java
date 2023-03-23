package Practica_1;

public class Matematicas {
/*
     Genera una aproximación al número pi mediante el método de
     Montecarlo. El parámetro ‘pasos‘ indica el número de puntos
     generado.
     */

    public static double generarNumeroPi(long pasos) {
        int dentro = 0;
        for (int i = 0; i < pasos; i++) {
            double x = Math.random();
            double y = Math.random();
            if (x * x + y * y <= 1) dentro++;
        }
        return 4.0 * dentro / pasos;
    }
}
