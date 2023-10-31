
package travel.tourism;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class DeleteDetails extends JFrame implements ActionListener{
    JButton back;
    String username;
    DeleteDetails(String username){
        this.username=username;
        setBounds(350,150,870,625);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JLabel labelusername=new JLabel("");
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelusername.setBounds(180,50,150,25);
        add(labelusername);
        
        
        JLabel lblid=new JLabel("ID");
        lblid.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        JLabel labelid=new JLabel("");
        labelid.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelid.setBounds(180,110,150,25);
        add(labelid);
        
        
        JLabel lblnumber=new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);
        
        JLabel labelnumber=new JLabel("");
        labelnumber.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelnumber.setBounds(180,170,150,25);
        add(labelnumber);
        
        JLabel lblname=new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        JLabel labelname=new JLabel("");
        labelname.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelname.setBounds(180,230,150,25);
        add(labelname);
        
        JLabel lblgender=new JLabel("Gender");
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        JLabel labelgender=new JLabel("");
        labelgender.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelgender.setBounds(180,290,150,25);
        add(labelgender);
        
        JLabel lblcountry=new JLabel("Country");
        lblcountry.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblcountry.setBounds(450,50,150,25);
        add(lblcountry);
        
        JLabel labelcountry=new JLabel("");
        labelcountry.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelcountry.setBounds(600,50,150,25);
        add(labelcountry);
        
        JLabel lbladdress=new JLabel("Address");
        lbladdress.setFont(new Font("Tahoma",Font.PLAIN,20));
        lbladdress.setBounds(450,110,150,25);
        add(lbladdress);
        
        JLabel labeladdress=new JLabel("");
        labeladdress.setFont(new Font("Tahoma",Font.PLAIN,20));
        labeladdress.setBounds(600,110,150,25);
        add(labeladdress);
        
        JLabel lblphone=new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblphone.setBounds(450,170,150,25);
        add(lblphone);
        
        JLabel labelphone=new JLabel("");
        labelphone.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelphone.setBounds(600,170,150,25);
        add(labelphone);
        
        JLabel lblemail=new JLabel("E-mail");
        lblemail.setFont(new Font("Tahoma",Font.PLAIN,20));
        lblemail.setBounds(450,230,150,25);
        add(lblemail);
        
        JLabel labelemail=new JLabel("");
        labelemail.setFont(new Font("Tahoma",Font.PLAIN,20));
        labelemail.setBounds(600,230,150,25);
        add(labelemail);
        
        back=new JButton("Delete");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(350,350,100,25);
        back.setFont(new Font("Raleway",Font.BOLD,20));
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(650, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(120,400,600,200);
        add(image);
        
        
        try{
            Conn conn=new Conn();
            String query="select * from customer where username = '"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==back){
            try{
                Conn c=new Conn();
                c.s.executeUpdate("delete from account where username= '"+username+"'");
                c.s.executeUpdate("delete from customer where username= '"+username+"'");
                c.s.executeUpdate("delete from bookpackage where username= '"+username+"'");
                c.s.executeUpdate("delete from bookhotel where username= '"+username+"'");
                
                JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
                
                setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    
    public static void main(String[] args) {
        new DeleteDetails("adib");
    }
}
