package Travel.Management.System;
import org.jdesktop.swingx.prompt.PromptSupport;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.*;

@SuppressWarnings("serial")
public class login extends JFrame implements ActionListener {
JTextField tfusername;
JPasswordField tfpassword;
JButton createnew,login,forgot;
	login(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/Gallery/icon1.png")));
		setTitle("Login");
		setSize(890,500);
		setLocation(230,150);
		setResizable(false);
		
		getContentPane().setBackground(Color.white);
		
		JPanel p1=new JPanel();
		p1.setBounds(0,0,400,500);
		p1.setBackground(Color.white);
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i4 = new ImageIcon(login.class.getResource("/Gallery/resort.jpg"));
	    Image i5=i4.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel image=new JLabel(i6);
		image.setBounds(0,0,400,500);
	    p1.add(image);
		
	    JPanel p2=new JPanel();
	    p2.setLayout(null);
	    p2.setBounds(400, 30, 450, 300);
	    p2.setBackground(Color.black);
	    add(p2);
		
		JLabel j1=new JLabel("T & T");
        j1.setFont(new Font("Tahoma",Font.PLAIN,35));
        j1.setForeground(Color.white);
		j1.setBounds(590,30,300,30);
		p2.add(j1);
		
		JTextField t1=new JTextField();
		p2.add(t1);
	    
		tfusername=new JTextField();
		tfusername.setBounds(460,90,350,50);
		tfusername.setFont(new Font("Eras Bold ITC",Font.PLAIN,20));
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		PromptSupport.setPrompt("Email Address or Phone Number", tfusername);
		p2.add(tfusername);
		
		tfpassword=new JPasswordField();
		tfpassword.setBounds(460,160,350,50);
		tfpassword.setFont(new Font("Eras Bold ITC",Font.PLAIN,20));
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		PromptSupport.setPrompt("Password", tfpassword);
		p2.add(tfpassword);
		
		login=new JButton("Log in");
		login.setBackground(Color.blue);
		login.setForeground(Color.white);
		login.setFont(new Font("Tahoma",Font.BOLD,20));
		login.addActionListener(this);
		login.setBounds(460, 240, 350, 50);
		login.setBorder(BorderFactory.createEmptyBorder());
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		p2.add(login);
		
	
		forgot=new JButton("Forgotten password?");
		forgot.setBackground(Color.black);
		forgot.setForeground(Color.blue);
		forgot.setFont(new Font("SANS SERIF",Font.PLAIN,15));
		forgot.setBounds(530, 300, 200, 30);
		forgot.setBorder(BorderFactory.createEmptyBorder());
		forgot.addActionListener(this);
		forgot.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p2.add(forgot);
		
		
		createnew=new JButton("Create new account");
		createnew.setBackground(Color.green);
		createnew.setForeground(Color.white);
		createnew.setFont(new Font("Tahoma",Font.BOLD,20));
		createnew.setBounds(500, 380, 270, 50);
		createnew.setBorder(BorderFactory.createEmptyBorder());
		createnew.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		createnew.addActionListener(this);
		p2.add(createnew);
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==createnew) {
			setVisible(false);
			  new Signup();
		}
		if(e.getSource()==forgot) {
			setVisible(false);
			 new forgotpass();
		}
		if(e.getSource()==login) {
			try {
				String username=tfusername.getText();
				@SuppressWarnings("deprecation")
				String password=tfpassword.getText();
				String query="Select * from signup where username='"+username+"' AND password='"+password+"'";
				Conn c=new Conn();
				ResultSet rs=c.s.executeQuery(query);
				if(rs.next()) {
					setVisible(false);
					 new loading(username);
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid Username and Password");
				}
				
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	
	}

}
