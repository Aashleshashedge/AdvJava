package Chap1;

import java.awt.*;
import java.awt.event.*;
public class ListsDemo extends Frame implements WindowListener {
ListsDemo()
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
List l=new List(6,true);
l.add("Hindustan Times");
l.add("The Times of India");
l.add("The Indian Exress");
l.add("Pune Times");
l.add("The Telegraph");
f.add(l);
f.setSize(400,400);
f.setLayout(new FlowLayout());
f.setTitle("ListDemo");
f.setVisible(true);
}
}
