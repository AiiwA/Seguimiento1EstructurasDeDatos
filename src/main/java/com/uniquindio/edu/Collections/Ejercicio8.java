package com.uniquindio.edu.Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// Un servicio de mensajería puede conservar solo una ventana de mensajes recientes.
// ArrayDeque agrega al final y permite retirar el registro más antiguo cuando se alcanza el límite.
/**
 * Mantiene una lista limitada con los diez mensajes enviados más recientemente.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio8 {
    /** Cantidad máxima de mensajes conservados. */
    private static final int MAXIMO_MENSAJES = 10;
    /** Historial de mensajes desde el más antiguo al más reciente. */
    private final Deque<String> mensajes = new ArrayDeque<>();

    public static void main(String[] args) {
        Ejercicio8 mensajesRecientes = new Ejercicio8();
        for (int numero = 1; numero <= 13; numero++) {
            mensajesRecientes.enviarMensaje("Nota recibida " + numero);
        }
        System.out.println(mensajesRecientes.obtenerUltimosMensajes());
    }

    /** Guarda un mensaje y descarta el más antiguo si se alcanzó el límite. */
    /** @param mensaje contenido del mensaje enviado */
    public void enviarMensaje(String mensaje) {
        if (mensajes.size() == MAXIMO_MENSAJES) {
            mensajes.removeFirst();
        }
        mensajes.addLast(mensaje);
    }

    /** @return lista con los mensajes conservados, del más antiguo al más reciente */
    public List<String> obtenerUltimosMensajes() {
        return new ArrayList<>(mensajes);
    }
}