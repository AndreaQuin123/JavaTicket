/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author vanes
 */
public class EditarUsuario_Admin extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private String usuarioViejo;
    private String passwordViejo;
    private String edadViejaSTRING;
    private int edadViejaINT;
    private String nombreVieja;

    public EditarUsuario_Admin(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, String usuarioViejo, String passwordViejo) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = UsuariosMetodos.getUsuariosArray();
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        this.name = name;
        this.usuarioViejo = usuarioViejo;
        this.passwordViejo = passwordViejo;

        initComponents();
        
        setLocationRelativeTo(null);

        for (int indice = 0; indice < usuariosArray.size(); indice++) {
            if (usuariosArray.get(indice).getUsuario().equals(usuarioViejo)) {
                int edadViejaINT = usuariosArray.get(indice).getEdad();
                String nombreVieja = usuariosArray.get(indice).getNombre();
            }
        }

        edadViejaSTRING = String.valueOf(edadViejaINT);

        EdadTextbox.setText(edadViejaSTRING);
        NombreTextbox.setText(nombreVieja);
        UsernameTextbox.setText(usuarioViejo);
        PasswordTextbox.setText(passwordViejo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreTextbox = new javax.swing.JTextField();
        UsernameTextbox = new javax.swing.JTextField();
        PasswordTextbox = new javax.swing.JTextField();
        EdadTextbox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        EdadTextbox.setBackground(new java.awt.Color(245, 245, 245));
        EdadTextbox.setForeground(new java.awt.Color(0, 0, 0));
        EdadTextbox.setBorder(null);
        getContentPane().add(EdadTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 230, 40));

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 180, 40));

        jButton2.setBackground(new java.awt.Color(231, 201, 76));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(40, 60, 100));
        jButton2.setText("EDITAR");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_EdicionUsuarios.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String nombre = NombreTextbox.getText();
        String usuarioNuevo = UsernameTextbox.getText();
        String passwordNuevo = PasswordTextbox.getText();
        String edad = EdadTextbox.getText();

        try {
            int edadINT = Integer.parseInt(edad);

            funcionUsuario.editarUsuario(usuarioViejo, nombre, passwordNuevo, edadINT, usuarioNuevo, passwordNuevo);
            
            
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "La edad debe ser un número entero válido.");

        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "Desea regresar al menu principal?", "REGRESAR AL MENU", JOptionPane.YES_NO_OPTION);

        if (usuarioEleccion == JOptionPane.YES_OPTION) {
            MainMenu_Admin pasar = new MainMenu_Admin(usuariosArray, name, funcionUsuario);
            pasar.setVisible(true);
            this.setVisible(false);
            
        } else if (usuarioEleccion == JOptionPane.NO_OPTION){
            
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario_Admin(new ArrayList<Usuario>(), "", new UsuariosMetodos(), "", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EdadTextbox;
    private javax.swing.JTextField NombreTextbox;
    private javax.swing.JTextField PasswordTextbox;
    private javax.swing.JTextField UsernameTextbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

