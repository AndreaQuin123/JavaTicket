package EVENTOS_USUARIOS;


import java.time.LocalDateTime;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public abstract class Evento {

    //ATRIBUTOS
    private String codigo;
    private int cantidad;
    private String tituloEvento;
    private String descripcionEvento;
    Date fechaEvento;
    private double montoEvento;

    public Evento(String codigo, String tituloEvento, String descripcionEvento, Date fechaEvento, double montoEvento, int cantidad) {

        this.codigo = codigo;
        this.tituloEvento = tituloEvento;
        this.descripcionEvento = descripcionEvento;
        this.fechaEvento = fechaEvento;
        this.montoEvento = montoEvento;
        this.cantidad = cantidad;

    }

    //FUNCIONES GET
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return tituloEvento;
    }

    public String getDescripcion() {
        return descripcionEvento;
    }

    public Date getFecha() {
        return fechaEvento;
    }

    public double getMonto() {
        return montoEvento;
    }

    public int getCantidad() {
        return cantidad;
    }

    //FUNCIONES SET
    public void setCantidad(int cantidad) {
        this.cantidad=cantidad;
    }
   
    public void setCodigo(String codigo) {
        this.codigo=codigo;
    }

    public void setTitulo(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public void setDescripcion(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public void setFecha(Date fechaEVento) {
        this.fechaEvento = fechaEvento;
    }

    public void setMonto(double Monto) {
        this.montoEvento = montoEvento;
    }

    public enum TipoEvento {
        MUSICAL, RELIGIOSO, DEPORTIVO
    }

}
