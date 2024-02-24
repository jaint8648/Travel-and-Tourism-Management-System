package Travel.Management.System;
import javax.swing.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.ResultSet;

@SuppressWarnings("serial")
public class ViewBookedHotel extends JFrame implements ActionListener {

	JButton exit,back;
	JLabel secondusername,tfselhotel,tftotalpersons,tfnoofdays,tfac,tffood,tfdocid,tfdocnumber,tfcontact,tftotalprice;
	
	ViewBookedHotel(String username){
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewBookedHotel.class.getResource("/Gallery/icon1.png")));

		setBounds(430,160,790,570);
		getContentPane().setBackground(Color.black);
		setLayout(null);
		setResizable(false);
		
		JLabel title=new JLabel("View Booked Hotel");
		title.setBounds(105, 25, 350, 30);
		title.setFont(new Font("Tahoma",Font.BOLD,28));
		title.setForeground(Color.yellow);
		add(title);
		
		JLabel username1=new JLabel("Username");
		username1.setFont(new Font("Times New Roman",Font.PLAIN,20));
		username1.setBounds(55,75,120,30);
		username1.setForeground(Color.white);
		add(username1);
		
		secondusername=new JLabel();
		secondusername.setFont(new Font("Times New Roman",Font.PLAIN,18));
		secondusername.setBounds(250,75,150,25);
		secondusername.setForeground(Color.red);
		add(secondusername);
		
		
		JLabel selhotel=new JLabel("Select Hotel");
		selhotel.setFont(new Font("Times New Roman",Font.PLAIN,20));
		selhotel.setBounds(55,125,120,30);
		selhotel.setForeground(Color.white);
		add(selhotel);
		
		
		tfselhotel=new JLabel();
		tfselhotel.setBounds(250,125,150,25);
		tfselhotel.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfselhotel.setForeground(Color.red);
	    add(tfselhotel);
	   

		JLabel totalpersons=new JLabel("Total Persons");
		totalpersons.setFont(new Font("Times New Roman",Font.PLAIN,20));
		totalpersons.setBounds(55,175,120,30);
		totalpersons.setBorder(BorderFactory.createEmptyBorder());
		totalpersons.setForeground(Color.white);
		add(totalpersons);
		
		
		tftotalpersons=new JLabel();
		tftotalpersons.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tftotalpersons.setBounds(250,175,150,25);
		tftotalpersons.setForeground(Color.red);
		tftotalpersons.setBorder(BorderFactory.createEmptyBorder());
		add(tftotalpersons);
		
		
		JLabel noofdayas=new JLabel("Number of Days");
		noofdayas.setFont(new Font("Times New Roman",Font.PLAIN,20));
		noofdayas.setBounds(55,225,200,30);
		noofdayas.setForeground(Color.white);
		add(noofdayas);
		
		tfnoofdays=new JLabel();
		tfnoofdays.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfnoofdays.setBounds(250,225,150,25);
		tfnoofdays.setForeground(Color.red);
		tfnoofdays.setBorder(BorderFactory.createEmptyBorder());
		add(tfnoofdays);
		
		JLabel ac=new JLabel("AC / Non-AC");
		ac.setFont(new Font("Times New Roman",Font.PLAIN,20));
		ac.setBounds(55,275,150,30);
		ac.setForeground(Color.white);
		add(ac);
		
		tfac=new JLabel();
		tfac.setBounds(250,275,150,25);
		tfac.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfac.setForeground(Color.red);
		add(tfac);
		
		JLabel foodincluded=new JLabel("Food Included");
		foodincluded.setFont(new Font("Times New Roman",Font.PLAIN,20));
		foodincluded.setBounds(55,325,150,30);
		foodincluded.setForeground(Color.white);
		add(foodincluded);
		
		tffood=new JLabel();
		tffood.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tffood.setBounds(250,325,150,25);
		tffood.setForeground(Color.red);
		add(tffood);
		
		JLabel docid=new JLabel("Document ID");
		docid.setFont(new Font("Times New Roman",Font.PLAIN,20));
		docid.setBounds(55,375,120,30);
		docid.setForeground(Color.white);
		add(docid);
		
		tfdocid=new JLabel();
		tfdocid.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfdocid.setBounds(250,375,150,25);
		tfdocid.setForeground(Color.red);
		add(tfdocid);

		JLabel docnumber=new JLabel("Document Number");
		docnumber.setFont(new Font("Times New Roman",Font.PLAIN,20));
		docnumber.setBounds(55,425,190,30);
		docnumber.setForeground(Color.white);
		add(docnumber);
		
		tfdocnumber=new JLabel();
		tfdocnumber.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfdocnumber.setBounds(250,425,150,25);
		tfdocnumber.setForeground(Color.red);
		add(tfdocnumber);
		
		
		JLabel contact=new JLabel("Contact Number");
		contact.setFont(new Font("Times New Roman",Font.PLAIN,20));
		contact.setBounds(55,475,180,30);
		contact.setForeground(Color.white);
		add(contact);
		
		tfcontact=new JLabel();
		tfcontact.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfcontact.setBounds(250,475,150,25);
		tfcontact.setForeground(Color.red);
		add(tfcontact);
		
		
		JLabel price=new JLabel("Total Price");
		price.setFont(new Font("Times New Roman",Font.PLAIN,20));
		price.setBounds(55,525,120,30);
		price.setForeground(Color.white);
		add(price);
		
		tftotalprice=new JLabel();
		tftotalprice.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tftotalprice.setBounds(250,525,150,25);
		tftotalprice.setForeground(Color.red);
		add(tftotalprice);
			
		try {
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("Select * from bookhotel where username= '"+username+"'");
			 while(rs.next()) {
			 	 secondusername.setText(rs.getString("username"));
				 tfselhotel.setText(rs.getString("selectpack"));
				 tftotalpersons.setText(rs.getString("totalperson"));
				 tfnoofdays.setText(rs.getString("numberofdays"));
				 tfac.setText(rs.getString("acnon"));
				 tffood.setText(rs.getString("foodincluded"));
			 	 tfdocid.setText(rs.getString("documentid"));
				 tfdocnumber.setText(rs.getString("documentnumber"));
				 tfcontact.setText(rs.getString("contact"));
				 tftotalprice.setText(rs.getString("totalprice"));
				 
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		
		
		ImageIcon i4 = new ImageIcon(ViewBookedHotel.class.getResource("/Gallery/viewbooked.jpg"));
		Image i5=i4.getImage().getScaledInstance(330,480,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
	    JLabel image=new JLabel(i6);
		image.setBounds(430,30,330,480);
	    add(image);
		
				 
		 back=new JButton("BACK");
		 back.addActionListener(this);
		 back.setForeground(Color.white);
		 back.setBackground(Color.green);
		 back.setFont(new Font("Tahoma",Font.BOLD,20));
		 back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		 back.setBorder(BorderFactory.createEmptyBorder());
		 back.setBounds(430,525,150,35);
		 add(back);
		

		 exit=new JButton("Exit");
		 exit.addActionListener(this);
		 exit.setForeground(Color.white);
		 exit.setBackground(Color.red);
		 exit.setFont(new Font("Tahoma",Font.BOLD,20));
		 exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		 exit.setBorder(BorderFactory.createEmptyBorder());
		 exit.setBounds(610,525,150,35);
		 add(exit);
		
		 setUndecorated(true);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new ViewBookedHotel("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			setVisible(false);
		}
		else if(e.getSource()==exit) {
			System.exit(0);
		}
	}

}
