/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class About extends JFrame {
    JFrame frame;
     Image img = Toolkit.getDefaultToolkit().getImage("I:\\ABOUT.jpg"); 
    About(){
        frame=new JFrame("ABOUT US"); 
        frame.setContentPane(new JPanel() {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, null);
         }
      });
      pack();
      frame.setSize(888,760); 
       frame.setLayout(null); 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       frame.setVisible(true); 
    }
    
}
