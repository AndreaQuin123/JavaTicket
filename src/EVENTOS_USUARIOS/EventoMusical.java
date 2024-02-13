/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * @author vanes
 */
public class EventoMusical extends Evento {

    private int cantidad;
    private String tipoMusical;
    private double seguro;
    private HashMap<String, String> miembrosInstruments;
    private String miembro;
    private String instrumento;

    public EventoMusical(String codigo, String tituloEvento, String descripcionEvento, Date fechaEvento, double montoEvento, double seguro, int cantidad, String tipoMusical) {
        super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento, cantidad);
        this.cantidad = cantidad;
        this.tipoMusical = tipoMusical;
        this.seguro = montoEvento*0.30;
        this.miembrosInstruments = new HashMap<>();
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

    public void setSeguro(double seguro) {
        this.seguro = seguro;

    }

    //SETTERS
    public void setmiembrosInstruments(String miembro, String instrumento) {
        miembrosInstruments.put(miembro, instrumento);
    }

    public String getMiembro(int indice) {
        return miembrosInstruments.get(miembro);
    }

    public String getInstrumento(int indice) {
        return miembrosInstruments.get(instrumento);
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public void setTipoMusical(String tipoMusical) {
        this.tipoMusical = tipoMusical;
    }

    public HashMap<String, String> getMembersAndInstruments() {
        return miembrosInstruments;
    }

    public void setMembersAndInstruments(HashMap <String, String> miembrosInstruments) {
        this.miembrosInstruments = miembrosInstruments;;
    }

    public enum TipoMusical {
        POP, ROCK, RAP, CLASICA, REGGEATON, OTRO
    }

}
