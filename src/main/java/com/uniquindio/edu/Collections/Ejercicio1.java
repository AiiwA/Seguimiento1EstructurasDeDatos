package com.uniquindio.edu.Collections;

import java.time.LocalDate;
import java.util.TreeMap;

// Una agenda necesita ordenar sus actividades por fecha y localizar la siguiente pendiente.
// TreeMap conserva esa secuencia cronológica y permite consultar rápidamente la fecha adecuada.
/**
 * Organiza eventos por fecha y muestra el primero que aún está pendiente.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio1 {

    TreeMap<LocalDate, Evento> agenda = new TreeMap<>();
    LocalDate fechaActual = LocalDate.now();

    public static void main(String[] args) {
        Ejercicio1 agendaEventos = new Ejercicio1();

        LocalDate hoy = LocalDate.now();
        agendaEventos.agregarEvento(hoy.plusDays(3), "Conferencia de Tecnología", 150);
        agendaEventos.agregarEvento(hoy.plusDays(1), "Reunión de Negocios", 20);
        agendaEventos.agregarEvento(hoy.plusDays(7), "Fiesta de Cumpleaños", 50);

        agendaEventos.mostrarEventoProximo();
    }

    /** Registra un evento asociado a una fecha en la agenda. */
    /** @param fecha fecha de realización del evento */
    /** @param titulo título descriptivo del evento */
    /** @param invitados cantidad de personas invitadas */
    public void agregarEvento(LocalDate fecha, String titulo, int invitados) {
        Evento nuevoEvento = new Evento(titulo, invitados);
        agenda.put(fecha, nuevoEvento);

    }

    /** Muestra el primer evento cuya fecha no es anterior a la fecha actual. */
    public void mostrarEventoProximo() {
        LocalDate siguienteFecha = agenda.ceilingKey(fechaActual);
        if (siguienteFecha != null) {
            Evento siguienteEvento = agenda.get(siguienteFecha);
            System.out.println("El evento más próximo es: " + siguienteEvento + " en la fecha: " + siguienteFecha);
        } else {
            System.out.println("No hay eventos próximos.");
        }
    }

    /** Representa la información básica de un evento de la agenda. */
    public class Evento {
        /** Título del evento. */
        public String nombreEvento;
        /** Número de invitados al evento. */
        public int invitados;

        /** Crea un evento con su título y número de invitados. */
        /** @param nombreEvento título del evento */
        /** @param invitados cantidad de invitados */
        public Evento(String nombreEvento, int invitados) {
            this.nombreEvento = nombreEvento;
            this.invitados = invitados;
        }

        /** @return representación textual del evento */
        @Override
        public String toString() {
            return "Evento=" + nombreEvento + ", invitados=" + invitados;
        }

    }
}
