package SWING;

import EVENTOS_USUARIOS.Evento;
import EVENTOS_USUARIOS.EventoReligioso;
import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DetallesReligioso extends javax.swing.JFrame {
    private ArrayList<Usuario> usuariosArray;
    private String name;
    private String codigoEvento;
    private EventoReligioso eventoReligioso;
    private EventosMetodos funcionEvento;

    public DetallesReligioso(String name, EventosMetodos EventoFuncion, String codigoEvento) {
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        this.codigoEvento = codigoEvento;
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        initComponents();

        String participante;

        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            if (usuariosArray.get(indice).getUsuario().equals(name)) {

                ArrayList<Evento> eventos = usuariosArray.get(indice).getListaEventos();
                for (Evento evento : eventos) {
                    if (evento.getCodigo().equals(codigoEvento)) {
                        eventoReligioso = (EventoReligioso) evento;
                        
                        for (String entry : eventoReligioso.getParticipantes()) {
                            participante = entry;

                            if (ParticipantesTextbox1.getText().isEmpty()) {
                                ParticipantesTextbox1.setText(participante);
                            } else if (ParticipantesTextbox2.getText().isEmpty()) {
                                ParticipantesTextbox2.setText(participante);
                            } else if (ParticipantesTextbox3.getText().isEmpty()) {
                                ParticipantesTextbox3.setText(participante);
                            } else if (ParticipantesTextbox4.getText().isEmpty()) {
                                ParticipantesTextbox4.setText(participante);
                            } else if (ParticipantesTextbox5.getText().isEmpty()) {
                                ParticipantesTextbox5.setText(participante);
                            } else if (ParticipantesTextbox6.getText().isEmpty()) {
                                ParticipantesTextbox6.setText(participante);
                            } else if (ParticipantesTextbox7.getText().isEmpty()) {
                                ParticipantesTextbox7.setText(participante);
                            } else if (ParticipantesTextbox8.getText().isEmpty()) {
                                ParticipantesTextbox8.setText(participante);
                            } else if (ParticipantesTextbox9.getText().isEmpty()) {
                                ParticipantesTextbox9.setText(participante);
                            } else if (ParticipantesTextbox10.getText().isEmpty()) {
                                ParticipantesTextbox10.setText(participante);
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

        ParticipantesTextbox1 = new javax.swing.JTextField();
        ParticipantesTextbox2 = new javax.swing.JTextField();
        ParticipantesTextbox3 = new javax.swing.JTextField();
        ParticipantesTextbox4 = new javax.swing.JTextField();
        ParticipantesTextbox5 = new javax.swing.JTextField();
        ParticipantesTextbox6 = new javax.swing.JTextField();
        ParticipantesTextbox7 = new javax.swing.JTextField();
        ParticipantesTextbox8 = new javax.swing.JTextField();
        ParticipantesTextbox9 = new javax.swing.JTextField();
        ParticipantesTextbox10 = new javax.swing.JTextField();
        RegresarBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ParticipantesTextbox1.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox1.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox1);
        ParticipantesTextbox1.setBounds(190, 83, 260, 40);

        ParticipantesTextbox2.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox2.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox2);
        ParticipantesTextbox2.setBounds(190, 150, 260, 40);

        ParticipantesTextbox3.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox3.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox3);
        ParticipantesTextbox3.setBounds(190, 220, 260, 40);

        ParticipantesTextbox4.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox4.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox4);
        ParticipantesTextbox4.setBounds(190, 290, 260, 40);

        ParticipantesTextbox5.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox5.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox5);
        ParticipantesTextbox5.setBounds(190, 370, 260, 40);

        ParticipantesTextbox6.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox6.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox6);
        ParticipantesTextbox6.setBounds(510, 90, 260, 40);

        ParticipantesTextbox7.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox7.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox7);
        ParticipantesTextbox7.setBounds(510, 150, 260, 40);

        ParticipantesTextbox8.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox8.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox8);
        ParticipantesTextbox8.setBounds(510, 220, 260, 40);

        ParticipantesTextbox9.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox9.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox9);
        ParticipantesTextbox9.setBounds(510, 290, 260, 40);

        ParticipantesTextbox10.setBackground(new java.awt.Color(245, 245, 245));
        ParticipantesTextbox10.setForeground(new java.awt.Color(0, 0, 0));
        ParticipantesTextbox10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ParticipantesTextbox10);
        ParticipantesTextbox10.setBounds(510, 370, 260, 40);

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN);
        RegresarBTN.setBounds(250, 470, 480, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_EditarReligioso.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed

        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            if (usuariosArray.get(indice).getUsuario().equals(name)) {

                ArrayList<Evento> eventos = usuariosArray.get(indice).getListaEventos();
                for (Evento evento : eventos) {
                    if (evento.getCodigo().equals(codigoEvento)) {
                        eventoReligioso = (EventoReligioso) evento;
                    }
                }
            }
        }

        String participante = ParticipantesTextbox1.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox2.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox3.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox4.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox5.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox6.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox7.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox8.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox9.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        participante = ParticipantesTextbox10.getText();

        if (!participante.isEmpty()) {
            eventoReligioso.setParticipante(participante);
        }

        if (!ParticipantesTextbox1.getText().isEmpty()
                && !ParticipantesTextbox2.getText().isEmpty()
                && !ParticipantesTextbox3.getText().isEmpty()
                && !ParticipantesTextbox4.getText().isEmpty()
                && !ParticipantesTextbox5.getText().isEmpty()
                && !ParticipantesTextbox6.getText().isEmpty()
                && !ParticipantesTextbox7.getText().isEmpty()
                && !ParticipantesTextbox8.getText().isEmpty()
                && !ParticipantesTextbox9.getText().isEmpty()
                && !ParticipantesTextbox10.getText().isEmpty()) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, inserta mínimo participante.");
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
            java.util.logging.Logger.getLogger(DetallesReligioso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallesReligioso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallesReligioso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallesReligioso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallesReligioso("", new EventosMetodos(), "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ParticipantesTextbox1;
    private javax.swing.JTextField ParticipantesTextbox10;
    private javax.swing.JTextField ParticipantesTextbox2;
    private javax.swing.JTextField ParticipantesTextbox3;
    private javax.swing.JTextField ParticipantesTextbox4;
    private javax.swing.JTextField ParticipantesTextbox5;
    private javax.swing.JTextField ParticipantesTextbox6;
    private javax.swing.JTextField ParticipantesTextbox7;
    private javax.swing.JTextField ParticipantesTextbox8;
    private javax.swing.JTextField ParticipantesTextbox9;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
