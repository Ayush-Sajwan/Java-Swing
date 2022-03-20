package com.swing_java;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Slider {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        //can pass arguments of min max and initial value
        JSlider slider=new JSlider(0,100,50);

        //setting size of slider
        slider.setPreferredSize(new Dimension(200,200));

        //will set minor ticks visible and distance between them
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        //will set major tracks visible and distance between them
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        //set major tracks visible
        slider.setPaintLabels(true);

        JLabel label=new JLabel();
        label.setForeground(Color.CYAN);
        label.setBackground(Color.gray);
        label.setOpaque(true);
        //label.setPreferredSize(new Dimension(200,200));
        label.setFont(new Font("Times_New_Roman",Font.BOLD,40));


        //to reverse orientation of slider
       // slider.setOrientation(SwingConstants.VERTICAL);

        //whenever label is used it triggers change listener
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("Your Selected value ="+slider.getValue());
                //can also set value using
               // slider.setValue(10);
            }
        });


        frame.add(slider);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //adding slider moving transition
//        int counter=0;
//
//        while(counter<=100){
//            slider.setValue(counter);
//
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            counter+=1;
//        }
    }
}
