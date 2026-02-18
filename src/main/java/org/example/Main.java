package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- PROYECTO GRUPAL: PROGRAMACIÓN I ---");
        System.out.println("Estado: Repositorio sincronizado exitosamente.");

        // Llamamos al cambio de Sephiroth
        SephirothUpdate actualizacion = new SephirothUpdate();
        actualizacion.mostrarMensaje();

        // Llamamos al cambio de Gabriel
        GabrielUpdate actualizacion2 = new GabrielUpdate();
        actualizacion2.mostrarMensaje();
    }
}