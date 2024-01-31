package EVENTOS_USUARIOS;


import java.time.LocalDateTime;

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
    
    private int codigo;
    private String tituloEvento;
    private String descripcionEvento;
    private LocalDateTime fechaEvento;
    private double montoEvento;
    
    public Evento(int codigo, String tituloEvento, String descripcionEvento, LocalDateTime fechaEvento, double montoEvento) {

        this.codigo = codigo;
        this.tituloEvento = tituloEvento;
        this.descripcionEvento = descripcionEvento;
        this.fechaEvento = fechaEvento;
        this.montoEvento = montoEvento;

    }

    //FUNCIONES GET
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return tituloEvento;
    }

    public String getDescripcion() {
        return descripcionEvento;
    }

    public LocalDateTime getFecha() {
        return fechaEvento;
    }

    public double getMonto() {
        return montoEvento;
    }

    //FUNCIONES SET
    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }

    public void setTitulo(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public void setDescripcion(String descripcionEvento) {
        this.descripcionEvento=descripcionEvento;
    }

    public void setFecha(LocalDateTime fechaEVento) {
        this.fechaEvento=fechaEvento;
    }

    public void setMonto(double Monto) {
        this.montoEvento=montoEvento;
    }

    
    
}
