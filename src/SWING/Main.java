/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SWING;

import EVENTOS_USUARIOS.Usuario;
import EVENTOS_USUARIOS.UsuariosMetodos;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;



/**
 *
 * @author AndreaQuin
 */  

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            
            
            //netbeans me dijo que lo pusiera en un try catch
            try {
                
                UsuariosMetodos funcionUsuario;
                
                //CREACION del jlabel
                JLabel label = new JLabel();

                Icon icon = new ImageIcon("C:\\Users\\vanes\\OneDrive\\Documents\\NetBeansProjects\\JavaTicket\\src\\IMAGENES\\BG_Inicio.gif");

                label.setIcon(icon);

                //CREACION del JFrame
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(label);
                frame.setSize(580, 350);
                frame.setLocationRelativeTo(null);

                //TIMER de 3 segundos donde frame se hace visible y luego desaparece cuando se llama el timer
                Timer timer = new Timer(3000, e -> {
                    frame.setVisible(false);
                    frame.dispose();

                    ArrayList<Usuario> usuariosArray = new ArrayList<>();
                    UsuariosMetodos usuariosMetodos = new UsuariosMetodos();
                     usuariosArray = Login.getUsuariosArray();

                    new Login(usuariosArray, usuariosMetodos).setVisible(true);
                });

                //para que se repita solo una vez
                timer.setRepeats(false);
                timer.start();
                
                frame.setVisible(true);
                
            } catch (HeadlessException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
}
