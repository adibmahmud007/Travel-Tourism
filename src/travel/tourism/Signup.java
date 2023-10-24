
package travel.tourism;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;
public class Signup extends JFrame implements ActionListener{
    JButton create,back;
    JTextField tfname,tfusername,tfpassword,tfanswer;
    Choice security;
    Signup(){
        setSize(900,400);
        setLocation(350,200);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);
        
        //for username label
        JLabel lblusername=new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.BOLD,15));
        lblusername.setBounds(50, 20, 125, 25);
        p1.add(lblusername);
        
        //for username textfield
        tfusername=new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        //for name label
        JLabel lblname=new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.BOLD,15));
        lblname.setBounds(50, 60, 125, 25);
        p1.add(lblname);
        
        //for name textfield
        tfname=new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        
        //for password label
        JLabel lblpassword=new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.BOLD,15));
        lblpassword.setBounds(50, 100, 125, 25);
        p1.add(lblpassword);
        
        //for password textfield
        tfpassword=new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        //for secuirity question label
        JLabel lblsecuirity=new JLabel("Secuirity Questions");
        lblsecuirity.setFont(new Font("Tahoma",Font.BOLD,15));
        lblsecuirity.setBounds(50, 140, 125, 25);
        p1.add(lblsecuirity);
        
        //for dropdown questions
        security=new Choice();
        security.add("Favourute character from GOT?");
        security.add("Your lucky number?");
        security.add("Your childhood superhero?");
        security.add("Your favourite animal?");
        security.setBounds(190,140,180,25);
        p1.add(security);
        
        //for answer label
        JLabel lblanswer=new JLabel("Answer");
        lblanswer.setFont(new Font("Tahoma",Font.BOLD,15));
        lblanswer.setBounds(50, 180, 125, 25);
        p1.add(lblanswer);
        
        //for answer textfield
        tfanswer=new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        
        //Create button
        create=new JButton("Create");
        create.setBackground(Color.white);
        create.setForeground(new Color(133,193,233));
        create.setFont(new Font("Tahoma",Font.BOLD,15));
        create.setBounds(100,250,100,30);
        create.addActionListener(this);
        p1.add(create);
        
        //Back button
        back=new JButton("Back");
        back.setBackground(Color.white);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setBounds(290,250,100,30);
        back.addActionListener(this);
        p1.add(back);
        
        
        //Image added here
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup2.png"));
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image); 
        
        
        
        
        setVisible(true);
    }
    
   
    //Method for Event Listener and Sql insertion
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == create) {
            String username=tfusername.getText();
            String name=tfname.getText();
            String password=tfpassword.getText();
            String answer=tfanswer.getText();
            String question=security.getSelectedItem();
            
            String query= "insert into account values ('"+username+"', '"+name+"', '"+password+"','"+question+"','"+answer+"')  ";
            try{
                Conn c= new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                setVisible(false);
                new Login();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
            new Login();
        }
    }
    
    

    
    public static void main(String[] args) {
        new Signup();
    }
}
