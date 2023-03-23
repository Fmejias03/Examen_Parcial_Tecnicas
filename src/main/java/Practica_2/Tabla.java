package Practica_2;

public class Tabla {
    public int[][] tablaActual;
    public int[][] tablaSiguiente = new int[dimension][dimension];
    public static int dimension = 30;

    public void estadoActual() {
        tablaActual = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(tablaActual[i][j] + "");
            }
        }
    }





}
