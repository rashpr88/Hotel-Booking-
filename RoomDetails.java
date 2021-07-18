package p;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RoomDetails implements ActionListener {
	JFrame frame = new JFrame();
	JPanel p =new JPanel();
	JTextField t1 = new JTextField();
	
	
	JLabel label1 = new JLabel();
	JLabel label2= new JLabel();
	JLabel label3 = new JLabel();
	
	
	
	RoomDetails(){
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
		
		
		label1.setBounds(90,90,90,90);
		label1.setBackground(Color.yellow);
		label1.setText("Room Details");
		label1.setHorizontalAlignment(label1.CENTER);
		label1.setFont(new Font("comic sans",Font.BOLD,40));
		
		label2.setBounds(90,90,90,90);
		label2.setBackground(Color.yellow);
		label2.setText("1.Luxury Double Room \\n 2.Deluxe Double Room \\n3.Luxury Single Room \\n4.Deluxe Single Room");
		label2.setHorizontalAlignment(label2.CENTER);
		label2.setFont(new Font("comic sans",Font.BOLD,15));
		
		label3.setBounds(70,70,70,70);
		label3.setBackground(Color.yellow);
		label3.setText("3");
		label3.setHorizontalAlignment(label3.CENTER);
		label3.setFont(new Font("comic sans",Font.BOLD,40));
		
		
		
		
		
		
		p.setBackground(new Color(123,50,250));
		p.setPreferredSize(new Dimension(550,550));
		
		
		
		
		
		p.add(label1);
		
		p.add(label2);
		p.add(t1);
		

		
		
		
		
		
		frame.add(p,BorderLayout.SOUTH);
		frame.add(label1);
		frame.pack();
		frame.setVisible(true);
	
	
	
}
		
		

		
	


	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==t1) {
			LaunchPage window = new LaunchPage();
			frame.dispose();// get rid of launch page just new page given
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void features(int i)
    {
        switch (i) {
            case 1:System.out.println("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ");
                break;
            case 2:System.out.println("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ");
                break;
            case 3:System.out.println("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ");
                break;
            case 4:System.out.println("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }
}
