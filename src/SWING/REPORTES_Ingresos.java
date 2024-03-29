package SWING;

import EVENTOS_USUARIOS.Evento;
import EVENTOS_USUARIOS.EventoDeportivo;
import EVENTOS_USUARIOS.EventoMusical;
import EVENTOS_USUARIOS.EventoReligioso;
import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import SWING.CALENDARIO.CalendarioPanel;
import SWING.PIECHART.DynamicPieChart;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class REPORTES_Ingresos extends javax.swing.JFrame {

    public static ArrayList<Evento> eventos;
    public static ArrayList<Evento> eventosCancelados;

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private EventosMetodos funcionEvento;
    public static Date selectedDate;
    Date startDate = null;
    Date endDate = null;
    int montoDeportivo = 0;
    int montoReligioso = 0;
    int montoMusical = 0;
    double montoTotal;

    private SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yy");

    public REPORTES_Ingresos(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion, EventosMetodos EventoFuncion) throws ParseException {
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        usuariosArray = Login.getUsuariosArray();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
        funcionEvento = EventoFuncion != null ? EventoFuncion : new EventosMetodos();

        eventosCancelados = funcionEvento.eventosCancelados();
        eventos = funcionEvento.eventos();

        if (eventos == null) {
            eventos = new ArrayList<Evento>();

        }

        if (eventosCancelados == null) {
            eventosCancelados = new ArrayList<Evento>();
        }

        initComponents();

        setLocationRelativeTo(null);

        //FIRST JFRAME
        JFrame frame = new JFrame();
        CalendarioPanel calendar = new CalendarioPanel(0, 0, usuariosArray, "", funcionUsuario);
        CustomDatePickerDialog dialog = new CustomDatePickerDialog(frame);

        dialog.setVisible(true);

        System.out.println(selectedDate);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd/MM/yy");

        if (selectedDate != null) {
            System.out.println("No esta null.");

            int usuarioEleccion = JOptionPane.showConfirmDialog(
                    null,
                    "Desea elegir " + dateFormat.format(selectedDate) + " como su fecha para el evento?",
                    "ELEGIR PRIMERA FECHA",
                    JOptionPane.YES_NO_OPTION
            );

            if (usuarioEleccion == JOptionPane.YES_OPTION) {
                System.out.println(selectedDate);

                FIRSTDATE.setText(dateFormat.format(selectedDate));
                frame.dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Se canceló la operación.");
                frame.dispose();
            }

        } else {
            System.out.println("esta null");
        }

        //SECOND JFRAME
        JFrame frame1 = new JFrame();
        CalendarioPanel calendar1 = new CalendarioPanel(0, 0, usuariosArray, "", funcionUsuario);
        CustomDatePickerDialog dialog1 = new CustomDatePickerDialog(frame1);

        dialog1.setVisible(true);

        System.out.println(selectedDate);

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("EEEE, dd/MM/yy");

        if (selectedDate != null) {
            System.out.println("No esta null.");

            int usuarioEleccion = JOptionPane.showConfirmDialog(
                    null,
                    "Desea elegir " + dateFormat.format(selectedDate) + " como su fecha para el evento?",
                    "ELEGIR SEGUNDA FECHA",
                    JOptionPane.YES_NO_OPTION
            );

            if (usuarioEleccion == JOptionPane.YES_OPTION) {
                System.out.println(selectedDate);
                LASTDATE.setText(dateFormat.format(selectedDate));
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Se canceló la operación.");
                frame.dispose();
            }
        } else {
            System.out.println("esta null");
        }

        Date startDate = dateFormat.parse(FIRSTDATE.getText());
        Date endDate = dateFormat.parse(LASTDATE.getText());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Eventos = new javax.swing.JTextArea();
        CanceladosBTN = new javax.swing.JButton();
        ReligiososBTN = new javax.swing.JButton();
        MusicalesBTN = new javax.swing.JButton();
        DeportivosBTN = new javax.swing.JButton();
        RegresarBTN = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        LASTDATE = new javax.swing.JLabel();
        FIRSTDATE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 201, 76));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("TOTAL GENERADO:                 ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 420, 30));

        Eventos.setEditable(false);
        Eventos.setBackground(new java.awt.Color(245, 245, 245));
        Eventos.setColumns(20);
        Eventos.setRows(5);
        Eventos.setBorder(null);
        jScrollPane1.setViewportView(Eventos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 520, 280));

        CanceladosBTN.setBorder(null);
        CanceladosBTN.setContentAreaFilled(false);
        CanceladosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanceladosBTNActionPerformed(evt);
            }
        });
        getContentPane().add(CanceladosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 200, 40));

        ReligiososBTN.setBorder(null);
        ReligiososBTN.setContentAreaFilled(false);
        ReligiososBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReligiososBTNActionPerformed(evt);
            }
        });
        getContentPane().add(ReligiososBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 311, 190, 40));

        MusicalesBTN.setBorder(null);
        MusicalesBTN.setContentAreaFilled(false);
        MusicalesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicalesBTNActionPerformed(evt);
            }
        });
        getContentPane().add(MusicalesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 251, 190, 40));

        DeportivosBTN.setBorder(null);
        DeportivosBTN.setContentAreaFilled(false);
        DeportivosBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeportivosBTNActionPerformed(evt);
            }
        });
        getContentPane().add(DeportivosBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 191, 190, 40));

        RegresarBTN.setBorder(null);
        RegresarBTN.setContentAreaFilled(false);
        RegresarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBTNActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 473, 187, 51));

        jButton1.setBackground(new java.awt.Color(200, 200, 200));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/graph_ICON (3) (1).png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 100, 80));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 140, 30));

        LASTDATE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LASTDATE.setForeground(new java.awt.Color(0, 0, 0));
        LASTDATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LASTDATE.setText("LAST DATE");
        getContentPane().add(LASTDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 140, 30));

        FIRSTDATE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FIRSTDATE.setForeground(new java.awt.Color(0, 0, 0));
        FIRSTDATE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FIRSTDATE.setText("FIRST DATE");
        getContentPane().add(FIRSTDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/BG_ReportesIngresos.png"))); // NOI18N
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

    private void DeportivosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeportivosBTNActionPerformed
        Eventos.setText("");
        montoTotal = 0;

        try {
            startDate = dateFormat.parse(FIRSTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            endDate = dateFormat.parse(LASTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            startDate = dateFormat.parse(FIRSTDATE.getText());
            endDate = dateFormat.parse(LASTDATE.getText());
        } catch (ParseException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error parsing dates: " + ex.getMessage());
            return;
        }

        for (Evento evento : eventos) {
            if (evento != null) {
                Date eventDate = evento.getFecha();

                if (eventDate != null && eventDate.after(startDate) && eventDate.before(endDate)) {
                    if (evento instanceof EventoDeportivo) {
                        EventoDeportivo deportivoEvento = (EventoDeportivo) evento;
                        Eventos.append("Monto: " + deportivoEvento.getMonto() + " - ");
                        Eventos.append("Codigo: " + deportivoEvento.getCodigo() + " - ");
                        Eventos.append("Titulo: " + deportivoEvento.getTitulo() + "\n");
                        montoDeportivo++;

                        montoTotal += deportivoEvento.getMonto();
                    }
                }
            }
        }

        jLabel5.setText("TOTAL GENERADO:" + String.valueOf(montoTotal));

    }//GEN-LAST:event_DeportivosBTNActionPerformed

    private void MusicalesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicalesBTNActionPerformed
        Eventos.setText("");
        montoTotal = 0;

        try {
            startDate = dateFormat.parse(FIRSTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            endDate = dateFormat.parse(LASTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }

            for (Evento evento : eventos) {
                if (evento != null) {

                    Date eventDate = evento.getFecha();

                    if (eventDate.after(startDate) && eventDate.before(endDate)) {
                        if (evento instanceof EventoMusical) {
                            EventoMusical musicalEvento = (EventoMusical) evento;
                            Eventos.append(" Monto: " + musicalEvento.getMonto() + " - ");
                            Eventos.append("Codigo: " + musicalEvento.getCodigo() + " - ");
                            Eventos.append("Titulo: " + musicalEvento.getTitulo() + "\n");
                            montoMusical++;

                            montoTotal += musicalEvento.getMonto();

                        }
                    }
                }
            }
       

        jLabel5.setText("TOTAL GENERADO:" + String.valueOf(montoTotal));

    }//GEN-LAST:event_MusicalesBTNActionPerformed

    private void ReligiososBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReligiososBTNActionPerformed
        Eventos.setText("");
        montoTotal = 0;
        
        try {
            startDate = dateFormat.parse(FIRSTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            endDate = dateFormat.parse(LASTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }

            for (Evento evento : eventos) {
                if (evento != null) {

                    Date eventDate = evento.getFecha();

                    if (eventDate.after(startDate) && eventDate.before(endDate)) {
                        if (evento instanceof EventoReligioso) {
                            EventoReligioso religiosoEvento = (EventoReligioso) evento;
                            Eventos.append(" Monto: " + religiosoEvento.getMonto() + " - ");
                            Eventos.append("Codigo: " + religiosoEvento.getCodigo() + " - ");
                            Eventos.append("Titulo: " + religiosoEvento.getTitulo() + "\n");
                            montoReligioso++;

                            montoTotal += religiosoEvento.getMonto();

                        }
                    }
                }
            }

        jLabel5.setText("TOTAL GENERADO:" + String.valueOf(montoTotal));

    }//GEN-LAST:event_ReligiososBTNActionPerformed

    private void CanceladosBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanceladosBTNActionPerformed
        Eventos.setText("");
        montoTotal = 0;

        try {
            startDate = dateFormat.parse(FIRSTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            endDate = dateFormat.parse(LASTDATE.getText());
        } catch (ParseException ex) {
            Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Evento evento : eventosCancelados) {
            if (evento != null) {
                Date eventDate = evento.getFecha();

                if (eventDate.after(startDate) && eventDate.before(endDate)) {
                    if (evento instanceof EventoMusical) {
                        EventoMusical musicalEvento = (EventoMusical) evento;
                        Eventos.append(" Monto: " + musicalEvento.getMonto() + " - ");
                        Eventos.append("Codigo: " + musicalEvento.getCodigo() + " - ");
                        Eventos.append("Titulo: " + musicalEvento.getTitulo() + "\n");

                        montoTotal += musicalEvento.getMonto();
                    } else if (evento instanceof EventoDeportivo) {
                        EventoDeportivo deportivoEvento = (EventoDeportivo) evento;
                        Eventos.append(" Monto: " + deportivoEvento.getMonto() + " - ");
                        Eventos.append("Codigo: " + deportivoEvento.getCodigo() + " - ");
                        Eventos.append("Titulo: " + deportivoEvento.getTitulo() + "\n");

                        montoTotal += deportivoEvento.getMonto();
                    } else if (evento instanceof EventoReligioso) {
                        EventoReligioso religiosoEvento = (EventoReligioso) evento;
                        Eventos.append(" Monto: " + religiosoEvento.getMonto() + " - ");
                        Eventos.append("Codigo: " + religiosoEvento.getCodigo() + " - ");
                        Eventos.append("Titulo: " + religiosoEvento.getTitulo() + "\n");

                        montoTotal += religiosoEvento.getMonto();
                    }
                }
            }
        }

        jLabel5.setText("TOTAL GENERADO:" + String.valueOf(montoTotal));
    }//GEN-LAST:event_CanceladosBTNActionPerformed

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        jButton1.setToolTipText("Graficos en relacion al monto de eventos y sus tipos.");
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            DynamicPieChart grafico = new DynamicPieChart("EVENTOS FUTUROS - GRAFICO", new int[]{montoDeportivo, montoReligioso, montoMusical});
            grafico.setVisible(true);
            grafico.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(REPORTES_Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REPORTES_Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REPORTES_Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REPORTES_Ingresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new REPORTES_Ingresos(new ArrayList<Usuario>(), "", new UsuariosMetodos(), new EventosMetodos()).setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(REPORTES_Ingresos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanceladosBTN;
    private javax.swing.JButton DeportivosBTN;
    private javax.swing.JTextArea Eventos;
    private javax.swing.JLabel FIRSTDATE;
    private javax.swing.JLabel LASTDATE;
    private javax.swing.JButton MusicalesBTN;
    private javax.swing.JButton RegresarBTN;
    private javax.swing.JButton ReligiososBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
