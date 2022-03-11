package Chap1;

import java.awt.*; 
import java.awt.event.*; 
public class CheckBoxGroupExample extends Frame implements 
WindowListener { 
CheckBoxGroupExample() 
{ 
addWindowListener(this); //register 
}
public void windowOpened(WindowEvent e) 
{} //1 
public void windowClosing(WindowEvent e) //2 
{ 
System.exit(1); 
}
public void windowClosed(WindowEvent e) {} //3 
public void windowIconified(WindowEvent e) {} //4 
public void windowDeiconified(WindowEvent e) {} //5 
public void windowActivated(WindowEvent e) {} //6 
public void windowDeactivated(WindowEvent e) {} //7 
public static void main(String args[]) { 
CheckBoxGroupExample f = new CheckBoxGroupExample(); 
Label lb= new Label("Select your favourite Animal:"); 
CheckboxGroup cb = new CheckboxGroup();Checkbox checkBox1 = new Checkbox("Elephant", cb, false); 
Checkbox checkBox2 = new Checkbox("Lion", cb, true); 
Checkbox checkBox3 =new Checkbox("Tiger", cb, true); 
Checkbox checkBox4 = new Checkbox("Zebra", cb, true); 
Label lb1= new Label("Select the languages you like:"); 
f.add(lb1); 
Checkbox c1=new Checkbox("C"); 
f.add(c1);//add component to frame window 
Checkbox c2=new Checkbox("Python"); 
f.add(c2);//add component to frame window 
Checkbox c3=new Checkbox("Java"); 
f.add(c3);//add component to frame window 
Checkbox c4=new Checkbox("PHP"); 
f.add(c4); 
f.add(lb); 
f.add(checkBox3); 
f.add(checkBox2); 
f.add(checkBox1); 
f.add(checkBox4); 
f.setSize(400,400); 
f.setLayout(new FlowLayout()); 
f.setTitle("RadioButtons"); 
f.setVisible(true); 
} 
}
