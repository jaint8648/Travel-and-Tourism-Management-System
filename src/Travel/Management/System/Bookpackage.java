package Travel.Management.System;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

@SuppressWarnings("serial")
public class Bookpackage extends JFrame implements ActionListener {

	String username;

	JLabel secondusername,tfdocid,tfdocnumber,tfphone,tfprice;
	Choice totalpackage;
	JTextField tftotalpersons;
	JButton checkprice,bookpackage,back;
	Bookpackage(String username){
		this.username=username;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Bookpackage.class.getResource("/Gallery/icon1.png")));
		setTitle("Book Package");
		setBounds(430,200,790,501);
		getContentPane().setBackground(Color.black);
		setLayout(null);
		setResizable(false);
		
		
		JLabel title=new JLabel("Book Package");
		title.setBounds(155, 25, 350, 40);
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
		
		
		JLabel selpack=new JLabel("Select Package");
		selpack.setFont(new Font("Times New Roman",Font.PLAIN,20));
		selpack.setBounds(70,125,120,30);
		selpack.setForeground(Color.white);
		add(selpack);
		
		
		totalpackage=new Choice();
		totalpackage.add("Gold Package");
		totalpackage.add("Silver Package");
		totalpackage.add("Bronze Package");
		totalpackage.setBounds(250,125,150,25);
		add(totalpackage);
		
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
		
		
		JLabel docid=new JLabel("Document ID");
		docid.setFont(new Font("Times New Roman",Font.PLAIN,20));
		docid.setBounds(70,225,120,30);
		docid.setForeground(Color.white);
		add(docid);
		
		tfdocid=new JLabel();
		tfdocid.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfdocid.setBounds(250,225,150,25);
		tfdocid.setForeground(Color.red);
		add(tfdocid);
		
		JLabel docnumber=new JLabel("Document Number");
		docnumber.setFont(new Font("Times New Roman",Font.PLAIN,20));
		docnumber.setBounds(70,275,150,30);
		docnumber.setForeground(Color.white);
		add(docnumber);
		
		tfdocnumber=new JLabel();
		tfdocnumber.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfdocnumber.setBounds(250,275,150,25);
		tfdocnumber.setForeground(Color.red);
		add(tfdocnumber);
		
		JLabel contact=new JLabel("Contact Number");
		contact.setFont(new Font("Times New Roman",Font.PLAIN,20));
		contact.setBounds(70,325,150,30);
		contact.setForeground(Color.white);
		add(contact);
		
		tfphone=new JLabel();
		tfphone.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfphone.setBounds(250,325,150,25);
		tfphone.setForeground(Color.red);
		add(tfphone);
		
		JLabel price=new JLabel("Price");
		price.setFont(new Font("Times New Roman",Font.PLAIN,20));
		price.setBounds(70,375,120,30);
		price.setForeground(Color.white);
		add(price);
		
		tfprice=new JLabel();
		tfprice.setFont(new Font("Times New Roman",Font.PLAIN,18));
		tfprice.setBounds(250,375,150,25);
		tfprice.setForeground(Color.blue);
		add(tfprice);
		
		try {
		Conn c=new Conn();
		ResultSet rs=c.s.executeQuery("Select * from customer where username= '"+username+"'");
		 while(rs.next()) {
		 	 secondusername.setText(rs.getString("username"));
			 tfdocid.setText(rs.getString("documentid"));
			 tfdocnumber.setText(rs.getString("documentnumber"));
			 tfphone.setText(rs.getString("contact"));
			 
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		checkprice=new JButton("Check Price");
		checkprice.addActionListener(this);
		checkprice.setForeground(Color.white);
		checkprice.setBackground(Color.green);
		checkprice.setFont(new Font("Tahoma",Font.BOLD,20));
		checkprice.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		checkprice.setBorder(BorderFactory.createEmptyBorder());
		checkprice.setBounds(75,435,150,50);
		add(checkprice);
		
		 bookpackage=new JButton("Book Package");
		 bookpackage.addActionListener(this);
		 bookpackage.setForeground(Color.white);
		 bookpackage.setBackground(Color.red);
		 bookpackage.setFont(new Font("Tahoma",Font.BOLD,20));
		 bookpackage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		 bookpackage.setBorder(BorderFactory.createEmptyBorder());
		 bookpackage.setBounds(310,435,200,50);
		 add(bookpackage);
		 
		back=new JButton("BACK");
		back.addActionListener(this);
		back.setForeground(Color.white);
		back.setBackground(Color.blue);
		back.setFont(new Font("Tahoma",Font.BOLD,20));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setBounds(590,435,100,50);
		add(back);
		
		ImageIcon i4 = new ImageIcon(Bookpackage.class.getResource("/Gallery/bookpack.jpg"));
		Image i5=i4.getImage().getScaledInstance(330,400,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
	    JLabel image=new JLabel(i6);
		image.setBounds(420,25,330,400);
        add(image);
		
		
		
		
		
		setUndecorated(true);
		setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             new Bookpackage("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	     	if(e.getSource()==checkprice) {
	     		String pack=totalpackage.getSelectedItem();
	     		int cost=0;
	     		if(pack.equals("Gold Package")) {
	     			cost+=49999;
	     		}
	     		else if(pack.equals("Silver Package")) {
	     			cost+=35499;
	     		}
	     		else {
	     			cost+=22299;
	     		}
	     		int persons=Integer.parseInt(tftotalpersons.getText());
	     		cost *=persons;
	     	     tfprice.setText("Rs " +cost);
	     	}
	     	else if(e.getSource()==bookpackage) {
	     		try {
	     			Conn c=new Conn();
	     			c.s.executeUpdate("insert into bookpackage values('"+secondusername.getText()+"','"+totalpackage.getSelectedItem()+"','"+tftotalpersons.getText()+"','"+tfdocid.getText()+"','"+tfdocnumber.getText()+"','"+tfphone.getText()+"','"+tfprice.getText()+"')");
	     		JOptionPane.showMessageDialog(null, "Booked Package Sucessfully");
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
