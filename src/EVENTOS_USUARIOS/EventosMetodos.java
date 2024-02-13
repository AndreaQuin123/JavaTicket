package EVENTOS_USUARIOS;

import SWING.Login;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;
import javax.swing.JOptionPane;

public class EventosMetodos {

    private ArrayList<Usuario> usuariosArray = Login.getUsuariosArray();
    private static ArrayList<Evento> eventosCancelados = new ArrayList<>();
    private static ArrayList<Evento> eventos = new ArrayList<>();
    
    double pagoCancelar;
    int indice = 0;

    public EventosMetodos() {
        if (usuariosArray == null) {
            usuariosArray = new ArrayList<>();
        }

    }

    public ArrayList<Evento> eventos() {
        return eventos;
    }

    public ArrayList<Evento> eventosCancelados() {
        return eventosCancelados;
    }


    public boolean BuscarEvento(String name, String code) {
        return buscarEventoRecursivo(0, name, code);
    }

    private boolean buscarEventoRecursivo(int indice, String name, String code) {
        if (indice >= usuariosArray.size()) {
            return false;
        }

        if (usuariosArray.get(indice).getUsuario().equals(name)) {
            for (Evento evento : eventos) {
                if (evento.getCodigo().equals(code)) {
                    return true;
                }
            }
        }

        if (usuariosArray.get(indice).getUsuario().equals(name)) {
            for (Evento evento : eventosCancelados) {
                if (evento.getCodigo().equals(code)) {
                    return true;
                }
            }
        }

        return buscarEventoRecursivo(indice + 1, name, code);
    }

    public boolean CrearEventoDeportivo(String codigo, String titulo, String desc, Date fecha, double monto, String name, String equipo1, String equipo2, int cantidad, String TipoDeporte) {
        Date today = new Date();

        if (fecha.before(today)) {
            JOptionPane.showMessageDialog(null, "No puedes planificar un evento en una fecha que ya pasó.");
            return false;
        }

        if (BuscarEvento(codigo, name) == true) {
            JOptionPane.showMessageDialog(null, "Ya existe este evento.");
            return false;
        }

        System.out.println("USUARIOS ACTUALES: " + usuariosArray);

        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            if (usuariosArray.get(indice).getUsuario().equals(name)) {

                if (cantidad <= 20000) {
                    ArrayList<String> jugadoresEquipo1 = new ArrayList<>();
                    ArrayList<String> jugadoresEquipo2 = new ArrayList<>();

                    EventoDeportivo nuevoEvento = new EventoDeportivo(codigo, titulo, desc, fecha, monto, equipo1, equipo2, cantidad, TipoDeporte);
                    nuevoEvento.setEquipo(equipo1, jugadoresEquipo1);
                    nuevoEvento.setEquipo(equipo2, jugadoresEquipo2);

                    usuariosArray.get(indice).AgregarEvento(nuevoEvento);
                    eventos.add(nuevoEvento);

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

    public boolean CrearEventoReligioso(String codigo, String titulo, String desc, Date fecha, double monto, String name, double seguro, int cantidad) {

        Date today = new Date();

        if (fecha.before(today)) {
            JOptionPane.showMessageDialog(null, "No puedes planificar un evento en una fecha que ya pasó.");
            return false;
        }

        if (BuscarEvento(codigo, name) == true) {
            JOptionPane.showMessageDialog(null, "Ya existe este evento.");
            return false;
        }

        System.out.println("USUARIOS ACTUALES: " + usuariosArray);
        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getUsuario().equals(name)) {
                if (cantidad <= 30000) {
                    EventoReligioso nuevoEvento = new EventoReligioso(codigo, titulo, desc, fecha, monto, seguro, cantidad);
                    usuariosArray.get(indice).AgregarEvento(nuevoEvento);
                    eventos.add(nuevoEvento);

                    JOptionPane.showMessageDialog(null, "Se agrego un nuevo evento RELIGIOSO de manera exitosa!");
                    return true;

                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad es muy alta para un evento RELIGIOSO.");
                    return false;
                }
            }
        }
        return false;

    }

    public boolean CrearEventoMusical(String codigo, String titulo, String desc, Date fecha, double monto, String name, double seguro, int cantidad, String tipoMusical) {

        Date today = new Date();

        if (fecha.before(today)) {
            JOptionPane.showMessageDialog(null, "No puedes planificar un evento en una fecha que ya pasó.");
            return false;
        }

        if (BuscarEvento(codigo, name) == true) {
            JOptionPane.showMessageDialog(null, "Ya existe este evento.");
            return false;
        }

        System.out.println("USUARIOS ACTUALES: " + usuariosArray);

        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getUsuario().equals(name)) {
                if (cantidad <= 25000) {
                    EventoMusical nuevoEvento = new EventoMusical(codigo, titulo, desc, fecha, monto, seguro, cantidad, tipoMusical);
                    usuariosArray.get(indice).AgregarEvento(nuevoEvento);
                    eventos.add(nuevoEvento);


                    JOptionPane.showMessageDialog(null, "Se agrego un nuevo evento MUSICAL de manera exitosa!");
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad es muy alta para un evento MUSICAL.");
                    return false;
                }
            }
        }
        return false;

    }

    public void EditarEventoDeportivo(String codigo, String name, String nuevoTitulo, String nuevaDesc, Date nuevaFecha, int nuevaCantidad, double nuevoMonto, String equipo1, String equipo2, String tipoDeporte, ArrayList<String> jugadores1, ArrayList<String> jugadores2) {
        boolean eventoEncontrado = BuscarEvento(name, codigo);

        if (eventoEncontrado) {
            for (int indice = 0; indice < usuariosArray.size(); indice++) {
                if (usuariosArray.get(indice).getUsuario().equals(name)) {
                    ArrayList<Evento> eventos1 = usuariosArray.get(indice).getListaEventos();

                    for (Evento evento : eventos1) {
                        if (evento instanceof EventoDeportivo && evento.getCodigo().equals(codigo)) {
                            EventoDeportivo deportivoEvento = (EventoDeportivo) evento;
                            deportivoEvento.setTitulo(nuevoTitulo);
                            deportivoEvento.setDescripcion(nuevaDesc);
                            deportivoEvento.setFecha(nuevaFecha);
                            deportivoEvento.setMonto(nuevoMonto);
                            deportivoEvento.setEquipo1(equipo1);
                            deportivoEvento.setEquipo2(equipo2);
                            deportivoEvento.addJugadores(equipo1, jugadores1);
                            deportivoEvento.addJugadores(equipo2, jugadores2);
                            deportivoEvento.setTipoDeporte(tipoDeporte);

                            if (nuevaCantidad > 20000) {
                                JOptionPane.showMessageDialog(null, "La cantidad no es valida.");
                                return;
                            } else {
                                deportivoEvento.setCantidad(nuevaCantidad);
                            }

                            Date today = new Date();

                            if (nuevaFecha.before(today)) {
                                JOptionPane.showMessageDialog(null, "No puedes planificar un evento en una fecha que ya pasó.");
                                return;
                            }

                            JOptionPane.showMessageDialog(null, "Evento DEPORTIVO con el codigo [" + codigo + "] editado exitosamente.");
                            return;
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "No se encontró el evento DEPORTIVO para editar.");
        }
    }

    public void EditarEventoReligioso(String codigo, String name, String nuevoTitulo, String nuevaDesc, Date nuevaFecha, double nuevoMonto, int nuevaCantidad, ArrayList<String> participantes) {
        boolean eventoEncontrado = BuscarEvento(name, codigo);

        if (eventoEncontrado) {
            for (int indice = 0; indice < usuariosArray.size(); indice++) {
                if (usuariosArray.get(indice).getUsuario().equals(name)) {
                    ArrayList<Evento> eventos1 = usuariosArray.get(indice).getListaEventos();

                    for (Evento evento : eventos1) {
                        if (evento instanceof EventoReligioso && evento.getCodigo().equals(codigo)) {
                            EventoReligioso religiosoEvento = (EventoReligioso) evento;
                            religiosoEvento.setTitulo(nuevoTitulo);
                            religiosoEvento.setDescripcion(nuevaDesc);
                            religiosoEvento.setFecha(nuevaFecha);
                            religiosoEvento.setMonto(nuevoMonto);
                            double seguro = nuevoMonto * 0.30;
                            religiosoEvento.setSeguro(seguro);
                            religiosoEvento.setSeguro(seguro);
                            religiosoEvento.setParticipantes(participantes);

                            if (nuevaCantidad > 30000) {
                                JOptionPane.showMessageDialog(null, "La cantidad no es valida.");
                                return;
                            } else {
                                religiosoEvento.setCantidad(nuevaCantidad);
                            }

                            Date today = new Date();

                            if (nuevaFecha.before(today)) {
                                JOptionPane.showMessageDialog(null, "No puedes planificar un evento en una fecha que ya pasó.");
                                return;
                            }

                            JOptionPane.showMessageDialog(null, "Evento RELIGIOSO con el codigo [" + codigo + "] editado exitosamente.");
                            return;
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "No se encontró el evento RELIGIOSO para editar.");
        }
    }

    public void EditarEventoMusical(String codigo, String name, String nuevoTitulo, String nuevaDesc, Date nuevaFecha, double nuevoMonto, String tipoMusical, int nuevaCantidad, HashMap<String, String> miembrosInstrumentos) {
        boolean eventoEncontrado = BuscarEvento(name, codigo);

        if (eventoEncontrado) {
            for (Usuario usuario : usuariosArray) {
                if (usuario.getUsuario().equals(name)) {
                    for (Evento evento : usuario.getListaEventos()) {
                        if (evento instanceof EventoMusical && evento.getCodigo().equals(codigo)) {
                            EventoMusical musicalEvento = (EventoMusical) evento;
                            musicalEvento.setTitulo(nuevoTitulo);
                            musicalEvento.setDescripcion(nuevaDesc);
                            musicalEvento.setFecha(nuevaFecha);
                            musicalEvento.setMonto(nuevoMonto);
                            double seguro = 2000;
                            musicalEvento.setSeguro(seguro);
                            musicalEvento.setTipoMusical(tipoMusical);
                            musicalEvento.setMembersAndInstruments(miembrosInstrumentos);

                            if (nuevaCantidad > 25000) {
                                JOptionPane.showMessageDialog(null, "La cantidad no es válida.");
                                return;
                            } else {
                                musicalEvento.setCantidad(nuevaCantidad);
                            }

                            Date today = new Date();

                            if (nuevaFecha.before(today)) {
                                JOptionPane.showMessageDialog(null, "No puedes planificar un evento en una fecha que ya pasó.");
                                return;
                            }

                            JOptionPane.showMessageDialog(null, "Evento MUSICAL con el código [" + codigo + "] editado exitosamente.");
                            return;
                        }
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "No se encontró el evento MUSICAL para editar.");
        }
    }

    public void EliminarEvento(String codigo, String name, String password) {

        boolean eventoEncontrado = BuscarEvento(name, codigo);

        for (Evento eventoCancelado : eventosCancelados) {
            if (eventoCancelado.getCodigo().equals(codigo)) {
                JOptionPane.showMessageDialog(null, "Este evento ya fue cancelado.");
                return;
            }
        }

        if (eventoEncontrado) {

            for (int indice = 0; indice < usuariosArray.size(); indice++) {
                if (usuariosArray.get(indice).getUsuario().equals(name)) {
                    if (usuariosArray.get(indice).getContraseña().equals(password)) {
                        ArrayList<Evento> eventos3 = usuariosArray.get(indice).getListaEventos();

                        for (Evento evento : eventos3) {
                            if (evento.getCodigo().equals(codigo)) {
                                Calendar today = Calendar.getInstance();
                                Calendar eventDate = Calendar.getInstance();
                                eventDate.setTime(evento.getFecha());

                                if ((today.get(Calendar.DAY_OF_YEAR) == eventDate.get(Calendar.DAY_OF_YEAR) - 1) && !(evento instanceof EventoReligioso)) {
                                    pagoCancelar = evento.getMonto() * 0.5;
                                    JOptionPane.showMessageDialog(null, "Se está cancelando el evento un día antes. Su pago por cancelar será de: " + pagoCancelar);
                                }

                                eventosCancelados.add(evento);
                                
                                eventos.remove(evento);

                                JOptionPane.showMessageDialog(null, "Evento con código [" + codigo + "] eliminado exitosamente.");
                                return;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña proporcionada no es válida. No tiene permisos para eliminar el evento.");
                        return;
                    }
                }
            }

        }

        JOptionPane.showMessageDialog(null, "No se encontró el evento para cancelar.");

    }

    public StringBuilder verEvento(String code) {

        StringBuilder informacion = new StringBuilder();

        for (Evento evento : eventos) {

            if (evento.getCodigo().equals(code)) {

                if (evento instanceof EventoDeportivo) {

                    EventoDeportivo deportivoEvento = (EventoDeportivo) evento;

                    informacion.append("TIPO DE EVENTO: ").append("DEPORTIVO").append("\n");
                    informacion.append("TITULO: ").append(deportivoEvento.getTitulo()).append("\n");
                    informacion.append("DESCRIPCION: ").append(deportivoEvento.getDescripcion()).append("\n");
                    informacion.append("FECHA: ").append(deportivoEvento.getFecha()).append("\n");
                    informacion.append("MONTO: ").append(deportivoEvento.getMonto()).append("\n");
                    informacion.append("CANTIDAD: ").append(deportivoEvento.getCantidad()).append("\n");
                    informacion.append("TIPO DE DEPORTE: ").append(deportivoEvento.getTipoDeporte()).append("\n");

                    String equipo1Name = deportivoEvento.getEquipo1();
                    ArrayList<String> jugadoresEquipo1 = deportivoEvento.getJugadores(equipo1Name);

                    String equipo2Name = deportivoEvento.getEquipo2();
                    ArrayList<String> jugadoresEquipo2 = deportivoEvento.getJugadores(equipo2Name);

                    informacion.append("EQUIPO 1: ").append(equipo1Name).append("\n");
                    informacion.append("JUGADORES 1: ").append(jugadoresEquipo1).append("\n");
                    informacion.append("EQUIPO 2: ").append(equipo2Name).append("\n");
                    informacion.append("JUGADORES 2: ").append(jugadoresEquipo2).append("\n");

                    informacion.append("STATUS: ").append("ACTIVO").append("\n");

                    return informacion;

                }

                if (evento instanceof EventoReligioso) {
                    EventoReligioso religiosoEvento = (EventoReligioso) evento;
                    informacion.append("TIPO DE EVENTO: ").append("RELIGIOSO").append("\n");
                    informacion.append("TITULO: ").append(religiosoEvento.getTitulo()).append("\n");
                    informacion.append("DESCRIPCION: ").append(religiosoEvento.getDescripcion()).append("\n");
                    informacion.append("FECHA: ").append(religiosoEvento.getFecha()).append("\n");
                    informacion.append("MONTO: ").append(religiosoEvento.getMonto()).append("\n");
                    informacion.append("SEGURO: ").append(religiosoEvento.getSeguro()).append("\n");
                    informacion.append("CANTIDAD: ").append(religiosoEvento.getCantidad()).append("\n");
                    informacion.append("PARTICIPANTES: ").append(religiosoEvento.getParticipantes()).append("\n");

                    informacion.append("STATUS: ").append("ACTIVO").append("\n");

                    return informacion;

                }

                if (evento instanceof EventoMusical) {
                    EventoMusical musicalEvento = (EventoMusical) evento;
                    informacion.append("TIPO DE EVENTO: ").append("MUSICAL").append("\n");
                    informacion.append("TITULO: ").append(musicalEvento.getTitulo()).append("\n");
                    informacion.append("DESCRIPCION: ").append(musicalEvento.getDescripcion()).append("\n");
                    informacion.append("FECHA: ").append(musicalEvento.getFecha()).append("\n");
                    informacion.append("MONTO: ").append(musicalEvento.getMonto()).append("\n");
                    informacion.append("SEGURO: ").append(musicalEvento.getSeguro()).append("\n");
                    informacion.append("CANTIDAD: ").append(musicalEvento.getCantidad()).append("\n");

                    informacion.append("MIEMBROS: ").append(musicalEvento.getMembersAndInstruments()).append("\n");

                    informacion.append("STATUS: ").append("ACTIVO").append("\n");

                    return informacion;

                }
            }
        }

        for (Evento evento : eventosCancelados) {
            indice++;
            if (evento.getCodigo().equals(code)) {

                if (evento instanceof EventoDeportivo) {

                    EventoDeportivo deportivoEvento = (EventoDeportivo) evento;

                    informacion.append("TIPO DE EVENTO: ").append("DEPORTIVO").append("\n");
                    informacion.append("TITULO: ").append(deportivoEvento.getTitulo()).append("\n");
                    informacion.append("DESCRIPCION: ").append(deportivoEvento.getDescripcion()).append("\n");
                    informacion.append("FECHA: ").append(deportivoEvento.getFecha()).append("\n");
                    informacion.append("MONTO: ").append(deportivoEvento.getMonto()).append("\n");
                    informacion.append("CANTIDAD: ").append(deportivoEvento.getCantidad()).append("\n");
                    informacion.append("TIPO DE DEPORTE: ").append(deportivoEvento.getTipoDeporte()).append("\n");

                    String equipo1Name = deportivoEvento.getEquipo1();
                    ArrayList<String> jugadoresEquipo1 = deportivoEvento.getJugadores(equipo1Name);

                    String equipo2Name = deportivoEvento.getEquipo2();
                    ArrayList<String> jugadoresEquipo2 = deportivoEvento.getJugadores(equipo2Name);

                    informacion.append("EQUIPO 1: ").append(equipo1Name).append("\n");
                    informacion.append("JUGADORES 1: ").append(jugadoresEquipo1).append("\n");
                    informacion.append("EQUIPO 2: ").append(equipo2Name).append("\n");
                    informacion.append("JUGADORES 2: ").append(jugadoresEquipo2).append("\n");
                    informacion.append("STATUS: ").append("CANCELADO").append("\n");
                    informacion.append("MONTO A PAGAR: ").append(pagoCancelar).append("\n");

                    return informacion;

                }

                if (evento instanceof EventoReligioso) {
                    EventoReligioso religiosoEvento = (EventoReligioso) evento;
                    informacion.append("TIPO DE EVENTO: ").append("RELIGIOSO").append("\n");
                    informacion.append("TITULO: ").append(religiosoEvento.getTitulo()).append("\n");
                    informacion.append("DESCRIPCION: ").append(religiosoEvento.getDescripcion()).append("\n");
                    informacion.append("FECHA: ").append(religiosoEvento.getFecha()).append("\n");
                    informacion.append("MONTO: ").append(religiosoEvento.getMonto()).append("\n");
                    informacion.append("SEGURO: ").append(religiosoEvento.getSeguro()).append("\n");
                    informacion.append("CANTIDAD: ").append(religiosoEvento.getCantidad()).append("\n");
                    informacion.append("PARTICIPANTES: ").append(religiosoEvento.getParticipantes()).append("\n");

                    informacion.append("STATUS: ").append("CANCELADO").append("\n");
                    informacion.append("MONTO A PAGAR: ").append(pagoCancelar).append("\n");

                    return informacion;

                }

                if (evento instanceof EventoMusical) {
                    EventoMusical musicalEvento = (EventoMusical) evento;
                    informacion.append("TIPO DE EVENTO: ").append("MUSICAL").append("\n");
                    informacion.append("TITULO: ").append(musicalEvento.getTitulo()).append("\n");
                    informacion.append("DESCRIPCION: ").append(musicalEvento.getDescripcion()).append("\n");
                    informacion.append("FECHA: ").append(musicalEvento.getFecha()).append("\n");
                    informacion.append("MONTO: ").append(musicalEvento.getMonto()).append("\n");
                    informacion.append("SEGURO: ").append(musicalEvento.getSeguro()).append("\n");
                    informacion.append("CANTIDAD: ").append(musicalEvento.getCantidad()).append("\n");

                    informacion.append("MIEMBROS: ").append(musicalEvento.getMembersAndInstruments()).append("\n");

                    informacion.append("STATUS: ").append("CANCELADO").append("\n");
                    informacion.append("MUKTA A PAGAR: ").append(pagoCancelar).append("\n");

                    return informacion;

                }

            }

        }

        return null;
    }

    public static String generateRandomCode() {
        UUID uuid = UUID.randomUUID();
        return "EVT" + uuid.toString().toUpperCase().replaceAll("-", "").substring(0, 6);
    }

}
