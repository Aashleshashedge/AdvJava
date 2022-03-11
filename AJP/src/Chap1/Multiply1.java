package Chap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Multiply1 {
    static JFrame frame = new JFrame();

    static JLabel label , label1 , label2;
    static JButton button;
    static JTextField textField, textField1 , textField2;

    public static void main(String[] args) {
        label = new JLabel("First Number:");
        label.setBounds(20,50,200,20);
        label.setFont(new Font("Times New Roman", Font.BOLD, 16));
        textField = new JTextField();
        textField.setBounds(140,50,100,20);

        label1 = new JLabel("Second Number:");
        label1.setBounds(20,80,150,20);
        label1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        textField1 = new JTextField();
        textField1.setBounds(140,80,100,20);

        label2 = new JLabel("Result:");
        label2.setBounds(50,240,50,20);
        label2.setFont(new Font("Times New Roman", Font.BOLD, 16));

        button = new JButton("Multiply");
        button.setBackground(Color.LIGHT_GRAY);
        button.setBounds(100,150,100,20);
        button.setFont(new Font("Times New Roman", Font.BOLD, 16));
        
        textField2 = new JTextField("");
        textField2.setBounds(100,240,200,30);
        textField2.setEnabled(false);


        frame.add(label);
        frame.add(button);
        frame.add(textField);
        frame.add(textField1);

        frame.add(label1);
        frame.add(label2);

        frame.add(textField2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,c;
                a = Integer.parseInt(textField.getText());
                b = Integer.parseInt(textField1.getText());
                c = a*b;
                textField2.setEnabled(true);
                textField2.setText(""+c);
            }
        });

    }

}
