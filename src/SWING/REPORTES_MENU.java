/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class REPORTES_MENU extends javax.swing.JFrame {
    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;

 
    public REPORTES_MENU(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngresosBTN = new javax.swing.JButton();
        MiPerfilBTN = new javax.swing.JButton();
        EventosFuturosBTN = new javax.swing.JButton();
        EventosRealizadosBTN = new javax.swing.JButton();
        EventosCanceladosBTN = new javax.swing.JButton();
        RegresarBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IngresosBTN.setContentAreaFilled(false);
        IngresosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresosBTNActionPerformed(evt);
            }
        });
        getContentPane().add(IngresosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 180, 170));

        MiPerfilBTN.setContentAreaFilled(false);
        MiPerfilBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiPerfilBTNActionPerformed(evt);
            }
        });
        getContentPane().add(MiPerfilBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 180, 170));

        EventosFuturosBTN.setContentAreaFilled(false);
        EventosFuturosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosFuturosBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EventosFuturosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 180, 180));

        EventosRealizadosBTN.setContentAreaFilled(false);
        EventosRealizadosBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EventosRealizadosBTNMouseMoved(evt);
            }
        });
        EventosRealizadosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosRealizadosBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EventosRealizadosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 180, 180));

        EventosCanceladosBTN.setContentAreaFilled(false);
        EventosCanceladosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosCanceladosBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EventosCanceladosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, 170));

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 180, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_ReportesMenu.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiPerfilBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiPerfilBTNActionPerformed
        PerfilUsuario pasar = new PerfilUsuario(usuariosArray, name, funcionUsuario, funcionEvento);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MiPerfilBTNActionPerformed

    private void EventosFuturosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosFuturosBTNActionPerformed
        REPORTES_EventosFuturos pasar = new REPORTES_EventosFuturos(usuariosArray, name, funcionUsuario);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EventosFuturosBTNActionPerformed

    private void EventosRealizadosBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventosRealizadosBTNMouseMoved
        EventosRealizadosBTN.setToolTipText("Menu para ver eventos realizados.");
    }//GEN-LAST:event_EventosRealizadosBTNMouseMoved

    private void EventosRealizadosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosRealizadosBTNActionPerformed
        REPORTES_EventosRealizados pasar = new REPORTES_EventosRealizados(usuariosArray, name, funcionUsuario, funcionEvento);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EventosRealizadosBTNActionPerformed

    private void EventosCanceladosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosCanceladosBTNActionPerformed
        REPORTES_EventosCancelados pasar = new REPORTES_EventosCancelados(usuariosArray, name, funcionUsuario);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EventosCanceladosBTNActionPerformed

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

    private void IngresosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresosBTNActionPerformed
        REPORTES_Ingresos pasar = null;
        try {
            pasar = new REPORTES_Ingresos(usuariosArray, name, funcionUsuario, funcionEvento);
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_MENU.class.getName()).log(Level.SEVERE, null, ex);
        }
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_IngresosBTNActionPerformed

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
            java.util.logging.Logger.getLogger(REPORTES_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REPORTES_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REPORTES_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REPORTES_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REPORTES_MENU(new ArrayList<Usuario>(), "", new UsuariosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EventosCanceladosBTN;
    private javax.swing.JButton EventosFuturosBTN;
    private javax.swing.JButton EventosRealizadosBTN;
    private javax.swing.JButton IngresosBTN;
    private javax.swing.JButton MiPerfilBTN;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
