package Travel.Management.System;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

@SuppressWarnings("serial")
public class BookHotel extends JFrame implements ActionListener {

	String username;
	JLabel secondusername,tfdocid,tfdocnumber,tfcontact,tftotalprice;
	JButton checkprice,book,back;
	Choice selhotel,tfac,tffood;
	JTextField tftotalpersons,tfnoofdays;
	
	BookHotel(String username){
	
	this.username=username;
	
	setIconImage(Toolkit.getDefaultToolkit().getImage(BookHotel.class.getResource("/Gallery/icon1.png")));
	setTitle("Book Hotel");
	setBounds(430,160,790,580);
	getContentPane().setBackground(Color.black);
	setLayout(null);
	setResizable(false);
	
	JLabel title=new JLabel("Book Hotel");
	title.setBounds(165, 25, 350, 30);
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
	secondusername.setBounds(250,75,150,25);
	secondusername.setForeground(Color.red);
	add(secondusername);
	
	
	JLabel selpack=new JLabel("Select Hotel");
	selpack.setFont(new Font("Times New Roman",Font.PLAIN,20));
	selpack.setBounds(70,125,120,30);
	selpack.setForeground(Color.white);
	add(selpack);
	
	
	selhotel=new Choice();
	selhotel.setBounds(250,125,150,25);
    add(selhotel);
    
    try {
    	Conn c=new Conn();
    	ResultSet rs=c.s.executeQuery("Select * from hotels");
    	while(rs.next()) {
    		selhotel.add(rs.getString("name"));
    	}
    }
    catch(Exception e) {
    	e.printStackTrace();
    }

	JLabel totalpersons=new JLabel("Total Persons");
	totalpersons.setFont(new Font("Times New Roman",Font.PLAIN,20));
	totalpersons.setBounds(70,175,120,30);
	totalpersons.setBorder(BorderFactory.createEmptyBorder());
	totalpersons.setForeground(Color.white);
	add(totalpersons);
	
	
	tftotalpersons=new JTextField();
	tftotalpersons.setFont(new Font("Times New Roman",Font.PLAIN,18));
	tftotalpersons.setBounds(250,175,150,25);
	tftotalpersons.setForeground(Color.black);
	tftotalpersons.setBorder(BorderFactory.createEmptyBorder());
	add(tftotalpersons);
	
	
	JLabel noofdayas=new JLabel("Number of Days");
	noofdayas.setFont(new Font("Times New Roman",Font.PLAIN,20));
	noofdayas.setBounds(70,225,200,30);
	noofdayas.setForeground(Color.white);
	add(noofdayas);
	
	tfnoofdays=new JTextField();
	tfnoofdays.setFont(new Font("Times New Roman",Font.PLAIN,18));
	tfnoofdays.setBounds(250,225,150,25);
	tfnoofdays.setForeground(Color.black);
	tfnoofdays.setBorder(BorderFactory.createEmptyBorder());
	add(tfnoofdays);
	
	JLabel ac=new JLabel("AC / Non-AC");
	ac.setFont(new Font("Times New Roman",Font.PLAIN,20));
	ac.setBounds(70,275,150,30);
	ac.setForeground(Color.white);
	add(ac);
	
	tfac=new Choice();
    tfac.add("AC");
    tfac.add("Non-AC");
	tfac.setBounds(250,275,150,25);
	add(tfac);
	
	JLabel foodincluded=new JLabel("Food Included");
	foodincluded.setFont(new Font("Times New Roman",Font.PLAIN,20));
	foodincluded.setBounds(70,325,150,30);
	foodincluded.setForeground(Color.white);
	add(foodincluded);
	
	tffood=new Choice();
	tffood.add("Yes");
	tffood.add("No");
	tffood.setBounds(250,325,150,25);
	add(tffood);
	
	JLabel docid=new JLabel("Document ID");
	docid.setFont(new Font("Times New Roman",Font.PLAIN,20));
	docid.setBounds(70,375,120,30);
	docid.setForeground(Color.white);
	add(docid);
	
	tfdocid=new JLabel();
	tfdocid.setFont(new Font("Times New Roman",Font.PLAIN,18));
	tfdocid.setBounds(250,375,150,25);
	tfdocid.setForeground(Color.red);
	add(tfdocid);

	JLabel docnumber=new JLabel("Document Number");
	docnumber.setFont(new Font("Times New Roman",Font.PLAIN,20));
	docnumber.setBounds(70,425,190,30);
	docnumber.setForeground(Color.white);
	add(docnumber);
	
	tfdocnumber=new JLabel();
	tfdocnumber.setFont(new Font("Times New Roman",Font.PLAIN,18));
	tfdocnumber.setBounds(250,425,150,25);
	tfdocnumber.setForeground(Color.red);
	add(tfdocnumber);
	
	
	JLabel contact=new JLabel("Contact Number");
	contact.setFont(new Font("Times New Roman",Font.PLAIN,20));
	contact.setBounds(70,475,180,30);
	contact.setForeground(Color.white);
	add(contact);
	
	tfcontact=new JLabel();
	tfcontact.setFont(new Font("Times New Roman",Font.PLAIN,18));
	tfcontact.setBounds(250,475,150,25);
	tfcontact.setForeground(Color.red);
	add(tfcontact);
	
	try {
		Conn c=new Conn();
		ResultSet rs=c.s.executeQuery("Select * from customer where username= '"+username+"'");
		 while(rs.next()) {
		 	 secondusername.setText(rs.getString("username"));
			 tfdocid.setText(rs.getString("documentid"));
			 tfdocnumber.setText(rs.getString("documentnumber"));
			 tfcontact.setText(rs.getString("contact"));
			 
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	JLabel price=new JLabel("Total Price");
	price.setFont(new Font("Times New Roman",Font.PLAIN,20));
	price.setBounds(70,525,120,30);
	price.setForeground(Color.white);
	add(price);
	
	tftotalprice=new JLabel();
	tftotalprice.setFont(new Font("Times New Roman",Font.PLAIN,18));
	tftotalprice.setBounds(250,525,150,25);
	tftotalprice.setForeground(Color.blue);
	add(tftotalprice);
		
	
	ImageIcon i4 = new ImageIcon(BookHotel.class.getResource("/Gallery/bookht.png"));
	Image i5=i4.getImage().getScaledInstance(330,420,Image.SCALE_DEFAULT);
	ImageIcon i6=new ImageIcon(i5);
    JLabel image=new JLabel(i6);
	image.setBounds(430,30,330,420);
    add(image);
	
	
	checkprice=new JButton("Check Price");
	checkprice.addActionListener(this);
	checkprice.setForeground(Color.white);
	checkprice.setBackground(Color.green);
	checkprice.setFont(new Font("Tahoma",Font.BOLD,18));
	checkprice.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	checkprice.setBorder(BorderFactory.createEmptyBorder());
	checkprice.setBounds(430,525,150,35);
	add(checkprice);
	
	 book=new JButton("Book Hotel");
	 book.addActionListener(this);
	 book.setForeground(Color.white);
	 book.setBackground(Color.red);
	 book.setFont(new Font("Tahoma",Font.BOLD,20));
	 book.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	 book.setBorder(BorderFactory.createEmptyBorder());
	 book.setBounds(510,475,170,40);
	 add(book);
	 
	 back=new JButton("BACK");
	 back.addActionListener(this);
	 back.setForeground(Color.white);
	 back.setBackground(Color.blue);
	 back.setFont(new Font("Tahoma",Font.BOLD,20));
	 back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	 back.setBorder(BorderFactory.createEmptyBorder());
	 back.setBounds(610,525,150,35);
	 add(back);
	
	
	
	
	
	setUndecorated(true);
	setVisible(true);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BookHotel("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==checkprice) {
         try {
			 Conn c=new Conn();
             ResultSet rs=c.s.executeQuery("select * from hotels where name='"+selhotel.getSelectedItem()+"'");
             while(rs.next()) {
	   int cost=Integer.parseInt(rs.getString("costperperson"));
	   int ac=Integer.parseInt(rs.getString("acroom"));
	   int food=Integer.parseInt(rs.getString("foodincluded"));
	   
	   int persons=Integer.parseInt(tftotalpersons.getText());
	   int days=Integer.parseInt(tfnoofdays.getText());
	   
	   String acselected=tfac.getSelectedItem();
	   String foodselected=tffood.getSelectedItem();
	   
	   if(persons*days>0) {
		   int total=0;
		   total+=acselected.equals("AC")?ac:0;
		   total+=foodselected.equals("Yes")?food:0;
		     total+=cost;
		     total=total*persons*days;
		     tftotalprice.setText("Rs "+total);
		   
	   }
	   else {
		   JOptionPane.showMessageDialog(null, "Please Enter a Valid Number");
	   }
	   
   }
         }
         catch(Exception e1) {
        	 e1.printStackTrace();
         }
			
			
		}
		else if(e.getSource()==book) {
            try {
            	Conn c=new Conn();
            	c.s.executeUpdate("insert into bookhotel values('"+secondusername.getText()+"','"+selhotel.getSelectedItem()+"','"+tftotalpersons.getText()+"','"+tfnoofdays.getText()+"','"+tfac.getSelectedItem()+"','"+tffood.getSelectedItem()+"','"+tfdocid.getText()+"','"+tfdocnumber.getText()+"','"+tfcontact.getText()+"','"+tftotalprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Hotel Booked Sucessfully");
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
