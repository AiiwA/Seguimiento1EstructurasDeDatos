package com.uniquindio.edu.Collections;
// Un servicio de urgencias debe priorizar a quienes presentan mayor necesidad de atención.
// PriorityQueue permite retirar primero al paciente con el nivel de prioridad más alto.

import java.util.PriorityQueue;

/**
 * Simula la atención de pacientes utilizando una cola priorizada.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio2 {

    PriorityQueue<Paciente> triage = new PriorityQueue<>();

    public static void main(String[] args) {
        Ejercicio2 salaTriage = new Ejercicio2();

        salaTriage.agregarPaciente("Sofia Rojas", 2);
        salaTriage.agregarPaciente("Mateo Diaz", 4);
        salaTriage.agregarPaciente("Valentina Cruz", 1);

        salaTriage.atenderPacientes();

    }

    /** Añade un paciente a la cola de triage. */
    /** @param nombre nombre del paciente */
    /** @param prioridad nivel de urgencia; un valor mayor se atiende primero */
    public void agregarPaciente(String nombre, int prioridad) {
        Paciente nuevoPaciente = new Paciente(nombre, prioridad);
        triage.add(nuevoPaciente);
    }

    /** Atiende pacientes hasta vaciar la cola, respetando su prioridad. */
    public void atenderPacientes() {
        while (!triage.isEmpty()) {
            Paciente paciente = triage.poll();
            System.out.println("Atendiendo a: " + paciente);
        }
    }

    /** Modelo de un paciente ordenable por nivel de prioridad. */
    public class Paciente implements Comparable<Paciente> {
        /** Nombre del paciente. */
        public String nombrePaciente;
        /** Nivel de prioridad del paciente. */
        public int prioridad;

        /** Crea un paciente. */
        /** @param nombrePaciente nombre del paciente */
        /** @param prioridad nivel de prioridad */
        public Paciente(String nombrePaciente, int prioridad) {
            this.nombrePaciente = nombrePaciente;
            this.prioridad = prioridad;
        }

        /** @return representación textual del paciente */
        @Override
        public String toString() {
            return "Paciente=" + nombrePaciente + ", prioridad=" + prioridad;
        }

        /** Ordena de mayor a menor prioridad. */
        /** @param other paciente con el que se compara */
        /** @return resultado de la comparación */
        @Override
        public int compareTo(Paciente other) {
            return Integer.compare(other.prioridad, this.prioridad);
        }
    }
}
