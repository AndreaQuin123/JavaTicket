/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import java.time.LocalDateTime;

/**
 * @author vanes
 */
public class EventoMusical extends Evento {

    private int cantidad;
    private String tipoMusical;
    private double seguro;

    public EventoMusical(int codigo, String tituloEvento, String descripcionEvento, LocalDateTime fechaEvento, double montoEvento, double seguro, int cantidad, String tipoMusical) {
        super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento);
        this.cantidad = cantidad;
        this.tipoMusical = tipoMusical;
        this.seguro = seguro;
    }

    //FUNCIONES GET
    public double getSeguro() {
        return seguro;
    }

    public String getTipoMusical() {
        return tipoMusical;
    }

    public int getCantidad() {
        return cantidad;
    }

}
