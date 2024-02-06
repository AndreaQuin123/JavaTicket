/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SWING.CALENDARIO;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author vanes
 */
public class Dia extends JButton{
 
    private Date date;
    private boolean title;
    private boolean isToDay;
    private boolean selected;
    boolean getSelected;
    
    
    public Dia() {
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
        
    }
  
    public void asTitle() {
        title = true;
    }

    public boolean isTitle() {
        return title;
    }

    public void setFecha(Date date) {
        this.date = date;
    }

    public Date getFecha() {
        return date;
    }

    public void setAsToDay() {
        isToDay = true;
        setForeground(Color.WHITE);
    }

    public void mesActual(boolean act) {
        if (act) {
            setForeground(new Color(68, 68, 68));
        } else {
            setForeground(new Color(169, 169, 169));
        }
    }

    @Override
    protected void paintComponent(Graphics graph) {
        if (title) {
            graph.setColor(new Color(213, 213, 213));
            graph.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }

        if (isToDay) {
            Graphics2D g2 = (Graphics2D) graph;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(54, 54, 130));

            int arcWidth = 40;
            int arcHeight = 40;
            g2.fillRoundRect(17, 4, arcWidth,arcHeight , 100, 100);
//            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 100, 100);
        }
        super.paintComponent(graph);
    }
}
