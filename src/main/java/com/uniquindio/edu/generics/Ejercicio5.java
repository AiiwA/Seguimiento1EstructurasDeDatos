package com.uniquindio.edu.generics;

import java.util.Objects;

// Un registro puede agrupar dos valores del mismo tipo y comparar su contenido.
// Par<T> garantiza que ambos elementos pertenezcan a una única clase genérica.
/**
 * Reúne dos valores tipados y determina si representan el mismo dato.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Par<Integer> pareja = new Par<>(14, 14);
        System.out.println("Los valores son iguales: " + pareja.sonIguales());
    }

    /** Par de valores que deben pertenecer al mismo tipo genérico. */
    /** @param <T> tipo de ambos valores */
    public static class Par<T> {
        /** Primer valor del par. */
        private final T primerValor;
        /** Segundo valor del par. */
        private final T segundoValor;

        /** Crea un par de valores. */
        /** @param primerValor primer valor */
        /** @param segundoValor segundo valor */
        public Par(T primerValor, T segundoValor) {
            this.primerValor = primerValor;
            this.segundoValor = segundoValor;
        }

        /** @return {@code true} si ambos valores son iguales */
        public boolean sonIguales() {
            return Objects.equals(primerValor, segundoValor);
        }
    }
}