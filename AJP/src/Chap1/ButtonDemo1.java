package Chap1;
	import java.awt.*;
	import java.awt.event.*;
	public class ButtonDemo1 extends Frame implements WindowListener
	{
		ButtonDemo1()
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
	    
	    public static void main(String args[]) {
	    	 Frame f=new Frame();
	         Button b1=new Button("Ok");
	         b1.setBounds(100,50,50,50);
	         f.add(b1);
	         Button b2=new Button("Reset");
	         b2.setBounds(100,101,50,50);
	         f.add(b2);
	         Button b3=new Button("Cancel");
	         b3.setBounds(100,150,80,50);
	         f.add(b3);
	         f.setSize(500,500);
	         f.setLayout(null);
	         f.setVisible(true);
	    	
	    }
		

	}

