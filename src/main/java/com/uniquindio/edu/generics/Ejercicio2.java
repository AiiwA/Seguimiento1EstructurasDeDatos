package com.uniquindio.edu.generics;

// Una utilidad de prueba puede imprimir valores heterogéneos sin repetir la misma función.
// Un método estático genérico recibe cada dato conservando la seguridad de tipos.
/**
 * Presenta una función genérica capaz de mostrar valores de diferentes clases.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        mostrarElemento("Dato de prueba");
        mostrarElemento(18);
        mostrarElemento(6.28);
    }

    /** Imprime un elemento de cualquier tipo manteniendo seguridad genérica. */
    /** @param <T> tipo del elemento */
    /** @param elemento valor que se imprimirá */
    public static <T> void mostrarElemento(T elemento) {
        System.out.println(elemento);
    }
}