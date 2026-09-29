package com.uniquindio.edu.Collections;

import java.util.Vector;

// Un editor puede conservar sus modificaciones recientes para revertir la última acción.
// Vector almacena el historial y permite quitar el cambio que se registró más recientemente.

/**
 * Registra modificaciones de un editor y permite eliminar la más reciente.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio3 {

    /** Historial de cambios en el orden en que fueron registrados. */
    public Vector<Cambio> historial = new Vector<>();

    public static void main(String[] args) {
        Ejercicio3 editor = new Ejercicio3();
        editor.agregarCambio("Cambio 1");
        editor.agregarCambio("Cambio 2");
        editor.agregarCambio("Cambio 3");
        editor.deshacer();
      
        IO.println("Historial de cambios:");
        editor.mostrarHistorial();

        IO.println("Nuevo historial ");
        editor.agregarCambio("Cambio 4");
        editor.mostrarHistorial();

    }

    /** Añade un cambio al final del historial. */
    /** @param cambio descripción del cambio realizado */
    public void agregarCambio(String cambio) {
        historial.add(new Cambio(cambio));
    }

    /** Elimina el último cambio cuando el historial no está vacío. */
    public void deshacer() {

        if (!historial.isEmpty()) {
            historial.remove(historial.size() - 1);
        }

    }

    /** Imprime las descripciones de todos los cambios registrados. */
    public void mostrarHistorial() {
        for (Cambio registro : historial) {
            IO.println(registro.cambio);
        }
    }

    /** Representa un cambio realizado en el editor. */
    public class Cambio {
        /** Descripción del cambio. */
        public String cambio;

        /** Crea un cambio con su descripción. */
        /** @param cambio descripción del cambio */
        public Cambio(String cambio) {
            this.cambio = cambio;
        }
    }

}
