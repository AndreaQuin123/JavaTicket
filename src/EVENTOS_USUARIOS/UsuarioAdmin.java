/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import java.util.ArrayList;

/**
 *
 * @author vanes
 */
    public class UsuarioAdmin extends Usuario {

        private ArrayList<Evento> listaEventos;
        
        
        public UsuarioAdmin(String nombre, String username, String password, int edad) {
            super(nombre, username, password, edad);
            this.listaEventos = new ArrayList<Evento>();
    }

    public ArrayList getListaEventos() {
        return listaEventos;
    }

    @Override
    public String toString() {
        return super.toString()+"Eventos: " + listaEventos;
    }
}
