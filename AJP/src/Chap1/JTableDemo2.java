package Chap1;

import java.awt.*;
import javax.swing.*;
public class JTableDemo2 extends JFrame{
	JTableDemo2()
	{
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		String column[] = { "ID", "NAME", "SALARY" };
		String data[][] = { { "101", "Amit", "670000" }, { "102", "Jai", "780000" }, { "101", "Sachin", "700000" } };
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		add(sp);
		setTitle("JTable Example");
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableDemo2();
	}
}
