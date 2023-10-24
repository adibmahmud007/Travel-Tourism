
package travel.tourism;
import javax.swing.*;
import java.awt.*;


public class Dashboard extends JFrame{
    Dashboard(){
        //setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        //Dash Board Panel
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,51,51));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        
        //Dashboard image icon
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon); 
        
        
        //Dashboard label
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        
        //Menu button Panel
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,51,51));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        
        ////BUTTONS////
        
        JButton addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,50);
        addPersonalDetails.setBackground(new Color(0,51,51));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        p2.add(addPersonalDetails);
        
        JButton updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,50,300,50);
        updatePersonalDetails.setBackground(new Color(0,51,51));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatePersonalDetails);
        
        JButton viewDetails=new JButton("View Details");
        viewDetails.setBounds(0,100,300,50);
        viewDetails.setBackground(new Color(0,51,51));
        viewDetails.setForeground(Color.white);
        viewDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewDetails.setMargin(new Insets(0,0,0,130));
        p2.add(viewDetails);
        
        JButton deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,150,300,50);
        deletePersonalDetails.setBackground(new Color(0,51,51));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN,20));
        deletePersonalDetails.setMargin(new Insets(0,0,0,30));
        p2.add(deletePersonalDetails);
        
        JButton checkPackage=new JButton("Check Package");
        checkPackage.setBounds(0,200,300,50);
        checkPackage.setBackground(new Color(0,51,51));
        checkPackage.setForeground(Color.white);
        checkPackage.setFont(new Font("Tahoma", Font.PLAIN,20));
        checkPackage.setMargin(new Insets(0,0,0,100));
        p2.add(checkPackage);
        
        JButton bookPackage=new JButton("Book Package");
        bookPackage.setBounds(0,250,300,50);
        bookPackage.setBackground(new Color(0,51,51));
        bookPackage.setForeground(Color.white);
        bookPackage.setFont(new Font("Tahoma", Font.PLAIN,20));
        bookPackage.setMargin(new Insets(0,0,0,100));
        p2.add(bookPackage);
        
        JButton viewPackage=new JButton("View Package");
        viewPackage.setBounds(0,300,300,50);
        viewPackage.setBackground(new Color(0,51,51));
        viewPackage.setForeground(Color.white);
        viewPackage.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewPackage.setMargin(new Insets(0,0,0,100));
        p2.add(viewPackage);
        
        JButton viewHotel=new JButton("View Hotel");
        viewHotel.setBounds(0,350,300,50);
        viewHotel.setBackground(new Color(0,51,51));
        viewHotel.setForeground(Color.white);
        viewHotel.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewHotel.setMargin(new Insets(0,0,0,120));
        p2.add(viewHotel);
        
        JButton bookHotel=new JButton("Book Hotel");
        bookHotel.setBounds(0,400,300,50);
        bookHotel.setBackground(new Color(0,51,51));
        bookHotel.setForeground(Color.white);
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN,20));
        bookHotel.setMargin(new Insets(0,0,0,120));
        p2.add(bookHotel);
        
        JButton viewbookedHotel=new JButton("View Booked Hotel");
        viewbookedHotel.setBounds(0,450,300,50);
        viewbookedHotel.setBackground(new Color(0,51,51));
        viewbookedHotel.setForeground(Color.white);
        viewbookedHotel.setFont(new Font("Tahoma", Font.PLAIN,20));
        viewbookedHotel.setMargin(new Insets(0,0,0,50));
        p2.add(viewbookedHotel);
        
        JButton destination=new JButton("Destination");
        destination.setBounds(0,500,300,50);
        destination.setBackground(new Color(0,51,51));
        destination.setForeground(Color.white);
        destination.setFont(new Font("Tahoma", Font.PLAIN,20));
        destination.setMargin(new Insets(0,0,0,120));
        p2.add(destination);
        
        JButton payment=new JButton("Payment");
        payment.setBounds(0,550,300,50);
        payment.setBackground(new Color(0,51,51));
        payment.setForeground(Color.white);
        payment.setFont(new Font("Tahoma", Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,120));
        p2.add(payment);
        
        JButton calculator=new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,51,51));
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Tahoma", Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,120));
        p2.add(calculator);
        
        
        
        JButton about=new JButton("About");
        about.setBounds(0,650,300,50);
        about.setBackground(new Color(0,51,51));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma", Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,140));
        p2.add(about);
        
        //Dashboard image
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.png"));
        Image i5=i4.getImage().getScaledInstance(1350, 900, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(85,0,1700,1000);
        add(image); 
        
        
        setVisible (true);
    }
    public static void main(String[] args) {
        new Dashboard();
    }
}
