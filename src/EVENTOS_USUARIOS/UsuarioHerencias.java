package EVENTOS_USUARIOS;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public class UsuarioHerencias {

    public class UsuarioAdmin extends Usuario {

        private ArrayList<Evento> listaEventos;
        
        
        public UsuarioAdmin(String nombre, String username, String password, int edad) {
            super(nombre, username, password, edad);
            this.listaEventos = new ArrayList<Evento>();

        }

    }
    
    public class UsuarioContenido extends Usuario {

        private ArrayList<Evento> listaEventos;

        public UsuarioContenido(String nombre, String username, String password, int edad) {
            super(nombre, username, password, edad);
            this.listaEventos = new ArrayList<Evento>();

        }

    }

    public class UsuarioLimitado extends Usuario {

        public UsuarioLimitado(String nombre, String username, String password, int edad) {
            super(nombre, username, password, edad);

        }

    }
}
