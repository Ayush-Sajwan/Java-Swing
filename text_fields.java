package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class text_fields {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
       // frame.setLayout(null);
        frame.setLayout(new FlowLayout());

        JTextField field=new JTextField();
        //in case of flowLayout or any other layout set preferred size works
       field.setPreferredSize(new Dimension(400,100));
      // field.setBounds(10,10,400,100);

       //changing font of text field
        field.setFont(new Font("Times_New_Roman",Font.ITALIC,50));

        //changing color of text and background
        field.setForeground(Color.CYAN);
        field.setBackground(Color.GRAY);



        JButton b1=new JButton("Submit");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //disabling both button and field
                //after taking input
                field.setEditable(false);
                b1.setEnabled(false);
                String str=field.getText();
                System.out.println("Hello "+str);
            }
        });


        frame.add(field);
        frame.add(b1);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
