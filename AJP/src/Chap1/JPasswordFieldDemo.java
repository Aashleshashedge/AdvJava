package Chap1;

import javax.swing.*; 
import java.awt.*;
public class JPasswordFieldDemo extends JFrame{ 
	JPasswordFieldDemo(){ 
		setLayout(null); 
		setVisible(true); 
		setSize(300, 300); 
		setTitle("JPasswordField");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JLabel l = new JLabel("Enter Pass :-");
		l.setFont(new Font("Times New Roman",Font.BOLD , 15));
		l.setBounds(50, 50, 100, 10);
		add(l);
		JPasswordField ps = new JPasswordField();
		ps.setEchoChar('#'); 
		ps.setBounds(30, 80, 250,25); 
		add(ps); 
		} 
public static void main(String[] args) { 
	new JPasswordFieldDemo(); 
} 
}
