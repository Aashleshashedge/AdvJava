package Chap1;

import java.awt.*;
import java.awt.event.*;//optional
public class GridDemo2 extends Frame implements WindowListener
{
GridDemo2()
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
GridLayout gl=new GridLayout(3,3,10,10);
f.setLayout(gl);
for(int i=1;i<=9;i++)
{
f.add(new Button(""+i));
}
f.setSize(500,500);
f.setTitle("GridDemo");
f.setVisible(true);
}
}
