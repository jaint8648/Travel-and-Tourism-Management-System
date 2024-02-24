package Travel.Management.System;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
@SuppressWarnings("serial")
public class Payments extends JFrame implements ActionListener {

	JButton pay,back,exit;
	
	Payments(){
	setIconImage(Toolkit.getDefaultToolkit().getImage(Payments.class.getResource("/Gallery/icon1.png")));
	setTitle("Payment");
	setBounds(430,200,790,520);
	getContentPane().setBackground(Color.black);
	setLayout(null);
	setResizable(false);
	
	ImageIcon i4 = new ImageIcon(Payments.class.getResource("/Gallery/payment.jpg"));
	Image i5=i4.getImage().getScaledInstance(700,400,Image.SCALE_DEFAULT);
	ImageIcon i6=new ImageIcon(i5);
    JLabel image=new JLabel(i6);
	image.setBounds(5,10,765,460);
    add(image);
    
    pay=new JButton("PAY");
    pay.setBounds(100,465,140,40);
    pay.setBackground(Color.blue);
    pay.setForeground(Color.white);
    pay.addActionListener(this);
    pay.setFont(new Font("Tahoma",Font.BOLD,18));
    pay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    pay.setBorder(BorderFactory.createEmptyBorder());
    add(pay);
    
    back=new JButton("BACK");
    back.setBounds(330,465,140,40);
    back.addActionListener(this);
    back.setBackground(Color.red);
    back.setForeground(Color.white);
    back.setFont(new Font("Tahoma",Font.BOLD,18));
    back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    back.setBorder(BorderFactory.createEmptyBorder());
    add(back);
    
    
    exit=new JButton("Exit");
    exit.setBounds(550,465,140,40);
    exit.addActionListener(this);
    exit.setBackground(Color.green);
    exit.setForeground(Color.white);
    exit.setFont(new Font("Tahoma",Font.BOLD,18));
    exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
    exit.setBorder(BorderFactory.createEmptyBorder());
    add(exit);
    
    
	
    setUndecorated(true);
	setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Payments();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pay) {
            new paytm();
			setVisible(false);
			
		}
		else if(e.getSource()==back) {
			setVisible(false);
		}
		else if(e.getSource()==exit) {
			System.exit(0);
		}
		
		
	}

}
