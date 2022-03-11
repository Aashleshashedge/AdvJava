package Chap1;

//Write a Java program to create a table of Name of Student, Percentage and Grade of 10 students using JTable.
import java.awt.*;
import javax.swing.*;
public class JTableDemo3 extends JFrame{
	JTableDemo3()
	{
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		String column[] = { "Name of Student", "Percentage", "Grade" };
		String data[][] = { { "Siya", "91%", "A+" }, 
				{ "Ram", "94%", "A+" },
				{ "Shreyas", "87%", "A" },
				{ "Aditya", "87%", "A" },
				{ "Anagha", "96%", "A+" },
				{ "Raj", "90%", "A" },
				{ "Sara", "84%", "B+" },
				{ "Aashay", "79%", "B" },
				{ "Sachin", "82%", "B+" }
				
		};
		JTable jt = new JTable(data, column);
		jt.setBounds(30, 40, 200, 300);
		JScrollPane sp = new JScrollPane(jt);
		add(sp);
		setTitle("JTable Example");
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableDemo3();
	}

}
