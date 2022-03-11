package Chap1;
import java.awt.*; 
import java.awt.event.*;//optional 
public class ButtonDemoo extends Frame implements WindowListener 
{ 
ButtonDemoo() 
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
ButtonDemo f=new ButtonDemo(); 
Label lb=new Label("Name: "); 
TextField tf=new TextField(20); 
Label lb1=new Label("Feedback: "); 
TextArea ta=new TextArea(3,20); 
Button b1=new Button("Submit"); 
f.add(lb); 
f.add(tf); 
f.add(lb1); 
f.add(ta); 
f.add(b1); 
f.setSize(500,500); 
f.setLayout(new FlowLayout() ); 
f.setTitle("ButtonDemo"); 
f.setVisible(true); 
} 
}
