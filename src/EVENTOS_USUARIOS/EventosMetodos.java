/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import SWING.Login;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class EventosMetodos {
    
    private ArrayList<Usuario> usuariosArray = Login.getUsuariosArray();

    public EventosMetodos() {
        
    }

    public boolean CrearEventoDeportivo(String codigo, String titulo, String desc, LocalDateTime fecha, double monto, String name, String equipo1, String equipo2, int cantidad, String TipoDeporte) {
       
        System.out.println(usuariosArray);
        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getUsuario().equals(name)) {
                if (cantidad < 20000) {
                    EventoDeportivo nuevoEvento = new EventoDeportivo(codigo, titulo, desc, fecha, monto, equipo1, equipo2, cantidad, TipoDeporte);
                    usuariosArray.get(indice).AgregarEvento(nuevoEvento);
                    JOptionPane.showMessageDialog(null, "Se agregó un nuevo evento DEPORTIVO de manera exitosa!");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad es muy alta para un evento DEPORTIVO.");
                    return false;
                }
            }
        }
        return false;
    }

    public boolean CrearEventoReligioso(String codigo, String titulo, String desc, LocalDateTime fecha, double monto, String name, double seguro, int cantidad) {
        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getNombre().equals(name)) {
                if (cantidad < 30000) {
                    EventoReligioso nuevoEvento = new EventoReligioso(codigo, titulo, desc, fecha, monto, seguro, cantidad);
                    usuariosArray.get(indice).AgregarEvento(nuevoEvento);
                JOptionPane.showMessageDialog(null, "Se agrego un nuevo evento RELIGIOSO de manera exitosa!");
                return true;
                 } else {
                    JOptionPane.showMessageDialog(null, "La cantidad es muy alta para un evento RELIOGOSO."); {
                     return false;
                 }
                 }
            }
        }
        return false;

    }

    public boolean CrearEventoMusical(String codigo, String titulo, String desc, LocalDateTime fecha, double monto, String name, double seguro, int cantidad, String tipoMusical) {
        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getNombre().equals(name)) {
                if (cantidad<25000) {
                EventoMusical nuevoEvento = new EventoMusical(codigo, titulo, desc, fecha, monto, seguro, cantidad, tipoMusical);
                usuariosArray.get(indice).AgregarEvento(nuevoEvento);
                JOptionPane.showMessageDialog(null, "Se agrego un nuevo evento MUSICAL de manera exitosa!");
                return true;
                 } else {
                    JOptionPane.showMessageDialog(null, "La cantidad es muy alta para un evento DEPORTIVO.");
                    return false;
                }
            }
        }
        return false;

    }

    public void EditarEvento() {

        
        
        
    }

    public void EliminarEvento() {

    }

    public static String generateRandomCode() {
        UUID uuid = UUID.randomUUID();
        return "EVT"+uuid.toString().toUpperCase().replaceAll("-", "").substring(0, 6);
    }

}
