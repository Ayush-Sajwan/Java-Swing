package com.swing_java;

import javax.swing.*;

public class Joption_pane {
    public static void main(String[] args) {
/*
        //JOption pane message dialog box
        JOptionPane.showMessageDialog(null,"WELCOME TO JAVA","My JOption pane",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"WELCOME TO JAVA","My JOption pane",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"WELCOME TO JAVA","My JOption pane",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"WELCOME TO JAVA","My JOption pane",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"WELCOME TO JAVA","My JOption pane",JOptionPane.ERROR_MESSAGE);


        //JOption pane confirm dialog
       int i=JOptionPane.showConfirmDialog(null,"DO you code?","Question",JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(i);
        //yes returns =0
        //no returns=1
        //cancel returns=2
        //[X] returns -1

        //JOption input dialog box
        //if we press cancel or exit button it returns null
        String str=JOptionPane.showInputDialog("Write your name:-");
        System.out.println("Hello "+str);
*/

        //JOption option dialog

        //this array of strings can be used to add options to dialog box
        String[] str={"Yes Sometimes","Never","Maybe","Everyday"};
       int i=JOptionPane.showOptionDialog(null,"Do you do coding?","Question",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,new ImageIcon("C:\\Users\\ayush sajwan\\Downloads\\download.jpg"),str,0);
        System.out.println(i);
    }
}
