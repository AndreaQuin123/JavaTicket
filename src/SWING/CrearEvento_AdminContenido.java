/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Evento.TipoEvento;
import static EVENTOS_USUARIOS.Evento.TipoEvento.DEPORTIVO;
import static EVENTOS_USUARIOS.Evento.TipoEvento.MUSICAL;
import static EVENTOS_USUARIOS.Evento.TipoEvento.RELIGIOSO;
import EVENTOS_USUARIOS.EventoDeportivo.TipoDeporte;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import SWING.CALENDARIO.CalendarioPanel;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
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
    public static Date selectedDate;

    public CrearEvento_AdminContenido(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = UsuariosMetodos.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();

        initComponents();
        EventoDeportivo.setVisible(false);
        EventoReligioso.setVisible(false);
        EventoMusical.setVisible(false);
        
        setLocationRelativeTo(null);

    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        EventoDeportivo = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        CantidadTextbox = new javax.swing.JTextField();
        Equipo1Textbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Equipo2Textbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DeportivoHide = new javax.swing.JButton();
        EventoMusical = new javax.swing.JPanel();
        MusicaJcombo = new javax.swing.JComboBox();
        MusicalHide = new javax.swing.JButton();
        EventoReligioso = new javax.swing.JPanel();
        ReligiosoHide = new javax.swing.JButton();
        DetallesBTN = new javax.swing.JButton();
        CrearBTN = new javax.swing.JButton();
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

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/STAR_Calendar (2).png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 310, 30, 40));

        EventoDeportivo.setBackground(new java.awt.Color(110, 115, 166));
        EventoDeportivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(TipoDeporte.values()));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        EventoDeportivo.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 40));

        CantidadTextbox.setEditable(false);
        CantidadTextbox.setBackground(new java.awt.Color(245, 245, 245));
        CantidadTextbox.setForeground(new java.awt.Color(0, 0, 0));
        CantidadTextbox.setText("Cantidad");
        CantidadTextbox.setBorder(null);
        EventoDeportivo.add(CantidadTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 220, 40));

        Equipo1Textbox.setBackground(new java.awt.Color(245, 245, 245));
        Equipo1Textbox.setForeground(new java.awt.Color(0, 0, 0));
        Equipo1Textbox.setText("Equipo 1");
        Equipo1Textbox.setBorder(null);
        Equipo1Textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipo1TextboxActionPerformed(evt);
            }
        });
        EventoDeportivo.add(Equipo1Textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 220, 40));

        jLabel3.setBackground(new java.awt.Color(231, 201, 76));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(40, 60, 100));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANTIDAD");
        jLabel3.setOpaque(true);
        EventoDeportivo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 40));

        jLabel4.setBackground(new java.awt.Color(231, 201, 76));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(40, 60, 100));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("EQUIPO 1");
        jLabel4.setOpaque(true);
        EventoDeportivo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 40));

        Equipo2Textbox.setBackground(new java.awt.Color(245, 245, 245));
        Equipo2Textbox.setForeground(new java.awt.Color(0, 0, 0));
        Equipo2Textbox.setText("Equipo 2");
        Equipo2Textbox.setBorder(null);
        EventoDeportivo.add(Equipo2Textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 220, 40));

        jLabel5.setBackground(new java.awt.Color(231, 201, 76));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(40, 60, 100));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("EQUIPO 2");
        jLabel5.setOpaque(true);
        EventoDeportivo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 40));

        DeportivoHide.setBackground(new java.awt.Color(231, 201, 76));
        DeportivoHide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeportivoHide.setForeground(new java.awt.Color(40, 60, 100));
        DeportivoHide.setText("ESCONDER");
        DeportivoHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeportivoHideActionPerformed(evt);
            }
        });
        EventoDeportivo.add(DeportivoHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 130, 40));

        getContentPane().add(EventoDeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 370, 540));

        EventoMusical.setBackground(new java.awt.Color(54, 54, 130));
        EventoMusical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MusicaJcombo.setBackground(new java.awt.Color(255, 255, 255));
        MusicaJcombo.setForeground(new java.awt.Color(0, 0, 0));
        MusicaJcombo.setModel(new javax.swing.DefaultComboBoxModel<>(TipoDeporte.values()));
        MusicaJcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicaJcomboActionPerformed(evt);
            }
        });
        EventoMusical.add(MusicaJcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 300, 40));

        MusicalHide.setBackground(new java.awt.Color(231, 201, 76));
        MusicalHide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MusicalHide.setForeground(new java.awt.Color(40, 60, 100));
        MusicalHide.setText("ESCONDER");
        MusicalHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicalHideActionPerformed(evt);
            }
        });
        EventoMusical.add(MusicalHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 130, 40));

        getContentPane().add(EventoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 390, 540));

        EventoReligioso.setBackground(new java.awt.Color(54, 54, 130));
        EventoReligioso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReligiosoHide.setBackground(new java.awt.Color(231, 201, 76));
        ReligiosoHide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReligiosoHide.setForeground(new java.awt.Color(40, 60, 100));
        ReligiosoHide.setText("ESCONDER");
        ReligiosoHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReligiosoHideActionPerformed(evt);
            }
        });
        EventoReligioso.add(ReligiosoHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 130, 40));

        getContentPane().add(EventoReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 390, 540));

        DetallesBTN.setBackground(new java.awt.Color(231, 201, 76));
        DetallesBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        DetallesBTN.setForeground(new java.awt.Color(40, 60, 100));
        DetallesBTN.setText("DETALLES");
        DetallesBTN.setBorder(null);
        DetallesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetallesBTNActionPerformed(evt);
            }
        });
        getContentPane().add(DetallesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 180, 50));

        CrearBTN.setBackground(new java.awt.Color(231, 201, 76));
        CrearBTN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CrearBTN.setForeground(new java.awt.Color(40, 60, 100));
        CrearBTN.setText("CREAR");
        CrearBTN.setBorder(null);
        CrearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CrearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 180, 50));

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

        FechaTextbox.setEditable(false);
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

        } else if (usuarioEleccion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Se canceló la operación.");
        }
    }//GEN-LAST:event_RegresarBTNActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        TipoEvento selectedItem = (TipoEvento) jComboBox1.getSelectedItem();

        if (selectedItem != null) {

            switch (selectedItem) {

                case MUSICAL:
                    DescripcionTextbox.setText("Este evento es de tipo musical.");

                    Uniquecode = funcionEvento.generateRandomCode() + "M";
                    CodigoTextbox.setText(Uniquecode);

                    TituloTextbox.setText("Evento Musical.");
                    
                    
                    break;

                case DEPORTIVO:
                    DescripcionTextbox.setText("Este evento es de tipo deportivo.");

                    Uniquecode = funcionEvento.generateRandomCode() + "D";
                    CodigoTextbox.setText(Uniquecode);

                    TituloTextbox.setText("Evento deportivo.");
                    break;

                case RELIGIOSO:
                    DescripcionTextbox.setText("Este evento es de tipo religioso.");

                    Uniquecode = funcionEvento.generateRandomCode() + "R";
                    CodigoTextbox.setText(Uniquecode);

                    TituloTextbox.setText("Evento Religioso.");
                    break;

                default:
                    break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JFrame frame = new JFrame();
        CalendarioPanel calendar = new CalendarioPanel(0,0, usuariosArray, "", funcionUsuario);
        CustomDatePickerDialog dialog = new CustomDatePickerDialog(frame);

        dialog.setVisible(true);
        
        System.out.println(selectedDate);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yy");

        if (selectedDate != null) {
            System.out.println("No esta null.");

            int usuarioEleccion = JOptionPane.showConfirmDialog(
                    null,
                    "Desea elegir " + dateFormat.format(selectedDate) + " como su fecha para el evento?",
                    "ELEGIR FECHA",
                    JOptionPane.YES_NO_OPTION
            );

            if (usuarioEleccion == JOptionPane.YES_OPTION) {
                System.out.println(selectedDate);
                FechaTextbox.setText(dateFormat.format(selectedDate));
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Se canceló la operación.");
                frame.dispose();
            }
        } else {
            System.out.println("esta null");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
       TipoDeporte selectedItem = (TipoDeporte) jComboBox2.getSelectedItem();

        if (selectedItem != null) {

            switch (selectedItem) {

                case FUTBOL:
                    DescripcionTextbox.setText("Este evento es de tipo musical.");

                    Uniquecode = funcionEvento.generateRandomCode() + "M";
                    CodigoTextbox.setText(Uniquecode);

                    TituloTextbox.setText("Evento Musical.");
                    
                    
                    break;

                case TENIS:
                    DescripcionTextbox.setText("Este evento es de tipo deportivo.");

                    Uniquecode = funcionEvento.generateRandomCode() + "D";
                    CodigoTextbox.setText(Uniquecode);

                    TituloTextbox.setText("Evento deportivo.");
                    break;

                case RUGBY:
                    DescripcionTextbox.setText("Este evento es de tipo religioso.");

                    Uniquecode = funcionEvento.generateRandomCode() + "R";
                    CodigoTextbox.setText(Uniquecode);

                    TituloTextbox.setText("Evento Religioso.");
                    break;

                case BASEBALL:
                    DescripcionTextbox.setText("Este evento es de tipo religioso.");

                    Uniquecode = funcionEvento.generateRandomCode() + "R";
                    CodigoTextbox.setText(Uniquecode);

                    TituloTextbox.setText("Evento Religioso.");
                    break;

                default:
                    break;
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void CrearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBTNActionPerformed

        TipoEvento TipoEvento = (TipoEvento) jComboBox1.getSelectedItem();
        TipoDeporte TipoDeporte = (TipoDeporte) jComboBox2.getSelectedItem();
        String equipo1 = Equipo1Textbox.getText();
        String equipo2 = Equipo2Textbox.getText();
        String cantidad = CantidadTextbox.getText();
        

        String titulo = TituloTextbox.getText();
        String codigo = CodigoTextbox.getText();
        String fecha = FechaTextbox.getText();
        String monto = MontoTextbox.getText();
        String desc = DescripcionTextbox.getText();
        
        LocalDateTime fechaDate = LocalDateTime.parse(fecha);

        if (codigo.isEmpty() || monto.isEmpty() || fecha.isEmpty() || desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

    try {
        double montoDouble = Double.parseDouble(monto);
        int cantidadInt = Integer.parseInt(cantidad);
        
        switch (TipoEvento) {
            case DEPORTIVO:
                funcionEvento.CrearEventoDeportivo(codigo, titulo, desc, fechaDate, montoDouble, name, equipo1, equipo2, cantidadInt, TipoDeporte.toString());
                break;
//            case MUSICAL:
//                funcionEvento.CrearEventoMusical(codigo, titulo, desc, fechaDate, montoDouble, name, new ArrayList<>(), "GeneroMusical");
//                break;
//            case RELIGIOSO:
//                funcionEvento.CrearEventoReligioso(codigo, titulo, desc, LocalDateTime.parse(fecha), montoDouble, name, "DenominacionReligiosa", "OradorPrincipal");
//                break;
        }


    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El monto debe ser un número válido.");
        }
    }//GEN-LAST:event_CrearBTNActionPerformed

    private void DeportivoHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeportivoHideActionPerformed
        EventoDeportivo.setVisible(false);
    }//GEN-LAST:event_DeportivoHideActionPerformed

    private void DetallesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesBTNActionPerformed
        TipoEvento TipoEvento = (TipoEvento) jComboBox1.getSelectedItem();

        switch (TipoEvento) {
            case DEPORTIVO:
                EventoMusical.setVisible(false);
                EventoReligioso.setVisible(false);
                EventoDeportivo.setVisible(true);
                break;
            case MUSICAL:
                EventoDeportivo.setVisible(false);
                EventoReligioso.setVisible(false);
                EventoMusical.setVisible(true);
                break;
            case RELIGIOSO:
                EventoDeportivo.setVisible(false);
                EventoMusical.setVisible(false);
                EventoReligioso.setVisible(true);
                break;
            default:
        }

        EventoDeportivo.setVisible(true);
    }//GEN-LAST:event_DetallesBTNActionPerformed

    private void MusicaJcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicaJcomboActionPerformed
       EventoDeportivo.setVisible(false);
    }//GEN-LAST:event_MusicaJcomboActionPerformed

    private void MusicalHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicalHideActionPerformed
        EventoMusical.setVisible(false);
    }//GEN-LAST:event_MusicalHideActionPerformed

    private void ReligiosoHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReligiosoHideActionPerformed
        EventoReligioso.setVisible(false);
    }//GEN-LAST:event_ReligiosoHideActionPerformed

    private void Equipo1TextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipo1TextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Equipo1TextboxActionPerformed


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
    private javax.swing.JTextField CantidadTextbox;
    private javax.swing.JTextField CodigoTextbox;
    private javax.swing.JButton CrearBTN;
    private javax.swing.JButton DeportivoHide;
    private javax.swing.JTextArea DescripcionTextbox;
    private javax.swing.JButton DetallesBTN;
    private javax.swing.JTextField Equipo1Textbox;
    private javax.swing.JTextField Equipo2Textbox;
    private javax.swing.JPanel EventoDeportivo;
    private javax.swing.JPanel EventoMusical;
    private javax.swing.JPanel EventoReligioso;
    private javax.swing.JTextField FechaTextbox;
    private javax.swing.JTextField MontoTextbox;
    private javax.swing.JComboBox MusicaJcombo;
    private javax.swing.JButton MusicalHide;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JButton ReligiosoHide;
    private javax.swing.JTextField TituloTextbox;
    private javax.swing.JComboBox<TipoEvento> jComboBox1;
    private javax.swing.JComboBox<TipoDeporte> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
