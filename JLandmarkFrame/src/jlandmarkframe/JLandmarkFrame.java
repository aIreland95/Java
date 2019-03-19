/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlandmarkframe;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
public class JLandmarkFrame extends JFrame{

    //Aaron Ireland
    //May 17, 2018
    //Exercise 1
    
    //JButtons, each created with the name of a landmark
    JButton rushmore = new JButton("South Dakota's Mount Rushmore");
    JButton alamo = new JButton("The Alamo of San Antonio, Texas");
    JButton liberty = new JButton("New York's Statue of Liberty");
    JButton bridge = new JButton("San Francisco Bay's Golden Gate Bridge");
    JButton gateway = new JButton("Gateway Arch of St. Louis");
    
    //constructor for JLandmarkFrame
    public JLandmarkFrame(){
        
        //sets frame operations and adds buttons to regions of a border layout
        super("Landmarks");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        add(rushmore, BorderLayout.NORTH);
        add(alamo, BorderLayout.SOUTH);
        add(liberty, BorderLayout.EAST);
        add(bridge, BorderLayout.WEST);
        add(gateway, BorderLayout.CENTER);
    }
    
    //main method, creates a JLandmarkFrame object and sets the size
    public static void main(String[] args) {
        
        JLandmarkFrame landmarks = new JLandmarkFrame();
        landmarks.setSize(750, 250);
    }
}