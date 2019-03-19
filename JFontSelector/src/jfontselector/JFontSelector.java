/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfontselector;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFontSelector extends JFrame implements ActionListener {

    //Aaron Ireland
    //May 18, 2018
    //Exercise 3 - JFontSelector
    
    //new JButton objects
    JButton text1 = new JButton("Arial");
    JButton text2 = new JButton("Century");
    JButton text3 = new JButton("Monospaced");
    JButton text4 = new JButton("Calibri");
    JButton text5 = new JButton("Times New Roman");
    JButton resize = new JButton("Increase Size");
    JLabel font = new JLabel("Click the buttons to change me!");
    
    //new Font objects
    Font arial = new Font("Arial", Font.PLAIN, 12);
    Font century = new Font("Century", Font.PLAIN, 12);
    Font mono = new Font("Monospaced", Font.PLAIN, 12);
    Font calibri = new Font("Calibri", Font.PLAIN, 12);
    Font times = new Font("Times New Roman", Font.PLAIN, 12);
    Font sizeUp = new Font("", Font.PLAIN, 18);
    Font sizeDown = new Font("", Font.PLAIN, 12);
    
    boolean increase = false;
    //default constructor for JFontSelector
    public JFontSelector(){
        
        super("Font Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        add(text1);
        add(text2);
        add(text3);
        add(text4);
        add(text5);
        add(resize);
        add(font);
        text1.addActionListener(this);
        text2.addActionListener(this);
        text3.addActionListener(this);
        text4.addActionListener(this);
        text5.addActionListener(this);
        resize.addActionListener(this);
    }
    
    //action performed method, detects when buttons are clicked
    public void actionPerformed(ActionEvent e){
        
        //bool determines if fnt is large or small
       
        Object source =e.getSource();
        
        //if statements that change the font type
        if(source == text1){
            font.setFont(arial);
        }
        else if(source == text2){
            font.setFont(century);
        }
        else if(source == text3){
            font.setFont(mono);
        }
        else if(source == text4){
            font.setFont(calibri);
        }
        else if(source == text5){
            font.setFont(times);
        }
        
        //if statements that change the font size
        if(source == resize){
            if(!increase){
                font.setFont(sizeUp);
                increase = true;
            }
            else if(increase){
                font.setFont(sizeDown);
                increase = false;
            }
        }
    }
    
    //main method, creates new JFontSelector object and sets frame size
    public static void main(String[] args) {
        
        JFontSelector frame = new JFontSelector();
        final int WIDTH = 300;
        final int HEIGHT = 250;
        frame.setSize(WIDTH, HEIGHT);
    }
    
}
