 
package SWING;

import EVENTOS_USUARIOS.Evento;
import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuarioAdmin;
import EVENTOS_USUARIOS.UsuarioContenido;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminEvento_Menu extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;
    private static ArrayList<Evento> eventosCancelados;
    private static ArrayList<Evento> eventos;

    public AdminEvento_Menu(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        eventosCancelados = funcionEvento.eventosCancelados();
        eventos = funcionEvento.eventos();

        initComponents();

        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VerEventoBTN = new javax.swing.JButton();
        EditarEventoBTN = new javax.swing.JButton();
        CrearEventoBTN = new javax.swing.JButton();
        BorrarEventoBTN = new javax.swing.JButton();
        RegresarBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VerEventoBTN.setBorder(null);
        VerEventoBTN.setContentAreaFilled(false);
        VerEventoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEventoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(VerEventoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 180, 170));

        EditarEventoBTN.setBorder(null);
        EditarEventoBTN.setContentAreaFilled(false);
        EditarEventoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEventoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(EditarEventoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 180, 180));

        CrearEventoBTN.setBorder(null);
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
        getContentPane().add(CrearEventoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 190, 180));

        BorrarEventoBTN.setBorder(null);
        BorrarEventoBTN.setContentAreaFilled(false);
        BorrarEventoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarEventoBTNActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarEventoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 180, 170));

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
        CrearEvento_AdminContenido pasar = new CrearEvento_AdminContenido(usuariosArray, name, funcionUsuario, funcionEvento);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CrearEventoBTNActionPerformed

    private void EditarEventoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEventoBTNActionPerformed
        
        String codigoEvento = JOptionPane.showInputDialog(null, "Inserte el codigo del evento que desea editar.");

        if (codigoEvento != null && !codigoEvento.isEmpty()) {
            boolean evento = funcionEvento.BuscarEvento(name, codigoEvento);

            if (evento) {
                EditarEvento_AdminContenido pasar = new EditarEvento_AdminContenido(usuariosArray, name, funcionUsuario, codigoEvento, funcionEvento);
                pasar.setVisible(true);
                this.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(null, "El usuario no es el creador de este evento o el evento no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operación cancelada o código de evento inválido.");
        }

    }//GEN-LAST:event_EditarEventoBTNActionPerformed

    private void BorrarEventoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarEventoBTNActionPerformed
        CancelarEvento_AdminContenido pasar = new CancelarEvento_AdminContenido(usuariosArray, name, funcionUsuario, funcionEvento);
        pasar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BorrarEventoBTNActionPerformed

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed

        int usuarioEleccion = 0;

        usuarioEleccion = JOptionPane.showConfirmDialog(null, "Desea regresar al menu principal?", "REGRESAR AL MENU", JOptionPane.YES_NO_OPTION);

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

    private void VerEventoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEventoBTNActionPerformed
        String codigoEvento = JOptionPane.showInputDialog(null, "Inserte el código del evento que desea editar.");

            for (Evento evento : eventos) {
                if (evento.getCodigo().equals(codigoEvento)) {
                    VerEvento_Usuarios pasar = new VerEvento_Usuarios(usuariosArray, name, funcionUsuario, funcionEvento, codigoEvento);
                    pasar.setVisible(true);
                    this.setVisible(false);
                    return;
                }
            }

        for (Evento evento : eventosCancelados) {
            if (evento.getCodigo().equals(codigoEvento)) {
                VerEvento_Usuarios pasar = new VerEvento_Usuarios(usuariosArray, name, funcionUsuario, funcionEvento, codigoEvento);
                pasar.setVisible(true);
                this.setVisible(false);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "No se encontró el evento con código " + codigoEvento);

    }//GEN-LAST:event_VerEventoBTNActionPerformed

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
                new AdminEvento_Menu(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarEventoBTN;
    private javax.swing.JButton CrearEventoBTN;
    private javax.swing.JButton EditarEventoBTN;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JButton VerEventoBTN;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
