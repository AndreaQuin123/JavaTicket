/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import java.time.LocalDateTime;

/**
 * @author vanes
 */
public class EventoReligioso extends Evento {

    private int cantidad;
    private final double seguro;

    public EventoReligioso(String codigo, String tituloEvento, String descripcionEvento, LocalDateTime fechaEvento, double montoEvento, double seguro, int cantidad) {
        super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento);
        this.cantidad = cantidad;
        this.seguro = 2000;
    }

    //FUNCIONES GET
    public double getSeguro() {
        return seguro;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
