package Chap1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SpecialKeyDemo extends JFrame implements KeyListener {

    JLabel label = new JLabel();
    JTextArea area= new JTextArea();

    SpecialKeyDemo() {
        setTitle("Special Keys");
        label.setBounds(20,50,150,20);
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);

        add(label);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }

    
	@Override
    public void keyTyped(KeyEvent e) {
        label.setText("key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP) {
            label.setText("UP key pressed");
        } else if (key == KeyEvent.VK_DOWN) {
            label.setText("DOWN key pressed");
        } else if(key == KeyEvent.VK_RIGHT) {
            label.setText("RIGHT key pressed");
        } else if (key == KeyEvent.VK_LEFT) {
            label.setText("LEFT key pressed");
        } else if (key == KeyEvent.VK_F3) {
            label.setText("F3 key pressed");
        } else if(key == KeyEvent.VK_F6) {
            label.setText("F6 key pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        label.setText("Key Released");
    }

    public static void main(String[] args) {
    	SpecialKeyDemo sk = new SpecialKeyDemo();
        sk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
