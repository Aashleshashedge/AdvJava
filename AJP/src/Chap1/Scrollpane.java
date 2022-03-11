package Chap1;

import javax.swing.*;
import java.awt.*;

public class Scrollpane extends JFrame {
    Scrollpane(){
        Container c=getContentPane();

        String s= "Swing introduced a mechanism that allowed the look and feel of every component in\r\n "
        		+ "an application to be altered without making substantial changes to the application code.\r\n"
        		+ "The introduction of support for a pluggable look and feel allows Swing components to\r\n"
        		+ "emulate the appearance of native components while still retaining the benefits of platform independence.\r\n "
        		+ "web applications.\r\n"
        		+ "Fundamentals to swing is JApplet class which extends Applet. JApplet supports\r\n"
        		+ "various panes such as content pane, glass pane and the root pane. When adding a\r\n"
        		+ "component to an instance of JApplet, call add () method for the content pane of\r\n"
        		+ "program that runs on more than one computer and communicates using the network and server\r\n"
        		+ "Web applications are accessed using a web browser so they are very popular for the ease\r\n"
        		+ " of using the browser as a user client.\r\n "
        		+ "JApplet object.\r\n"
        		+ "JComboBox is a combination of a TextField and a dropdown list. JComboBox\r\n"
        		+ "extends JComponent class. It normally displays single entry however it can also\r\n"
        		+ "display drop down list that allows the user to select option.\r\n"
        		+ "A JScrollPane is used to make a scrollable view of a component. A container that\r\n"
        		+ "provides horizontal and/or vertical scroll bars for another component.\r\n"
        		+ "Constructors of JComboBox\r\n"
        		+ "1. JComboBox()\r\n"
        		+ "2. JComboBox(Vector v)\r\n"
        		+ "\r\n"
        		+ "";
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;

        JTextArea js=new JTextArea(s);

        JScrollPane s1=new JScrollPane(js,v,h);

        c.add(s1);

        setTitle("ScrollPane");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Scrollpane();
    }
}