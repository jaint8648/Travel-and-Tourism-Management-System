package Travel.Management.System;
import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class loading extends JFrame implements Runnable {
	
	Thread t;
	JProgressBar bar;

	String username;
	
	loading(String username){
		this.username=username;
		getContentPane().setBackground(Color.black);
		t=new Thread(this);
		setIconImage(Toolkit.getDefaultToolkit().getImage(loading.class.getResource("/Gallery/icon1.png")));
		setBounds(390,200,650,210);
		setResizable(false);
		setTitle("Loading");
		setLayout(null);
		
		JLabel text=new JLabel("T & T");
		text.setBounds(265,30,200,40);
		text.setForeground(Color.white);
		text.setFont(new Font("Ralway",Font.BOLD,35));
		add(text);
		
		bar=new JProgressBar();
		bar.setBounds(120,100,400,35);
		bar.setStringPainted(true);
		bar.setBackground(Color.black);
		add(bar);
		
		JLabel loading =new JLabel("Loading , Please wait...");
		loading.setBounds(240,140,150,30);
		loading.setForeground(Color.red);
		add(loading);
		
		JLabel username1 =new JLabel("Welcome to T & T Portal,"+username);
		username1.setBounds(170,170,340,30);
		username1.setForeground(Color.white);	
		username1.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(username1);
		
		
		
		
		
		
		
		
		
		
		t.start();
		setUndecorated(true);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                new loading("");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=1;i<=101;i++) {
				int max=bar.getMaximum();
				int value=bar.getValue();
				if(value<max) {
					bar.setValue(bar.getValue()+1);
				}
				else {
					setVisible(false);
					new Dashboard(username);
				}
				Thread.sleep(10);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	} 

}
