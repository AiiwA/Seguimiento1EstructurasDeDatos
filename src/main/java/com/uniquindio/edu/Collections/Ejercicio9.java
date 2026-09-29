package com.uniquindio.edu.Collections;

import java.util.HashMap;
import java.util.Map;

// Un directorio telefónico relaciona cada contacto con su número para facilitar consultas directas.
// HashMap permite guardar esa asociación y reemplazar el número cuando el contacto ya existe.

/**
 * Ofrece un directorio de contactos consultable mediante el nombre.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio9 {
    /** Relación entre nombres de contactos y números telefónicos. */
    private final Map<String, String> directorio = new HashMap<>();

    public static void main(String[] args) {
        Ejercicio9 contactos = new Ejercicio9();
        contactos.agregarContacto("Laura", "3001234567");
        contactos.agregarContacto("Carlos", "3107654321");
        System.out.println("Telefono de Laura: " + contactos.buscarTelefono("Laura"));
    }

    /** Registra o actualiza el teléfono asociado a un nombre. */
    /** @param nombre nombre del contacto */
    /** @param telefono número telefónico del contacto */
    public void agregarContacto(String nombre, String telefono) {
        directorio.put(nombre, telefono);
    }

    /** Busca el teléfono asociado a un contacto. */
    /** @param nombre nombre del contacto */
    /** @return teléfono registrado o {@code null} si no existe */
    public String buscarTelefono(String nombre) {
        return directorio.get(nombre);
    }

    /** @return copia independiente del directorio telefónico */
    public Map<String, String> getDirectorio() {
        return new HashMap<>(directorio);
    }
}