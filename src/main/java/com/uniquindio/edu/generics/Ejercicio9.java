package com.uniquindio.edu.generics;

import java.util.ArrayList;
import java.util.List;

// Un servicio numérico puede localizar los extremos de una lista ordenable.
// El tipo genérico combina las condiciones Number y Comparable<T>.
/**
 * Calcula los valores mínimo y máximo de listas numéricas ordenables.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        ServicioNumerico<Integer> buscador = new ServicioNumerico<>();
        List<Integer> numeros = new ArrayList<>(List.of(11, 5, 18, 3));
        System.out.println("Minimo: " + buscador.minimo(numeros));
        System.out.println("Maximo: " + buscador.maximo(numeros));
    }

    /** Contrato para hallar extremos de listas numéricas ordenables. */
    /** @param <T> tipo numérico comparable */
    public interface Servicio<T extends Number & Comparable<T>> {
        /** Obtiene el menor elemento de una lista. */
        /** @param lista valores que se analizarán */
        /** @return menor valor de la lista */
        T minimo(List<T> lista);

        /** Obtiene el mayor elemento de una lista. */
        /** @param lista valores que se analizarán */
        /** @return mayor valor de la lista */
        T maximo(List<T> lista);
    }

    /** Implementa búsquedas de mínimo y máximo para tipos numéricos comparables. */
    /** @param <T> tipo numérico comparable */
    public static class ServicioNumerico<T extends Number & Comparable<T>> implements Servicio<T> {
        /** {@inheritDoc} */
        @Override
        public T minimo(List<T> lista) {
            validarLista(lista);
            T minimo = lista.get(0);
            for (T elemento : lista) {
                if (elemento.compareTo(minimo) < 0) {
                    minimo = elemento;
                }
            }
            return minimo;
        }

        /** {@inheritDoc} */
        @Override
        public T maximo(List<T> lista) {
            validarLista(lista);
            T maximo = lista.get(0);
            for (T elemento : lista) {
                if (elemento.compareTo(maximo) > 0) {
                    maximo = elemento;
                }
            }
            return maximo;
        }

        /** Valida que la lista exista y tenga al menos un elemento. */
        /** @param lista lista que se validará */
        /** @throws IllegalArgumentException si la lista es nula o está vacía */
        private void validarLista(List<T> lista) {
            if (lista == null || lista.isEmpty()) {
                throw new IllegalArgumentException("La lista no puede estar vacia");
            }
        }
    }
}