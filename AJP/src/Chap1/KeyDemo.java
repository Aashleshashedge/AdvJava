package Chap1;

/*Write a program to generate KeyEvent when a key is pressed and display “Key Pressed” message.*/ 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class KeyDemo extends JFrame implements 
KeyListener{ 
	JLabel l;
	JTextArea ta; 
	KeyDemo() { l = new JLabel();
	l.setBounds (20, 50, 100, 20);
	ta = new JTextArea(); 
	ta.setBounds (20, 80, 300, 100);
ta.addKeyListener(this); 
add(l); 
add(ta);
setSize (400, 400); 
setLayout (null); 
setVisible (true); 
setTitle("Key Pressed Demo");
} 
// overriding the keyPressed() method 
public void keyPressed (KeyEvent e) {
	l.setText ("Key Pressed"); 
	} 
// overriding the keyReleased() method
public void keyReleased (KeyEvent e) { 
	l.setText ("Key Released");
	} 
// overriding the keyTyped() method 
public void keyTyped (KeyEvent e) { 	
}
public static void main(String[] args) { 
KeyDemo kp=new KeyDemo(); 
kp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
}