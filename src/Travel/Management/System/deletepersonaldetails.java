package Travel.Management.System;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class deletepersonaldetails extends JFrame implements ActionListener {
       
	String username;
	JLabel secondusername,tfdocumentid,tfdocumentnumber,tfgender,tfcountry,tfcontact,tfemail,tfname;
	JLabel tfaddress;
	JButton back,delete;
	deletepersonaldetails(String username){
		this.username=username;
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewDetails.class.getResource("/Gallery/icon1.png")));
		setTitle("Delete Personal Details");
		setBounds(430,200,790,505);
		getContentPane().setBackground(Color.red);
		setLayout(null);
		setResizable(false);
		

		JLabel username2=new JLabel("Username");
		username2.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		username2.setBounds(50,30,120,30);
		username2.setForeground(Color.white);
		add(username2);
		
		secondusername=new JLabel();
		secondusername.setFont(new Font("Times New Roman",Font.PLAIN,18));
		secondusername.setBounds(230,30,150,30);
		secondusername.setForeground(Color.black);
		add(secondusername);
		
		
		JLabel documentid=new JLabel("Document ID");
		documentid.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		documentid.setForeground(Color.white);
		documentid.setBounds(50,70,120,30);
		add(documentid);
		
		tfdocumentid=new JLabel();
		tfdocumentid.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfdocumentid.setBounds(230,70,150,30);
		tfdocumentid.setForeground(Color.black);
		add(tfdocumentid);
		
		JLabel documentnumber=new JLabel("Document Number");
		documentnumber.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		documentnumber.setForeground(Color.white);
		documentnumber.setBounds(50,110,200,30);
		add(documentnumber);
		
		tfdocumentnumber=new JLabel();
		tfdocumentnumber.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfdocumentnumber.setForeground(Color.black);
		tfdocumentnumber.setBounds(230,110,150,30);
		add(tfdocumentnumber);
		
		JLabel gender=new JLabel("Gender");
		gender.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		gender.setForeground(Color.white);
		gender.setBounds(50,150,120,30);
		add(gender);
		
		tfgender=new JLabel();
		tfgender.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfgender.setForeground(Color.black);
		tfgender.setBounds(230,150,150,30);
		add(tfgender);
		
		JLabel country=new JLabel("Country");
		country.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		country.setForeground(Color.white);
		country.setBounds(50,190,150,30);
		add(country);
		
		tfcountry=new JLabel();
		tfcountry.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfcountry.setForeground(Color.black);
		tfcountry.setBounds(230,190,150,30);
		add(tfcountry);
		
		JLabel address=new JLabel("Address");
		address.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		address.setForeground(Color.white);
		address.setBounds(50,230,150,30);
		add(address);
		
		tfaddress=new JLabel();
		tfaddress.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfaddress.setBounds(230,230,150,60);
		tfaddress.setBackground(Color.red);
		tfaddress.setBorder(BorderFactory.createEmptyBorder());
		tfaddress.setForeground(Color.black);
		add(tfaddress);
		
		JLabel contact=new JLabel("Contact Number");
		contact.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		contact.setBounds(50,310,150,30);
		contact.setForeground(Color.white);
		add(contact);
		
		tfcontact=new JLabel();
		tfcontact.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfcontact.setBounds(230,310,150,30);
		tfcontact.setForeground(Color.black);
		add(tfcontact);
		
		JLabel email=new JLabel("Email");
		email.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		email.setBounds(50,350,150,30);
		email.setForeground(Color.white);
		add(email);
		
		tfemail=new JLabel();
		tfemail.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfemail.setForeground(Color.black);
		tfemail.setBounds(230,350,200,30);
		add(tfemail);
		
		JLabel name=new JLabel("Full Name");
		name.setFont(new Font("Times New Romanf",Font.PLAIN,20));
		name.setForeground(Color.white);
		name.setBounds(50,390,150,30);
		add(name);
		
		tfname=new JLabel();
		tfname.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfname.setForeground(Color.black);
		tfname.setBounds(230,390,150,30);
		add(tfname);
		
		delete=new JButton("DELETE");
		delete.addActionListener(this);
		delete.setForeground(Color.white);
		delete.setBackground(Color.black);
		delete.setFont(new Font("Tahoma",Font.BOLD,20));
		delete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		delete.setBorder(BorderFactory.createEmptyBorder());
		delete.setBounds(65,450,130,40);
		add(delete);
		

		
		back=new JButton("BACK");
		back.addActionListener(this);
		back.setForeground(Color.white);
		back.setBackground(Color.black);
		back.setFont(new Font("Tahoma",Font.BOLD,20));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setBounds(250,450,130,40);
		add(back);
		
		
		ImageIcon i4 = new ImageIcon(deletepersonaldetails.class.getResource("/Gallery/delpersonal.jpg"));
		Image i5=i4.getImage().getScaledInstance(400,570,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
	    JLabel image=new JLabel(i6);
		image.setBounds(420,0,400,570);
        add(image);
		
        try {
        	Conn c=new Conn();
        String query="Select * from customer where username='"+username+"'";
        ResultSet rs=c.s.executeQuery(query);
			 while(rs.next()) {
				 secondusername.setText(rs.getString("username"));
				 tfdocumentid.setText(rs.getString("documentid"));
				 tfdocumentnumber.setText(rs.getString("documentnumber"));
				 tfgender.setText(rs.getString("gender"));
				 tfcountry.setText(rs.getString("country"));
				 tfaddress.setText(rs.getString("address"));
				 tfcontact.setText(rs.getString("contact"));
				 tfemail.setText(rs.getString("email"));
				 tfname.setText(rs.getString("name"));
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
         new deletepersonaldetails("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==delete) {
		try {
			Conn c=new Conn();
			c.s.executeUpdate("delete from signup where username='"+username+"'");
			c.s.executeUpdate("delete from customer where username='"+username+"'");
			c.s.executeUpdate("delete from bookhotel where username='"+username+"'");
			c.s.executeUpdate("delete from bookpackage where username='"+username+"'");
		    JOptionPane.showMessageDialog(null,"Data Deleted Successfully");
		    System.exit(0);
               	} 
		catch(Exception e1) {
			e1.printStackTrace();
		}
		}
		else if(e.getSource()==back) {
			setVisible(false);
		}

}
}
