/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class AdminEvento_Menu extends javax.swing.JFrame {

 private ArrayList<Usuario> usuariosArray;
 private String name;
    private UsuariosMetodos funcionUsuario;
 
 
    public AdminEvento_Menu(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditarEventoBTN = new javax.swing.JButton();
        CrearEventoBTN = new javax.swing.JButton();
        BorrarEventoBTN = new javax.swing.JButton();
        RegresarBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EditarEventoBTN.setContentAreaFilled(false);
        EditarEventoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEventoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EditarEventoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 240, 240));

        CrearEventoBTN.setContentAreaFilled(false);
        CrearEventoBTN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CrearEventoBTNMouseMoved(evt);
            }
        });
        CrearEventoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CrearEventoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 250, 240));

        BorrarEventoBTN.setContentAreaFilled(false);
        BorrarEventoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarEventoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarEventoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 250, 240));

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_AdminEventos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEventoBTNMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearEventoBTNMouseMoved
        CrearEventoBTN.setToolTipText("Menu para crear eventos.");
    }//GEN-LAST:event_CrearEventoBTNMouseMoved

    private void CrearEventoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEventoBTNActionPerformed
    CrearEvento_AdminContenido pasar = new CrearEvento_AdminContenido(usuariosArray, name, funcionUsuario);
    pasar.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_CrearEventoBTNActionPerformed

    private void EditarEventoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEventoBTNActionPerformed
        
    }//GEN-LAST:event_EditarEventoBTNActionPerformed

    private void BorrarEventoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarEventoBTNActionPerformed
    
    }//GEN-LAST:event_BorrarEventoBTNActionPerformed

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed
        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "Desea regresar al menu principal?", "REGRESAR AL MENU", JOptionPane.YES_NO_OPTION);

        if (usuarioEleccion == JOptionPane.YES_OPTION) {
            
            MainMenu_Admin pasar = new MainMenu_Admin(usuariosArray, name, funcionUsuario);
            pasar.setVisible(true);
            this.setVisible(false);
            
        } else if (usuarioEleccion== JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
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
            java.util.logging.Logger.getLogger(AdminEvento_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEvento_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEvento_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEvento_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEvento_Menu(new ArrayList<Usuario>(), "", new UsuariosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarEventoBTN;
    private javax.swing.JButton CrearEventoBTN;
    private javax.swing.JButton EditarEventoBTN;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
