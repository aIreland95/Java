/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlyrics;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
public class JLyrics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //May 8, 2018
        //Exercise 1
        
        //creates new JFrame, title, size and operation on close
        JFrame lyrics = new JFrame("T.N.T. by AC/DC");
        lyrics.setSize(350, 150);
        lyrics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JLabels for displaying lyrics
        JLabel line1 = new JLabel("'Cause I'm T.N.T. I'm dynamite");
        JLabel line2 = new JLabel("T.N.T. and I'll win the fight");
        JLabel line3 = new JLabel("T.N.T. I'm a power load");
        JLabel line4 = new JLabel("T.N.T. watch me explode");
        
        //sets the layout for the JLabels
        lyrics.setLayout(new FlowLayout());
        
        //adds the lines of lyrics to the JFrame
        lyrics.add(line1);
        lyrics.add(line2);
        lyrics.add(line3);
        lyrics.add(line4);
        
        //makes the JFrame visible
        lyrics.setVisible(true);
    }
}
