package EVENTOS_USUARIOS;


import java.time.LocalDateTime;
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public class EventosHerencia {

    public class EventoDeportivo extends Evento {

        private String equipo1;
        private String equipo2;
        private String tipoDeporte;
        private int cantidad;

        public EventoDeportivo(int codigo, String tituloEvento, String descripcionEvento, LocalDateTime fechaEvento, double montoEvento, String equipo1, String equipo2, int cantidad, String tipoDeporte) {
            super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento);
            this.equipo1 = equipo1;
            this.equipo2 = equipo2;
            this.cantidad = cantidad;
            this.tipoDeporte = tipoDeporte;
        }

    }

    public class EventoMusical extends Evento {

        private int cantidad;
        private String tipoMusical;
        private double seguro;
        
        
        public EventoMusical(int codigo, String tituloEvento, String descripcionEvento, LocalDateTime fechaEvento, double montoEvento, double seguro, int cantidad, String tipoMusical) {
            super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento);
            this.cantidad = cantidad;
            this.tipoMusical = tipoMusical;
            this.seguro = seguro;
        }
    }
    
    
        public class EventoReligioso extends Evento {

        private int cantidad;
        private double seguro;
        
        
        public EventoReligioso(int codigo, String tituloEvento, String descripcionEvento, LocalDateTime fechaEvento, double montoEvento, double seguro, int cantidad) {
            super(codigo, tituloEvento, descripcionEvento, fechaEvento, montoEvento);
            this.cantidad = cantidad;
            this.seguro = seguro;
        }
    }


}
