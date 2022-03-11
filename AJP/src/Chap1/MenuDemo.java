package Chap1;
import java.awt.*; 
import java.awt.event.*;//optional 
public class MenuDemo extends Frame implements WindowListener 
{ 
	MenuDemo() 
{ 
addWindowListener(this); //registering the event listener with the frame window 
}
public void windowOpened(WindowEvent e) 
{} 
public void windowClosing(WindowEvent e) 
{ 
System.exit(1); 
}
public void windowClosed(WindowEvent e) {} 
public void windowIconified(WindowEvent e) {} 
public void windowDeiconified(WindowEvent e) {} 
public void windowActivated(WindowEvent e) {} 
public void windowDeactivated(WindowEvent e) {} 
public static void main(String args[]) { 
	
	MenuDemo f=new MenuDemo();
	MenuBar mb=new MenuBar();
	Menu m1=new Menu("Colours");
	MenuItem mi1=new MenuItem("Red");
	MenuItem mi2=new MenuItem("Yellow");
	MenuItem mi3=new MenuItem("Black");
	mi3.setEnabled(false);
	MenuItem mi4=new MenuItem("Pink");
	MenuItem mi5=new MenuItem("White");
	mb.add(m1);
	m1.add(mi1);
	m1.add(mi2);
	m1.add(mi3);
	m1.add(mi4);
	m1.add(mi5);
	f.setMenuBar(mb);
	 f.setSize(400,400);    
     f.setLayout(new FlowLayout()); 
     f.setTitle("MenuDemo");
     f.setVisible(true); 
}
}
