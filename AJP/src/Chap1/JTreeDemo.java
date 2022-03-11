package Chap1;

//Write a Jtree program to show root directory and its subFolders of your System./ Write program of your choice to demonstrate JTree.
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class JTreeDemo extends JFrame{
	JTreeDemo()
	{
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Local Disk (C:)");
		
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("Intel");
		root.add(a);
		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Logs");
		a.add(a1);
		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("gp");
		a.add(a2);
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("ProgramData");
		root.add(b);
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("VirtualBox");
		b.add(b1);
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("MySQL");
		b.add(b2);
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("Program Files");
		root.add(c);
		DefaultMutableTreeNode c1 = new DefaultMutableTreeNode("Git");
		c.add(c1);
		DefaultMutableTreeNode c2 = new DefaultMutableTreeNode("Google");
		c.add(c2);
		DefaultMutableTreeNode c3 = new DefaultMutableTreeNode("DellTPad");
		c.add(c3);
		DefaultMutableTreeNode d = new DefaultMutableTreeNode("GitHub");
		root.add(d);
		DefaultMutableTreeNode d1 = new DefaultMutableTreeNode(".git");
		d.add(d1);
		DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("Docs");
		d.add(d2);
		DefaultMutableTreeNode d3 = new DefaultMutableTreeNode("Readme");
		d.add(d3);
		DefaultMutableTreeNode e = new DefaultMutableTreeNode("Windows");
		root.add(e);
		DefaultMutableTreeNode e1 = new DefaultMutableTreeNode("Security");
		e.add(e1);
		DefaultMutableTreeNode e2 = new DefaultMutableTreeNode("Tasks");
		e.add(e2);
		DefaultMutableTreeNode e3 = new DefaultMutableTreeNode("System");
		e.add(e3);
		DefaultMutableTreeNode f= new DefaultMutableTreeNode("ProgramFiles(86)");
		root.add(f);
		DefaultMutableTreeNode f1 = new DefaultMutableTreeNode("Notepad++");
		f.add(f1);
		DefaultMutableTreeNode f2 = new DefaultMutableTreeNode("WindowsPoweShell");
		f.add(f2);
		DefaultMutableTreeNode f3 = new DefaultMutableTreeNode("WindowsMail");
		f.add(f3);
		DefaultMutableTreeNode f4 = new DefaultMutableTreeNode("MSBuild");
		f.add(f4);
		DefaultMutableTreeNode f5 = new DefaultMutableTreeNode("Microsoft.NET");
		f.add(f5);
		DefaultMutableTreeNode f6 = new DefaultMutableTreeNode("Realtek");
		f.add(f6);
		//Create Tree
		JTree tree = new JTree(root);
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane jsp = new JScrollPane(tree,v,h);
		
		ct.add(jsp, BorderLayout.CENTER);
		
		setTitle("Tree Demo");
		setVisible(true);
		setSize(200,200);
			
	}
	public static void main(String[] args) {
      new JTreeDemo();
	}

}
