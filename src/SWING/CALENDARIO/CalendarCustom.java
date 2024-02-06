
package SWING.CALENDARIO;

import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.SwingUtilities;

public class CalendarCustom extends javax.swing.JLayeredPane {

    private int mes;
    private int año;
    public Date selectedDate;
        private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;

    public CalendarCustom(ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        this.mes = mes;
        this.año = año;
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();
    
        initComponents();

        mesActual();
        slide.show(new CalendarioPanel(mes, año, usuariosArray, "", funcionUsuario), PanelSlide.AnimateType.TO_RIGHT);
        mostrarMesAño();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    SwingUtilities.invokeLater(() -> {
                        Date date = new Date();
                        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
                        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE,    dd/MM/yy");

                        String time = timeFormat.format(date);

                        Hora.setText(time.split(" ")[0]);
                        AmPm.setText(time.split(" ")[1]);
                        Fecha.setText(dateFormat.format(date));
                    });
                }
            }
        }).start();
    }



    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slide = new SWING.CALENDARIO.PanelSlide();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Hora = new javax.swing.JLabel();
        AmPm = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        NEXT = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        MONTH_YEAR = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(true);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slide.setBackground(new java.awt.Color(255, 255, 255));
        slide.setForeground(new java.awt.Color(255, 255, 255));
        add(slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 38, 530, 340));

        jPanel1.setBackground(new java.awt.Color(54, 54, 130));

        jPanel2.setBackground(new java.awt.Color(40, 40, 98));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Hora.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        Hora.setForeground(new java.awt.Color(255, 255, 255));
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hora.setText("12:55:00");

        AmPm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AmPm.setForeground(new java.awt.Color(255, 255, 255));
        AmPm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AmPm.setText("AM");

        Fecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("Monday,    05/02/23");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Hora)
                    .addComponent(Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AmPm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmPm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        NEXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Arrow_RIGHT.png"))); // NOI18N
        NEXT.setContentAreaFilled(false);
        NEXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NEXTActionPerformed(evt);
            }
        });
        add(NEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 50, 40));

        BACK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Arrow_LEFT.png"))); // NOI18N
        BACK.setContentAreaFilled(false);
        BACK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });
        add(BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 40, 40));

        MONTH_YEAR.setBackground(new java.awt.Color(54, 54, 130));
        MONTH_YEAR.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        MONTH_YEAR.setForeground(new java.awt.Color(54, 54, 130));
        MONTH_YEAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MONTH_YEAR.setText("MONTH - YEAR");
        add(MONTH_YEAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 450, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void NEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NEXTActionPerformed
        if (mes == 12) {
            mes = 1;
            año++;
        } else {
            mes++;
        }
        slide.show(new CalendarioPanel(mes, año, usuariosArray, "", funcionUsuario), PanelSlide.AnimateType.TO_LEFT);
        mostrarMesAño();
    }//GEN-LAST:event_NEXTActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        if (mes == 1) {
            mes = 12;
            año--;
        } else {
            mes--;
        }
        slide.show(new CalendarioPanel(mes, año, usuariosArray, "", funcionUsuario), PanelSlide.AnimateType.TO_RIGHT);
        mostrarMesAño();
    }//GEN-LAST:event_BACKActionPerformed

    private void mesActual(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        mes = calendar.get(Calendar.MONTH) + 1;
        año = calendar.get(Calendar.YEAR);
        
    }
    
    private void mostrarMesAño(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, mes-1);
        calendar.set(Calendar.YEAR, año);
        calendar.set(Calendar.DATE, 1);
        SimpleDateFormat df = new SimpleDateFormat("MMMM-yyyy");
        MONTH_YEAR.setText(df.format(calendar.getTime()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmPm;
    private javax.swing.JButton BACK;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel MONTH_YEAR;
    private javax.swing.JButton NEXT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private SWING.CALENDARIO.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
