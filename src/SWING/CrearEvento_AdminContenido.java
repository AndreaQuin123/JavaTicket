/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Evento.TipoEvento;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vanes
 */
public class CrearEvento_AdminContenido extends javax.swing.JFrame {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;
    private String Uniquecode;

    public CrearEvento_AdminContenido(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
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

        jComboBox1 = new javax.swing.JComboBox<>();
        RegresarBTN = new javax.swing.JButton();
        MontoTextbox = new javax.swing.JTextField();
        FechaTextbox = new javax.swing.JTextField();
        TituloTextbox = new javax.swing.JTextField();
        CodigoTextbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionTextbox = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(TipoEvento.values()));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 250, 40));

        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 473, 187, 51));

        MontoTextbox.setBackground(new java.awt.Color(245, 245, 245));
        MontoTextbox.setForeground(new java.awt.Color(0, 0, 0));
        MontoTextbox.setBorder(null);
        getContentPane().add(MontoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 220, 40));

        FechaTextbox.setBackground(new java.awt.Color(245, 245, 245));
        FechaTextbox.setForeground(new java.awt.Color(0, 0, 0));
        FechaTextbox.setBorder(null);
        getContentPane().add(FechaTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 220, 40));

        TituloTextbox.setBackground(new java.awt.Color(245, 245, 245));
        TituloTextbox.setForeground(new java.awt.Color(0, 0, 0));
        TituloTextbox.setBorder(null);
        getContentPane().add(TituloTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 220, 40));

        CodigoTextbox.setEditable(false);
        CodigoTextbox.setBackground(new java.awt.Color(245, 245, 245));
        CodigoTextbox.setForeground(new java.awt.Color(0, 0, 0));
        CodigoTextbox.setBorder(null);
        getContentPane().add(CodigoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 40));

        DescripcionTextbox.setColumns(20);
        DescripcionTextbox.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionTextbox.setRows(5);
        DescripcionTextbox.setOpaque(false);
        jScrollPane1.setViewportView(DescripcionTextbox);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 260, 270));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_CrearEVENTO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        TipoEvento selectedItem = (TipoEvento) jComboBox1.getSelectedItem();

        if (selectedItem != null) {
            
            switch (selectedItem) {
                
                case MUSICAL:
                    DescripcionTextbox.setText("Este evento es de tipo musical.");
                    
                    Uniquecode = funcionEvento.generateRandomCode()+"M";
                    CodigoTextbox.setText(Uniquecode);
                    
                    TituloTextbox.setText("Evento Musical."); 
                    break;
                    
                case DEPORTIVO:
                    DescripcionTextbox.setText("Este evento es de tipo deportivo.");
                    
                    Uniquecode = funcionEvento.generateRandomCode()+"D";
                    CodigoTextbox.setText(Uniquecode);
                    
                    TituloTextbox.setText("Evento deportivo.");
                    break;
                    
                case RELIGIOSO:
                    DescripcionTextbox.setText("Este evento es de tipo religioso.");
                    
                    Uniquecode = funcionEvento.generateRandomCode()+"R";
                    CodigoTextbox.setText(Uniquecode);
                    
                    TituloTextbox.setText("Evento Religioso.");
                    break;
                    
                default:
                    break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


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
            java.util.logging.Logger.getLogger(CrearEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearEvento_AdminContenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearEvento_AdminContenido(new ArrayList<Usuario>(), "", new UsuariosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoTextbox;
    private javax.swing.JTextArea DescripcionTextbox;
    private javax.swing.JTextField FechaTextbox;
    private javax.swing.JTextField MontoTextbox;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JTextField TituloTextbox;
    private javax.swing.JComboBox<TipoEvento> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
