package Chap1;

import javax.swing.*; 
public class Progressbar extends JFrame{ 
JProgressBar jb; 
int i=0,num=0; 
Progressbar(){ 
jb=new JProgressBar(0,2000); 
jb.setBounds(40,40,160,30); 
jb.setValue(0); 
jb.setStringPainted(true); 
JLabel l=new JLabel("J ProgressBar");
l.setBounds(10,5,150,50);
add(l);
add(jb); 
setSize(250,150); 
setLayout(null); 
} 
public void iterate(){ 
while(i<=2000){ 
jb.setValue(i); 
i=i+20; 
try{Thread.sleep(150);}catch(Exception e){} 
} 
} 
public static void main(String[] args) { 
Progressbar m=new Progressbar(); 
m.setVisible(true); 
m.iterate(); 
}
}
