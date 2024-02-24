package Travel.Management.System;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Dashboard extends JFrame implements ActionListener {

	JButton addpersonaldetails,updatepersonaldetails,viewdetails,deletepersonaldetails,checkpackage,bookpackage,viewpackage,viewhotels,bookhotel,viewbookedhotel,destinations,payments,logout,about;
	String username;
	Dashboard(String username)
	
	{
		this.username=username;
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/Gallery/icon1.png")));
		setTitle("DashBoard");
		setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.black);
		p1.setBounds(0,0,1600,125);
		add(p1);
		
		
		ImageIcon i1 = new ImageIcon(Dashboard.class.getResource("/Gallery/dashtravel.png"));
		Image i2=i1.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
	    JLabel icon=new JLabel(i3);
		icon.setBounds(5,0,125,125);
        p1.add(icon);
		
		JLabel heading=new JLabel("DashBoard");
		heading.setBounds(120,80,300,40);
		heading.setForeground(Color.white);
		heading.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(heading);
        
        JLabel superheading=new JLabel("Travel and Tourism Management");
        superheading.setBounds(480,35,850,55);
        superheading.setForeground(Color.yellow);
        superheading.setFont(new Font("Times New Roman",Font.BOLD,50));
		p1.add(superheading);
			
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.black);
		p2.setBounds(0, 65, 310, 980);
		add(p2);
		
		addpersonaldetails=new JButton("Add Personal Details");
		addpersonaldetails.setBounds(5, 60, 300, 35);
		addpersonaldetails.setBackground(Color.black);
		addpersonaldetails.setForeground(Color.white);
		addpersonaldetails.setFont(new Font("Tahoma",Font.BOLD,18));
		addpersonaldetails.setBorder(new LineBorder(Color.red));
		addpersonaldetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addpersonaldetails.addActionListener(this);
		p2.add(addpersonaldetails);
		
		updatepersonaldetails=new JButton("Update Personal Details");
		updatepersonaldetails.setBounds(5, 107, 300, 35);
		updatepersonaldetails.setBackground(Color.black);
		updatepersonaldetails.setForeground(Color.white);
		updatepersonaldetails.setFont(new Font("Tahoma",Font.BOLD,18));
		updatepersonaldetails.setBorder(new LineBorder(Color.red));
		updatepersonaldetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		updatepersonaldetails.addActionListener(this);
		p2.add(updatepersonaldetails);
		
		
		viewdetails=new JButton("View Details");
		viewdetails.setBounds(5, 154, 300, 35);
		viewdetails.setBackground(Color.black);
		viewdetails.setForeground(Color.white);
		viewdetails.setFont(new Font("Tahoma",Font.BOLD,18));
		viewdetails.setBorder(new LineBorder(Color.red));
		viewdetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewdetails.addActionListener(this);
		p2.add(viewdetails);
		
		
		deletepersonaldetails=new JButton("Delete Personal Details");
		deletepersonaldetails.setBounds(5, 201, 300, 35);
		deletepersonaldetails.setBackground(Color.black);
		deletepersonaldetails.setForeground(Color.white);
		deletepersonaldetails.setFont(new Font("Tahoma",Font.BOLD,18));
		deletepersonaldetails.setBorder(new LineBorder(Color.red));
		deletepersonaldetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		deletepersonaldetails.addActionListener(this);
		p2.add(deletepersonaldetails);
		
		checkpackage=new JButton("Check Package");
		checkpackage.setBounds(5, 248, 300, 35);
		checkpackage.setBackground(Color.black);
		checkpackage.setForeground(Color.white);
		checkpackage.setFont(new Font("Tahoma",Font.BOLD,18));
		checkpackage.setBorder(new LineBorder(Color.red));
		checkpackage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		checkpackage.addActionListener(this);
		p2.add(checkpackage);
		
		bookpackage=new JButton("Book Package");
		bookpackage.setBounds(5, 295, 300, 35);
		bookpackage.setBackground(Color.black);
		bookpackage.setForeground(Color.white);
		bookpackage.setFont(new Font("Tahoma",Font.BOLD,18));
		bookpackage.setBorder(new LineBorder(Color.red));
		bookpackage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bookpackage.addActionListener(this);
		p2.add(bookpackage);
		
		
	    viewpackage=new JButton("View Package");
		viewpackage.setBounds(5, 342, 300, 35);
		viewpackage.setBackground(Color.black);
		viewpackage.setForeground(Color.white);
		viewpackage.setFont(new Font("Tahoma",Font.BOLD,18));
		viewpackage.setBorder(new LineBorder(Color.red));
		viewpackage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewpackage.addActionListener(this);
		p2.add(viewpackage);
		

		viewhotels=new JButton("View Hotels");
		viewhotels.setBounds(5, 389, 300, 35);
		viewhotels.setBackground(Color.black);
		viewhotels.setForeground(Color.white);
		viewhotels.setFont(new Font("Tahoma",Font.BOLD,18));
		viewhotels.setBorder(new LineBorder(Color.red));
		viewhotels.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewhotels.addActionListener(this);
		p2.add(viewhotels);
		
		bookhotel=new JButton("Book Hotel");
		bookhotel.setBounds(5, 436, 300, 35);
		bookhotel.setBackground(Color.black);
		bookhotel.setForeground(Color.white);
		bookhotel.setFont(new Font("Tahoma",Font.BOLD,18));
		bookhotel.setBorder(new LineBorder(Color.red));
		bookhotel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		bookhotel.addActionListener(this);
		p2.add(bookhotel);
		
		viewbookedhotel=new JButton("View Booked Hotel");
		viewbookedhotel.setBounds(5, 483, 300, 35);
		viewbookedhotel.setBackground(Color.black);
		viewbookedhotel.setForeground(Color.white);
		viewbookedhotel.setFont(new Font("Tahoma",Font.BOLD,18));
		viewbookedhotel.setBorder(new LineBorder(Color.red));
		viewbookedhotel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewbookedhotel.addActionListener(this);
		p2.add(viewbookedhotel);
		
		destinations=new JButton("Destinations");
		destinations.setBounds(5, 530, 300, 35);
		destinations.setBackground(Color.black);
		destinations.setForeground(Color.white);
		destinations.setFont(new Font("Tahoma",Font.BOLD,18));
		destinations.setBorder(new LineBorder(Color.red));
		destinations.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		destinations.addActionListener(this);
		p2.add(destinations);
				
		
		payments=new JButton("Payment");
		payments.setBounds(5, 577, 300, 35);
		payments.setBackground(Color.black);
		payments.setForeground(Color.white);
		payments.setFont(new Font("Tahoma",Font.BOLD,18));
		payments.setBorder(new LineBorder(Color.red));
		payments.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		payments.addActionListener(this);
		p2.add(payments);
				
		logout=new JButton("Log Out");
		logout.addActionListener(this);
		logout.setBounds(5, 671, 300, 30);
		logout.setBackground(Color.black);
		logout.setForeground(Color.white);
		logout.setFont(new Font("Tahoma",Font.BOLD,18));
		logout.setBorder(new LineBorder(Color.red));
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p2.add(logout);
		
		about=new JButton("About Us");
		about.setBounds(5, 624, 300, 35);
		about.setBackground(Color.black);
		about.setForeground(Color.white);
		about.setFont(new Font("Tahoma",Font.BOLD,18));
		about.setBorder(new LineBorder(Color.red));
		about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		about.addActionListener(this);
		p2.add(about);
		
		ImageIcon i4 = new ImageIcon(login.class.getResource("/Gallery/fancy.jpg"));
		Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
	    ImageIcon i6=new ImageIcon(i5);
		JLabel image=new JLabel(i6);
		image.setBounds(0,0,1650,1000);
        add(image);
		
		
		
		
        setUndecorated(true);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  new Dashboard("");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addpersonaldetails) {
			new Addpersonaldetails(username);
			
		}
		else if(e.getSource()==viewdetails) {
			new ViewDetails(username);
		}
		else if(e.getSource()==updatepersonaldetails) {
			new updatepersonaldetails(username);
		}
		else if(e.getSource()==checkpackage) {
			new CheckPackage();
		}
		else if(e.getSource()==bookpackage) {
			 new Bookpackage(username);
		}
		else if(e.getSource()==viewpackage) {
			 new Viewpackage(username);
		}
		else if(e.getSource()==viewhotels) {
			 new ViewHotels();
		}
		else if(e.getSource()==destinations) {
	         new Destinations();
		}
		else if(e.getSource()==bookhotel) {
			new BookHotel(username);
		}
		else if(e.getSource()==viewbookedhotel) {
			new ViewBookedHotel(username);
		}
		else if(e.getSource()==logout) {
			System.exit(0);
		}
		else if(e.getSource()==payments) {
			new Payments();
		}
		else if(e.getSource()==deletepersonaldetails) {
			new deletepersonaldetails(username);
		}
		else if(e.getSource()==deletepersonaldetails) {
			new deletepersonaldetails(username);
		}
		else if(e.getSource()==about) {
			 new About();
		}
	}

}
