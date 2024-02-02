/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVENTOS_USUARIOS;

import java.util.UUID;

/**
 *
 * @author vanes
 */
public class EventosMetodos {
    
    
    public boolean CrearEvento() {

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
