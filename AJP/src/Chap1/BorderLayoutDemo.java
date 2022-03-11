package Chap1;

import java.awt.*;
import java.awt.event.*;//optional
public class BorderLayoutDemo extends Frame implements
WindowListener
{
BorderLayoutDemo()
{
addWindowListener(this); //registering the event listener with the framewindow
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
BorderLayoutDemo f=new BorderLayoutDemo();
f.setFont(new Font("SansSerif",Font.PLAIN,38));
f.setLayout(new BorderLayout());
Button bt1=new Button("North");
f.add(bt1,BorderLayout.NORTH);
Button bt2=new Button("South");
f.add(bt2,BorderLayout.SOUTH);
Button bt3=new Button("West");
f.add(bt3,BorderLayout.WEST);
Button bt4=new Button("East");
f.add(bt4,BorderLayout.EAST);
Button bt5=new Button("Center");
f.add(bt5,BorderLayout.CENTER);
f.setSize(500,500);
f.setTitle("BorderLayoutDemo");
f.setVisible(true);
}
}
