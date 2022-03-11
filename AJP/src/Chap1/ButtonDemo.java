package Chap1;
//label demo
import java.awt.*;
import java.awt.event.*;
public class ButtonDemo extends Frame implements ActionListener {
String msg = " ";
Button yes, no, ok;
public ButtonDemo () {
setLayout (new FlowLayout() );
yes = new Button ("Yes");
no = new Button ("No");
ok = new Button ("Ok");
add(yes);
add(no);
add(ok);
yes.addActionListener(this);
no.addActionListener(this);
ok.addActionListener(this);
addWindowListener (new WindowAdapter () {
public void windowClosing (WindowEvent we ) {
System.exit (0);
}
});
}
public void actionPerformed (ActionEvent ae) {
String str = ae.getActionCommand ();
if (str.equals ("Yes")) {
msg = "You pressed Yes.";
}
else if (str.equals ("No")) {
msg = "You pressed No.";
}
else {
msg = "You pressed Ok.";
}
repaint();
}
public void paint (Graphics g) {
g. drawString (msg, 20,100);
}
public static void main (String [] args) {
ButtonDemo appwin = new ButtonDemo ();
appwin.setSize (new Dimension (250,150));
appwin.setTitle ("ButtonDemo");
appwin.setVisible (true);
		}
		}
		