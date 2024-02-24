package Travel.Management.System;
import org.jdesktop.swingx.prompt.PromptSupport; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Signup extends JFrame implements ActionListener {

	JButton back,signin;
	JTextField tfusername,tffullname,tfemail,tfanswer;
	JPasswordField tfpassword;
	Choice tfsecurity;
	Signup(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Signup.class.getResource("/Gallery/icon1.png")));

		setBounds(210,150,900,450);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.black);
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.black);
		p1.setBounds(0,0,500,500);
		p1.setLayout(null);
		add(p1);
		
		JLabel signup=new JLabel("Sign Up");
		signup.setFont(new Font("Tahoma",Font.BOLD,30));
		signup.setForeground(Color.red);
		signup.setBounds(200, 20, 200, 50);
		p1.add(signup);
		
		JTextField t1=new JTextField();
		p1.add(t1);
		
		tfusername=new JTextField();
		tfusername.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		tfusername.setBounds(50, 80, 400, 30);
		PromptSupport.setPrompt("Enter your Username", tfusername);
		p1.add(tfusername);
		
		tffullname=new JTextField();
		tffullname.setFont(new Font("Tahoma",Font.PLAIN,18));
		tffullname.setBorder(BorderFactory.createEmptyBorder());
		tffullname.setBounds(50, 130, 400, 30);
		PromptSupport.setPrompt("Enter your Full Name", tffullname);
		p1.add(tffullname);
		
		tfpassword=new JPasswordField();
		tfpassword.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		tfpassword.setBounds(50, 180, 400, 30);
		PromptSupport.setPrompt("Enter your Password", tfpassword);
		p1.add(tfpassword);
		
		
		tfemail=new JTextField();
		tfemail.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfemail.setBorder(BorderFactory.createEmptyBorder());
		tfemail.setBounds(50, 230, 400, 30);
		PromptSupport.setPrompt("Enter your Email Address", tfemail);
		p1.add(tfemail);
		
		
	    JLabel security=new JLabel("Security Question");
	    security.setFont(new Font("Tahoma",Font.PLAIN,18));
	    security.setForeground(Color.red);
	    security.setBounds(50, 280,150, 30);
		p1.add(security);
		
		tfsecurity=new Choice();
		tfsecurity.setBounds(230,283,220,80);
		tfsecurity.add("What is your Nickname");
		tfsecurity.add("What is your Father's Name");
		tfsecurity.add("What is your Bestfriend Name");
		p1.add(tfsecurity);
		
		tfanswer=new JTextField();
		tfanswer.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfanswer.setBorder(BorderFactory.createEmptyBorder());
		tfanswer.setBounds(50, 330, 400, 30);
		PromptSupport.setPrompt("Enter your Answer", tfanswer);
		p1.add(tfanswer);
		
		signin=new JButton("Sign In");
		signin.setBounds(80,390,150,50);
		signin.setFont(new Font("Tahoma",Font.PLAIN,18));
		signin.setBorder(BorderFactory.createEmptyBorder());
		signin.setForeground(Color.white);
		signin.setBackground(Color.green);
		signin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signin.addActionListener(this);
		p1.add(signin);
		
		
		back=new JButton("Back");
		back.setBounds(250,390,150,50);
		back.setFont(new Font("Tahoma",Font.PLAIN,18));
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setForeground(Color.white);
		back.setBackground(Color.green);
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(this);
		p1.add(back);
		
		ImageIcon i4 = new ImageIcon(Signup.class.getResource("/Gallery/resort2.jpg"));
	    Image i5=i4.getImage().getScaledInstance(400,480,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel image=new JLabel(i6);
		image.setBounds(501,0,400,480);
	    add(image);
		
		
		
		
	    setUndecorated(true);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new Signup();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==signin) {
		String username=tfusername.getText();
		String name=tffullname.getText();
		@SuppressWarnings("deprecation")
		String password=tfpassword.getText();
		String email=tfemail.getText();
		String security=tfsecurity.getSelectedItem();
		String answer=tfanswer.getText();
		
		if(username.equals("")) {
			JOptionPane.showMessageDialog(null,"Username Should not be Empty");
			return;
		}
		if(name.equals("")) {
			JOptionPane.showMessageDialog(null,"Full Name Should not be Empty");
			return;
		}
		if(password.equals("")) {
			JOptionPane.showMessageDialog(null,"Password Should not be Empty");
			return;
		}
		if(email.equals("")) {
			JOptionPane.showMessageDialog(null,"Email Should not be Empty");
			return;
		}
		if(answer.equals("")) {
			JOptionPane.showMessageDialog(null,"Your Answer Should not be Empty");
			return;
		}
		
		
		
		try {
			Conn c=new Conn();
			String query="insert into signup values('"+username+"','"+name+"','"+password+"','"+email+"','"+security+"','"+answer+"')";
			c.s.executeUpdate(query);
		JOptionPane.showMessageDialog(null,"Account Created Sucessfully :) ");
		 setVisible(false);
			new login();
		}
			catch(Exception e1) {
				e1.printStackTrace();
			}
		}
		
		if(e.getSource()==back) {
			setVisible(false);
			new login();
		}
	}

}
