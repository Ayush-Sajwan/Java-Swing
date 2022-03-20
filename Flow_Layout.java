package com.swing_java;

import javax.swing.*;
import java.awt.*;

public class Flow_Layout {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setTitle("Flow_Layout Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        //setting layout to the flowLayout
        //we can add the positioning
        //and horizontal and vertical spacing to the constructor of flowLayout
        frame.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));

        //adding some buttons to the frame
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));



        frame.setVisible(true);
    }
}
