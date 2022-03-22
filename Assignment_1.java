package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Assignment_1 implements MouseListener{
    JFrame f;
    JTextField t;
    JLabel label;
    Assignment_1(){
        f=new JFrame();
        t=new JTextField();
        label=new JLabel();
        label.setText("Enter Size in Text box and Click On it");
        label.setForeground(Color.CYAN);
        label.setBackground(Color.gray);
        label.setOpaque(true);
        label.setFont(new Font("Times_New_Roman",Font.BOLD,20));

        label.setBounds(100,10,500,200);

        t.setBounds(100,300,300,50);

        t.addMouseListener(this);
        f.add(label);
        f.add(t);
        f.setSize(1000,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x=Integer.parseInt(t.getText());
        t.setBounds(100,300,x+300,x+50);
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
    public static void main(String[] args){
        new Assignment_1();
    }
}