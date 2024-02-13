/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuarioAdmin;
import EVENTOS_USUARIOS.UsuarioContenido;
import EVENTOS_USUARIOS.UsuarioLimitado;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author vanes
 */
public class Login extends javax.swing.JFrame {

    private Usuario usuarioMetodos;
    boolean usuarioEncontrado = false;
     boolean escondido = true;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;

    String nombreAdmin = "ADMINISTRADOR";
    String usuarioAdmin = "admin";
    String passAdmin = "supersecreto";
    int edadAdmin = 19;
    
    

    public Login(ArrayList<Usuario> usuarios, UsuariosMetodos UsuarioFuncion ) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = UsuariosMetodos.getUsuariosArray();
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();

        if (usuariosArray.isEmpty()) {
            UsuarioAdmin usuarioADMIN = new UsuarioAdmin(nombreAdmin, usuarioAdmin, passAdmin, edadAdmin);
            usuariosArray.add(usuarioADMIN);
        }

        initComponents();

        setLocationRelativeTo(null);
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContraseñaTEXTBOX = new javax.swing.JPasswordField();
        NombreTEXTBOX = new javax.swing.JTextField();
        SALIRButton = new javax.swing.JButton();
        LOGINButton = new javax.swing.JButton();
        ContraseñaStatus = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(230, 110));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContraseñaTEXTBOX.setBackground(new java.awt.Color(255, 255, 255));
        ContraseñaTEXTBOX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ContraseñaTEXTBOX.setForeground(new java.awt.Color(0, 0, 0));
        ContraseñaTEXTBOX.setText("Contraseña");
        ContraseñaTEXTBOX.setBorder(null);
        ContraseñaTEXTBOX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaTEXTBOXMouseClicked(evt);
            }
        });
        ContraseñaTEXTBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaTEXTBOXActionPerformed(evt);
            }
        });
        getContentPane().add(ContraseñaTEXTBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 270, 40));

        NombreTEXTBOX.setBackground(new java.awt.Color(255, 255, 255));
        NombreTEXTBOX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NombreTEXTBOX.setForeground(new java.awt.Color(0, 0, 0));
        NombreTEXTBOX.setText("Nombre");
        NombreTEXTBOX.setBorder(null);
        NombreTEXTBOX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreTEXTBOXMouseClicked(evt);
            }
        });
        getContentPane().add(NombreTEXTBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 270, 40));

        SALIRButton.setBorder(null);
        SALIRButton.setContentAreaFilled(false);
        SALIRButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SALIRButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 180, 60));

        LOGINButton.setBorder(null);
        LOGINButton.setContentAreaFilled(false);
        LOGINButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINButtonMouseClicked(evt);
            }
        });
        getContentPane().add(LOGINButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 180, 60));

        ContraseñaStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/HidePassword_IconResize.png"))); // NOI18N
        ContraseñaStatus.setContentAreaFilled(false);
        ContraseñaStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContraseñaStatusMouseClicked(evt);
            }
        });
        getContentPane().add(ContraseñaStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 40, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static ArrayList<Usuario> usuariosArray = new ArrayList<>();

    public static ArrayList<Usuario> getUsuariosArray() {
        return usuariosArray;
    }

    private void LOGINButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINButtonMouseClicked

        String usuario = NombreTEXTBOX.getText();
        String pass = ContraseñaTEXTBOX.getText();

        for (int indice = 0; indice < usuariosArray.size(); indice++) {

            System.out.println(usuariosArray);
            
            if (usuariosArray.get(indice).getUsuario().equals(usuario) && usuariosArray.get(indice).getContraseña().equals(pass)) {

                usuarioEncontrado = true;

                if (usuariosArray.get(indice) instanceof UsuarioAdmin) {
                    MainMenu_Admin pasar = new MainMenu_Admin(usuariosArray, usuario, funcionUsuario, funcionEvento);
                    pasar.setVisible(true);
                    this.setVisible(false);

                } else if (usuariosArray.get(indice) instanceof UsuarioContenido) {
                    MainMenu_Contenido pasar = new MainMenu_Contenido(usuariosArray, usuario, funcionUsuario);
                    pasar.setVisible(true);
                    this.setVisible(false);

                } else if (usuariosArray.get(indice) instanceof UsuarioLimitado) {
                    MainMenu_Limitado pasar = new MainMenu_Limitado(usuariosArray, usuario, funcionUsuario, funcionEvento);
                    pasar.setVisible(true);
                    this.setVisible(false);
                }

                return;
            }
        }

        if (usuarioEncontrado == false) {
            JOptionPane.showMessageDialog(null, "La informacion puesta es erronea.");
        }

    }//GEN-LAST:event_LOGINButtonMouseClicked

    private void SALIRButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRButtonActionPerformed
        
            JOptionPane.showMessageDialog(null, "Saliendo...");
            System.exit(0);

    }//GEN-LAST:event_SALIRButtonActionPerformed

    private void ContraseñaTEXTBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaTEXTBOXActionPerformed
        
    }//GEN-LAST:event_ContraseñaTEXTBOXActionPerformed

    private void NombreTEXTBOXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreTEXTBOXMouseClicked
        NombreTEXTBOX.setText("");
    }//GEN-LAST:event_NombreTEXTBOXMouseClicked

    private void ContraseñaTEXTBOXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaTEXTBOXMouseClicked
        ContraseñaTEXTBOX.setText("");
    }//GEN-LAST:event_ContraseñaTEXTBOXMouseClicked

    private void ContraseñaStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaStatusMouseClicked
       
        //STACK OVERFLOW MY BELOVED, GRACIAS.

        if (escondido) {
            ContraseñaTEXTBOX.setEchoChar((char)0);
            Icon icon = new ImageIcon(getClass().getClassLoader().getResource("IMAGENES/ShowPassword_IconResize.png"));
            ContraseñaStatus.setIcon(icon);
            escondido = false;
        } else if (!escondido) {
            ContraseñaTEXTBOX.setEchoChar('*');
            Icon icon = new ImageIcon(getClass().getClassLoader().getResource("IMAGENES/HidePassword_IconResize.png"));
            ContraseñaStatus.setIcon(icon);
            escondido = true;
        }
    }//GEN-LAST:event_ContraseñaStatusMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login(new ArrayList<Usuario>(), new UsuariosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ContraseñaStatus;
    private javax.swing.JPasswordField ContraseñaTEXTBOX;
    private javax.swing.JButton LOGINButton;
    private javax.swing.JTextField NombreTEXTBOX;
    private javax.swing.JButton SALIRButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
