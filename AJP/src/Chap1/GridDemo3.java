package Chap1;

import java.awt.*;
import java.awt.event.*;//optional
public class GridDemo3 extends Frame implements WindowListener
{
GridDemo3()
{
addWindowListener(this); 
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
GridDemo f=new GridDemo();
f.setFont(new Font("SansSerif",Font.BOLD,24));
GridLayout gl=new GridLayout(3,2,15,15);
Button btn1 = new Button("Button 1");
Button btn2 = new Button("Button 2");
Button btn3 = new Button("Button 3");
Button btn4 = new Button("Button 4");
Button btn5 = new Button("Button 5");
f.add(btn1);
f.add(btn2);
f.add(btn3);
f.add(btn4);
f.add(btn5);
f.setSize(500,500);
f.setLayout(gl);
f.setTitle("GridDemo");
f.setVisible(true);
}
}
