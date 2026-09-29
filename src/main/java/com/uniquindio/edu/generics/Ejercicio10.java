package com.uniquindio.edu.generics;

// Una calculadora avanzada necesita números que puedan convertirse y compararse naturalmente.
// T combina Number y Comparable<T> para admitir tipos como Integer o Double.
/**
 * Reúne sumas, restas y comparaciones para números definidos genéricamente.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        CalculadoraAvanzada<Double> operaciones = new CalculadoraAvanzada<>();
        System.out.println("Suma: " + operaciones.sumar(8.5, 2.5));
        System.out.println("Resta: " + operaciones.restar(8.5, 2.5));
        System.out.println("Maximo: " + operaciones.maximo(8.5, 2.5));
        System.out.println("Minimo: " + operaciones.minimo(8.5, 2.5));
    }

    /** Calculadora para tipos numéricos con orden natural. */
    /** @param <T> tipo numérico comparable de los operandos */
    public static class CalculadoraAvanzada<T extends Number & Comparable<T>> {
        /** Suma dos números. */
        /** @param primerNumero primer sumando */
        /** @param segundoNumero segundo sumando */
        /** @return resultado de la suma como {@code double} */
        public double sumar(T primerNumero, T segundoNumero) {
            return primerNumero.doubleValue() + segundoNumero.doubleValue();
        }

        /** Resta el segundo número al primero. */
        /** @param primerNumero minuendo */
        /** @param segundoNumero sustraendo */
        /** @return resultado de la resta como {@code double} */
        public double restar(T primerNumero, T segundoNumero) {
            return primerNumero.doubleValue() - segundoNumero.doubleValue();
        }

        /** Obtiene el mayor de dos números. */
        /** @param primerNumero primer valor */
        /** @param segundoNumero segundo valor */
        /** @return mayor valor; en caso de empate, el primero */
        public T maximo(T primerNumero, T segundoNumero) {
            return primerNumero.compareTo(segundoNumero) >= 0
                    ? primerNumero
                    : segundoNumero;
        }

        /** Obtiene el menor de dos números. */
        /** @param primerNumero primer valor */
        /** @param segundoNumero segundo valor */
        /** @return menor valor; en caso de empate, el primero */
        public T minimo(T primerNumero, T segundoNumero) {
            return primerNumero.compareTo(segundoNumero) <= 0
                    ? primerNumero
                    : segundoNumero;
        }
    }
}