/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vanes
 */
public class EventoDeportivo extends Evento {

    private Map<String, ArrayList<String>> equipos = new HashMap<>();
    private String equipo1;
    private String equipo2;
    private String tipoDeporte;
    private int cantidad;

    public EventoDeportivo(String codigo, String tituloEvento, String descripcionEvento, Date fechaEvento, double montoEvento, String equipo1, String equipo2, int cantidad, String tipoDeporte) {
        super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento, cantidad);
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.cantidad = cantidad;
        this.tipoDeporte = tipoDeporte;
    }

    // Getters

    
    
    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Map<String, ArrayList<String>> getEquipos() {
        return equipos;
    }

    public ArrayList<String> getJugadores(String nombreEquipo) {
        return equipos.get(nombreEquipo);
    }

    // Setters
    public void setEquipo(String nombreEquipo, ArrayList<String> jugadores) {
        equipos.put(nombreEquipo, jugadores);
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public void addJugadores(String nombreEquipo, ArrayList<String> jugadores) {
        ArrayList<String> existingJugadores = equipos.get(nombreEquipo);
        if (existingJugadores != null) {
            existingJugadores.addAll(jugadores);
        }
    }

    public enum TipoDeporte {
        FUTBOL, TENIS, RUGBY, BASEBALL
    }

}
