package com.uniquindio.edu.Collections;

import java.util.Stack;

// La navegación web requiere volver a la página visitada inmediatamente antes.
// Stack representa este historial con comportamiento LIFO: la última página sale primero.

/**
 * Modela el historial de páginas mediante una estructura tipo pila.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio4 {

    /** Pila con las páginas visitadas, desde la más antigua a la más reciente. */
    Stack<String> historialPaginas = new Stack<>();

    public static void main(String[] args) {
        Ejercicio4 navegador = new Ejercicio4();
        navegador.añadirPagina("yahoo.com");
        navegador.añadirPagina("Youtube.com");
        navegador.añadirPagina("mileroticos.com");

        IO.println("El historial actual es: ");
        navegador.mostrarHistorial();
        navegador.volverAnterior();
        IO.println("Historial nuevo: ");
        navegador.mostrarHistorial();
        
    }

    /** Muestra el contenido actual del historial de navegación. */
    public void mostrarHistorial(){
        IO.println(historialPaginas.toString());
    }

    /** Añade una página nueva al tope de la pila. */
    /** @param pagina dirección de la página visitada */
    public void añadirPagina(String pagina){
        historialPaginas.push(pagina);
    }

    /** Elimina la página actual e informa cuál queda como anterior. */
    public void volverAnterior(){
        IO.println("Se elimino la pagina :"+historialPaginas.pop());
        IO.println("Esta volviendo a la pagina:" + historialPaginas.peek());
    }
}
