package com.swing_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics_2D extends JFrame {

    int x=10;
    int y=10;
    Graphics_2D(){
        Timer timer=new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=10;
                y+=10;
                repaint();
            }
        });
      //  timer.start();
    }
    ImageIcon img= new ImageIcon("ssss.png");
    Image imgg=img.getImage();
    public void paint(Graphics g){

        Graphics2D g2D=(Graphics2D) g;

        g2D.setStroke(new BasicStroke(5));
        g2D.setPaint(Color.RED);
      //  g2D.drawRect(x,y,80,50);
       // g2D.fillRect(x,y,80,50);

        g2D.setPaint(Color.CYAN);
        g2D.drawOval(200,200,80,50);

        g2D.drawImage(imgg,x,y,null);

    }
    public static void main(String[] args) {

        JFrame frame=new Graphics_2D();

        frame.setVisible(true);
        frame.setTitle("Graphics");
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
