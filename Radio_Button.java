package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radio_Button {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        //creating three radio buttons
        JRadioButton b1=new JRadioButton();
        b1.setText("Male");

        //adding action listener
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(null,"You are a Male","Nothing",JOptionPane.INFORMATION_MESSAGE);
//            }
//        });

        JRadioButton b2=new JRadioButton("Female");

        JRadioButton b3=new JRadioButton("Others");

        //creating button group for working of radio buttons
        ButtonGroup group=new ButtonGroup();

        //can also set icon in radio buttons using setIcon
        group.add(b1);
        group.add(b2);
        group.add(b3);

        JLabel l1=new JLabel();
        l1.setText("Enter your gender:-");
        l1.setFont(new Font("Times_New_Roman",Font.ITALIC,40));
        l1.setForeground(Color.CYAN);
        l1.setBackground(Color.GRAY);
        l1.setOpaque(true);
        l1.setFont(new Font("Times_New_Roman",Font.ITALIC,20));

        frame.add(l1);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
