/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuarioAdmin;
import EVENTOS_USUARIOS.UsuarioContenido;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class CancelarEvento_AdminContenido extends javax.swing.JFrame {
    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;

    public CancelarEvento_AdminContenido(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();
        initComponents();
                setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CancelarBTN = new javax.swing.JButton();
        RegresarBTN = new javax.swing.JButton();
        PasswordTextbox = new javax.swing.JTextField();
        CodigoTextbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CancelarBTN.setBackground(new java.awt.Color(231, 201, 76));
        CancelarBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CancelarBTN.setForeground(new java.awt.Color(40, 60, 100));
        CancelarBTN.setText("CANCELAR");
        CancelarBTN.setBorder(null);
        CancelarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CancelarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 150, 50));

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 50));

        PasswordTextbox.setBackground(new java.awt.Color(245, 245, 245));
        PasswordTextbox.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextbox.setBorder(null);
        getContentPane().add(PasswordTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, 210, 40));

        CodigoTextbox.setBackground(new java.awt.Color(245, 245, 245));
        CodigoTextbox.setForeground(new java.awt.Color(0, 0, 0));
        CodigoTextbox.setBorder(null);
        getContentPane().add(CodigoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 210, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_CancelarEventos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed
        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "Desea regresar al menu principal?", "REGRESAR AL MENU", JOptionPane.YES_NO_OPTION);

        if (usuarioEleccion == JOptionPane.YES_OPTION) {

            for (int indice = 0; indice < usuariosArray.size(); indice++) {
                if (usuariosArray.get(indice).getUsuario().equals(name)) {

                    Usuario usuario = usuariosArray.get(indice);

                    if (usuario instanceof UsuarioAdmin) {
                        MainMenu_Admin pasar = new MainMenu_Admin(usuariosArray, name, funcionUsuario, funcionEvento);
                        pasar.setVisible(true);
                        this.setVisible(false);
                    }

                    if (usuario instanceof UsuarioContenido) {
                        MainMenu_Contenido pasar = new MainMenu_Contenido(usuariosArray, name, funcionUsuario);
                        pasar.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        } else if (usuarioEleccion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }
    }//GEN-LAST:event_RegresarBTNActionPerformed

    private void CancelarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBTNActionPerformed

        String codigo = CodigoTextbox.getText();
        String password = PasswordTextbox.getText();
        
        funcionEvento.EliminarEvento(codigo, name, password);
                
                
    }//GEN-LAST:event_CancelarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(CancelarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelarEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelarEvento_AdminContenido(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarBTN;
    private javax.swing.JTextField CodigoTextbox;
    private javax.swing.JTextField PasswordTextbox;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
