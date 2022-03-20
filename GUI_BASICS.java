package com.swing_java;

import javax.swing.*;
import java.awt.*;


public class GUI_BASICS {

    GUI_BASICS(){
         JFrame frame=new JFrame();
         frame.setVisible(true);//visibility of the frame
         frame.setTitle("My GUI FRAME");//title of the frame
         frame.setLayout(null);
        // frame.setResizable(false);//setting frame resizable as false
         frame.setSize(1000,1000);//setting size of the frame
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closing on hitting the cross button
         frame.setLocationRelativeTo(null);//setting position on centre of the screen

        //creating a image icon object
        ImageIcon image=new ImageIcon("C:\\Users\\ayush sajwan\\Downloads\\download.jpg");
        //setting frame icon
        frame.setIconImage(image.getImage());

        JLabel label=new JLabel();
        label.setText("My label");
        label.setForeground(Color.RED);
        label.setIcon(image);
        label.setFont(new Font("Times_New_Roman",Font.BOLD,20));
        label.setBackground(Color.CYAN);
        label.setOpaque(true);
        label.setBounds(10,10,700,700);

        //if border layout is used the it is required
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);

    }
    public static void main(String[] args) {
        new GUI_BASICS();
    }
}