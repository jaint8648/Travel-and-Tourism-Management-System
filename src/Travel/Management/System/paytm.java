package Travel.Management.System;
import javax.swing.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import java.awt.event.*;
import java.awt.*;
@SuppressWarnings("serial")
public class paytm extends JFrame implements ActionListener {

	JButton back;
	
	paytm(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Addpersonaldetails.class.getResource("/Gallery/icon1.png")));
		setTitle("Paytm");
		setBounds(325,158,1040,610);

		 setLayout(new BorderLayout());
		 setResizable(false);
		
		  JFXPanel fxPanel = new JFXPanel();
	        add(fxPanel, BorderLayout.CENTER);

	        Platform.runLater(() -> {
	            WebView webView = new WebView();
	            fxPanel.setScene(new Scene(webView));
	            webView.getEngine().load("https://paytm.com/online-payments");
	        });
		
		back=new JButton("BACK");
		    back.setBounds(0,0,150,60);
		    back.addActionListener(this);
		    back.setBackground(Color.black);
		    back.setForeground(Color.white);
		    back.setFont(new Font("Tahoma",Font.BOLD,18));
		    back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		    back.setBorder(BorderFactory.createEmptyBorder());
		    add(back, BorderLayout.NORTH);
		
		
	
		setUndecorated(true);
		setVisible(true);   
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new paytm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			setVisible(false);
			new Payments();
		}
	}

}
