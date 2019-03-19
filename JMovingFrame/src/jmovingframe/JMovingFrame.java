/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmovingframe;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class JMovingFrame extends JFrame implements ActionListener{

    //Aaron Ireland
    //May 18, 2018
    //Exercise 5 - JMovingFrame
    
    //creation of JButton, JLabel, and multiple JPanels
    JButton location = new JButton("Change Label Location");
    JLabel overHere = new JLabel("Over here!");
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel east = new JPanel();
    JPanel west = new JPanel();
    
    //default constructor, adds objects to frame
    public JMovingFrame(){
        
        super("Random Label Location");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setVisible(true);
        
        //adds button and panels to a border layout
        add(location, BorderLayout.CENTER);
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        south.add(overHere);
        
        //sets size of each panel
        north.setPreferredSize(new Dimension(150, 150));
        south.setPreferredSize(new Dimension(150, 150));
        east.setPreferredSize(new Dimension(150, 150));
        west.setPreferredSize(new Dimension(150, 150));
        
        location.addActionListener(this);
    }
    
    //method when an action is performed, the button is pressed
    public void actionPerformed(ActionEvent e){
        
        Random labelPoint = new Random();
        int randomInt = getRandomInt(1, 4);
        
        //if statement for random number generator, sets label location
        if (randomInt == 1){
            north.add(overHere);
        }
        else if (randomInt == 2){
            south.add(overHere);
        }
        else if (randomInt == 3){
            east.add(overHere);
        }
        else if (randomInt == 4){
            west.add(overHere);
        }
        
        //updates each panel after the label is added
        north.revalidate();
        north.repaint();
        south.revalidate();
        south.repaint();
        east.revalidate();
        east.repaint();
        west.revalidate();
        west.repaint();
        
    }
    
    //getRandomInt method, determines random number for label location
    public int getRandomInt(int minimum, int maximum){
        
        Random random = new Random();
        return random.nextInt((maximum - minimum) + 1) + minimum;
    }
    
    //main method, creates new JMovingFrame object and size
    public static void main(String[] args) {
        
        JMovingFrame frame = new JMovingFrame();
        final int WIDTH = 500;
        final int HEIGHT = 500;
        frame.setSize(WIDTH, HEIGHT);
    } 
}