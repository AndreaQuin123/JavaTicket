package SWING.CALENDARIO;

import EVENTOS_USUARIOS.EventosMetodos;
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import SWING.CrearEvento_AdminContenido;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CalendarioPanel extends javax.swing.JLayeredPane {

    private ArrayList<Usuario> usuariosArray;
    private String name;
    private UsuariosMetodos funcionUsuario;
    private int mes;
    private int año;
    private Date fechaSeleccionada;

    public CalendarioPanel(int mes, int año, ArrayList<Usuario> usuarios, String name, UsuariosMetodos UsuarioFuncion) {
        initComponents();
        this.mes = mes;
        this.año = año;
        usuariosArray = usuarios != null ? usuarios : new ArrayList<Usuario>();
        this.name = name;
        funcionUsuario = UsuarioFuncion != null ? UsuarioFuncion : new UsuariosMetodos();

        for (Component com : getComponents()) {
            if (com instanceof SWING.CALENDARIO.Dia) {
                SWING.CALENDARIO.Dia dia = (SWING.CALENDARIO.Dia) com;
                dia.addActionListener((java.awt.event.ActionEvent evt) -> {
                    diaActionPerformed(dia);
                });
            }
        }

        init();
    }

    private void diaActionPerformed(SWING.CALENDARIO.Dia dia) {
        clearIcons();
        Icon icon = new ImageIcon(getClass().getClassLoader().getResource("IMAGENES/STAR_Icon.png"));
        dia.setIcon(icon);
        fechaSeleccionada = dia.getFecha();
        CrearEvento_AdminContenido creatorInstance = new CrearEvento_AdminContenido(usuariosArray, "", funcionUsuario);
        creatorInstance.selectedDate = fechaSeleccionada;
        System.out.println(fechaSeleccionada);
    }
    
    public Date getFechaSeleccionada(){
        return fechaSeleccionada;
    }

    private void init() {
        Day_Sunday.asTitle();
        Day_Monday.asTitle();
        Day_Tuesday.asTitle();
        Day_Wednesday.asTitle();
        Day_Thursday.asTitle();
        Day_Friday.asTitle();
        Day_Saturday.asTitle();
        setFecha();
    }

private void setFecha() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, año);
        calendar.set(Calendar.MONTH, mes - 1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        
        for (Component com : getComponents()) {
            Dia dia = (Dia) com;
            if (!dia.isTitle()) {
                dia.setText(calendar.get(Calendar.DATE) + "");
                dia.setFecha(calendar.getTime());
                dia.mesActual(calendar.get(Calendar.MONTH) == mes - 1);
                if (toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)))) {
                    dia.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1);
            }
        }
    }

    private ToDay getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    /**
     * WARNING: Do NOT modify this code.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Day_Sunday = new SWING.CALENDARIO.Dia();
        Day_Monday = new SWING.CALENDARIO.Dia();
        Day_Tuesday = new SWING.CALENDARIO.Dia();
        Day_Wednesday = new SWING.CALENDARIO.Dia();
        Day_Thursday = new SWING.CALENDARIO.Dia();
        Day_Friday = new SWING.CALENDARIO.Dia();
        Day_Saturday = new SWING.CALENDARIO.Dia();
        dia8 = new SWING.CALENDARIO.Dia();
        dia9 = new SWING.CALENDARIO.Dia();
        dia51 = new SWING.CALENDARIO.Dia();
        dia52 = new SWING.CALENDARIO.Dia();
        dia53 = new SWING.CALENDARIO.Dia();
        dia54 = new SWING.CALENDARIO.Dia();
        dia55 = new SWING.CALENDARIO.Dia();
        dia56 = new SWING.CALENDARIO.Dia();
        dia57 = new SWING.CALENDARIO.Dia();
        dia58 = new SWING.CALENDARIO.Dia();
        dia59 = new SWING.CALENDARIO.Dia();
        dia60 = new SWING.CALENDARIO.Dia();
        dia61 = new SWING.CALENDARIO.Dia();
        dia62 = new SWING.CALENDARIO.Dia();
        dia63 = new SWING.CALENDARIO.Dia();
        dia64 = new SWING.CALENDARIO.Dia();
        dia65 = new SWING.CALENDARIO.Dia();
        dia66 = new SWING.CALENDARIO.Dia();
        dia67 = new SWING.CALENDARIO.Dia();
        dia68 = new SWING.CALENDARIO.Dia();
        dia69 = new SWING.CALENDARIO.Dia();
        dia70 = new SWING.CALENDARIO.Dia();
        dia71 = new SWING.CALENDARIO.Dia();
        dia72 = new SWING.CALENDARIO.Dia();
        dia73 = new SWING.CALENDARIO.Dia();
        dia74 = new SWING.CALENDARIO.Dia();
        dia75 = new SWING.CALENDARIO.Dia();
        dia76 = new SWING.CALENDARIO.Dia();
        dia77 = new SWING.CALENDARIO.Dia();
        dia78 = new SWING.CALENDARIO.Dia();
        dia79 = new SWING.CALENDARIO.Dia();
        dia80 = new SWING.CALENDARIO.Dia();
        dia81 = new SWING.CALENDARIO.Dia();
        dia82 = new SWING.CALENDARIO.Dia();
        dia83 = new SWING.CALENDARIO.Dia();
        dia84 = new SWING.CALENDARIO.Dia();
        dia85 = new SWING.CALENDARIO.Dia();
        dia86 = new SWING.CALENDARIO.Dia();
        dia87 = new SWING.CALENDARIO.Dia();
        dia88 = new SWING.CALENDARIO.Dia();
        dia89 = new SWING.CALENDARIO.Dia();
        dia90 = new SWING.CALENDARIO.Dia();

        setLayout(new java.awt.GridLayout(7, 7));

        Day_Sunday.setForeground(new java.awt.Color(255, 206, 0));
        Day_Sunday.setText("SUN");
        Day_Sunday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Day_Sunday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Day_SundayActionPerformed(evt);
            }
        });
        add(Day_Sunday);

        Day_Monday.setText("MON");
        Day_Monday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(Day_Monday);

        Day_Tuesday.setText("TUE");
        Day_Tuesday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(Day_Tuesday);

        Day_Wednesday.setText("WED");
        Day_Wednesday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(Day_Wednesday);

        Day_Thursday.setText("THU");
        Day_Thursday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(Day_Thursday);

        Day_Friday.setText("FRI");
        Day_Friday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(Day_Friday);

        Day_Saturday.setText("SAT");
        Day_Saturday.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add(Day_Saturday);

        dia8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia8);

        dia9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia9);

        dia51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia51);

        dia52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia52);

        dia53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia53);

        dia54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia54);

        dia55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia55);

        dia56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia56);

        dia57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia57);

        dia58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia58);

        dia59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia59);

        dia60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia60);

        dia61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia61);

        dia62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia62);

        dia63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia63);

        dia64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia64);

        dia65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia65);

        dia66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia66);

        dia67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia67);

        dia68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia68);

        dia69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia69);

        dia70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia70);

        dia71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia71);

        dia72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia72);

        dia73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia73);

        dia74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia74);

        dia75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia75);

        dia76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia76);

        dia77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia77);

        dia78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia78);

        dia79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia79);

        dia80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia80);

        dia81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia81);

        dia82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia82);

        dia83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia83);

        dia84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia84);

        dia85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia85);

        dia86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia86);

        dia87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia87);

        dia88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia88);

        dia89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dia8MouseClicked(evt);
            }
        });
        add(dia89);
        add(dia90);
    }// </editor-fold>//GEN-END:initComponents

    private void Day_SundayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Day_SundayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Day_SundayActionPerformed


    private void dia8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dia8MouseClicked

    }//GEN-LAST:event_dia8MouseClicked

    private void clearIcons() {
        for (Component com : getComponents()) {
            if (com instanceof SWING.CALENDARIO.Dia) {
                SWING.CALENDARIO.Dia dia = (SWING.CALENDARIO.Dia) com;
                dia.setIcon(null);
                dia.setSelected(false);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private SWING.CALENDARIO.Dia Day_Friday;
    private SWING.CALENDARIO.Dia Day_Monday;
    private SWING.CALENDARIO.Dia Day_Saturday;
    private SWING.CALENDARIO.Dia Day_Sunday;
    private SWING.CALENDARIO.Dia Day_Thursday;
    private SWING.CALENDARIO.Dia Day_Tuesday;
    private SWING.CALENDARIO.Dia Day_Wednesday;
    private SWING.CALENDARIO.Dia dia51;
    private SWING.CALENDARIO.Dia dia52;
    private SWING.CALENDARIO.Dia dia53;
    private SWING.CALENDARIO.Dia dia54;
    private SWING.CALENDARIO.Dia dia55;
    private SWING.CALENDARIO.Dia dia56;
    private SWING.CALENDARIO.Dia dia57;
    private SWING.CALENDARIO.Dia dia58;
    private SWING.CALENDARIO.Dia dia59;
    private SWING.CALENDARIO.Dia dia60;
    private SWING.CALENDARIO.Dia dia61;
    private SWING.CALENDARIO.Dia dia62;
    private SWING.CALENDARIO.Dia dia63;
    private SWING.CALENDARIO.Dia dia64;
    private SWING.CALENDARIO.Dia dia65;
    private SWING.CALENDARIO.Dia dia66;
    private SWING.CALENDARIO.Dia dia67;
    private SWING.CALENDARIO.Dia dia68;
    private SWING.CALENDARIO.Dia dia69;
    private SWING.CALENDARIO.Dia dia70;
    private SWING.CALENDARIO.Dia dia71;
    private SWING.CALENDARIO.Dia dia72;
    private SWING.CALENDARIO.Dia dia73;
    private SWING.CALENDARIO.Dia dia74;
    private SWING.CALENDARIO.Dia dia75;
    private SWING.CALENDARIO.Dia dia76;
    private SWING.CALENDARIO.Dia dia77;
    private SWING.CALENDARIO.Dia dia78;
    private SWING.CALENDARIO.Dia dia79;
    private SWING.CALENDARIO.Dia dia8;
    private SWING.CALENDARIO.Dia dia80;
    private SWING.CALENDARIO.Dia dia81;
    private SWING.CALENDARIO.Dia dia82;
    private SWING.CALENDARIO.Dia dia83;
    private SWING.CALENDARIO.Dia dia84;
    private SWING.CALENDARIO.Dia dia85;
    private SWING.CALENDARIO.Dia dia86;
    private SWING.CALENDARIO.Dia dia87;
    private SWING.CALENDARIO.Dia dia88;
    private SWING.CALENDARIO.Dia dia89;
    private SWING.CALENDARIO.Dia dia9;
    private SWING.CALENDARIO.Dia dia90;
    // End of variables declaration//GEN-END:variables
}
