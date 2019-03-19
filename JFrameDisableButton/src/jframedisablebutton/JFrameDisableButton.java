/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframedisablebutton;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame implements ActionListener{

    //Aaron Ireland
    //May 10, 2018
    //JFrameDisableButton
    
    //variables for width, height, JLabel, and JButton
    final int WIDTH = 275;
    final int HEIGHT = 175;
    JLabel text = new JLabel("Press this button to disable it.");
    JButton disable = new JButton("Disable");
    
    //construcotr for the JFrameDisableButton class
    public JFrameDisableButton(){
        
        super("Disable Button");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(text);
        add(disable);
        disable.addActionListener(this);
        
        setVisible(true);
    }
    
    //event handler that disables the button when pressed
    public void actionPerformed(ActionEvent e){
        disable.setEnabled(false);
    }
    
    public static void main(String[] args) {
        
        //instantiates a new JFrameDisableButton object
        JFrameDisableButton frame = new JFrameDisableButton();
    }
}

