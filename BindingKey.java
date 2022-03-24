package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BindingKey {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setSize(600,600);

        JLabel label=new JLabel();

        label.setBounds(10,10,50,50);
        label.setOpaque(true);
        label.setBackground(Color.RED);


        //mapping the down key to a action
        //for this we use input map which creates an input map object
        //and after that we use the action map which creates an action map object
        //keyStroke is used to get a key
        //then in action map we pass an object of Abstract action and implement it there only using
        //anonymous inner classes
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        label.getActionMap().put("downAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(),label.getY()+50);
            }
        });

        //if we do not  use anonymous inner class then
        //creating inner local class
        //performing for up Action
        class UpAction extends AbstractAction{
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX(),label.getY()-50);
            }
        }
        //then create a object of upAction
        UpAction upAction=new UpAction();
        //and should have passed this object into actionMap
        //note that actionMapKey links input and action map
        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        //passing object of up Action into action map
        label.getActionMap().put("upAction",upAction);


        //right action
        //using objects of input and action map
       InputMap in=label.getInputMap();
        in.put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        ActionMap a=label.getActionMap();
        a.put("rightAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX()+50,label.getY());
            }
        });

        //left action
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        label.getActionMap().put("leftAction", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setLocation(label.getX()-50,label.getY());
            }
        });


        frame.add(label);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
