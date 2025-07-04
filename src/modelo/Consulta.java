/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author sandro rendon
 */
// Clase que representa una consulta médica
public class Consulta {

    // Código identificador de la consulta
    private String codigo;

    // Fecha en que se realizó la consulta
    private String fecha;

    // Diagnóstico asociado a la consulta
    private Diagnostico diagnostico;

    // Constructor que recibe el código, la fecha y el diagnóstico al crear el objeto
    public Consulta(String codigo, String fecha, Diagnostico diagnostico) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
    }

    // Método para obtener el código de la consulta
    public String getCodigo() {
        return codigo;
    }

    // Método para cambiar el código
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para obtener la fecha de la consulta
    public String getFecha() {
        return fecha;
    }

    // Método para cambiar la fecha
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Método para obtener el diagnóstico guardado
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    // Método para cambiar el diagnóstico
    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    // Método que muestra todos los datos de la consulta en pantalla
    public void mostrarConsulta() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("diagnostico: " + diagnostico.getDescripcion());
        System.out.println("diagnostico: " + diagnostico.getTratamiento());
    }
}
