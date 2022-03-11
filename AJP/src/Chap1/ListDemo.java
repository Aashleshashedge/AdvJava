package Chap1;

import java.awt.*;
import java.awt.event.*;
public class ListDemo extends Frame implements WindowListener {
ListDemo()
{
addWindowListener(this); //register
}
public void windowOpened(WindowEvent e) {}
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
ListDemo f = new ListDemo();
List l=new List(3);
l.add("Summer");
l.add("Winter");
l.add("Rainy");
f.add(l);
f.setSize(400,400);
f.setLayout(new FlowLayout());
f.setTitle("ListDemo");
f.setVisible(true);
}
}
