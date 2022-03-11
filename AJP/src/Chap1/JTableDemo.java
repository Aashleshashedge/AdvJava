package Chap1;

import java.awt.*;
import javax.swing.*;
public class JTableDemo extends JFrame {
	JTableDemo()
	{
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		String column[] = { "Roll", "NAME", "Div" };
		String data[][] = { { "24", "Priya", "A" }, { "65", "Sita", "A" }, { "66", "Anuja", "A" },{ "69", "Veera", "B" } };
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		add(sp);
		setTitle("JTable Example");
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableDemo();
	}
}
