package Travel.Management.System;
import org.jdesktop.swingx.prompt.PromptSupport;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;
@SuppressWarnings("serial")
public class forgotpass extends JFrame implements ActionListener {
	JTextField tfusername,tffullname,tfemail,tfanswer,tfsecurity;
	JTextField tfpassword;
	JButton search,retreive,back;
	forgotpass(){
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(forgotpass.class.getResource("/Gallery/icon1.png")));
		setTitle("Forgot Password");
		setBounds(210,150,900,450);
		setLayout(null);
		setResizable(false);
		getContentPane().setBackground(Color.black);
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.black);
		p1.setBounds(0,0,500,500);
		p1.setLayout(null);
		add(p1);
		
		JLabel forgotpass=new JLabel("Forgot Password");
		forgotpass.setFont(new Font("sans-serif",Font.BOLD,30));
		forgotpass.setForeground(Color.white);
		forgotpass.setBounds(130, 20, 250, 50);
		p1.add(forgotpass);
		
		
		JTextField t1=new JTextField();
		p1.add(t1);
	    
		
		
		tfusername=new JTextField();
		tfusername.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		tfusername.setBounds(50, 80, 200,30);
      	p1.add(tfusername);
	    PromptSupport.setPrompt("Enter your Username", tfusername);	
		 
	    search=new JButton("Search");
		search.setBounds(280,80,170,32);
		search.setFont(new Font("Tahoma",Font.PLAIN,18));
		search.setBorder(BorderFactory.createEmptyBorder());
		search.setForeground(Color.black);
		search.setBackground(Color.yellow);
		search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		search.addActionListener(this);
		p1.add( search);
		
		tffullname=new JTextField();
		tffullname.setFont(new Font("Tahoma",Font.PLAIN,18));
		tffullname.setBorder(BorderFactory.createEmptyBorder());
		tffullname.setBounds(50, 130, 400, 30);
		p1.add(tffullname);
		PromptSupport.setPrompt("Full Name", tffullname);
		
		tfemail=new JTextField();
		tfemail.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfemail.setBorder(BorderFactory.createEmptyBorder());
		tfemail.setBounds(50, 180, 400, 30);
		
		PromptSupport.setPrompt("Email", tfemail);
		p1.add(tfemail);
		
		
		tfanswer=new JTextField();
		tfanswer.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfanswer.setBorder(BorderFactory.createEmptyBorder());
		tfanswer.setBounds(50, 280, 200, 30);
		p1.add(tfanswer);
		PromptSupport.setPrompt("Answer", tfanswer);
		
		retreive=new JButton("Retrieve");
		retreive.setBounds(280,283,170,30);
		retreive.setFont(new Font("Tahoma",Font.PLAIN,18));
		retreive.setBorder(BorderFactory.createEmptyBorder());
		retreive.setForeground(Color.black);
		retreive.setBackground(Color.yellow);
		retreive.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		retreive.addActionListener(this);
		p1.add(retreive);
		
	    JLabel security=new JLabel("Security Question");
	    security.setFont(new Font("Tahoma",Font.PLAIN,18));
	    security.setForeground(Color.green);
	    security.setBounds(50, 230,150, 30);
		p1.add(security);
		
		tfsecurity=new JTextField();
		tfsecurity.setBounds(230,233,220,30);
		tfsecurity.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfsecurity);
		
		tfpassword=new JTextField();
		tfpassword.setFont(new Font("Tahoma",Font.PLAIN,18));
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		tfpassword.setBounds(50, 330, 400, 30);
		PromptSupport.setPrompt("Password", tfpassword);
		p1.add(tfpassword);
		
		
		back=new JButton("Back");
		back.setBounds(170,390,150,50);
		back.setFont(new Font("Tahoma",Font.PLAIN,18));
		back.setBorder(BorderFactory.createEmptyBorder());
		back.setForeground(Color.white);
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.setBackground(Color.red);
		back.addActionListener(this);
		p1.add(back);
		
		ImageIcon i4 = new ImageIcon(Signup.class.getResource("/Gallery/resort3.jpg"));
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
		  new forgotpass();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		    if(e.getSource()==search) {
		    	try {
		    		String query="Select * from signup where username='"+tfusername.getText()+"'";
		    	    Conn c=new Conn();
		    	    ResultSet rs=c.s.executeQuery(query);
		    	    while(rs.next()) {
		    	    	tffullname.setText(rs.getString("name"));
		    	    	tfemail.setText(rs.getString("email"));
		    	    	tfsecurity.setText(rs.getString("question"));
		    	    }
		    	        
		    	}
		    	catch(Exception e1) {
		    		e1.printStackTrace();
		    	}
		    }
	
	if(e.getSource()==retreive) {
    	try {
    		String query="Select * from signup where answer='"+tfanswer.getText()+"' AND username='"+tfusername.getText()+"'";
    	    Conn c=new Conn();
    	    ResultSet rs=c.s.executeQuery(query);
    	    while(rs.next()) {
    	    	tfpassword.setText(rs.getString("password"));
    	    }
    	        
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
