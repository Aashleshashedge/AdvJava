package Chap1;

import java.awt.*;
import javax.swing.*;
public class JComboBoxDemo extends JFrame {
	public JComboBoxDemo()
	{
		Container ct = getContentPane();
		ct.setLayout(null);
		JLabel j1 = new JLabel("Select State:");
		JComboBox jc = new JComboBox();
		jc.addItem("Maharashtra");
		jc.addItem("Gujarat");
		jc.addItem("Andhra Pradesh");
		jc.addItem("Madhya Pradesh");
		ct.add(j1);
		ct.add(jc);
		j1.setBounds(30,50,100,30);
		jc.setBounds(150,50,100,30);
	}
	public static void main(String args[])
	{
		JComboBoxDemo f1 = new JComboBoxDemo();
		f1.setTitle("Combo Box");
		f1.setSize(300,400);
		f1.setVisible(true);
	}
}