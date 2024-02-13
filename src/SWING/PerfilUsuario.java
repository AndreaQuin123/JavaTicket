
package SWING;

import EVENTOS_USUARIOS.Evento;
import EVENTOS_USUARIOS.EventoDeportivo;
import EVENTOS_USUARIOS.EventoMusical;
import EVENTOS_USUARIOS.EventoReligioso;
import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuarioAdmin;
import EVENTOS_USUARIOS.UsuarioContenido;
import EVENTOS_USUARIOS.UsuarioLimitado;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class PerfilUsuario extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;
    StringBuilder eventosUsuarios = new StringBuilder();

    public PerfilUsuario(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        initComponents();
        
        setLocationRelativeTo(null);

        for (Usuario usuario : usuariosArray) {
            if (usuario.getUsuario().equals(name)) {
                EdadTextbox.setText(String.valueOf(usuario.getEdad()));
                NombreTextbox.setText(usuario.getNombre());
                PasswordTextbox.setText(usuario.getContraseña());
                if (usuario instanceof UsuarioAdmin) {
                    TipoUsuario.setText("ADMIN");
                }

                if (usuario instanceof UsuarioContenido) {
                    TipoUsuario.setText("CONTENIDO");
                }

                if (usuario instanceof UsuarioLimitado) {
                    TipoUsuario.setText("LIMITADO");
                }
                
                UsernameTextbox.setText(name);
            }
        }

        for (Usuario usuario : usuariosArray) {
            if (!(usuario instanceof UsuarioLimitado)) {
                if (usuario.getUsuario().equals(name)) {
                    for (Evento evento : usuario.getListaEventos()) {
                        if (evento instanceof EventoDeportivo) {
                            EventoDeportivo deportivoEvento = (EventoDeportivo) evento;

                            eventosUsuarios.append("Tipo: ").append("DEPORTIVO").append(" - ");
                            eventosUsuarios.append("Titulo: ").append(deportivoEvento.getTitulo()).append(" - ");
                            eventosUsuarios.append("Fecha: ").append(deportivoEvento.getFecha()).append(" - ");
                            eventosUsuarios.append("Monto: ").append(deportivoEvento.getMonto()).append("\n");
                        }

                        if (evento instanceof EventoMusical) {
                            EventoMusical musicalEvento = (EventoMusical) evento;

                            eventosUsuarios.append("Tipo: ").append("MUSICAL").append(" - ");
                            eventosUsuarios.append("Titulo: ").append(musicalEvento.getTitulo()).append(" - ");
                            eventosUsuarios.append("Fecha: ").append(musicalEvento.getFecha()).append(" - ");
                            eventosUsuarios.append("Monto: ").append(musicalEvento.getMonto()).append("\n");
                        }

                        if (evento instanceof EventoReligioso) {
                            EventoReligioso religiosoEvento = (EventoReligioso) evento;

                            eventosUsuarios.append("Titulo: ").append("RELIGIOSO").append(" - ");
                            eventosUsuarios.append("Fecha: ").append(religiosoEvento.getFecha()).append(" - ");
                            eventosUsuarios.append("Monto: ").append(religiosoEvento.getMonto()).append("\n");
                        }
                    }
                }
            }
        }
        
        Eventos.setText(eventosUsuarios.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Eventos = new javax.swing.JTextArea();
        RegresarBTN = new javax.swing.JButton();
        TipoUsuario = new javax.swing.JTextField();
        UsernameTextbox = new javax.swing.JTextField();
        PasswordTextbox = new javax.swing.JTextField();
        EdadTextbox = new javax.swing.JTextField();
        NombreTextbox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eventos.setEditable(false);
        Eventos.setBackground(new java.awt.Color(245, 245, 245));
        Eventos.setColumns(20);
        Eventos.setRows(5);
        Eventos.setBorder(null);
        jScrollPane1.setViewportView(Eventos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 130, 260, 280));

        RegresarBTN.setBorder(null);
        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 180, 50));

        TipoUsuario.setEditable(false);
        TipoUsuario.setBackground(new java.awt.Color(245, 245, 245));
        TipoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TipoUsuario.setBorder(null);
        getContentPane().add(TipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 200, 30));

        UsernameTextbox.setEditable(false);
        UsernameTextbox.setBackground(new java.awt.Color(245, 245, 245));
        UsernameTextbox.setForeground(new java.awt.Color(0, 0, 0));
        UsernameTextbox.setBorder(null);
        getContentPane().add(UsernameTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 200, 30));

        PasswordTextbox.setEditable(false);
        PasswordTextbox.setBackground(new java.awt.Color(245, 245, 245));
        PasswordTextbox.setForeground(new java.awt.Color(0, 0, 0));
        PasswordTextbox.setBorder(null);
        getContentPane().add(PasswordTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 200, 30));

        EdadTextbox.setEditable(false);
        EdadTextbox.setBackground(new java.awt.Color(245, 245, 245));
        EdadTextbox.setForeground(new java.awt.Color(0, 0, 0));
        EdadTextbox.setBorder(null);
        getContentPane().add(EdadTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 200, 30));

        NombreTextbox.setEditable(false);
        NombreTextbox.setBackground(new java.awt.Color(245, 245, 245));
        NombreTextbox.setForeground(new java.awt.Color(0, 0, 0));
        NombreTextbox.setBorder(null);
        getContentPane().add(NombreTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_PerfilUsuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBTNActionPerformed
        int usuarioEleccion = JOptionPane.showConfirmDialog(null, "Desea regresar al menu de REPORTES?", "REGRESAR AL MENU", JOptionPane.YES_NO_OPTION);

        if (usuarioEleccion == JOptionPane.YES_OPTION) {

            REPORTES_MENU pasar = new REPORTES_MENU(usuariosArray, name, funcionUsuario);
            pasar.setVisible(true);
            this.setVisible(false);

        } else if (usuarioEleccion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }
    }//GEN-LAST:event_RegresarBTNActionPerformed

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
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilUsuario(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EdadTextbox;
    private javax.swing.JTextArea Eventos;
    private javax.swing.JTextField NombreTextbox;
    private javax.swing.JTextField PasswordTextbox;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JTextField TipoUsuario;
    private javax.swing.JTextField UsernameTextbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
