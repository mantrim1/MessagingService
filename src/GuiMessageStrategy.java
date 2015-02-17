
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JKowalske2
 */
public class GuiMessageStrategy implements MessageStrategy{
     

    @Override
    public String displayMessage() {
        return JOptionPane.showInputDialog("What message would you like to display?");
    }

}