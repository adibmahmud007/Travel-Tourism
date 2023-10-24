
package travel.tourism;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    
    @Override
    public void run(){
        try{
            for(int i=1;i<=101;i++){//loop to run the bar
                int max=bar.getMaximum();//get the max value
                int value=bar.getValue();//get the current value
                
                if(value<max){
                    bar.setValue(bar.getValue() + 1);//if value is not 100 then we will increase it
                }
                else
                {
                    setVisible(false);//when we get the max value=100 then we will shut this frame and 
                    new Dashboard();   //new frame will be open here
                }
                Thread.sleep(30);//using sleep to give the break while running the bar 
                //to see the bar going from 1 to 100
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    JProgressBar bar;
    String username;
    Loading(String username){
        
        this.username=username;
        t=new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        //Title label
        JLabel text=new JLabel("Travel And Tourism Application");
        text.setBounds(50,20,600,40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway", Font.BOLD,35));
        add(text);
        
        //Progress Bar
        bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        //Loading label
        JLabel loading=new JLabel("Loading, Please wait...");
        loading.setBounds(200,140,250,30);
        loading.setForeground(Color.DARK_GRAY);
        loading.setFont(new Font("Raleway", Font.BOLD,18));
        add(loading);
        
        
        //username label
        JLabel lblusername=new JLabel("Welcome "+username);
        lblusername.setBounds(20,310,400,40);
        lblusername.setForeground(Color.red);
        lblusername.setFont(new Font("Raleway", Font.BOLD,25));
        add(lblusername);
        
        t.start();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Loading("");
    }
}
