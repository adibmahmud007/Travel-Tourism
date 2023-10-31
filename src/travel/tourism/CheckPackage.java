
package travel.tourism;
import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame{
    CheckPackage(){
        setBounds(450,200,900,600);
        
        String[] package1= {"GOLD PACAKGE","6 Days and 7 Nights","Airport Assistance","Half day city tour","Daily Buffets","Full day 3 Island tour","Welcome drinks","English speaking guide","Book Now the Summer Special Package for Tk12000/- only ","package1.jpg"};
        String[] package2= {"SILVER PACAKGE","5 days and 6 Nights","Entrance free tickets","Meet and  greet at airport","Welcome Drinks on Arrival","Free Buffets","Night Safari","Native speaking guide","Book Now the Winter Special Package for Tk10000/- only ","package2.jpg"};
        String[] package3= {"BRONZE PACAKGE","4 Days 5 Nights","Return Airfare","Free clubbing, Horse riding","Hard drinks free","Mountain Camping","BBQ Dinner","River Rafting","Book Now the Monsoon Special Package for Tk8000/- only ","package3.jpg"};
        
        
        
        //creating tab for package 1
        JTabbedPane tab=new JTabbedPane();
        
        JPanel p1=createPackage(package1);
        tab.addTab("Package-1", null,p1);
        
        JPanel p2=createPackage(package2);
        tab.addTab("Package-2", null,p2);
        
        JPanel p3=createPackage(package3);
        tab.addTab("Package-3", null,p3);
        
        
        add(tab);
        
        
        setVisible(true);
    }
    public JPanel createPackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);
        
        JLabel l1=new JLabel(pack[0]);  
        l1.setBounds(300,5,300,30);
        l1.setForeground(Color.ORANGE);
        l1.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(l1);
        
        JLabel l2=new JLabel(pack[1]);  
        l2.setBounds(30,60,300,30);
        l2.setForeground(Color.blue);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l2);
        
        JLabel l3=new JLabel(pack[2]);  
        l3.setBounds(30,110,300,30);
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l3);
        
        JLabel l4=new JLabel(pack[3]);  
        l4.setBounds(30,160,300,30);
        l4.setForeground(Color.blue);
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l4);
        
        JLabel l5=new JLabel(pack[4]);  
        l5.setBounds(30,210,300,30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l5);
        
        JLabel l6=new JLabel(pack[5]);  
        l6.setBounds(30,260,350,30);
        l6.setForeground(Color.blue);
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l6);
        
        JLabel l7=new JLabel(pack[6]);  
        l7.setBounds(30,310,300,30);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l7);
        
        JLabel l8=new JLabel(pack[7]);  
        l8.setBounds(30,360,300,30);
        l8.setForeground(Color.blue);
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l8);
        
        JLabel l9 = new JLabel(pack[8]);
        l9.setBounds(80,460,800,30);
        l9.setForeground(Color.red);
        l9.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l9);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[9]));
        Image i2=i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(370,80,500,300);
        p1.add(image);
        
        return p1;
    }
    
    public static void main(String[] args) {
        new CheckPackage();
    }
}
