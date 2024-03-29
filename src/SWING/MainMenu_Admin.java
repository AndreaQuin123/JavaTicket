
package SWING;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;


public class MainMenu_Admin extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;

    public MainMenu_Admin(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        initComponents();

        QueDeseaText.setText("QUE DESEA HACER HOY, " + name + "?");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        QueDeseaText = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        USUARIOSButton = new javax.swing.JButton();
        EVENTOSButton = new javax.swing.JButton();
        REPORTESButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 201, 76));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        QueDeseaText.setBackground(new java.awt.Color(40, 60, 100));
        QueDeseaText.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        QueDeseaText.setForeground(new java.awt.Color(40, 60, 100));
        QueDeseaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QueDeseaText.setText("QUE DESEA HACER HOY, ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QueDeseaText, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QueDeseaText, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 50));

        USUARIOSButton.setContentAreaFilled(false);
        USUARIOSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USUARIOSButtonActionPerformed(evt);
            }
        });
        getContentPane().add(USUARIOSButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 270));

        EVENTOSButton.setContentAreaFilled(false);
        EVENTOSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENTOSButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EVENTOSButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 280, 270));

        REPORTESButton.setContentAreaFilled(false);
        REPORTESButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPORTESButtonActionPerformed(evt);
            }
        });
        getContentPane().add(REPORTESButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 280, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_UserAdmin.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "Al regresar al LOGIN, se quitaria su sesion. Esta de acuerdo con regresar?", "REGRESAR AL MENU", YES_NO_OPTION);

        if (usuarioEleccion == JOptionPane.YES_OPTION) {

            Login pasar = new Login(new ArrayList<Usuario>(), new UsuariosMetodos());
            pasar.setVisible(true);
            this.setVisible(false);

        } else if (usuarioEleccion== JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void USUARIOSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USUARIOSButtonActionPerformed
        AdminUsuario_Menu pasar = new AdminUsuario_Menu(usuariosArray, name, funcionUsuario);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_USUARIOSButtonActionPerformed

    private void EVENTOSButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVENTOSButtonActionPerformed
        AdminEvento_Menu pasar = new AdminEvento_Menu(usuariosArray, name, funcionUsuario, funcionEvento);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EVENTOSButtonActionPerformed

    private void REPORTESButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPORTESButtonActionPerformed
        REPORTES_MENU pasar = new REPORTES_MENU(usuariosArray, name, funcionUsuario);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_REPORTESButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu_Admin(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EVENTOSButton;
    private javax.swing.JLabel QueDeseaText;
    private javax.swing.JButton REPORTESButton;
    private javax.swing.JButton USUARIOSButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
