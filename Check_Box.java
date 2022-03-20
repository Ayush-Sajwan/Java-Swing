package com.swing_java;

import javax.swing.*;
import java.awt.*;

public class Check_Box {
    public static void main(String[] args) {


        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        JCheckBox box=new JCheckBox();
        box.setText("I am not a Robot");
        //to remove border around text
        box.setFocusable(false);

        box.setFont(new Font("Times_New_Roman",Font.BOLD,40));

        box.setForeground(Color.CYAN);
        box.setBackground(Color.GRAY);

        frame.add(box);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
