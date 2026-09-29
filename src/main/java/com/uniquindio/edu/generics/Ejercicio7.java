package com.uniquindio.edu.generics;

// Un comparador reutilizable debe aceptar cualquier tipo que defina un orden natural.
// La restricción Comparable<T> permite decidir el mayor usando compareTo.
/**
 * Selecciona valores genéricos de acuerdo con el orden natural de su tipo.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Comparador<String> orden = new Comparador<>();
        System.out.println(orden.mayor("Marta", "Julian"));
    }

    /** Comparador de valores con orden natural. */
    /** @param <T> tipo comparable que se comparará */
    public static class Comparador<T extends Comparable<T>> {
        /** Devuelve el mayor de dos valores según su orden natural. */
        /** @param primerElemento primer valor */
        /** @param segundoElemento segundo valor */
        /** @return el mayor valor; en caso de empate, el primero */
        public T mayor(T primerElemento, T segundoElemento) {
            return primerElemento.compareTo(segundoElemento) >= 0
                    ? primerElemento
                    : segundoElemento;
        }
    }
}