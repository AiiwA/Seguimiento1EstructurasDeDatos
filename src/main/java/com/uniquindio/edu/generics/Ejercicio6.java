package com.uniquindio.edu.generics;

// Una calculadora puede operar sobre valores numéricos sin admitir tipos ajenos a Number.
// La cota T extends Number permite reutilizar la operación con diferentes clases numéricas.
/**
 * Realiza operaciones sencillas utilizando tipos genéricos numéricos.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        CajaNumerica<Integer> cajaEnteros = new CajaNumerica<>(15);
        System.out.println("Doble: " + cajaEnteros.doble());
        System.out.println("Suma: " + sumar(4.5, 2.5));
    }

    /** Suma dos valores pertenecientes a tipos numéricos compatibles. */
    /** @param <T> tipo numérico de los operandos */
    /** @param primerNumero primer sumando */
    /** @param segundoNumero segundo sumando */
    /** @return suma convertida a {@code double} */
    public static <T extends Number> double sumar(T primerNumero, T segundoNumero) {
        return primerNumero.doubleValue() + segundoNumero.doubleValue();
    }

    /** Caja especializada para valores numéricos. */
    /** @param <T> tipo numérico almacenado */
    public static class CajaNumerica<T extends Number> {
        /** Número almacenado. */
        private final T numero;

        /** Crea una caja numérica. */
        /** @param numero valor que se almacenará */
        public CajaNumerica(T numero) {
            this.numero = numero;
        }

        /** @return el doble del número almacenado */
        public double doble() {
            return numero.doubleValue() * 2;
        }
    }
}