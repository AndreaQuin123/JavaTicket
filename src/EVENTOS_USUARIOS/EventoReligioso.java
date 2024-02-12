
package EVENTOS_USUARIOS;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class EventoReligioso extends Evento {

    private ArrayList<String> participantes;
    private int cantidad;
    private double seguro;

    public EventoReligioso(String codigo, String tituloEvento, String descripcionEvento, Date fechaEvento, double montoEvento, double seguro, int cantidad) {
        super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento, cantidad);
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

    public ArrayList<String> getParticipantes() {
        return participantes;
    }

    public void setParticipante(String participante) {
        this.participantes.add(participante);
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;

    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;

    
}
}
