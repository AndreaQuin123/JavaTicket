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
import SWING.CALENDARIO.CalendarioPanel;
import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class EditarEvento_AdminContenido extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private String codigoEvento;
    private UsuariosMetodos funcionUsuario;
    public static String equipo1;
    public static String equipo2;
    public static ArrayList<String> jugadores1;
    public static ArrayList<String> jugadores2;
    public static String tipoDeporte;
    public static String tipoMusical;
    public static ArrayList<String> partipantes;
    public static HashMap<String, String> miembrosInstruments;
    public static String miembro;
    public static String instrumento;

    private ArrayList<Evento> eventos;

    private EventosMetodos funcionEvento;
    public static Date selectedDate;

    public EditarEvento_AdminContenido(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, String codigoEvento) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        this.name = name;
        this.codigoEvento = codigoEvento;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();

        initComponents();

        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getUsuario().equals(name)) {
                for (Evento evento : eventos) {
                    if (evento.getCodigo().equals(codigoEvento)) {
                        CantidadTextbox.setText(String.valueOf(evento.getCantidad()));
                        DescTextArea.setText(evento.getDescripcion());
                        FechaTextbox.setText(evento.getFecha().toString());
                        MontoTextbox.setText(String.valueOf(evento.getMonto()));
                        TituloTextbox.setText(evento.getTitulo());
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        EditarDetallesBTN = new javax.swing.JButton();
        ConfirmarBTN = new javax.swing.JButton();
        RegresarBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescTextArea = new javax.swing.JTextArea();
        MontoTextbox = new javax.swing.JTextField();
        FechaTextbox = new javax.swing.JTextField();
        TituloTextbox = new javax.swing.JTextField();
        CantidadTextbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(214, 215, 226));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 36, 95));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANTIDAD:");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 120, 120, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/STAR_Calendar (2).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(470, 250, 30, 30);

        EditarDetallesBTN.setContentAreaFilled(false);
        EditarDetallesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarDetallesBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EditarDetallesBTN);
        EditarDetallesBTN.setBounds(490, 370, 230, 50);

        ConfirmarBTN.setContentAreaFilled(false);
        ConfirmarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmarBTN);
        ConfirmarBTN.setBounds(250, 370, 200, 50);

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN);
        RegresarBTN.setBounds(20, 470, 180, 50);

        DescTextArea.setBackground(new java.awt.Color(245, 245, 245));
        DescTextArea.setColumns(20);
        DescTextArea.setRows(5);
        DescTextArea.setBorder(null);
        jScrollPane1.setViewportView(DescTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(568, 160, 230, 170);

        MontoTextbox.setBackground(new java.awt.Color(245, 245, 245));
        MontoTextbox.setForeground(new java.awt.Color(0, 0, 0));
        MontoTextbox.setBorder(null);
        getContentPane().add(MontoTextbox);
        MontoTextbox.setBounds(280, 310, 220, 30);

        FechaTextbox.setBackground(new java.awt.Color(245, 245, 245));
        FechaTextbox.setForeground(new java.awt.Color(0, 0, 0));
        FechaTextbox.setBorder(null);
        getContentPane().add(FechaTextbox);
        FechaTextbox.setBounds(280, 250, 220, 30);

        TituloTextbox.setBackground(new java.awt.Color(245, 245, 245));
        TituloTextbox.setForeground(new java.awt.Color(0, 0, 0));
        TituloTextbox.setBorder(null);
        getContentPane().add(TituloTextbox);
        TituloTextbox.setBounds(280, 190, 220, 30);

        CantidadTextbox.setEditable(false);
        CantidadTextbox.setBackground(new java.awt.Color(245, 245, 245));
        CantidadTextbox.setForeground(new java.awt.Color(0, 0, 0));
        CantidadTextbox.setBorder(null);
        getContentPane().add(CantidadTextbox);
        CantidadTextbox.setBounds(280, 130, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_EditarEventos.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed
        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "Desea regresar al menu principal?", "REGRESAR AL MENU", JOptionPane.YES_NO_OPTION);

        if (usuarioEleccion == JOptionPane.YES_OPTION) {

            MainMenu_Admin pasar = new MainMenu_Admin(usuariosArray, name, funcionUsuario);
            pasar.setVisible(true);
            this.setVisible(false);

        } else if (usuarioEleccion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }
    }//GEN-LAST:event_RegresarBTNActionPerformed

    private void ConfirmarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarBTNActionPerformed
        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getUsuario().equals(name)) {
                ArrayList<Evento> eventos = usuariosArray.get(indice).getListaEventos();
                for (Evento evento : eventos) {
                    if (evento.getCodigo().equals(codigoEvento)) {
                        if (evento instanceof EventoDeportivo) {
                            String nuevoDesc = DescTextArea.getText();
                            String nuevaCantidad = CantidadTextbox.getText();
                            String nuevoMonto = MontoTextbox.getText();
                            String nuevoTitulo = TituloTextbox.getText();

                            try {
                                int nuevaCantidadINT = Integer.parseInt(nuevaCantidad);
                                double nuevaMontoINT = Double.parseDouble(nuevoMonto);

                                if (equipo1 != null || equipo2 != null || jugadores1 != null || jugadores2 != null) {
                                    funcionEvento.EditarEventoDeportivo(codigoEvento, name, nuevoTitulo, nuevoDesc, selectedDate, nuevaCantidadINT, nuevaMontoINT, equipo1, equipo2, tipoDeporte, jugadores1, jugadores2);
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se han llenado los detalles.");
                                }
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Cantidad y Monto deben ser números válidos.");
                            }
                        }

                        if (evento instanceof EventoReligioso) {
                            String nuevoDesc = DescTextArea.getText();
                            String nuevaCantidad = CantidadTextbox.getText();
                            String nuevoMonto = MontoTextbox.getText();
                            String nuevoTitulo = TituloTextbox.getText();

                            try {
                                int nuevaCantidadINT = Integer.parseInt(nuevaCantidad);
                                double nuevaMontoDouble = Double.parseDouble(nuevoMonto);

                                funcionEvento.EditarEventoReligioso(codigoEvento, name, nuevoTitulo, nuevoDesc, selectedDate, nuevaMontoDouble, nuevaCantidadINT);

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Cantidad y Monto deben ser números válidos.");
                            }
                        }

                        if (evento instanceof EventoMusical) {
                            String nuevoDesc = DescTextArea.getText();
                            String nuevaCantidad = CantidadTextbox.getText();
                            String nuevoMonto = MontoTextbox.getText();
                            String nuevoTitulo = TituloTextbox.getText();

                            try {
                                int nuevaCantidadINT = Integer.parseInt(nuevaCantidad);
                                double nuevaMontoINT = Double.parseDouble(nuevoMonto);

                                funcionEvento.EditarEventoMusical(codigoEvento, name, nuevoTitulo, nuevoDesc, selectedDate, nuevaMontoINT, tipoMusical, nuevaCantidadINT);

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Cantidad y Monto deben ser números válidos.");
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_ConfirmarBTNActionPerformed

    private void EditarDetallesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarDetallesBTNActionPerformed
        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            if (usuariosArray.get(indice).getUsuario().equals(name)) {

                ArrayList<Evento> eventos = usuariosArray.get(indice).getListaEventos();

                for (Evento evento : eventos) {
                    if (evento.getCodigo().equals(codigoEvento)) {

                        if (evento instanceof EventoDeportivo) {

                            DetallesDeportivo pasar = new DetallesDeportivo(name, funcionEvento, codigoEvento);
                            pasar.setVisible(true);
                            pasar.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                            if (evento instanceof EventoMusical) {

                                DetallesMusical pasar1 = new DetallesMusical(name, funcionEvento, codigoEvento);
                                pasar1.setVisible(true);
                                pasar1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                            }

                            if (evento instanceof EventoReligioso) {

                                DetallesReligioso pasar2 = new DetallesReligioso(name, funcionEvento, codigoEvento);
                                pasar2.setVisible(true);
                                pasar2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

                            }

                            System.out.println("Si existe y es de ese usuario");

                        }
                    }
                }
                System.out.println("Probable no es de ese usuario");
            }
        }
    }//GEN-LAST:event_EditarDetallesBTNActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        JFrame frame = new JFrame();
        CalendarioPanel calendar = new CalendarioPanel(0, 0, usuariosArray, "", funcionUsuario);
        CustomDatePickerDialog dialog = new CustomDatePickerDialog(frame);

        dialog.setVisible(true);

        System.out.println(selectedDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yy");

        if (selectedDate != null) {
            System.out.println("No esta null.");

            int usuarioEleccion = JOptionPane.showConfirmDialog(
                    null,
                    "Desea elegir " + dateFormat.format(selectedDate) + " como su fecha para el evento?",
                    "ELEGIR FECHA",
                    JOptionPane.YES_NO_OPTION
            );

            if (usuarioEleccion == JOptionPane.YES_OPTION) {
                System.out.println(selectedDate);
                FechaTextbox.setText(dateFormat.format(selectedDate));
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Se canceló la operación.");
                frame.dispose();
            }
        } else {
            System.out.println("esta null");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(EditarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEvento_AdminContenido(new ArrayList<Usuario>(), "", new UsuariosMetodos(), "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantidadTextbox;
    private javax.swing.JButton ConfirmarBTN;
    private javax.swing.JTextArea DescTextArea;
    private javax.swing.JButton EditarDetallesBTN;
    private javax.swing.JTextField FechaTextbox;
    private javax.swing.JTextField MontoTextbox;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JTextField TituloTextbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
