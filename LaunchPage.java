package p;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import p.RoomDetails;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class LaunchPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton b1 = new JButton("Display room details");
	JButton b2 = new JButton("Display room availability");
	JButton b3 = new JButton("Book");
	JButton b4 = new JButton("Order Food");
	JButton b5 = new JButton("Check Out");
	JPanel p =new JPanel();
	
	
	
	LaunchPage(){


			
		    
			frame.setTitle("HOTEL");
			
			//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);// wont close the application
			//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE );//just hiding the app
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close the application rather than hiding
			frame.setResizable(false);//prevent frame resizing
			ImageIcon img = new ImageIcon("C:\\Users\\Rashini De Silva\\Pictures\\Saved Pictures\\FB_IMG_1573733542979.jpg");// create an image icon
			frame.setIconImage(img.getImage());
			
			
			//frame.getContentPane().setBackground(Color.yellow);// (001122)or Hexadecimal colors
			frame.getContentPane().setBackground(Color.gray);// for RGB (255,0,0)-re (0,0,0)black range (0-255)
			frame.setLayout(new BorderLayout());
			
			JLabel label = new JLabel();
			label.setBounds(150,150,150,150);
			label.setBackground(Color.yellow);
			label.setText("WELCOME");
			label.setHorizontalAlignment(label.CENTER);
			label.setFont(new Font("comic sans",Font.BOLD,40));
			
			
			p.setBackground(new Color(123,50,250));
			p.setPreferredSize(new Dimension(550,550));
			p.setLayout(new GridLayout(5,1,10,10));
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			
			
			p.add(b1);
			p.add(b2);
			p.add(b3);
			p.add(b4);
			p.add(b5);
			
			
			
			
			frame.add(label);
			frame.add(p,BorderLayout.SOUTH);
			frame.pack();
			frame.setVisible(true);
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			RoomDetails window = new RoomDetails();
			frame.dispose();// get rid of launch page just new page given
		}
		if(e.getSource()==b2) {
			DisplayRoomAvailability window = new DisplayRoomAvailability();
			frame.dispose();// get rid of launch page just new page given
		}
		if(e.getSource()==b3) {
			Book window = new Book();
			frame.dispose();// get rid of launch page just new page given
		}
		if(e.getSource()==b4) {
			Food window = new Food();
			frame.dispose();// get rid of launch page just new page given
		}
		if(e.getSource()==b5) {
			CheckOut window = new CheckOut();
			frame.dispose();// get rid of launch page just new page given
		}
		
	}

}
