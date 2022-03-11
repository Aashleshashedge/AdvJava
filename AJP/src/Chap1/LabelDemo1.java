package Chap1;
	import java.awt.*;
	import java.awt.event.*;
	public class LabelDemo1 extends Frame implements WindowListener {
		LabelDemo1()
		{
		    addWindowListener(this); 
		}
		public void windowOpened(WindowEvent e) {} //1
	    public void windowClosing(WindowEvent e) //2
	    {
	    	System.exit(1);
	    }
	    public void windowClosed(WindowEvent e) {} //3
	    public void windowIconified(WindowEvent e) {} //4
	    public void windowDeiconified(WindowEvent e) {} //5
	    public void windowActivated(WindowEvent e) {} //6
	    public void windowDeactivated(WindowEvent e) {} //7
		public static void main(String args[])
		  {     
		    Frame f= new Frame();  
		    Label lab1;  
		    lab1=new Label("Welcome to Java");  
		    lab1.setBounds(200,50,200,80);  
		f.add(lab1); 
		f.setSize(500,500);  
		f.setLayout(null);  
		f.setVisible(true);  
		}  
	}

