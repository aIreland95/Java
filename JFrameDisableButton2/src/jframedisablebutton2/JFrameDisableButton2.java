/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframedisablebutton2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Aaron
 */
public class JFrameDisableButton2 extends JFrame implements ActionListener{

    //Aaron Ireland
    //May 10, 2018
    //JFrameDisableButton2
    
    //variables for width, height, JLabel, JButton, and a counter for the button being pressed
    int press = 0;
    final int WIDTH = 275;
    final int HEIGHT = 175;
    JLabel text = new JLabel("Click 8 times to disable");
    JButton disable = new JButton("Disable");
    
    //constructor for the JFrameDisableButton2 class
    public JFrameDisableButton2(){
        
        super("Disable Button");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(text);
        add(disable);
        disable.addActionListener(this);
        
        setVisible(true);
    }
    
    //action performed method, increments press each time the button is clicked
    public void actionPerformed(ActionEvent e) {
        
        press++;
        if (press == 8){
            disable.setEnabled(false);
        }
    }
    
    public static void main(String[] args) {
        
        //instantiates a new JFrameDisableButton2 object
        JFrameDisableButton2 frame = new JFrameDisableButton2();
    }
    
}
