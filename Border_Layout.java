package com.swing_java;

import javax.swing.*;
import java.awt.*;

public class Border_Layout {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setTitle("Border_Layout Practice");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);

        //we can add margins to the constructor of border layout
        frame.setLayout(new BorderLayout(10,10));

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();

        //setting color and layout to the panels
        p1.setBackground(Color.RED);
        //setting dimension of panels
        //setBounds does not work in this case
        p1.setPreferredSize(new Dimension(0,50));
        p2.setBackground(Color.GREEN);
        p2.setPreferredSize(new Dimension(50,0));
        p3.setBackground(Color.YELLOW);
        p3.setPreferredSize(new Dimension(50,0));
        p4.setBackground(Color.MAGENTA);
        p4.setPreferredSize(new Dimension(0,50));
        p5.setBackground(Color.BLUE);
        p5.setPreferredSize(new Dimension(300,300));

        //we can set border layout to a panel also
//        p1.setLayout(new BorderLayout());
//        p1.add(new JButton("Button"),BorderLayout.NORTH);

        frame.add(p1,BorderLayout.NORTH);
        frame.add(p2,BorderLayout.WEST);
        frame.add(p3,BorderLayout.EAST);
        frame.add(p4,BorderLayout.SOUTH);
        //p5 will be added to the center
        //since all left space is added to center in border layout
        frame.add(p5);

        frame.setVisible(true);

    }
}
