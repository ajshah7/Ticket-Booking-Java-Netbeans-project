/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketbooking;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ajmalshah
 */
public class TicketBooking {

    /**
     * @param args the command line arguments
     */
    public JFrame frame;
    private void Exit() {    
        frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame, "COnfirm if you want to Exit","Ticket Booking",JOptionPane.YES_NO_OPTION)==
                JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        Login_page l = new Login_page();
        l.login();
        
    }
    
}
