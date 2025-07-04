/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sandro rendon
 */

    // Clase que guarda información sobre el diagnóstico de un paciente
    public class Diagnostico {

        // Descripción del problema o enfermedad
        private String descripcion;

        // Tratamiento recomendado para ese diagnóstico
        private String tratamiento;

        // Constructor que recibe la descripción y el tratamiento al crear el objeto
        public Diagnostico(String descripcion, String tratamiento) {
            this.descripcion = descripcion;
            this.tratamiento = tratamiento;
        }

        // Método para obtener la descripción guardada
        public String getDescripcion() {
            return descripcion;
        }

        // Método para cambiar la descripción si es necesario
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        // Método para obtener el tratamiento guardado
        public String getTratamiento() {
            return tratamiento;
        }

        // Método para cambiar el tratamiento si es necesario
        public void setTratamiento(String tratamiento) {
            this.tratamiento = tratamiento;
        }

        // Método que revisa si el tratamiento tiene más de 30 caracteres
        public boolean esTratamientoLargo() {
            return tratamiento != null && tratamiento.length() > 30;
        }
    }

