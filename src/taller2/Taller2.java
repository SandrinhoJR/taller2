/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import modelo.Consulta;
import modelo.Diagnostico;

/**
 *
 * @author sandro rendon
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Se crea un diagnóstico con una descripción y un tratamiento
        Diagnostico diagnostico1 = new Diagnostico("dolor en pata derecha", "administrar calmante");

// Se crea una consulta, que incluye un código, una fecha y el diagnóstico creado antes
        Consulta consulta2 = new Consulta("00102", "18-04-2025", diagnostico1);

// Se muestran los datos de la consulta en pantalla
        consulta2.mostrarConsulta();

// Se verifica si el tratamiento es largo (más de 30 caracteres)
// Si es largo, se recomienda seguimiento. Si no, se indica que no es necesario.
        if (diagnostico1.esTratamientoLargo()) {
            System.out.println("El tratamiento es largo. necesita seguimiento");
        } else {
            System.out.println("El tratamiento es corto. No necesita seguimiento");
        }
    }
}
