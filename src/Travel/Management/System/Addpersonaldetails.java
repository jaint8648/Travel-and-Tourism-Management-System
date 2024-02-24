package Travel.Management.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Addpersonaldetails extends JFrame implements ActionListener {

	JLabel secondusername,tfemail,tffullname;
	JButton add,back,exit;
	@SuppressWarnings("rawtypes")
	JComboBox combo1,combo2,combo3;
	JTextArea tfaddress;
	JTextField tfphone,tfdocumentnumber;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	Addpersonaldetails(String username){
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Addpersonaldetails.class.getResource("/Gallery/icon1.png")));
		setTitle("Add Personal Details");
		setBounds(430,200,790,530);
		getContentPane().setBackground(Color.black);
		setLayout(null);
		setResizable(false);
		
		JLabel title=new JLabel("Add Personal Details");
		title.setBounds(265, 25, 350, 30);
		title.setFont(new Font("Tahoma",Font.BOLD,28));
		title.setForeground(Color.yellow);
		add(title);
		
		JLabel username1=new JLabel("Username");
		username1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		username1.setBounds(70,75,120,30);
		username1.setForeground(Color.white);
		add(username1);
		
		secondusername=new JLabel();
		secondusername.setFont(new Font("Times New Roman",Font.PLAIN,18));
		secondusername.setBounds(250,75,200,30);
		secondusername.setForeground(Color.red);
		add(secondusername);
		
		JLabel document=new JLabel("Document ID");
		document.setFont(new Font("Times New Roman",Font.PLAIN,20));
		document.setBounds(70,115,120,30);
		document.setForeground(Color.white);
		add(document);
		
		String id[]= {"Passport","Aadhar Card","Voter ID Card","Driving License","Pan Card"};
		combo1=new JComboBox(id);
		combo1.setBorder(BorderFactory.createEmptyBorder());
		combo1.setBounds(250, 115, 200, 30);
		add(combo1);
		
		JLabel documentnumber=new JLabel("Document Number");
		documentnumber.setFont(new Font("Times New Roman",Font.PLAIN,20));
		documentnumber.setBounds(70,155,150,30);
		documentnumber.setForeground(Color.white);
		add(documentnumber);
		
		tfdocumentnumber=new JTextField();
		tfdocumentnumber.setBounds(250, 155, 200, 30);
		tfdocumentnumber.setBorder(BorderFactory.createEmptyBorder());
		add(tfdocumentnumber);
		
		JLabel gender=new JLabel("Gender");
		gender.setFont(new Font("Times New Roman",Font.PLAIN,20));
		gender.setBounds(70,195,150,30);
		gender.setForeground(Color.white);
		add(gender);
		
		String gender1[]= {"Male","Female","Other"};
		combo2=new JComboBox(gender1);
		combo2.setBorder(BorderFactory.createEmptyBorder());
		combo2.setBounds(250,195,200,30);
		add(combo2);
		
		JLabel country=new JLabel("Country");
		country.setFont(new Font("Times New Roman",Font.PLAIN,20));
		country.setBounds(70,235,150,30);
		country.setForeground(Color.white);
		add(country);
		
		String country1[]= {"India","USA","UAE","China","Sri Lanka","Pakistan","Nepal","Russia","Australia"};
		combo3=new JComboBox(country1);
		combo3.setBorder(BorderFactory.createEmptyBorder());
		combo3.setBounds(250,235,200,30);
		add(combo3);
		
		JLabel address=new JLabel("Address");
		address.setFont(new Font("Times New Roman",Font.PLAIN,20));
		address.setBounds(70,275,150,30);
		address.setForeground(Color.white);
		add(address);
		
		tfaddress=new JTextArea();
		tfaddress.setBounds(250,275,200,100);
		tfaddress.setBackground(new Color(245, 245, 245));
		tfaddress.setBorder(BorderFactory.createEmptyBorder());
		add(tfaddress);
		
		JLabel phone=new JLabel("Contact Number");
		phone.setFont(new Font("Times New Roman",Font.PLAIN,20));
		phone.setBounds(70,390,150,30);
		phone.setForeground(Color.white);
		add(phone);
		
		tfphone=new JTextField();
		tfphone.setBorder(BorderFactory.createEmptyBorder());
		tfphone.setBounds(250,390,200,30);
		add(tfphone);
		
		JLabel email=new JLabel("Email");
		email.setFont(new Font("Times New Roman",Font.PLAIN,20));
		email.setBounds(70,430,150,30);
		email.setForeground(Color.white);
		add(email);
		
		tfemail=new JLabel();
		tfemail.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfemail.setBounds(250,430,200,30);
		tfemail.setForeground(Color.red);
		add(tfemail);
		
		JLabel fullname=new JLabel("Full Name");
		fullname.setFont(new Font("Times New Roman",Font.PLAIN,20));
		fullname.setBounds(70,470,150,30);
		fullname.setForeground(Color.white);
		add(fullname);
		
		tffullname=new JLabel();
		tffullname.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tffullname.setForeground(Color.red);
		tffullname.setBounds(250,470,200,30);
		add(tffullname);
		
		ImageIcon i4 = new ImageIcon(Addpersonaldetails.class.getResource("/Gallery/user.png"));
		Image i5=i4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
	    JLabel image=new JLabel(i6);
		image.setBounds(500,75,250,250);
        add(image);
		
        add=new JButton("ADD");
        add.addActionListener(this);
        add.setForeground(Color.black);
        add.setBackground(Color.white);
        add.setFont(new Font("Tahoma",Font.BOLD,20));
        add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
        add.setBorder(BorderFactory.createEmptyBorder());
		add.setBounds(550,335,100,50);
		add(add);
		
		back=new JButton("BACK");
		back.addActionListener(this);
		back.setForeground(Color.white);
		back.setBackground(Color.green);
		back.setFont(new Font("Tahoma",Font.BOLD,20));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setBounds(590,400,100,50);
		add(back);
		
		 exit=new JButton("Exit");
		 exit.addActionListener(this);
		 exit.setForeground(Color.white);
		 exit.setBackground(Color.red);
		 exit.setFont(new Font("Tahoma",Font.BOLD,20));
		 exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		 exit.setBorder(BorderFactory.createEmptyBorder());
		 exit.setBounds(630,465,100,50);
		 add(exit);
		
		 
		 try {
			 Conn c=new Conn();
			 ResultSet rs=c.s.executeQuery("Select * from signup where username= '"+username+"'");
			 while(rs.next()) {
				 secondusername.setText(rs.getString("username"));
				 tfemail.setText(rs.getString("email"));
				 tffullname.setText(rs.getString("name"));
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 
		 
		 
		 setUndecorated(true);
		 setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Addpersonaldetails("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==add) {
			String username=secondusername.getText();
			String documentid=(String)combo1.getSelectedItem();
			String documentnumber=tfdocumentnumber.getText();
			String gender=(String)combo2.getSelectedItem();
			String country=(String)combo3.getSelectedItem();
			String address=tfaddress.getText();
			String contact=tfphone.getText();
			String email=tfemail.getText();
			String name=tffullname.getText();
			
			if(documentnumber.equals("")) {
				JOptionPane.showMessageDialog(null,"Document Number Should not be Empty");
				return;
			}
			if(address.equals("")) {
				JOptionPane.showMessageDialog(null,"Address Should not be Empty");
				return;
			}
			if(contact.equals("")) {
				JOptionPane.showMessageDialog(null,"Contact Number Should not be Empty");
				return;
			}
			
			try {
				Conn c=new Conn();
				String query="insert into customer values('"+username+"','"+documentid+"','"+documentnumber+"','"+gender+"','"+country+"','"+address+"','"+contact+"','"+email+"','"+name+"')";
				c.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Customer Details Added Sucessfully");
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
			
		 }
		 if(e.getSource()==back) {
			 setVisible(false);
			
		 }
		 if(e.getSource()==exit) {
			 System.exit(0);
		 }
	}

}
