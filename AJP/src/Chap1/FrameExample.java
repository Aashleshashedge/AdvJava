package Chap1;
	import java.awt.*; //Step-1
	import java.awt.event.*; // optional
	public class FrameExample extends Frame implements WindowListener 
	{
		FrameExample()
		{
		    addWindowListener(this); //registering the event listener with the frame window
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
		     FrameExample f=new FrameExample();
		     Label l=new Label("Select known Languages");   
		     l.setBounds(200,50,200,80);
		     f.add(l); //add label component to frame window
		     Checkbox c1=new Checkbox("Marathi");
		 	 c1.setBounds(100,90,70,60);
		 	 f.add(c1);//add label component to frame window
		 	Checkbox c2=new Checkbox("Hindi");
			c2.setBounds(100,150,50,50);
			f.add(c2);//add label component to frame window
			Checkbox c3=new Checkbox("English");
			c3.setBounds(100,200,80,50);
			f.add(c3);//add label component to frame window
			Checkbox c4=new Checkbox("Sanskrit");
			c4.setBounds(100,250,80,50);
			f.add(c4);//add label component to frame window

			f.setSize(500,500);
			f.setLayout(null);
			f.setVisible(true);
		    }
		}

