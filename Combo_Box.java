package com.swing_java;

import javax.swing.*;
import java.awt.*;

public class Combo_Box {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());


        String[] animals={"Dog","Cat","Bird"};

        //we can only pass array of objects to the combo box
        //cannot pass array of non primitive data types
        JComboBox box=new JComboBox(animals);

        //to get item selected object
        Object str=box.getSelectedItem();

        //to get selected index
        int i=box.getSelectedIndex();

        //to add item to the combo box
        box.addItem("Horse");

        //to add item at a particular index
        box.insertItemAt("Pig",0);

        //to set initially selected index
        box.setSelectedIndex(0);

        frame.add(box);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
