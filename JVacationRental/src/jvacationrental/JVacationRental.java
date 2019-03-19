/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jvacationrental;

/**
 *
 * @author Aaron
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVacationRental extends JFrame implements ItemListener{

    //Aaron Ireland
    //May 11, 2018
    //Exercise 14
    
    //final ints declared for prices of certain rental components
    final int PARKSIDE = 600;
    final int POOLSIDE = 750;
    final int LAKESIDE = 825;
    final int ONE_BED = 0;
    final int TWO_BEDS = 75;
    final int THREE_BEDS = 150;
    final int MEALS = 200;
    int totalPrice = 0;
    
    //two created button groups, one for holding locations, the other for bed numbers
    //this will prevent users from selecting too many options
    ButtonGroup locationGroup = new ButtonGroup();
    ButtonGroup bedGroup = new ButtonGroup();
    
    //check boxes for each loction, bedroom number, and meals
    JCheckBox parkBox = new JCheckBox("Parkside $" + PARKSIDE, false);
    JCheckBox poolBox = new JCheckBox("Poolside $" + POOLSIDE, false);
    JCheckBox lakeBox = new JCheckBox("Lakeside $" + LAKESIDE, false);
    JCheckBox oneBedBox = new JCheckBox("One Bedroom $" + ONE_BED, false);
    JCheckBox twoBedBox = new JCheckBox("Two Bedrooms $" + TWO_BEDS, false);
    JCheckBox threeBedBox = new JCheckBox("Three Bedrooms $" + THREE_BEDS, false);
    JCheckBox mealBox = new JCheckBox("Meals $" + MEALS, false);
    
    //labels that display information, text field used to display total price
    JLabel rentals = new JLabel("Lambert's Vacation Rentals");
    JLabel price = new JLabel("The price for your stay will be");
    JTextField total = new JTextField(4);
    JLabel options = new JLabel("Select your options");
    
    //JVacationRental constructor, sets operations and adds checkboxes to frame and groups
    public JVacationRental(){
        
        super("Rental Price Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        add(rentals);
        add(options);
        locationGroup.add(parkBox);
        locationGroup.add(poolBox);
        locationGroup.add(lakeBox);
        bedGroup.add(oneBedBox);
        bedGroup.add(twoBedBox);
        bedGroup.add(threeBedBox);
        add(parkBox);
        add(poolBox);
        add(lakeBox);
        add(oneBedBox);
        add(twoBedBox);
        add(threeBedBox);
        add(mealBox);
        add(price);
        add(total);
        
        //adds item listeners to each check box item
        total.setText("$" + totalPrice);
        parkBox.addItemListener(this);
        poolBox.addItemListener(this);
        lakeBox.addItemListener(this);
        oneBedBox.addItemListener(this);
        twoBedBox.addItemListener(this);
        threeBedBox.addItemListener(this);
        mealBox.addItemListener(this);
    }
    
    //method used when an item listens and detects an event
    public void itemStateChanged(ItemEvent e){
        
        Object source = e.getSource();
        int select = e.getStateChange();
        
        //series of if statements that add or deduct the price based on the selections made
        if(source == parkBox){
            if(select ==ItemEvent.SELECTED)
                totalPrice += PARKSIDE;
            else
                totalPrice -= PARKSIDE;
        }
        if(source == poolBox){
            if(select ==ItemEvent.SELECTED)
                totalPrice += POOLSIDE;
            else
                totalPrice -= POOLSIDE;
        }
        if(source == lakeBox){
            if(select ==ItemEvent.SELECTED)
                totalPrice += LAKESIDE;
            else
                totalPrice -= LAKESIDE;
        }
        if(source == oneBedBox){
            if(select ==ItemEvent.SELECTED)
                totalPrice += ONE_BED;
            else
                totalPrice -= ONE_BED;
        }
        if(source == twoBedBox){
            if(select ==ItemEvent.SELECTED)
                totalPrice += TWO_BEDS;
            else
                totalPrice -= TWO_BEDS;
        }
        if(source == threeBedBox){
            if(select ==ItemEvent.SELECTED)
                totalPrice += THREE_BEDS;
            else
                totalPrice -= THREE_BEDS;
        }
        if(source == mealBox) {
            if(select ==ItemEvent.SELECTED)
                totalPrice += MEALS;
            else
                totalPrice -= MEALS;
            total.setText("$" + totalPrice);
        }
    }
    
    //main method, creates the frame and sets the size
    public static void main(String[] args) {
        
        JVacationRental frame = new JVacationRental();
        final int WIDTH = 300;
        final int HEIGHT = 250;
        frame.setSize(WIDTH, HEIGHT); 
    }   
}