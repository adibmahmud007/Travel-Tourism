
package travel.tourism;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    JButton back;
    String username;
    ViewBookedHotel(String username){
        this.username=username;
        setBounds(450,200,1000,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text= new JLabel("View Booked Hotel Details");
        text.setBounds(100,10,500,30);
        text.setFont(new Font("Tahoma",Font.BOLD,25));
        add(text);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel("");
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelusername.setBounds(180,50,150,25);
        add(labelusername);
        
        
        JLabel lblpackage=new JLabel("Hotel");
        lblpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblpackage.setBounds(30,90,150,25);
        add(lblpackage);
        
        JLabel labelpackage=new JLabel("");
        labelpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelpackage.setBounds(180,90,150,25);
        add(labelpackage);
        
        
        JLabel lblpersons=new JLabel("Persons");
        lblpersons.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblpersons.setBounds(30,130,150,25);
        add(lblpersons);
        
        JLabel labelpersons=new JLabel("");
        labelpersons.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelpersons.setBounds(180,130,150,25);
        add(labelpersons);
        
        JLabel lblid=new JLabel("Id");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblid.setBounds(30,170,150,25);
        add(lblid);
        
        JLabel labelid=new JLabel("");
        labelid.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelid.setBounds(180,170,150,25);
        add(labelid);
        
        JLabel lblNumber=new JLabel("Number");
        lblNumber.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblNumber.setBounds(30,210,150,25);
        add(lblNumber);
        
        JLabel labelnumber=new JLabel("");
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelnumber.setBounds(180,210,150,25);
        add(labelnumber);
        
        JLabel lblPhone=new JLabel("Phone");
        lblPhone.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblPhone.setBounds(30,250,150,25);
        add(lblPhone);
        
        JLabel labelphone=new JLabel("");
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelphone.setBounds(180,250,150,25);
        add(labelphone);
        
        JLabel lbldays=new JLabel("Days");
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,20));
        lbldays.setBounds(30,290,150,25);
        add(lbldays);
        
        JLabel labeldays=new JLabel("");
        labeldays.setFont(new Font("Tahoma",Font.PLAIN,20));
        labeldays.setBounds(180,290,150,25);
        add(labeldays);
        
        JLabel lblac=new JLabel("AC?");
        lblac.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblac.setBounds(30,330,150,25);
        add(lblac);
        
        JLabel labelac=new JLabel("");
        labelac.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelac.setBounds(180,330,150,25);
        add(labelac);
        
        JLabel lblfood=new JLabel("Food?");
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblfood.setBounds(30,370,150,25);
        add(lblfood);
        
        JLabel labelfood=new JLabel("");
        labelfood.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelfood.setBounds(180,370,150,25);
        add(labelfood);
        
        JLabel lbltotal=new JLabel("Price");
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,20));
        lbltotal.setBounds(30,410,150,25);
        add(lbltotal);
        
        JLabel labeltotal=new JLabel("");
        labeltotal.setFont(new Font("Tahoma",Font.PLAIN,20));
        labeltotal.setBounds(180,410,150,25);
        add(labeltotal);
        
        
        
        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(130,480,100,25);
        back.setFont(new Font("Raleway",Font.BOLD,20));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(600, 550, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(450,50,500,380);
        add(image);
        
        
        try{
            Conn conn=new Conn();
            String query="select * from bookhotel where username = '"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelpackage.setText(rs.getString("name"));
                labelpersons.setText(rs.getString("persons"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
                labeltotal.setText(rs.getString("price"));
                labeldays.setText(rs.getString("days"));
                labelac.setText(rs.getString("ac"));
                labelfood.setText(rs.getString("food"));
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args) {
        new ViewBookedHotel("");
    }
}
