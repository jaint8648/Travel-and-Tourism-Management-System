package Travel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class CheckPackage extends JFrame implements ActionListener  {
JButton bookpack;
	
	CheckPackage(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(CheckPackage.class.getResource("/Gallery/icon1.png")));
		setTitle("Check Package");
		setResizable(false);
		setBounds(430,200,790,540);
		
		getContentPane().setBackground(Color.black);
		
		String package1[]= {"Gold Package","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Soft Drinks Free","Full Day 3 Island Cruise","Speaking Guide","Premium Offers :)","(50% Off)Rs 49999/-","Book Package","checkpack1.jpg"};
		String package2[]= {"Silver Package","5 Days and 6 Nights","Toll Free","Entrance Free Tickets","Meet and Greet At Airport","Welcome Drinks on Arrival","Night Safari","Cruise With Dinner","Premium Offers :)","(50% Off)Rs 35499/-","Book Package","checkpack2.jpg"};
		String package3[]= {"Bronze Package","6 Days and 5 Nights","Return Airfare","Horse Ridding & Clubbing","River Rafting","Hard Drinks Free","Daily Buffet","Candle Dinner","Premium Offers :)","(30% Off)Rs 22299/-","Book Package","checkpack3.jpg"};
		
		
		JTabbedPane tab=new JTabbedPane();
		JPanel p1=CreatePackage(package1);
	    tab.addTab("Gold Package", null,p1);
	
	    JPanel p2=CreatePackage(package2);
	    tab.addTab("Silver Package", null,p2); 
        
	    JPanel p3=CreatePackage(package3);
	    tab.addTab("Bronze Package", null,p3); 
        
	    tab.setFont(new Font("Times New Roman",Font.BOLD,35));
	    tab.setBackground(Color.yellow);
	    tab.setForeground(Color.red);
	    tab.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
	    tab.setBorder(BorderFactory.createEmptyBorder());
	    
        add(tab);
		
		
		setVisible(true);
		
		
	}
	
	public JPanel CreatePackage(String[]pack) {
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.black);
		
		JLabel m1=new JLabel(pack[0]);
		m1.setBounds(270, 20, 300, 40);
		m1.setForeground(Color.yellow);
		m1.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(m1);
		
		JLabel m2=new JLabel(pack[1]);
		m2.setBounds(60, 70, 300, 40);
		m2.setForeground(Color.green);
		m2.setFont(new Font("Times New Roman",Font.PLAIN,30));
		p1.add(m2);
		
		
		JLabel m3=new JLabel(pack[2]);
		m3.setBounds(60, 130, 300, 40);
		m3.setForeground(Color.green);
		m3.setFont(new Font("Times New Roman",Font.PLAIN,30));
		p1.add(m3);
		
		JLabel m4=new JLabel(pack[3]);
		m4.setBounds(60, 190, 500, 40);
		m4.setForeground(Color.green);
		m4.setFont(new Font("Times New Roman",Font.PLAIN,30));
		p1.add(m4);
		
		JLabel m5=new JLabel(pack[4]);
		m5.setBounds(60, 250, 400, 40);
		m5.setForeground(Color.green);
		m5.setFont(new Font("Times New Roman",Font.PLAIN,30));
		p1.add(m5);
		

		JLabel m6=new JLabel(pack[5]);
		m6.setBounds(60, 310, 400, 40);
		m6.setForeground(Color.green);
		m6.setFont(new Font("Times New Roman",Font.PLAIN,30));
		p1.add(m6);
		
		JLabel m7=new JLabel(pack[6]);
		m7.setBounds(60, 370, 400, 40);
		m7.setForeground(Color.green);
		m7.setFont(new Font("Times New Roman",Font.PLAIN,30));
		p1.add(m7);
		
		JLabel m8=new JLabel(pack[7]);
		m8.setBounds(60, 430, 300, 40);
		m8.setForeground(Color.green);
		m8.setFont(new Font("Times New Roman",Font.PLAIN,30));
		p1.add(m8);
		
		JLabel m9=new JLabel(pack[8]);
		m9.setBounds(415, 315, 400, 40);
		m9.setForeground(Color.white);
		m9.setFont(new Font("Arial",Font.BOLD,40));
		p1.add(m9);
		
		JLabel m10=new JLabel(pack[9]);
		m10.setBounds(455, 365, 400, 40);
		m10.setForeground(Color.red);
		m10.setFont(new Font("Tahoma",Font.BOLD,20));
		p1.add(m10);
		
		bookpack=new JButton(pack[10]);
		bookpack.addActionListener(this);
		bookpack.setForeground(Color.white);
		bookpack.setBackground(Color.blue);
		bookpack.setFont(new Font("sans-serif",Font.BOLD,30));
		bookpack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); 
		bookpack.setBorder(BorderFactory.createEmptyBorder());
		bookpack.setBounds(425, 425, 280, 40);
		p1.add(bookpack);
		
		ImageIcon i4 = new ImageIcon(CheckPackage.class.getResource("/Gallery/"+pack[11]));
		Image i5=i4.getImage().getScaledInstance(250,200,Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
	    JLabel image=new JLabel(i6);
		image.setBounds(450,95,250,200);
        p1.add(image);
		
		
		
        setUndecorated(true);
		
		return p1;
	
	
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new CheckPackage();
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bookpack) {
			setVisible(false);
		}
	}

}
