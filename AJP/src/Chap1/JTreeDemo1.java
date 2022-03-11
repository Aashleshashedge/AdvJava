package Chap1;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class JTreeDemo1 extends JFrame{
	JTreeDemo1()
	{
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Local Disk D");
		
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("Aashlesha");
		root.add(a);
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("AJP Folder");
		root.add(b);
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Practical No. 1");
		b.add(b1);
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Practical No. 2");
		b.add(b2);
		DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("Practical No. 3");
		b.add(b3);
		
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
        new JTreeDemo1();
    }
	

}