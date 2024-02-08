/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import java.time.LocalDateTime;

/**
 *
 * @author vanes
 */
 public class EventoDeportivo extends Evento {

     private String equipo1;
     private String equipo2;
     private String tipoDeporte;
     private int cantidad;

     public EventoDeportivo(String codigo, String tituloEvento, String descripcionEvento, LocalDateTime fechaEvento, double montoEvento, String equipo1, String equipo2, int cantidad, String tipoDeporte) {
         super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento);
         this.equipo1 = equipo1;
         this.equipo2 = equipo2;
         this.cantidad = cantidad;
         this.tipoDeporte = tipoDeporte;
     }

    //FUNCIONES GET
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

    public enum TipoDeporte {
       FUTBOL, TENIS, RUGBY, BASEBALL
    }
   

}
