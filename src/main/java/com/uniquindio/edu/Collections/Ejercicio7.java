package com.uniquindio.edu.Collections;

import java.util.LinkedHashSet;

// Una lista de favoritos debe conservar el orden en que se agregan las canciones.
// LinkedHashSet mantiene esa secuencia y descarta cualquier título repetido.

/**
 * Guarda canciones favoritas respetando el orden de incorporación y evitando repeticiones.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio7 {

    /** Canciones favoritas conservando el orden de inserción. */
    private final LinkedHashSet<String> cancionesFavoritas = new LinkedHashSet<>();

    public static void main(String[] args) {
        Ejercicio7 listaMusical = new Ejercicio7();
        listaMusical.agregarFavorita("Imagine");
        listaMusical.agregarFavorita("Bohemian Rhapsody");
        listaMusical.agregarFavorita("Imagine");
        listaMusical.mostrarFavoritas();
    }

    /** Añade una canción y evita duplicados. */
    /** @param cancion título de la canción */
    /** @return {@code true} si la canción fue añadida */
    public boolean agregarFavorita(String cancion) {
        return cancionesFavoritas.add(cancion);
    }

    /** Imprime las canciones favoritas en orden de inserción. */
    public void mostrarFavoritas() {
        for (String cancion : cancionesFavoritas) {
            System.out.println(cancion);
        }
    }

    /** @return copia independiente del conjunto de canciones favoritas */
    public LinkedHashSet<String> getCancionesFavoritas() {
        return new LinkedHashSet<>(cancionesFavoritas);
    }
}