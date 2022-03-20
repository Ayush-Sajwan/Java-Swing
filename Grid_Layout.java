package com.swing_java;

import javax.swing.*;
import java.awt.*;

public class Grid_Layout {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle(" Grid_Layout  Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        //setting layout to the grid layout
        //we can add no of rows and no of columns
        //and horizontal and vertical spacing to the constructor of GridLayout
        frame.setLayout(new GridLayout(3,3,5,5));

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


        frame.setVisible(true);
    }
}
