/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.Evento;
import EVENTOS_USUARIOS.EventoMusical;
import EVENTOS_USUARIOS.EventoMusical.TipoMusical;
import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class DetallesMusical extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private String codigoEvento;
    private EventosMetodos funcionEvento;
    private EventoMusical eventoMusical;
    String tipoMusical;

    public DetallesMusical(String name, EventosMetodos EventoFuncion, String codigoEvento) {
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        this.codigoEvento = codigoEvento;
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        initComponents();

        setLocationRelativeTo(null);
        
        String miembro;
        String instrumento;

        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            if (usuariosArray.get(indice).getUsuario().equals(name)) {

                ArrayList<Evento> eventos = usuariosArray.get(indice).getListaEventos();
                for (Evento evento : eventos) {
                    if (evento.getCodigo().equals(codigoEvento)) {
                        EventoMusical musicalEvento = (EventoMusical) evento;
                        tipoMusical = musicalEvento.getTipoMusical();
                        jComboBox1.setSelectedItem(tipoMusical);

                        for (HashMap.Entry<String, String> entry : musicalEvento.getMembersAndInstruments().entrySet()) {
                            miembro = entry.getKey();
                            instrumento = entry.getValue();

                            miembro = musicalEvento.getMiembro(indice);

                            if (MiembrosTextbox1.getText().isEmpty()) {
                                MiembrosTextbox1.setText(miembro);
                                InstrumentosTextbox1.setText(instrumento);
                            } else if (MiembrosTextbox2.getText().isEmpty()) {
                                MiembrosTextbox2.setText(miembro);
                                InstrumentosTextbox2.setText(instrumento);
                            } else if (MiembrosTextbox3.getText().isEmpty()) {
                                MiembrosTextbox3.setText(miembro);
                                InstrumentosTextbox3.setText(instrumento);
                            }
                            if (MiembrosTextbox4.getText().isEmpty()) {
                                MiembrosTextbox4.setText(miembro);
                                InstrumentosTextbox4.setText(instrumento);
                            }
                            if (MiembrosTextbox5.getText().isEmpty()) {
                                MiembrosTextbox5.setText(miembro);
                                InstrumentosTextbox5.setText(instrumento);
                            }
                        }
                    }

                }
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegresarBTN = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        InstrumentosTextbox5 = new javax.swing.JTextField();
        InstrumentosTextbox4 = new javax.swing.JTextField();
        InstrumentosTextbox3 = new javax.swing.JTextField();
        InstrumentosTextbox2 = new javax.swing.JTextField();
        InstrumentosTextbox1 = new javax.swing.JTextField();
        MiembrosTextbox1 = new javax.swing.JTextField();
        MiembrosTextbox4 = new javax.swing.JTextField();
        MiembrosTextbox3 = new javax.swing.JTextField();
        MiembrosTextbox2 = new javax.swing.JTextField();
        MiembrosTextbox5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 480, 50));

        jComboBox1.setBackground(new java.awt.Color(245, 245, 245));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new DefaultComboBoxModel<>(TipoMusical.values()));
        jComboBox1.setBorder(null);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 240, 30));

        InstrumentosTextbox5.setBackground(new java.awt.Color(245, 245, 245));
        InstrumentosTextbox5.setForeground(new java.awt.Color(0, 0, 0));
        InstrumentosTextbox5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(InstrumentosTextbox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 232, 30));

        InstrumentosTextbox4.setBackground(new java.awt.Color(245, 245, 245));
        InstrumentosTextbox4.setForeground(new java.awt.Color(0, 0, 0));
        InstrumentosTextbox4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(InstrumentosTextbox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 232, 40));

        InstrumentosTextbox3.setBackground(new java.awt.Color(245, 245, 245));
        InstrumentosTextbox3.setForeground(new java.awt.Color(0, 0, 0));
        InstrumentosTextbox3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(InstrumentosTextbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 232, 40));

        InstrumentosTextbox2.setBackground(new java.awt.Color(245, 245, 245));
        InstrumentosTextbox2.setForeground(new java.awt.Color(0, 0, 0));
        InstrumentosTextbox2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(InstrumentosTextbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 193, 232, 40));

        InstrumentosTextbox1.setBackground(new java.awt.Color(245, 245, 245));
        InstrumentosTextbox1.setForeground(new java.awt.Color(0, 0, 0));
        InstrumentosTextbox1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(InstrumentosTextbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 232, 30));

        MiembrosTextbox1.setBackground(new java.awt.Color(245, 245, 245));
        MiembrosTextbox1.setForeground(new java.awt.Color(0, 0, 0));
        MiembrosTextbox1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MiembrosTextbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 134, 232, 43));

        MiembrosTextbox4.setBackground(new java.awt.Color(245, 245, 245));
        MiembrosTextbox4.setForeground(new java.awt.Color(0, 0, 0));
        MiembrosTextbox4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MiembrosTextbox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 232, 43));

        MiembrosTextbox3.setBackground(new java.awt.Color(245, 245, 245));
        MiembrosTextbox3.setForeground(new java.awt.Color(0, 0, 0));
        MiembrosTextbox3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MiembrosTextbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 232, 40));

        MiembrosTextbox2.setBackground(new java.awt.Color(245, 245, 245));
        MiembrosTextbox2.setForeground(new java.awt.Color(0, 0, 0));
        MiembrosTextbox2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MiembrosTextbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 193, 232, 40));

        MiembrosTextbox5.setBackground(new java.awt.Color(245, 245, 245));
        MiembrosTextbox5.setForeground(new java.awt.Color(0, 0, 0));
        MiembrosTextbox5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MiembrosTextbox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 383, 232, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_EditarMusical.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed

        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            if (usuariosArray.get(indice).getUsuario().equals(name)) {

                ArrayList<Evento> eventos = usuariosArray.get(indice).getListaEventos();
                for (Evento evento : eventos) {
                    if (evento.getCodigo().equals(codigoEvento)) {
                        eventoMusical = (EventoMusical) evento;
                    }
                }
            }
        }

        Object selectedItem = jComboBox1.getSelectedItem();
        tipoMusical = (selectedItem != null) ? selectedItem.toString() : null;

        HashMap<String, String> miembrosInstrumentos = new HashMap<>();

        String instrumento = InstrumentosTextbox1.getText();

        String miembro = MiembrosTextbox1.getText();

        if (!instrumento.isEmpty() && !miembro.isEmpty()) {
            eventoMusical.setmiembrosInstruments(miembro, instrumento);

        }

        instrumento = InstrumentosTextbox2.getText();

        miembro = MiembrosTextbox2.getText();

        if (!instrumento.isEmpty() && !miembro.isEmpty()) {
            eventoMusical.setmiembrosInstruments(miembro, instrumento);

        }

        instrumento = InstrumentosTextbox3.getText();

        miembro = MiembrosTextbox3.getText();

        if (!instrumento.isEmpty() && !miembro.isEmpty()) {
            eventoMusical.setmiembrosInstruments(miembro, instrumento);

        }

        instrumento = InstrumentosTextbox4.getText();

        miembro = MiembrosTextbox4.getText();

        if (!instrumento.isEmpty() && !miembro.isEmpty()) {
            eventoMusical.setmiembrosInstruments(miembro, instrumento);

        }

        instrumento = InstrumentosTextbox5.getText();

        miembro = MiembrosTextbox5.getText();

        if (!instrumento.isEmpty() && !miembro.isEmpty()) {
            miembrosInstrumentos.put(miembro, instrumento);

        }

        System.out.println("Miembros: " + miembrosInstrumentos.keySet() + "\nInstrumentos:" + miembrosInstrumentos.values() + "\ntipoMusical:" + tipoMusical);
        
        EditarEvento_AdminContenido.miembrosInstrumentos=eventoMusical.getMembersAndInstruments();
        
        if ((!MiembrosTextbox1.getText().isEmpty() && !InstrumentosTextbox1.getText().isEmpty())
                || (!MiembrosTextbox2.getText().isEmpty() && !InstrumentosTextbox2.getText().isEmpty())
                || (!MiembrosTextbox3.getText().isEmpty() && !InstrumentosTextbox3.getText().isEmpty())
                || (!MiembrosTextbox4.getText().isEmpty() && !InstrumentosTextbox4.getText().isEmpty())
                || (!MiembrosTextbox5.getText().isEmpty() && !InstrumentosTextbox5.getText().isEmpty())) {
            
            this.dispose();
            
        } else {

            JOptionPane.showMessageDialog(null, "Por favor, insertar minimo UN miembro con su respectivo cargo/instrumento.");
        }
    }//GEN-LAST:event_RegresarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(DetallesMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesMusical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesMusical("", new EventosMetodos(), "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InstrumentosTextbox1;
    private javax.swing.JTextField InstrumentosTextbox2;
    private javax.swing.JTextField InstrumentosTextbox3;
    private javax.swing.JTextField InstrumentosTextbox4;
    private javax.swing.JTextField InstrumentosTextbox5;
    private javax.swing.JTextField MiembrosTextbox1;
    private javax.swing.JTextField MiembrosTextbox2;
    private javax.swing.JTextField MiembrosTextbox3;
    private javax.swing.JTextField MiembrosTextbox4;
    private javax.swing.JTextField MiembrosTextbox5;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JComboBox<TipoMusical> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
