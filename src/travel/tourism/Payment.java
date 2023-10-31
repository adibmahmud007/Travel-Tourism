
package travel.tourism;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener{
    Payment(){
        setBounds(450,200,800,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        
    }
    public static void main(String[] args) {
        new Payment();
    }
}
