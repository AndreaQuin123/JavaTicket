/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author vanes
 */
public class CrearUsuario_Admin extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;

    public CrearUsuario_Admin(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = UsuariosMetodos.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();

        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
    * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        EdadTextbox = new javax.swing.JTextField();
        NombreTextbox = new javax.swing.JTextField();
        UsernameTextbox = new javax.swing.JTextField();
        PasswordTextbox = new javax.swing.JTextField();
        TipoUsuario = new javax.swing.JComboBox<>();
        TipoUsuarioImagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(231, 201, 76));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(40, 60, 100));
        jButton2.setText("AGREGAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 180, 50));

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 50));

        EdadTextbox.setBackground(new java.awt.Color(245, 245, 245));
        EdadTextbox.setForeground(new java.awt.Color(0, 0, 0));
        EdadTextbox.setBorder(null);
        getContentPane().add(EdadTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 230, 40));

        NombreTextbox.setBackground(new java.awt.Color(245, 245, 245));
        NombreTextbox.setForeground(new java.awt.Color(0, 0, 0));
        NombreTextbox.setBorder(null);
        getContentPane().add(NombreTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 230, 40));

        UsernameTextbox.setBackground(new java.awt.Color(245, 245, 245));
        UsernameTextbox.setForeground(new java.awt.Color(0, 0, 0));
        UsernameTextbox.setBorder(null);
        getContentPane().add(UsernameTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 230, 40));

        PasswordTextbox.setBackground(new java.awt.Color(245, 245, 245));
        PasswordTextbox.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextbox.setBorder(null);
        getContentPane().add(PasswordTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 230, 40));

        TipoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        TipoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "CONTENIDO", "LIMITADO" }));
        TipoUsuario.setToolTipText("Elija el tipo de usuario que desea.");
        TipoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 210, 30));

        TipoUsuarioImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/userAdmin.png"))); // NOI18N
        TipoUsuarioImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(TipoUsuarioImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 210, 210));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_CrearUsuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showConfirmDialog(null, "Desea regresar al menu principal?", "REGRESAR AL MENU", YES_NO_OPTION);

        int usuarioEleccion = 0;

        if (usuarioEleccion == JOptionPane.YES_OPTION) {

            AdminUsuario_Menu pasar = new AdminUsuario_Menu(usuariosArray, name, funcionUsuario);
            pasar.setVisible(true);
            this.setVisible(false);

        } else if (usuarioEleccion== JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoUsuarioActionPerformed

    String selectedItem = (String) TipoUsuario.getSelectedItem();

    if (null != selectedItem) {
        switch (selectedItem) {
            case "ADMINISTRADOR": {
                Icon icon = new ImageIcon(getClass().getClassLoader().getResource("IMAGENES/userAdmin.png"));
                TipoUsuarioImagen.setIcon(icon);
                break;
            }
            case "CONTENIDO": {
                Icon icon = new ImageIcon(getClass().getClassLoader().getResource("IMAGENES/userContenido.png"));
                TipoUsuarioImagen.setIcon(icon);
                break;
            }
            case "LIMITADO": {
                Icon icon = new ImageIcon(getClass().getClassLoader().getResource("IMAGENES/userLimitado.png"));
                TipoUsuarioImagen.setIcon(icon);
                break;
            }
            default:
                break;
        }
    }
    
    }//GEN-LAST:event_TipoUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String nombre = NombreTextbox.getText();
        String usuario = UsernameTextbox.getText();
        String password = PasswordTextbox.getText();
        String edad = EdadTextbox.getText();
        String selectedItem = (String) TipoUsuario.getSelectedItem();

        if (nombre.isEmpty() || usuario.isEmpty() || password.isEmpty() || edad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        try {
            int edadINT = Integer.parseInt(edad);

            funcionUsuario.agregarUsuario(nombre, usuario, password, edadINT, selectedItem);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La edad debe ser un número entero válido.");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CrearUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CrearUsuario_Admin(new ArrayList<Usuario>(), "", new UsuariosMetodos()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EdadTextbox;
    private javax.swing.JTextField NombreTextbox;
    private javax.swing.JTextField PasswordTextbox;
    private javax.swing.JComboBox<String> TipoUsuario;
    private javax.swing.JLabel TipoUsuarioImagen;
    private javax.swing.JTextField UsernameTextbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
