
package travel.tourism;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame{
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null); 
        
        getContentPane().setBackground(Color.white);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(100,70,200,200);
        p1.add(image);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(400,30,450, 300);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,25);
        p2.add(lblusername);
        lblusername.setFont(new Font("SAN SARIF",Font.PLAIN,20));
        
        JTextField tfusername= new JTextField();
        tfusername.setBounds(40,60,300,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,100,100,25);
        p2.add(lblpassword);
        lblpassword.setFont(new Font("SAN SARIF",Font.PLAIN,20));
        
        JTextField tfpassword= new JTextField();
        tfpassword.setBounds(40,140,300,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        JButton login=new JButton("Login");
        login.setBounds(40,200,130,30);
        login.setFont(new Font("SAN SARIF",Font.BOLD,20));
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.white);
        p2.add(login);
        
        JButton signup=new JButton("Signup");
        signup.setBounds(210,200,130,30);
        signup.setFont(new Font("SAN SARIF",Font.BOLD,20));
        signup.setBackground(new Color(133, 193, 233));
        signup.setForeground(Color.white);
        p2.add(signup);
        
        JButton fpass=new JButton("Forget Password");
        fpass.setBounds(90,250,180,30);
        fpass.setFont(new Font("SAN SARIF",Font.PLAIN,15));
        fpass.setBackground(new Color(133, 193, 233));
        fpass.setForeground(Color.white);
        p2.add(fpass);
        
        JLabel text=new JLabel("Trouble in Login...");
        text.setBounds(290,255,150,20);
        text.setFont(new Font("SAN SARIF",Font.PLAIN,18));
        text.setForeground(Color.red);
        p2.add(text);
        
        
        setVisible(true);
    }
    public static void main(String[] args) {
        Login l=new Login();
        
    }
    
}
