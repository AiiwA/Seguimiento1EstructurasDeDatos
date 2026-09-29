package com.uniquindio.edu.generics;

// Se pueden cambiar dos elementos de un arreglo sin conocer su tipo.
/**
 * Intercambia dos elementos de un arreglo.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Carlos"};
        intercambiar(nombres, 0, 2);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    /** Cambia de lugar los elementos ubicados en las posiciones indicadas. */
    /** @param <T> tipo de los elementos del arreglo */
    /** @param arreglo arreglo cuyos elementos se intercambiarán */
    /** @param primeraPosicion posición del primer elemento */
    /** @param segundaPosicion posición del segundo elemento */
    public static <T> void intercambiar(T[] arreglo, int primeraPosicion, int segundaPosicion) {
        T auxiliar = arreglo[primeraPosicion];
        arreglo[primeraPosicion] = arreglo[segundaPosicion];
        arreglo[segundaPosicion] = auxiliar;
    }
}