/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdisappearingfriends;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

    /**
     * @param args the command line arguments
     */
    
    public class JDisappearingFriends extends JFrame implements ActionListener {
        
        //Aaron Ireland
        //May 8, 2018
        //Exercise 3
        
        //created JLabels for 6 different friends
        int i = 1;
        JLabel pal1 = new JLabel("Jake");
        JLabel pal2 = new JLabel("Dillon");
        JLabel pal3 = new JLabel("Noah");
        JLabel pal4 = new JLabel("Brennan");
        JLabel pal5 = new JLabel("Zach");
        JLabel pal6 = new JLabel("Aaron");
        JButton disappear = new JButton("Disappear");
        
        //default constructor, adds JLabels, visibility, and a button
        public JDisappearingFriends(){
            super("Friends");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            
            //labels added here
            add(pal1);
            add(pal2);
            add(pal3);
            add(pal4);
            add(pal5);
            add(pal6);
            pal6.setVisible(false);
            add(disappear);
            disappear.addActionListener(this);
        }
        
        //method that switches names when button is pressed
        public void actionPerformed(ActionEvent event){
            
            if (i == 6){
                pal6.setVisible(false);
                pal5.setVisible(true);
                i = 1;
            }
            else if (i == 5){
                pal5.setVisible(false);
                pal4.setVisible(true);
                i = 6;
            }
            else if (i == 4){
                pal4.setVisible(false);
                pal3.setVisible(true);
                i = 5;
            }
            else if (i == 3){
                pal3.setVisible(false);
                pal2.setVisible(true);
                i = 4;
            }
            else if (i == 2){
                pal2.setVisible(false);
                pal1.setVisible(true);
                i = 3;
            }
            else {
                pal1.setVisible(false);
                pal6.setVisible(true);
                i = 2;
            }
        }
        
        //main method, creates new JDisappearing Friends, size, and visibility
        public static void main(String[] args) {
        
        JDisappearingFriends friends = new JDisappearingFriends();
        friends.setSize(300, 100);
        friends.setVisible(true);
    }
}
    
    
