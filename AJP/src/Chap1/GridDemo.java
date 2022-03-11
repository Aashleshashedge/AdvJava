package Chap1;

import java.awt.*;
import java.awt.event.*;//optional
public class GridDemo extends Frame implements WindowListener
{
GridDemo()
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
GridLayout gl=new GridLayout(5,5,10,10);
f.setLayout(gl);
Button btn1 = new Button("One");
Button btn2 = new Button("Two");
Button btn3 = new Button("Three");
Button btn4 = new Button("Four");
Button btn5 = new Button("Five");
Button btn6 = new Button("Six");
Button btn7 = new Button("Seven");
Button btn8 = new Button("Eight");
Button btn9 = new Button("Nine");
Button btn10 = new Button("Ten");
Button btn11 = new Button("Eleven");
Button btn12 = new Button("Twelve");
Button btn13 = new Button("Thirteen");
Button btn14 = new Button("Fourteen");
Button btn15 = new Button("Fifteen");
Button btn16 = new Button("Sixteen");
Button btn17 = new Button("Seventeen");
Button btn18 = new Button("Eighteen");
Button btn19 = new Button("Nineteen");
Button btn20 = new Button("Twenty");
Button btn21 = new Button("Twenty One");
Button btn22 = new Button("Twenty Two");
Button btn23 = new Button("Twenty Three");
Button btn24 = new Button("Twenty Four");
Button btn25 = new Button("Twenty Five");
f.add(btn1);
f.add(btn2);
f.add(btn3);
f.add(btn4);
f.add(btn5);
f.add(btn6);
f.add(btn7);
f.add(btn8);
f.add(btn9);
f.add(btn10);
f.add(btn11);
f.add(btn12);
f.add(btn13);
f.add(btn14);
f.add(btn15);
f.add(btn16);
f.add(btn17);
f.add(btn18);
f.add(btn19);
f.add(btn20);
f.add(btn21);
f.add(btn22);
f.add(btn23);
f.add(btn24);
f.add(btn25);
f.setSize(500,500);
f.setTitle("GridDemo");
f.setVisible(true);
}
}

