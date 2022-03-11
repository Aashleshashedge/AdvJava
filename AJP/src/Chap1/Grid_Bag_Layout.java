package Chap1;

import java.awt.*; 
public class Grid_Bag_Layout extends Frame { 
public Grid_Bag_Layout() { 
GridBagLayout grid = new GridBagLayout(); 
GridBagConstraints gbc = new GridBagConstraints(); 
setLayout(grid); 
setTitle("GridBag Layout in Java Example"); 
GridBagLayout layout = new GridBagLayout(); 
this.setLayout(layout); 
gbc.fill = GridBagConstraints.HORIZONTAL; 
gbc.gridx = 0; 
gbc.gridy = 0; 
this.add(new Label("Name"), gbc); 
gbc.gridx = 1; 
gbc.gridy = 0; 
this.add(new TextField(20) ,gbc); 
gbc.fill = GridBagConstraints.HORIZONTAL; 
gbc.ipady = 20; 
gbc.gridx = 0; 
gbc.gridy = 1; 
this.add(new Label("Comments"), gbc); 
gbc.gridx = 1; 
gbc.gridy = 1; 
this.add(new TextArea(10,10), gbc); 
gbc.gridx = 0; 
gbc.gridy = 2; 
gbc.fill = GridBagConstraints.VERTICAL; 
gbc.gridwidth = 5; 
this.add(new Button("Submit"), gbc); 
setSize(300, 300); 
setPreferredSize(getSize()); 
setVisible(true);
 } 
public static void main(String[] args) { 
Grid_Bag_Layout a = new Grid_Bag_Layout(); 
} }
