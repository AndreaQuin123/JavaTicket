package SWING;

import EVENTOS_USUARIOS.Evento;
import EVENTOS_USUARIOS.EventoDeportivo;
import EVENTOS_USUARIOS.EventoMusical;
import EVENTOS_USUARIOS.EventoReligioso;
import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import SWING.PIECHART.DynamicPieChart;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class REPORTES_EventosFuturos extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;
    public static ArrayList<Evento> eventosCancelados;
    public static ArrayList<Evento> eventos;

    StringBuilder eventosRealizados = new StringBuilder();
    int montoDeportivo = 0;
    int montoReligioso = 0;
    int montoMusical = 0;

    int indice = 0;

    public REPORTES_EventosFuturos(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        eventosCancelados = funcionEvento.eventosCancelados();
        eventos = funcionEvento.eventos();

        if (eventos == null) {
            eventos = new ArrayList<Evento>();
        }

        if (eventosCancelados == null) {
            eventosCancelados = new ArrayList<Evento>();
        }

        initComponents();

        setLocationRelativeTo(null);

        Date today = new Date();

        for (Evento evento : eventos) {
            if (evento.getFecha().after(today)) {
                indice++;

                eventosRealizados.append(indice).append(") ");
                eventosRealizados.append("Codigo: ").append(evento.getCodigo()).append(" - ");

                if (evento instanceof EventoDeportivo) {
                    EventoDeportivo deportivoEvento = (EventoDeportivo) evento;

                    eventosRealizados.append("Tipo de Evento: ").append("DEPORTIVO").append(" - ");
                    eventosRealizados.append("Tipo: ").append(deportivoEvento.getTipoDeporte()).append(" - ");
                    eventosRealizados.append("Titulo: ").append(deportivoEvento.getTitulo()).append(" - ");
                    eventosRealizados.append("Fecha: ").append(deportivoEvento.getFecha()).append(" - ");
                    eventosRealizados.append("Monto: ").append(deportivoEvento.getMonto()).append("\n");

                    montoDeportivo++;
                }

                if (evento instanceof EventoMusical) {
                    EventoMusical musicalEvento = (EventoMusical) evento;

                    eventosRealizados.append("Tipo de Evento: ").append("MUSICAL").append(" - ");
                    eventosRealizados.append("Tipo: ").append(musicalEvento.getTipoMusical()).append(" - ");
                    eventosRealizados.append("Titulo: ").append(musicalEvento.getTitulo()).append(" - ");
                    eventosRealizados.append("Fecha: ").append(musicalEvento.getFecha()).append(" - ");
                    eventosRealizados.append("Monto: ").append(musicalEvento.getMonto()).append("\n");

                    montoMusical++;
                }

                if (evento instanceof EventoReligioso) {
                    EventoReligioso religiosoEvento = (EventoReligioso) evento;

                    eventosRealizados.append("Tipo de Evento: ").append("RELIGIOSO").append(" - ");
                    eventosRealizados.append("Titulo: ").append(religiosoEvento.getTitulo()).append(" - ");
                    eventosRealizados.append("Fecha: ").append(religiosoEvento.getFecha()).append(" - ");
                    eventosRealizados.append("Monto: ").append(religiosoEvento.getMonto()).append("\n");
                    
                    montoReligioso++;
                }

            }
        }
        Eventos.setText(eventosRealizados.toString());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegresarBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Eventos = new javax.swing.JTextArea();
        ListaEventos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 50));

        jButton1.setBackground(new java.awt.Color(200, 200, 200));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/graph_ICON (3) (1).png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 200, 100, 80));

        Eventos.setEditable(false);
        Eventos.setBackground(new java.awt.Color(245, 245, 245));
        Eventos.setColumns(20);
        Eventos.setRows(5);
        Eventos.setBorder(null);
        jScrollPane1.setViewportView(Eventos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 630, 330));

        ListaEventos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_ListaEventosFUTUROS.png"))); // NOI18N
        getContentPane().add(ListaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        jButton1.setToolTipText("Graficos en relacion al monto de eventos y sus tipos.");
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    try {
        DynamicPieChart grafico = new DynamicPieChart("EVENTOS FUTUROS - GRAFICO", new int[]{montoDeportivo, montoReligioso, montoMusical});
        grafico.setVisible(true);
        grafico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed
        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "Desea regresar al menu de REPORTES?", "REGRESAR AL MENU", JOptionPane.YES_NO_OPTION);

        if (usuarioEleccion == JOptionPane.YES_OPTION) {

            REPORTES_MENU pasar = new REPORTES_MENU(usuariosArray, name, funcionUsuario);
            pasar.setVisible(true);
            this.setVisible(false);

        } else if (usuarioEleccion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }
    }//GEN-LAST:event_RegresarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(REPORTES_EventosFuturos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REPORTES_EventosFuturos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REPORTES_EventosFuturos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REPORTES_EventosFuturos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REPORTES_EventosFuturos(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Eventos;
    private javax.swing.JLabel ListaEventos;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
