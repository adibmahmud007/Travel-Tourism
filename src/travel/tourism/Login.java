
package travel.tourism;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,fpass;
    JTextField tfpassword,tfusername;
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null); 
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1=new JPanel();
        p1.setBackground( Color.white);
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login1.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(100,70,200,200);
        p1.add(image);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,0,450, 400);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,25);
        p2.add(lblusername);
        lblusername.setFont(new Font("SAN SARIF",Font.PLAIN,20));
        
        tfusername= new JTextField();
        tfusername.setBounds(40,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,100,100,25);
        p2.add(lblpassword);
        lblpassword.setFont(new Font("SAN SARIF",Font.PLAIN,20));
        
        tfpassword= new JTextField();
        tfpassword.setBounds(40,140,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        login=new JButton("Login");
        login.setBounds(40,200,130,30);
        login.setFont(new Font("SAN SARIF",Font.BOLD,20));
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.white);
        login.addActionListener(this);
        p2.add(login);
        
        signup=new JButton("Signup");
        signup.setBounds(210,200,130,30);
        signup.setFont(new Font("SAN SARIF",Font.BOLD,20));
        signup.setBackground(new Color(133, 193, 233));
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        p2.add(signup);
        
        fpass=new JButton("Forget Password");
        fpass.setBounds(90,250,180,30);
        fpass.setFont(new Font("SAN SARIF",Font.PLAIN,15));
        fpass.setBackground(new Color(133, 193, 233));
        fpass.setForeground(Color.white);
        fpass.addActionListener(this);
        p2.add(fpass);
        
        JLabel text=new JLabel("Trouble in Login...");
        text.setBounds(290,255,150,20);
        text.setFont(new Font("SAN SARIF",Font.PLAIN,18));
        text.setForeground(Color.red);
        p2.add(text);
        
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login){
            try{
                String username=tfusername.getText();
                String pass=tfpassword.getText();
                
                String query= " select * from account where username = '"+username+"' AND password= '"+pass+"'";
                Conn c= new Conn();
                ResultSet rs=c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Loading(username);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()== signup){
            setVisible(false);
            new Signup();
        }
        else if(ae.getSource()== fpass){
            setVisible(false);
            new ForgetPassword();
        }
    }
    public static void main(String[] args) {
        Login l=new Login();
        
    }
    
}
