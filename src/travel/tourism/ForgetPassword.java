package travel.tourism;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class ForgetPassword extends JFrame implements ActionListener{
    JTextField tfusername,tfname,tfquestion,tfanswer,tfpassword;
    JButton search,retrive,back;
    
    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        //image of forgot password
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image); 
        
        JPanel p1=new JPanel();
//      p1.setBackground(new Color(133,193,233));
        p1.setBounds(30, 30, 500, 280);
        p1.setLayout(null);
        add(p1);
        
        //for username label
        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,15));
        lblusername.setBounds(40, 20, 100, 25);
        p1.add(lblusername);
        
        //username textfield
        tfusername=new JTextField();
        tfusername.setBounds(150,20,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        //Search button
        search=new JButton("Search");
        search.setBackground(new Color(102,102,255));
        search.setForeground(Color.WHITE);
        search.setFont(new Font("Tahoma",Font.BOLD,15));
        search.setBounds(380,23,100,20);
        search.addActionListener(this);
        p1.add(search);
        
        //for name label
        JLabel lblname=new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.BOLD,15));
        lblname.setBounds(40, 60, 100, 25);
        p1.add(lblname);
        
        //username textfield
        tfname=new JTextField();
        tfname.setBounds(150,60,200,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        //for secuirity question label
        JLabel lblquestion=new JLabel("Security question");
        lblquestion.setFont(new Font("Tahoma",Font.BOLD,15));
        lblquestion.setBounds(10, 100, 140, 25);
        p1.add(lblquestion);
        
        //question textfield
        tfquestion=new JTextField();
        tfquestion.setBounds(150,100,200,25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);
        
        //for secuirity question label
        JLabel lblanswer=new JLabel("Answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,15));
        lblanswer.setBounds(40, 140, 100, 25);
        p1.add(lblanswer);
        
        //question textfield
        tfanswer=new JTextField();
        tfanswer.setBounds(150,140,200,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        //Retrive button
        retrive=new JButton("Retrive");
        retrive.setBackground(new Color(0,153,153));
        retrive.setForeground(Color.WHITE);
        retrive.setFont(new Font("Tahoma",Font.BOLD,15));
        retrive.setBounds(380,143,100,20);
        retrive.addActionListener(this);
        p1.add(retrive);
        
        //for password label
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,15));
        lblpassword.setBounds(40, 180, 200, 25);
        p1.add(lblpassword);
        
        //for password textfield
        tfpassword=new JTextField();
        tfpassword.setBounds(150,180,200,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        //back button
        back=new JButton("Back");
        back.setBackground(new Color(0,153,153));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setBounds(180,233,120,20);
        back.addActionListener(this);
        p1.add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== search){
            try{
                String query= "select * from account where username = '"+tfusername.getText()+"'"; 
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("secuirity_question"));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()== retrive){
            try{
                String query= "select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"'"; 
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while(rs.next()){
                   tfpassword.setText(rs.getString("password"));
                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
            new Login();
        }
    }
    
    
    public static void main(String[] args) {
        new ForgetPassword();
    }
}
