package p;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayRoomAvailability implements ActionListener {
	JFrame frame = new JFrame();
	JButton b1 = new JButton("Back3");
	
	
	DisplayRoomAvailability(){
		
		
JLabel b = new JLabel("new window");
		
		
		b.setBounds(0,0,100,100);
		b1.setBounds(10,10,100,100);
		b1.addActionListener(this);
		b.setBackground(Color.red);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.add(b);
		frame.add(b1);
		frame.setVisible(true);
		
	}


	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			LaunchPage window = new LaunchPage();
			frame.dispose();// get rid of launch page just new page given
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
