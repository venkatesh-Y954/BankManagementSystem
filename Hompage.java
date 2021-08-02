package ATMBank;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import Totpro.*;

@SuppressWarnings({ "unused", "serial" })

class frame11  extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4;
	frame11() {
		super("Hi! Welcome");
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("ATMBank/icons/BackGround.jpg"));
	    Image i2=i1.getImage().getScaledInstance(1000, 800, Image.SCALE_AREA_AVERAGING);
	    ImageIcon i3=new ImageIcon(i2);
	    JLabel l1=new JLabel(i3);
	    l1.setBounds(0,0,1000,800);
	   
	    JLabel l2=new JLabel("WELCOME TO BANKING");
	    l2.setForeground(Color.BLACK);
	    l2.setFont(new Font("System",Font.ITALIC,30));
	    
	    b1=new JButton("NEW USER OR CREATE ACCOUNT");
	    b1.setBounds(380,250,300,45);
	    l1.add(b1);
	    b2=new JButton("ALREADY EXISTING USER");
	    b2.setBounds(380,350,300,45);
	    l1.add(b2);
	    b3=new JButton("TRANSACTIONS");
	    b3.setBounds(380,450,300,45);
	    l1.add(b3);
	    
	    b4=new JButton("EXIT");
	    b4.setBounds(380,550,300,45);
	    l1.add(b4);
	    
	    setLayout(null);
	    
	    l2.setBounds(370,90,800,50);
	    l1.add(l2);
	    
	    add(l1);
	    setSize(1000,800);
        setVisible(true);
        b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    b4.addActionListener(this);
	    //setUndecorated(true);
	}
	public void actionPerformed(ActionEvent ae) {
		try { 
			if(ae.getSource()==b1) {	
		     new Signup().setVisible(true);
		     setVisible(false);
			}
			else if((ae.getSource()==b2)) {
				new Login().setVisible(true);
			}
			else if(ae.getSource()==b3) {
				new Login().setVisible(true);
			     setVisible(false);
			}
			else if(ae.getSource()==b4) {
				System.exit(0);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}

public class Hompage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        frame11 f1=new frame11();
	}

}
