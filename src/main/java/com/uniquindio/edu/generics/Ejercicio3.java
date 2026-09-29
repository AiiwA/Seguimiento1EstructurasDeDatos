package com.uniquindio.edu.generics;

import java.util.ArrayList;
import java.util.List;

// Una aplicación puede definir un contenedor reutilizable para un tipo específico de elemento.
// La interfaz genérica establece el contrato y ArrayList proporciona su implementación.
/**
 * Declara un contenedor tipado junto con una versión respaldada por una lista.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        ListaContenedor<String> listaNombres = new ListaContenedor<>();
        listaNombres.agregar("Ana");
        listaNombres.agregar("Luis");
        System.out.println(listaNombres.obtener(1));
    }

    /** Contrato genérico para agregar y consultar elementos por posición. */
    /** @param <T> tipo de los elementos contenidos */
    public interface Contenedor<T> {
        /** Agrega un elemento al contenedor. */
        /** @param item elemento que se agregará */
        void agregar(T item);

        /** Obtiene un elemento por su índice. */
        /** @param indice posición del elemento */
        /** @return elemento almacenado en la posición indicada */
        T obtener(int indice);
    }

    /** Implementación de {@link Contenedor} basada en una lista. */
    /** @param <T> tipo de los elementos almacenados */
    public static class ListaContenedor<T> implements Contenedor<T> {
        /** Lista interna que conserva los elementos en orden de inserción. */
        private final List<T> elementos = new ArrayList<>();

        /** {@inheritDoc} */
        @Override
        public void agregar(T item) {
            elementos.add(item);
        }

        /** {@inheritDoc} */
        @Override
        public T obtener(int indice) {
            return elementos.get(indice);
        }
    }
}