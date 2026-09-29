package com.uniquindio.edu.Collections;

import java.util.TreeSet;

// Una empresa puede conservar sus productos ordenados por código y consultarlos por ese dato.
/**
 * Registra productos en orden de código y ofrece búsquedas dentro del conjunto.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Empresa inventario = new Empresa();
        inventario.agregarProducto(new Producto("P003", "Teclado", 85000));
        inventario.agregarProducto(new Producto("P001", "Monitor", 650000));
        inventario.agregarProducto(new Producto("P002", "Mouse", 45000));

        System.out.println("Productos: " + inventario.productos);
        System.out.println("Producto encontrado: " + inventario.buscarProducto("P002"));
    }

    /** Gestiona productos ordenados por código. */
    public static class Empresa {
        /** Productos registrados, ordenados por código. */
        private final TreeSet<Producto> productos = new TreeSet<>();

        /** Registra un producto en la empresa. */
        /** @param producto producto que se desea agregar */
        public void agregarProducto(Producto producto) {
            productos.add(producto);
        }

        /** Busca un producto por su código. */
        /** @param codigo código del producto */
        /** @return producto encontrado o {@code null} si no existe */
        public Producto buscarProducto(String codigo) {
            for (Producto producto : productos) {
                if (producto.codigo.equals(codigo)) {
                    return producto;
                }
            }
            return null;
        }

        /** @return copia independiente de los productos registrados */
        public TreeSet<Producto> getProductos() {
            return new TreeSet<>(productos);
        }
    }

    /** Representa un producto identificable y ordenable por código. */
    public static class Producto implements Comparable<Producto> {
        /** Código único del producto. */
        private final String codigo;
        /** Nombre comercial del producto. */
        private final String nombre;
        /** Precio del producto. */
        private final double precio;

        /** Crea un producto. */
        /** @param codigo código del producto */
        /** @param nombre nombre del producto */
        /** @param precio precio del producto */
        public Producto(String codigo, String nombre, double precio) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.precio = precio;
        }

        /** Ordena productos alfabéticamente por código. */
        /** @param otro producto con el que se compara */
        /** @return resultado de la comparación */
        @Override
        public int compareTo(Producto otro) {
            return codigo.compareTo(otro.codigo);
        }

        /** @return descripción del producto con su precio */
        @Override
        public String toString() {
            return codigo + " - " + nombre + " ($" + precio + ")";
        }
    }
}