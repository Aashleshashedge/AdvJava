package Chap1;

import java.awt.*;
import java.awt.event.*;
public class ChoiceDemo extends Frame implements WindowListener {
ChoiceDemo()
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
ChoiceDemo f = new ChoiceDemo();
Choice ch=new Choice();
ch.add("Pune");
ch.add("Mumbai");
ch.add("Nashik");
ch.add("Banglore");
ch.add("Hydrabad");
ch.add("Chennai");
ch.add("Dehradun");
ch.add("Delhi");
ch.add("Surat");
ch.add("Lucknow");
f.add(ch);
f.setSize(400,400);
f.setLayout(new FlowLayout());
f.setTitle("ChoiceDemo");
f.setVisible(true);
}
}

