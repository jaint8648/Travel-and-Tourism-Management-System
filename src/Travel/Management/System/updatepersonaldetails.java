package Travel.Management.System;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;
@SuppressWarnings("serial")
public class updatepersonaldetails extends JFrame implements ActionListener {

	JLabel secondusername;
	JTextField documentid,tfdocumentnumber,tfgender,tfcountry,tfphone,tfemail,tfname;
	JTextArea tfaddress;
	JButton update,back,exit;
	updatepersonaldetails(String username){
		

		setIconImage(Toolkit.getDefaultToolkit().getImage(updatepersonaldetails.class.getResource("/Gallery/icon1.png")));
		setTitle("Update Personal Details");
		setBounds(430,200,790,525);
		getContentPane().setBackground(Color.black);
		setLayout(null);
		setResizable(false);
		
		JLabel title=new JLabel("Update Personal Details");
		title.setBounds(225, 25, 350, 30);
		title.setFont(new Font("Tahoma",Font.BOLD,28));
		title.setForeground(Color.yellow);
		add(title);
		
		JLabel username1=new JLabel("Username");
		username1.setFont(new Font("Times New Romanf",Font.PLAIN,20));
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
		
		documentid=new JTextField();
		documentid.setBorder(BorderFactory.createEmptyBorder());
		documentid.setFont(new Font("Times New Roman",Font.PLAIN,18));
		documentid.setBounds(250, 115, 200, 30);
		add(documentid);
		
		JLabel documentnumber=new JLabel("Document Number");
		documentnumber.setFont(new Font("Times New Roman",Font.PLAIN,20));
		documentnumber.setBounds(70,155,150,30);
		documentnumber.setForeground(Color.white);
		add(documentnumber);
		
		tfdocumentnumber=new JTextField();
		tfdocumentnumber.setBounds(250, 155, 200, 30);
		tfdocumentnumber.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfdocumentnumber.setBorder(BorderFactory.createEmptyBorder());
		add(tfdocumentnumber);
		
		JLabel gender=new JLabel("Gender");
		gender.setFont(new Font("Times New Roman",Font.PLAIN,20));
		gender.setBounds(70,195,150,30);
		gender.setForeground(Color.white);
		add(gender);
		
		tfgender=new JTextField();
		tfgender.setBorder(BorderFactory.createEmptyBorder());
		tfgender.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfgender.setBounds(250,195,200,30);
		add(tfgender);
		
		JLabel country=new JLabel("Country");
		country.setFont(new Font("Times New Roman",Font.PLAIN,20));
		country.setBounds(70,235,150,30);
		country.setForeground(Color.white);
		add(country);
		
		tfcountry=new JTextField();
		tfcountry.setBorder(BorderFactory.createEmptyBorder());
		tfcountry.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfcountry.setBounds(250,235,200,30);
		add(tfcountry);
		
		JLabel address=new JLabel("Address");
		address.setFont(new Font("Times New Roman",Font.PLAIN,20));
		address.setBounds(70,275,150,30);
		address.setForeground(Color.white);
		add(address);
		
		tfaddress=new JTextArea();
		tfaddress.setBounds(250,275,200,100);
		tfaddress.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfaddress.setBackground(Color.white);
		tfaddress.setBorder(BorderFactory.createEmptyBorder());
		add(tfaddress);
		
		JLabel phone=new JLabel("Contact Number");
		phone.setFont(new Font("Times New Roman",Font.PLAIN,20));
		phone.setBounds(70,390,150,30);
		phone.setForeground(Color.white);
		add(phone);
		
		tfphone=new JTextField();
		tfphone.setBorder(BorderFactory.createEmptyBorder());
		tfphone.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfphone.setBounds(250,390,200,30);
		add(tfphone);
		
		JLabel email=new JLabel("Email");
		email.setFont(new Font("Times New Roman",Font.PLAIN,20));
		email.setBounds(70,430,150,30);
		email.setForeground(Color.white);
		add(email);
		
		tfemail=new JTextField();
		tfemail.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfemail.setBounds(250,430,200,30);
		tfemail.setBorder(BorderFactory.createEmptyBorder());
		add(tfemail);
		
		JLabel fullname=new JLabel("Full Name");
		fullname.setFont(new Font("Times New Roman",Font.PLAIN,20));
		fullname.setBounds(70,470,150,30);
		fullname.setForeground(Color.white);
		add(fullname);
		
		tfname=new JTextField();
		tfname.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfname.setBorder(BorderFactory.createEmptyBorder());
		tfname.setBounds(250,470,200,30);
		add(tfname);
		
		ImageIcon i4 = new ImageIcon(updatepersonaldetails.class.getResource("/Gallery/update.png"));
		Image i5=i4.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
	    JLabel image=new JLabel(i6);
		image.setBounds(500,75,250,250);
        add(image);
		
        update=new JButton("UPDATE");
        update.addActionListener(this);
        update.setForeground(Color.black);
        update.setBackground(Color.white);
        update.setFont(new Font("Tahoma",Font.BOLD,20));
        update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
        update.setBorder(BorderFactory.createEmptyBorder());
        update.setBounds(550,335,150,50);
		add(update);
		
		back=new JButton("BACK");
		back.addActionListener(this);
		back.setForeground(Color.black);
		back.setBackground(Color.green);
		back.setFont(new Font("Tahoma",Font.BOLD,20));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setBounds(550,400,150,50);
		add(back);
		
		 exit=new JButton("Exit");
		 exit.addActionListener(this);
		 exit.setForeground(Color.black);
		 exit.setBackground(Color.red);
		 exit.setFont(new Font("Tahoma",Font.BOLD,20));
		 exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		 exit.setBorder(BorderFactory.createEmptyBorder());
		 exit.setBounds(550,465,150,50);
		 add(exit);
		
		 
		 try {
			 Conn c=new Conn();
			 ResultSet rs=c.s.executeQuery("Select * from customer where username= '"+username+"'");
			 while(rs.next()) {
				 secondusername.setText(rs.getString("username"));
				 documentid.setText(rs.getString("documentid"));
				 tfdocumentnumber.setText(rs.getString("documentnumber"));
				 tfgender.setText(rs.getString("gender"));
				 tfcountry.setText(rs.getString("country"));
				 tfaddress.setText(rs.getString("address"));
				 tfphone.setText(rs.getString("contact"));
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
		new updatepersonaldetails("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==update) {
			String username1=secondusername.getText();
			String document=documentid.getText();
			String documentnumber=tfdocumentnumber.getText();
			String gender=tfgender.getText();
			String country=tfcountry.getText();
			String address=tfaddress.getText();
			String contact=tfphone.getText();
			String email=tfemail.getText();
			String name=tfname.getText();
			
			try {
				Conn c=new Conn();
            	c.s.executeUpdate("update customer set documentid='"+document+"',documentnumber='"+documentnumber+"',gender='"+gender+"',country='"+country+"',address='"+address+"',contact='"+contact+"',email='"+email+"',name='"+name+"' where username ='"+username1+"'");
            JOptionPane.showMessageDialog(null,"Data Sucessfully Updated");
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==back) {
			setVisible(false);
			
		}
        else if(e.getSource()==exit) {
			System.exit(0);
			
		}
	}

}
