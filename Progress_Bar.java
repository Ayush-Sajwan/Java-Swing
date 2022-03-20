package com.swing_java;

import javax.swing.*;
import java.awt.*;

public class Progress_Bar {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        JProgressBar bar=new JProgressBar(0,100);
        bar.setPreferredSize(new Dimension(400,100));

        //to show string text
        bar.setStringPainted(true);

        bar.setForeground(Color.RED);
        bar.setBackground(Color.GRAY);
        bar.setFont(new Font("Times_New_Roman",Font.BOLD,40));



        frame.add(bar);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        int counter=0;

        while(counter<=100){
            bar.setValue(counter);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter+=1;
        }
        bar.setString("Downloaded");
    }
}
