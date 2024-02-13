/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import SWING.AdminUsuario_Menu;
import SWING.Login;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author vanes
 */
public class UsuariosMetodos {

    private static final ArrayList<Usuario> usuariosArray = Login.getUsuariosArray();

    public static ArrayList<Usuario> getUsuariosArray() {
        return usuariosArray;
    }

    public boolean buscarUsuario(String usuario) {
        return buscarUsuarioRecursivo(0, usuario);
    }

    private boolean buscarUsuarioRecursivo(int indice, String usuario) {
        if (indice >= usuariosArray.size()) {
            return false;
        }

        if (usuariosArray.get(indice).getUsuario().equals(usuario)) {
            return true;
        }

        return buscarUsuarioRecursivo(indice + 1, usuario);
    }

    public void agregarUsuario(String nombre, String usuario, String password, int edad, String tipoUsuario) {

        boolean usuarioBuscado = buscarUsuario(usuario);

        if (usuarioBuscado) {
            JOptionPane.showMessageDialog(null, "Un usuario con ese nombre de usuario ya existe, por favor elegir otro usuario.");
            return;
        }

        if ("admin".equals(usuario)) {
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
        return revisarUsuarioRecursivo(0, usuarioViejo, passwordViejo);
    }

    private boolean revisarUsuarioRecursivo(int indice, String usuarioViejo, String passwordViejo) {

        if (indice >= usuariosArray.size()) {
            JOptionPane.showMessageDialog(null, "Este usuario no existe.");
            return false;
        }

        if (usuariosArray.get(indice).getUsuario().equals(usuarioViejo)) {
            if (!usuariosArray.get(indice).getContraseña().equals(passwordViejo)) {
                JOptionPane.showMessageDialog(null, "La contraseña es incorrecta.");
                return false;
            } else {
                return true;
            }
        }

        return revisarUsuarioRecursivo(indice + 1, usuarioViejo, passwordViejo);
    }

    public void editarUsuario(String usuario, String nombre, String password, int edad, String nuevoUsuario, String nuevoPassword) {
        if (usuariosArray == null) {
            return;
        }

        boolean usuarioExistente = false;

        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            Usuario currentUsuario = usuariosArray.get(indice);

            if (currentUsuario.getUsuario().equals(nuevoUsuario)) {
                usuarioExistente = true;
                break;
            }
        }

        if (usuarioExistente) {
            JOptionPane.showMessageDialog(null, "Un usuario con ese nombre de usuario ya existe, por favor elegir otro usuario.");
            return;
        }

        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            Usuario currentUsuario = usuariosArray.get(indice);

            if (currentUsuario.getUsuario().equals(usuario)) {
                currentUsuario.setNombre(nombre);
                currentUsuario.setUser(nuevoUsuario);
                currentUsuario.setPassword(nuevoPassword);
                currentUsuario.setEdad(edad);

                if (!usuario.equals(nuevoUsuario)) {
                    JOptionPane.showMessageDialog(null, "El usuario " + usuario + " fue actualizado y se cambió a " + nuevoUsuario + ". \nRegresando al menú de usuarios.");
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario " + usuario + " fue actualizado.");
                }

                AdminUsuario_Menu pasar = new AdminUsuario_Menu(usuariosArray, "", null);
                return;
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
                        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar esta cuenta?", "ELIMINAR CUENTA", YES_NO_OPTION);

                        if (usuarioEleccion == JOptionPane.YES_OPTION) {
                            usuariosArray.remove(indice);
                            JOptionPane.showMessageDialog(null, "La cuenta se eliminó de manera permanente. Regresando al LOGIN.");
                            return;
                        } else {
                            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
                            return;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña no es correcta.");
                        return;
                    }
                }
            }
        }
    }

}
