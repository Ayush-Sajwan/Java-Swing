package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jbutton {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setTitle("JButton Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);


        JButton bt =new JButton();
        bt.setBounds(50,50,500,500);

        ImageIcon image=new ImageIcon("C:\\Users\\ayush sajwan\\Downloads\\download.jpg");
        bt.setIcon(image);
        bt.setText("I am a Button");

        //setting position of text as per the image
        bt.setVerticalTextPosition(JButton.NORTH);
        bt.setHorizontalTextPosition(JButton.CENTER);

        //setting Colour of text
        bt.setForeground(Color.CYAN);
        //setting font
        bt.setFont(new Font("Times_New_Roman",Font.BOLD,25));

        //setting background colour
        bt.setBackground(Color.GRAY);


        //adding an action listener to button
        bt.addActionListener(new ActionListener() {
            int i=0;
            @Override
            public void actionPerformed(ActionEvent e) {
                i++;
                bt.setText("You have Pressed me "+i+" times");
                if(i%2!=0){
                    bt.setForeground(Color.RED);
                    bt.setFont(new Font("Times_New_Roman",Font.ITALIC,25));
                    bt.setBackground(Color.MAGENTA);
                }
                else{
                    bt.setForeground(Color.CYAN);
                    bt.setFont(new Font("Times_New_Roman",Font.BOLD,25));
                    bt.setBackground(Color.GRAY);
                }
            }
        });


        frame.add(bt);
        frame.setVisible(true);
    }
}
