package Practica_2;

public class Main {

    public static void main(String[] args) {

        try {
            Tabla tabla = new Tabla();
            tabla.estadoActual();
            tabla.estadoSiguiente();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
