package Chap1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JChoice extends JFrame implements ActionListener {
    Label l;
    JComboBox j;
    JChoice(){
        Container c=getContentPane();
        c.setLayout(null);
        j=new JComboBox();
        j.addItem("Solapur");
        j.addItem("Pune");
        j.addItem("Banglore");
        j.addItem("Mumbai");
        c.add(j);
        j.addActionListener(this);

        l=new Label();
        l.setText("You are in : "+j.getSelectedItem());
        c.add(l);
        j.setBounds(50,10,100,30);
        l.setBounds(200,10,150,30);

        setTitle("Write a program code to generate the following output");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText("You are in : "+j.getSelectedItem());
    }

    public static void main(String[] args) {
        new JChoice();
    }
}