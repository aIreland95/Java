/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
public class GUI1 { 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame aFrame = new JFrame("Sixth Frame");
        aFrame.setSize(250, 100);
        aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel greeting = new JLabel("Hello!");
        aFrame.setLayout(new FlowLayout());
        JLabel greeting1 = new JLabel("Who are you?");
        JLabel greeting2 = new JLabel("Today is Tueday.");
        aFrame.add(greeting);
        aFrame.add(greeting1);
        aFrame.add(greeting2);
        
        aFrame.setVisible(true);
    }
    
}
