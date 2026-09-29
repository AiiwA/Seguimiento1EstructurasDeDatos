package com.uniquindio.edu.Collections;

import java.util.HashSet;

// Un control de acceso debe reconocer a cada empleado mediante un identificador único.
// HashSet evita registrar dos veces la misma identidad dentro del conjunto autorizado.
/**
 * Administra empleados autorizados sin repetir sus identificadores.
 *
 * @author Brandon Steven Gil
 * @license GNU General Public License v3.0
 */
public class Ejercicio6 {
    /** Empleados autorizados, sin identificadores repetidos. */
    HashSet<Empleado> empleados = new HashSet<>();
    public static void main(String[] args) {
        Ejercicio6 controlAcceso = new Ejercicio6();
        controlAcceso.agregarEmpleados(new Empleado("E-14", "Camila"));
        controlAcceso.agregarEmpleados(new Empleado("E-27", "Andres"));
        controlAcceso.agregarEmpleados(new Empleado("E-31", "Juliana"));
    }

    /** Agrega un empleado únicamente si su identificador no está registrado. */
    /** @param empleado empleado que se desea registrar */
    public void agregarEmpleados(Empleado empleado){
        if(!empleados.contains(empleado)){
            empleados.add(empleado);
        }
    }

    /** Representa a un empleado identificado por un código único. */
    public static class Empleado {
        /** Código identificador del empleado. */
        String idEmpleado;
        /** Nombre del empleado. */
        String nombreEmpleado;

        /** Crea un empleado. */
        /** @param idEmpleado identificador del empleado */
        /** @param nombreEmpleado nombre del empleado */
        public Empleado(String idEmpleado, String nombreEmpleado) {
            this.idEmpleado = idEmpleado;
            this.nombreEmpleado = nombreEmpleado;
        }

        /** Considera iguales los empleados con el mismo identificador. */
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass())
                return false;
            Empleado empleado = (Empleado) obj;
            return idEmpleado.equals(empleado.idEmpleado);
        }

        /** @return hash basado en el identificador del empleado */
        @Override
        public int hashCode() {
            return idEmpleado.hashCode();
        }
    }
}
