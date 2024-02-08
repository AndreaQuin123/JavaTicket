/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import SWING.AdminUsuario_Menu;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author vanes
 */
public class UsuariosMetodos {

    private static ArrayList<Usuario> usuariosArray = new ArrayList<>();

    public static ArrayList<Usuario> getUsuariosArray() {
        return usuariosArray;
    }

    public boolean buscarUsuario(String usuario) {

        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }

    public void agregarUsuario(String nombre, String usuario, String password, int edad, String tipoUsuario) {

        boolean usuarioBuscado = buscarUsuario(usuario);

        if (usuarioBuscado) {
            JOptionPane.showMessageDialog(null, "Un usuario con ese nombre de usuario ya existe, por favor elegir otro usuario.");
            return;
        }
        
        if ("admin".equals(usuario)){
            JOptionPane.showMessageDialog(null, "Un usuario con ese nombre de usuario ya existe, por favor elegir otro usuario.");
            return;
        }

        if (!usuarioBuscado) {

            if (tipoUsuario.equalsIgnoreCase("ADMINISTRADOR")) {
                UsuarioAdmin usuarioNuevo = new UsuarioAdmin(nombre, usuario, password, edad);
                usuariosArray.add(usuarioNuevo);

                JOptionPane.showMessageDialog(null, "¡Nuevo usuario de tipo Administrador agregado!");
            } else if (tipoUsuario.equalsIgnoreCase("CONTENIDO")) {
                UsuarioContenido usuarioNuevo = new UsuarioContenido(nombre, usuario, password, edad);
                usuariosArray.add(usuarioNuevo);

                JOptionPane.showMessageDialog(null, "¡Nuevo usuario de tipo Contenido agregado!");

            } else if (tipoUsuario.equalsIgnoreCase("LIMITADO")) {
                UsuarioLimitado usuarioNuevo = new UsuarioLimitado(nombre, usuario, password, edad);
                usuariosArray.add(usuarioNuevo);

                JOptionPane.showMessageDialog(null, "¡Nuevo usuario de tipo Limitado agregado!");

            }

        }
       
    }

    public boolean revisarUsuario(String usuarioViejo, String passwordViejo) {

        boolean usuarioEncontrado = buscarUsuario(usuarioViejo);

        if (!usuarioEncontrado) {
            JOptionPane.showMessageDialog(null, "Este usuario no existe.");
            return false;

        } else {

            for (int indice = 0; indice < usuariosArray.size(); indice++) {
                if (usuariosArray.get(indice).getUsuario().equals(usuarioViejo)) {
                    if (!usuariosArray.get(indice).getContraseña().equals(passwordViejo)) {

                       JOptionPane.showMessageDialog(null, "La contraseña es incorrecta.");
                       return false;
                       
                    } else {
                        
                        return true;
                    }
                }

            }
        }

        return false;
    }

    public void editarUsuario(String usuario, String nombre, String password, int edad, String nuevoUsuario, String nuevoPassword) {

        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            boolean usuarioBuscado = buscarUsuario(nuevoUsuario);

            if (usuarioBuscado) {
                JOptionPane.showMessageDialog(null, "Un usuario con ese nombre de usuario ya existe, por favor elegir otro usuario.");
                return;

            } else {

                usuariosArray.get(indice).setNombre(nombre);
                usuariosArray.get(indice).setUser(nuevoUsuario);
                usuariosArray.get(indice).setPassword(nuevoPassword);
                usuariosArray.get(indice).setEdad(edad);

                if (usuario != nuevoUsuario) {
                    JOptionPane.showMessageDialog(null, "El usuario " + usuario + " fue actualizado y se cambio a "+nuevoUsuario+". \nRegresando al menu de usuarios.");
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "El usuario " + usuario + "fue actualizado. \nRegresando al menu de usuarios.");
                }

            }
        }
    }

    public void eliminarUsuario(String usuario, String password) {

        boolean usuarioBuscado = buscarUsuario(usuario);

        if (!usuarioBuscado) {
            JOptionPane.showMessageDialog(null, "Este usuario no existe.");
        }

        if (usuarioBuscado) {

            for (int indice = 0; indice < usuariosArray.size(); indice++) {

                if (usuariosArray.get(indice).getUsuario().equals(usuario)) {

                    if (password.equals(usuariosArray.get(indice).getContraseña())) {

                        JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar esta cuenta?", "ELIMINAR CUENTA", YES_NO_OPTION);

                        int usuarioEleccion = 0;

                        if (usuarioEleccion == JOptionPane.YES_OPTION) {

                            usuariosArray.remove(indice);

                            JOptionPane.showMessageDialog(null, "La cuenta se elimino de manera permanente. Regresando al LOGIN.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Se cancelo la operacion.");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña no es correcta.");
                    }
                }

            }
        }
    }


}
