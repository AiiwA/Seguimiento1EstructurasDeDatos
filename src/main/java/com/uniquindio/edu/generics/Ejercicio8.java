package com.uniquindio.edu.generics;

import java.util.ArrayList;
import java.util.List;

// Un almacén debe registrar elementos comparables y poder identificar el más grande.
// La interfaz exige un orden natural y la implementación mantiene los datos en una lista.
/**
 * Proporciona un almacén genérico capaz de obtener su valor máximo.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        AlmacenNumerico<Integer> inventario = new AlmacenNumerico<>();
        inventario.guardar(12);
        inventario.guardar(27);
        inventario.guardar(9);
        System.out.println("Maximo: " + inventario.maximo());
    }

    /** Contrato para almacenar valores y consultar el máximo. */
    /** @param <T> tipo comparable de los elementos */
    public interface Almacenable<T extends Comparable<T>> {
        /** Guarda un elemento en el almacén. */
        /** @param item elemento que se guardará */
        void guardar(T item);

        /** @return elemento máximo o {@code null} si el almacén está vacío */
        T maximo();
    }

    /** Almacén basado en una lista que utiliza el orden natural. */
    /** @param <T> tipo comparable de los elementos */
    public static class AlmacenNumerico<T extends Comparable<T>> implements Almacenable<T> {
        /** Elementos guardados en el almacén. */
        private final List<T> elementos = new ArrayList<>();

        /** {@inheritDoc} */
        @Override
        public void guardar(T item) {
            elementos.add(item);
        }

        /** {@inheritDoc} */
        @Override
        public T maximo() {
            if (elementos.isEmpty()) {
                return null;
            }

            T mayor = elementos.get(0);
            for (int indice = 1; indice < elementos.size(); indice++) {
                if (elementos.get(indice).compareTo(mayor) > 0) {
                    mayor = elementos.get(indice);
                }
            }
            return mayor;
        }
    }
}