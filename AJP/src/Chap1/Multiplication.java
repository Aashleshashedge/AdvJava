package Chap1;

/*Write a program to generate KeyEvent when a key is pressed and display “Key Pressed” message.*/ 
import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
public class Multiplication extends JFrame implements
KeyListener { 
	JLabel l,l1,l2,l3; 
	JTextField tf,tf1,tf2;
	String msg = ""; 
	Multiplication() { l = new JLabel("Enter 1st Number");
	l.setBounds (100, 50, 100, 20); 
	tf = new JTextField(10); 
	tf.setBounds (210, 50, 100, 20);
l1 = new JLabel("Enter 2nd Number"); 
l1.setBounds (100, 100, 100, 20);
tf1 = new JTextField(10); 
tf1.setBounds (210, 100, 100, 20);
l3 = new JLabel("Press ' * '"); 
l3.setBounds (100, 150, 100, 20); 
tf2 = new JTextField(5); 
tf2.setBounds (210, 150, 100, 20); 
l2 = new JLabel(); 
l2.setBounds (320, 150, 100, 20);
	

tf2.addKeyListener(this); 
add(l);
add(tf); 
add(l1); 
add(tf1);
add(l3); 
add(tf2); 
add(l2); 

	}
// overriding the keyPressed() method 
public void keyPressed (KeyEvent e) { 
	int key = e.getKeyCode();
	if(key == KeyEvent.VK_MULTIPLY) { 
		int a,b,c; a = Integer.parseInt(tf.getText()); 
		b = Integer.parseInt(tf1.getText()); 
		c = a*b; l2.setEnabled(true); 
		l2.setText(" = "+c); 
		} 
	} 
// overriding the keyReleased() method 
public void keyReleased (KeyEvent e) {
	
} 
// overriding the keyTyped() method 
public void keyTyped (KeyEvent e) { 
	
} public static void main(String[] args) {
	Multiplication m =new Multiplication(); 
	m.setSize (400, 400); 
	m.setLayout (null); 
	m.setVisible (true);
	m.setTitle("Multiplication");
	m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	}
}