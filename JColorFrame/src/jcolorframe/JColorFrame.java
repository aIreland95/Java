/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcolorframe;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class JColorFrame extends JFrame implements ActionListener{

   //Aaron Ireland
   //May 18, 2018
   //Exercise 4 - JColorFrame
    
    //creation of a JButton, BorderLayout, and JPanels for filling the layout
    JButton colorChange = new JButton("Click to change colors");
    BorderLayout border = new BorderLayout(5, 5);
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel east = new JPanel();
    JPanel west = new JPanel();
    
    //default constructor for JColorFrame
    public JColorFrame(){
        
        super("Background Color Change");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(border);
        
        //adds button and panel to the border layout
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(colorChange, BorderLayout.CENTER);
        
        //creates larger sizes for each panel
        north.setPreferredSize(new Dimension(100, 100));
        south.setPreferredSize(new Dimension(100, 100));
        east.setPreferredSize(new Dimension(100, 100));
        west.setPreferredSize(new Dimension(100, 100));
        
        colorChange.addActionListener(this);
    }
    
    //method for when the center button is pressed
    public void actionPerformed(ActionEvent e){
        
        //random components for creating a color
        Random colors = new Random();
        float red = colors.nextFloat();
        float green = colors.nextFloat();
        float blue = colors.nextFloat();
        Color color = new Color(red, green, blue);
        int randomInt = colors.nextInt((3 - 0) + 1);
        
        //if statements for determining which region changes color
        if (randomInt == 0){
            north.setBackground(color);
        }
        else if (randomInt == 1){
            south.setBackground(color);
        }
        else if (randomInt == 2){
            east.setBackground(color);
        }
        else if (randomInt == 3){
            west.setBackground(color);
        }
    }
    
    //main method, creates a JColorFrame object and sets the size
    public static void main(String[] args) {
        
        JColorFrame frame = new JColorFrame();
        final int WIDTH = 400;
        final int HEIGHT = 400;
        frame.setSize(WIDTH, HEIGHT);
    }
}
