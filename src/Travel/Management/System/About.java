package Travel.Management.System;
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class About extends JFrame{

	About(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Addpersonaldetails.class.getResource("/Gallery/icon1.png")));
		setTitle("About Us");
		setBounds(430,200,790,560);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setResizable(false);
	
		JLabel title=new JLabel("About Us");
		title.setBounds(325, 25, 350, 30);
		title.setFont(new Font("Tahoma",Font.BOLD,28));
		title.setForeground(Color.black);
		add(title);
		
		
		
		String para=
                 
"Welcome to our Travel and Tourism Management System! We are dedicated to providing seamless travel experiences for our users, offering a comprehensive platform to book packages, reserve hotels, and explore detailed hotel and package information.\n"+
"\n"+
"Our Mission\n"+
"\n"+
"Our mission is to simplify travel planning and enhance user experiences by offering a one-stop solution for all travel needs. From exotic getaways to local adventures, we strive to make every journey memorable.\n"+
"\n"+
"Our Team\n"+
"\n"+
"Behind our platform is a team of passionate developers and travel enthusiasts committed to delivering excellence. With a blend of expertise in software development and a deep understanding of travel dynamics, we aim to revolutionize the way people explore the world.\n"+
"\n"+
"Contact Us\n"+
"\n"+
"Have questions or feedback? We'd love to hear from you! Feel free to reach out to us at jaint8648@gmail.com and join us on our journey to redefine travel.\n"+
		"\n";
		
		TextArea area=new TextArea(para,10,40,Scrollbar.VERTICAL);
		area.setEditable(false);
		area.setFont(new Font("Times New Roman",Font.BOLD,18));
		area.setBackground(Color.black);
        area.setForeground(Color.white);
		area.setBounds(20, 70, 730, 430);
		add(area);
		
		
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new About();
	}
	

}
