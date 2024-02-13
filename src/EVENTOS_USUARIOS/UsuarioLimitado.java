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

    public class UsuarioLimitado extends Usuario {

    public UsuarioLimitado(String nombre, String username, String password, int edad) {
        super(nombre, username, password, edad);

    }

    @Override
    public void AgregarEvento(Evento nuevoEvento) {
        return;
    }

    @Override
    public ArrayList<Evento> getListaEventos() {
        return null;
    }

}
