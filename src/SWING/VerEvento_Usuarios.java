package SWING;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import java.util.Date;

public class VerEvento_Usuarios extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;

    public VerEvento_Usuarios(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion, String codigoEvento) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        initComponents();

        StringBuilder informacion = funcionEvento.verEvento(codigoEvento);

        if (informacion != null) {
            Desc.setText(informacion.toString());
        } else {
            Desc.setText("No existe informacion disponible.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Desc = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Desc.setEditable(false);
        Desc.setBackground(new java.awt.Color(245, 245, 245));
        Desc.setColumns(20);
        Desc.setRows(5);
        Desc.setBorder(null);
        jScrollPane1.setViewportView(Desc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 120, 640, 320);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_VerEvento.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VerEvento_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerEvento_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerEvento_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerEvento_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerEvento_Usuarios(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos(), "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
