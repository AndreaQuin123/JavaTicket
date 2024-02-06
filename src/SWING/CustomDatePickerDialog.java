/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SWING;

/**
 *
 * @author vanes
 */
import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import SWING.CALENDARIO.CalendarCustom;
import SWING.CALENDARIO.CalendarioPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class CustomDatePickerDialog extends JDialog {

    CalendarCustom dateChooserPanel;
    CalendarioPanel calendar;
    private JButton okButton;
    private JButton cancelButton;

    Date selectedDate;

    public CustomDatePickerDialog(JFrame parent) {
        
        super(parent, "ELEGIR FECHA", true);


        dateChooserPanel = new CalendarCustom(new ArrayList<Usuario>(), "", new UsuariosMetodos());

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");


        okButton.addActionListener((ActionEvent e) -> {
            selectedDate = dateChooserPanel.selectedDate;
            dispose();
        });

        cancelButton.addActionListener((ActionEvent e) -> {
            selectedDate = null;
            dispose();
        });

        setLayout(new BorderLayout());
        add(dateChooserPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pack();
        setLocationRelativeTo(parent);
    }

    public Date getSelectedDate() {
        return selectedDate;
    }

}