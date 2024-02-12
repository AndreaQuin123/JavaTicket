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
import EVENTOS_USUARIOS.EventoMusical.TipoMusical;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import SWING.CALENDARIO.CalendarioPanel;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

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

    public CrearEvento_AdminContenido(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion) {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

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
        EventoMusical = new javax.swing.JPanel();
        MusicaJcombo = new javax.swing.JComboBox<>();
        MusicalHide = new javax.swing.JButton();
        CantidadTextbox1 = new javax.swing.JTextField();
        SeguroTextbox = new javax.swing.JTextField();
        CANTIDADLABEL1 = new javax.swing.JLabel();
        SEGUROLABEL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        EventoReligioso = new javax.swing.JPanel();
        ReligiosoHide = new javax.swing.JButton();
        CANTIDADLABEL2 = new javax.swing.JLabel();
        CantidadTextbox3 = new javax.swing.JTextField();
        SeguroTextbox1 = new javax.swing.JTextField();
        SEGUROLABEL3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EventoDeportivo = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        CantidadTextbox = new javax.swing.JTextField();
        Equipo1Textbox = new javax.swing.JTextField();
        EQUIPO1LABEL = new javax.swing.JLabel();
        EQUIPO2LABEL = new javax.swing.JLabel();
        Equipo2Textbox = new javax.swing.JTextField();
        DeportivoHide = new javax.swing.JButton();
        CANTIDADLABEL = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 310, 30, 40));

        EventoMusical.setBackground(new java.awt.Color(136, 140, 186));
        EventoMusical.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MusicaJcombo.setBackground(new java.awt.Color(255, 255, 255));
        MusicaJcombo.setForeground(new java.awt.Color(0, 0, 0));
        MusicaJcombo.setModel(new javax.swing.DefaultComboBoxModel<>(TipoMusical.values()));
        MusicaJcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicaJcomboActionPerformed(evt);
            }
        });
        EventoMusical.add(MusicaJcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 300, 40));

        MusicalHide.setBackground(new java.awt.Color(231, 201, 76));
        MusicalHide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MusicalHide.setForeground(new java.awt.Color(40, 60, 100));
        MusicalHide.setContentAreaFilled(false);
        MusicalHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicalHideActionPerformed(evt);
            }
        });
        EventoMusical.add(MusicalHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 190, 50));

        CantidadTextbox1.setBackground(new java.awt.Color(255, 255, 255));
        CantidadTextbox1.setForeground(new java.awt.Color(0, 0, 0));
        CantidadTextbox1.setText("Cantidad");
        CantidadTextbox1.setBorder(null);
        CantidadTextbox1.setOpaque(true);
        CantidadTextbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadTextbox1ActionPerformed(evt);
            }
        });
        EventoMusical.add(CantidadTextbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 210, 40));

        SeguroTextbox.setEditable(false);
        SeguroTextbox.setBackground(new java.awt.Color(255, 255, 255));
        SeguroTextbox.setForeground(new java.awt.Color(0, 0, 0));
        SeguroTextbox.setText("2000");
        SeguroTextbox.setBorder(null);
        SeguroTextbox.setOpaque(true);
        SeguroTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguroTextboxActionPerformed(evt);
            }
        });
        EventoMusical.add(SeguroTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 30));

        CANTIDADLABEL1.setBackground(new java.awt.Color(255, 255, 255));
        CANTIDADLABEL1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        CANTIDADLABEL1.setForeground(new java.awt.Color(255, 255, 255));
        CANTIDADLABEL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CANTIDADLABEL1.setText("CANTIDAD");
        EventoMusical.add(CANTIDADLABEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 50));

        SEGUROLABEL.setBackground(new java.awt.Color(255, 255, 255));
        SEGUROLABEL.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        SEGUROLABEL.setForeground(new java.awt.Color(255, 255, 255));
        SEGUROLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEGUROLABEL.setText("SEGURO");
        EventoMusical.add(SEGUROLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PanelExtra_EventoCreacionReligioso.png"))); // NOI18N
        EventoMusical.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 410, 540));

        getContentPane().add(EventoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 390, 540));

        EventoReligioso.setBackground(new java.awt.Color(136, 140, 186));
        EventoReligioso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReligiosoHide.setBackground(new java.awt.Color(231, 201, 76));
        ReligiosoHide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReligiosoHide.setForeground(new java.awt.Color(40, 60, 100));
        ReligiosoHide.setContentAreaFilled(false);
        ReligiosoHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReligiosoHideActionPerformed(evt);
            }
        });
        EventoReligioso.add(ReligiosoHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 190, 50));

        CANTIDADLABEL2.setBackground(new java.awt.Color(255, 255, 255));
        CANTIDADLABEL2.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        CANTIDADLABEL2.setForeground(new java.awt.Color(255, 255, 255));
        CANTIDADLABEL2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CANTIDADLABEL2.setText("CANTIDAD");
        EventoReligioso.add(CANTIDADLABEL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 50));

        CantidadTextbox3.setBackground(new java.awt.Color(255, 255, 255));
        CantidadTextbox3.setForeground(new java.awt.Color(0, 0, 0));
        CantidadTextbox3.setText("Cantidad");
        CantidadTextbox3.setBorder(null);
        CantidadTextbox3.setOpaque(true);
        CantidadTextbox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadTextbox3ActionPerformed(evt);
            }
        });
        EventoReligioso.add(CantidadTextbox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 210, 30));

        SeguroTextbox1.setEditable(false);
        SeguroTextbox1.setBackground(new java.awt.Color(255, 255, 255));
        SeguroTextbox1.setForeground(new java.awt.Color(0, 0, 0));
        SeguroTextbox1.setText("2000");
        SeguroTextbox1.setBorder(null);
        SeguroTextbox1.setOpaque(true);
        EventoReligioso.add(SeguroTextbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 30));

        SEGUROLABEL3.setBackground(new java.awt.Color(255, 255, 255));
        SEGUROLABEL3.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        SEGUROLABEL3.setForeground(new java.awt.Color(255, 255, 255));
        SEGUROLABEL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SEGUROLABEL3.setText("SEGURO");
        EventoReligioso.add(SEGUROLABEL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PanelExtra_EventoCreacionReligioso.png"))); // NOI18N
        EventoReligioso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 410, 540));

        getContentPane().add(EventoReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 390, 540));

        EventoDeportivo.setBackground(new java.awt.Color(136, 140, 186));
        EventoDeportivo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(TipoDeporte.values()));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        EventoDeportivo.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 300, 40));

        CantidadTextbox.setBackground(new java.awt.Color(255, 255, 255));
        CantidadTextbox.setForeground(new java.awt.Color(0, 0, 0));
        CantidadTextbox.setText("Cantidad");
        CantidadTextbox.setBorder(null);
        CantidadTextbox.setOpaque(true);
        EventoDeportivo.add(CantidadTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 210, 30));

        Equipo1Textbox.setBackground(new java.awt.Color(255, 255, 255));
        Equipo1Textbox.setForeground(new java.awt.Color(0, 0, 0));
        Equipo1Textbox.setText("Equipo 1");
        Equipo1Textbox.setBorder(null);
        Equipo1Textbox.setOpaque(true);
        Equipo1Textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Equipo1TextboxActionPerformed(evt);
            }
        });
        EventoDeportivo.add(Equipo1Textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 210, 40));

        EQUIPO1LABEL.setBackground(new java.awt.Color(255, 255, 255));
        EQUIPO1LABEL.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        EQUIPO1LABEL.setForeground(new java.awt.Color(255, 255, 255));
        EQUIPO1LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EQUIPO1LABEL.setText("EQUIPO 1");
        EventoDeportivo.add(EQUIPO1LABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 50));

        EQUIPO2LABEL.setBackground(new java.awt.Color(255, 255, 255));
        EQUIPO2LABEL.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        EQUIPO2LABEL.setForeground(new java.awt.Color(255, 255, 255));
        EQUIPO2LABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EQUIPO2LABEL.setText("EQUIPO 2");
        EventoDeportivo.add(EQUIPO2LABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 50));

        Equipo2Textbox.setBackground(new java.awt.Color(255, 255, 255));
        Equipo2Textbox.setForeground(new java.awt.Color(0, 0, 0));
        Equipo2Textbox.setText("Equipo 2");
        Equipo2Textbox.setBorder(null);
        Equipo2Textbox.setOpaque(true);
        EventoDeportivo.add(Equipo2Textbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, 30));

        DeportivoHide.setBackground(new java.awt.Color(231, 201, 76));
        DeportivoHide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeportivoHide.setForeground(new java.awt.Color(40, 60, 100));
        DeportivoHide.setContentAreaFilled(false);
        DeportivoHide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeportivoHideActionPerformed(evt);
            }
        });
        EventoDeportivo.add(DeportivoHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 190, 50));

        CANTIDADLABEL.setBackground(new java.awt.Color(255, 255, 255));
        CANTIDADLABEL.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        CANTIDADLABEL.setForeground(new java.awt.Color(255, 255, 255));
        CANTIDADLABEL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CANTIDADLABEL.setText("CANTIDAD");
        EventoDeportivo.add(CANTIDADLABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/PanelExtra_EventoCreacion.png"))); // NOI18N
        EventoDeportivo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 410, 540));

        getContentPane().add(EventoDeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 390, 540));

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
        getContentPane().add(DetallesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 180, 50));

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
        getContentPane().add(CrearBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 180, 50));

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
        MontoTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MontoTextboxActionPerformed(evt);
            }
        });
        getContentPane().add(MontoTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 220, 40));

        FechaTextbox.setEditable(false);
        FechaTextbox.setBackground(new java.awt.Color(245, 245, 245));
        FechaTextbox.setForeground(new java.awt.Color(0, 0, 0));
        FechaTextbox.setBorder(null);
        getContentPane().add(FechaTextbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 190, 40));

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

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void CrearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBTNActionPerformed

        TipoEvento TipoEvento = (TipoEvento) jComboBox1.getSelectedItem();

        try {
            switch (TipoEvento) {
                case DEPORTIVO:
                    handleDeportivoEvent();
                    break;
                case MUSICAL:
                    handleMusicalEvent();
                    break;
                case RELIGIOSO:
                    handleReligiosoEvent();
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos para monto y cantidad.");
        }
    }//GEN-LAST:event_CrearBTNActionPerformed

    private void handleDeportivoEvent() {

        String titulo = TituloTextbox.getText();
        String codigo = CodigoTextbox.getText();
        String fecha = FechaTextbox.getText();
        Date fechaDate;

        try {
            fechaDate = new SimpleDateFormat("EEEE, dd/MM/yy", Locale.ENGLISH).parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
        String monto = MontoTextbox.getText();
        String desc = DescripcionTextbox.getText();

        if (codigo.isEmpty() || monto.isEmpty() || fecha.isEmpty() || desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        TipoDeporte tipoDeporte = (TipoDeporte) jComboBox2.getSelectedItem();
        String equipo1 = Equipo1Textbox.getText();
        String equipo2 = Equipo2Textbox.getText();
        String cantidad = CantidadTextbox.getText();

        try {
            double montoDouble = Double.parseDouble(monto);
            int cantidadInt = Integer.parseInt(cantidad);
           
            funcionEvento.CrearEventoDeportivo(codigo, titulo, desc, fechaDate, montoDouble, name, equipo1, equipo2, cantidadInt, tipoDeporte.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos para monto y cantidad.");
        }

    }

    private void handleReligiosoEvent() {

        String cantidadReligioso = null;
        String seguroReligioso = null;

        String titulo = TituloTextbox.getText();
        String codigo = CodigoTextbox.getText();
        String fecha = FechaTextbox.getText();
        Date fechaDate;

        try {
            fechaDate = new SimpleDateFormat("EEEE, dd/MM/yy", Locale.ENGLISH).parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }

        String monto = MontoTextbox.getText();
        String desc = DescripcionTextbox.getText();

        if (codigo.isEmpty() || monto.isEmpty() || fecha.isEmpty() || desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        if (CantidadTextbox3 != null && SeguroTextbox1 != null) {
            cantidadReligioso = CantidadTextbox3.getText();
            seguroReligioso = SeguroTextbox1.getText();
        }

        try {
            double seguroReligiosoDouble = Double.parseDouble(seguroReligioso);
            double montoDouble = Double.parseDouble(monto);
            int cantidadReligiosaINT = Integer.parseInt(cantidadReligioso);
            funcionEvento.CrearEventoReligioso(codigo, titulo, desc, fechaDate, montoDouble, name, seguroReligiosoDouble, cantidadReligiosaINT);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos para monto y cantidad.");
        }

    }

    private void handleMusicalEvent() {

        TipoMusical TipoMusical = null;
        String cantidadMusica = null;
        String seguroMusica = null;

        if (MusicaJcombo != null && CantidadTextbox1 != null && SeguroTextbox != null) {
            TipoMusical = (TipoMusical) MusicaJcombo.getSelectedItem();
            cantidadMusica = CantidadTextbox1.getText();
            seguroMusica = SeguroTextbox.getText();
        }

        String titulo = TituloTextbox.getText();
        String codigo = CodigoTextbox.getText();
        String fecha = FechaTextbox.getText();
        Date fechaDate;

        try {
            fechaDate = new SimpleDateFormat("EEEE, dd/MM/yy", Locale.ENGLISH).parse(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            return;
        }
        String monto = MontoTextbox.getText();
        String desc = DescripcionTextbox.getText();

        if (codigo.isEmpty() || monto.isEmpty() || fecha.isEmpty() || desc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
            return;
        }

        try {
            
            double seguroMusicalDouble = Double.parseDouble(seguroMusica);
            int cantidadInt2 = Integer.parseInt(cantidadMusica);
            double montoDouble = Double.parseDouble(monto);
            
            funcionEvento.CrearEventoMusical(codigo, titulo, desc, fechaDate, montoDouble, name, seguroMusicalDouble, cantidadInt2, TipoMusical.toString());
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese valores numéricos válidos para monto y cantidad.");
        }

    }

    
    private void DeportivoHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeportivoHideActionPerformed
        EventoDeportivo.setVisible(false);
        DescripcionTextbox.setEditable(true);
    }//GEN-LAST:event_DeportivoHideActionPerformed

    private void DetallesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetallesBTNActionPerformed
        TipoEvento TipoEvento = (TipoEvento) jComboBox1.getSelectedItem();

        switch (TipoEvento) {
            case DEPORTIVO:
                EventoMusical.setVisible(false);
                EventoReligioso.setVisible(false);
                EventoDeportivo.setVisible(true);
                 DescripcionTextbox.setEditable(false);

                break;
            case MUSICAL:
                EventoDeportivo.setVisible(false);
                EventoReligioso.setVisible(false);
                EventoMusical.setVisible(true);
                 DescripcionTextbox.setEditable(false);
                break;
            case RELIGIOSO:
                EventoDeportivo.setVisible(false);
                EventoMusical.setVisible(false);
                EventoReligioso.setVisible(true);
                 DescripcionTextbox.setEditable(false);
                break;
            default:
        }
    }//GEN-LAST:event_DetallesBTNActionPerformed

    private void MusicaJcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicaJcomboActionPerformed
       
    }//GEN-LAST:event_MusicaJcomboActionPerformed

    private void ReligiosoHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReligiosoHideActionPerformed
        EventoReligioso.setVisible(false);
        DescripcionTextbox.setEditable(true);
    }//GEN-LAST:event_ReligiosoHideActionPerformed

    private void Equipo1TextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Equipo1TextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Equipo1TextboxActionPerformed

    private void MusicalHideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicalHideActionPerformed
        EventoMusical.setVisible(false);
        DescripcionTextbox.setEditable(true);
    }//GEN-LAST:event_MusicalHideActionPerformed

    private void CantidadTextbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadTextbox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadTextbox1ActionPerformed

    private void CantidadTextbox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadTextbox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadTextbox3ActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void SeguroTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguroTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeguroTextboxActionPerformed

    private void MontoTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MontoTextboxActionPerformed
        String monto = MontoTextbox.getText();

        try {

            double montoDouble = Double.parseDouble(monto);
            double seguro = montoDouble * 0.30;
   
            SeguroTextbox.setText(String.valueOf(seguro));
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_MontoTextboxActionPerformed



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
                new CrearEvento_AdminContenido(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CANTIDADLABEL;
    private javax.swing.JLabel CANTIDADLABEL1;
    private javax.swing.JLabel CANTIDADLABEL2;
    private javax.swing.JTextField CantidadTextbox;
    private javax.swing.JTextField CantidadTextbox1;
    private javax.swing.JTextField CantidadTextbox3;
    private javax.swing.JTextField CodigoTextbox;
    private javax.swing.JButton CrearBTN;
    private javax.swing.JButton DeportivoHide;
    private javax.swing.JTextArea DescripcionTextbox;
    private javax.swing.JButton DetallesBTN;
    private javax.swing.JLabel EQUIPO1LABEL;
    private javax.swing.JLabel EQUIPO2LABEL;
    private javax.swing.JTextField Equipo1Textbox;
    private javax.swing.JTextField Equipo2Textbox;
    private javax.swing.JPanel EventoDeportivo;
    private javax.swing.JPanel EventoMusical;
    private javax.swing.JPanel EventoReligioso;
    private javax.swing.JTextField FechaTextbox;
    private javax.swing.JTextField MontoTextbox;
    private javax.swing.JComboBox<TipoMusical> MusicaJcombo;
    private javax.swing.JButton MusicalHide;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JButton ReligiosoHide;
    private javax.swing.JLabel SEGUROLABEL;
    private javax.swing.JLabel SEGUROLABEL3;
    private javax.swing.JTextField SeguroTextbox;
    private javax.swing.JTextField SeguroTextbox1;
    private javax.swing.JTextField TituloTextbox;
    private javax.swing.JComboBox<TipoEvento> jComboBox1;
    private javax.swing.JComboBox<TipoDeporte> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
