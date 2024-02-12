/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.Evento;
import EVENTOS_USUARIOS.EventoDeportivo;
import EVENTOS_USUARIOS.EventoMusical;
import EVENTOS_USUARIOS.EventoReligioso;
import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vanes
 */
public class REPORTES_EventosCancelados extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;
    public static ArrayList<Evento> eventosCancelar;
    StringBuilder eventosCancelados = new StringBuilder();

    public REPORTES_EventosCancelados(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        initComponents();

        int indice = 0;

        Date today = new Date();

        for (Usuario usuario : usuariosArray) {
            for (Evento evento : usuario.getListaEventos()) {
                if (evento.getFecha().before(today)) {
                    indice++;

                    eventosCancelados.append(indice).append(") ");
                    eventosCancelados.append("Codigo: ").append(evento.getCodigo()).append(" - ");

                    if (evento instanceof EventoDeportivo) {
                        EventoDeportivo deportivoEvento = (EventoDeportivo) evento;

                        eventosCancelados.append("Tipo: ").append(deportivoEvento.getTipoDeporte()).append(" - ");
                        eventosCancelados.append("Titulo: ").append(deportivoEvento.getTitulo()).append(" - ");
                        eventosCancelados.append("Fecha: ").append(deportivoEvento.getFecha()).append(" - ");
                        eventosCancelados.append("Monto: ").append(deportivoEvento.getMonto()).append("\n");
                    }

                    if (evento instanceof EventoMusical) {
                        EventoMusical musicalEvento = (EventoMusical) evento;

                        eventosCancelados.append("Tipo: ").append(musicalEvento.getTipoMusical()).append(" - ");
                        eventosCancelados.append("Titulo: ").append(musicalEvento.getTitulo()).append(" - ");
                        eventosCancelados.append("Fecha: ").append(musicalEvento.getFecha()).append(" - ");
                        eventosCancelados.append("Monto: ").append(musicalEvento.getMonto()).append("\n");
                    }

                    if (evento instanceof EventoReligioso) {
                        EventoReligioso religiosoEvento = (EventoReligioso) evento;

                        eventosCancelados.append("Titulo: ").append(religiosoEvento.getTitulo()).append(" - ");
                        eventosCancelados.append("Fecha: ").append(religiosoEvento.getFecha()).append(" - ");
                        eventosCancelados.append("Monto: ").append(religiosoEvento.getMonto()).append("\n");
                    }

                }
            }
        }

        Eventos.setText(eventosCancelados.toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eventos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Eventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_ListaEventosCancelados.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Eventos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Eventos)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(REPORTES_EventosCancelados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REPORTES_EventosCancelados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REPORTES_EventosCancelados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REPORTES_EventosCancelados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REPORTES_EventosCancelados(new ArrayList<Usuario>(), "", new UsuariosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eventos;
    // End of variables declaration//GEN-END:variables
}
