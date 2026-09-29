package com.uniquindio.edu.generics;

// Un contenedor reutilizable debe aceptar distintos tipos sin conversiones manuales.
// La clase Caja<T> conserva el tipo del dato almacenado mediante generics.
/**
 * Ejemplifica el almacenamiento tipado de valores mediante una caja genérica.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Caja<String> texto = new Caja<>();
        texto.guardar("Aprendiendo Java");
        System.out.println(texto.obtener());

        Caja<Integer> numero = new Caja<>();
        numero.guardar(42);
        System.out.println(numero.obtener());
    }

    /** Caja tipada que almacena un único valor. */
    public static class Caja<T> {
        /** Valor almacenado actualmente. */
        private T contenido;

        /** Guarda o reemplaza el valor de la caja. */
        /** @param valor valor que se almacenará */
        public void guardar(T valor) {
            contenido = valor;
        }

        /** @return valor almacenado, o {@code null} si aún no se ha guardado uno */
        public T obtener() {
            return contenido;
        }
    }
}