package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Listener {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(null);

        JLabel label=new JLabel();
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.setBounds(0,0,50,50);


        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //combination of both key pressed and released
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 37 -> label.setLocation(label.getX() - 10, label.getY());
                    case 38 -> label.setLocation(label.getX(), label.getY() - 10);
                    case 39 -> label.setLocation(label.getX() + 10, label.getY());
                    case 40 -> label.setLocation(label.getX(), label.getY() + 10);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(label);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
