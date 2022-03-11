package Chap1;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class JTreeDemo2 extends JFrame{
	JTreeDemo2()
	{
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");
		
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("Maharashtra");
		root.add(a);
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("Mumbai");
		a.add(b);
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Pune");
		a.add(b1);
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Nashik");
		a.add(b2);
		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("Nagpur");
		a.add(b3);
		
		DefaultMutableTreeNode c = new DefaultMutableTreeNode("Gujarat");
		root.add(c);
		
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
        new JTreeDemo2();
    }
	}