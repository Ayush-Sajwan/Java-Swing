package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouse_Listenerrrr implements MouseListener {
    JFrame frame;
    JLabel label;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    Mouse_Listenerrrr(){
        frame=new JFrame();
        frame.setSize(300,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        label=new JLabel();
        label.setPreferredSize(new Dimension(200,200));
        label.setBackground(Color.RED);
        label.setOpaque(true);

         b1=new JButton("Red");
         b2=new JButton("Blue");
         b3=new JButton("Yellow");
         b4=new JButton("Green");

        b1.setPreferredSize(new Dimension(100,100));
        b2.setPreferredSize(new Dimension(100,100));
        b3.setPreferredSize(new Dimension(100,100));
        b4.setPreferredSize(new Dimension(100,100));


        b1.addMouseListener(this);
        b2.addMouseListener(this);
        b3.addMouseListener(this);
        b4.addMouseListener(this);

        frame.add(label);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);


        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==b1){
            label.setBackground(Color.YELLOW);
        }
        else if(e.getSource()==b2){
            label.setBackground(Color.GREEN);
        }
        else if(e.getSource()==b3){
            label.setBackground(Color.RED);
        }
        else if(e.getSource()==b4){
            label.setBackground(Color.BLUE);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public static void main(String[] args) {
        new Mouse_Listenerrrr();
    }
}
