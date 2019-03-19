/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpizza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Aaron
 */
public class JPizza extends JFrame implements ItemListener{

    //Aaron Ireland
    //May 15, 2018
    //Exercise 6
    
    //final ints declared for prices of certain pizza components
    final int SMALL = 7;
    final int MEDIUM = 9;
    final int LARGE = 11;
    final int EXTRA_LARGE = 14;
    final int CHEESE = 0;
    final int TOPPING = 1;
    int totalPrice = 0;
    
    //button groups, one for pizza size, one for toppings, limits user selections
    ButtonGroup sizeGroup = new ButtonGroup();
    ButtonGroup toppingGroup = new ButtonGroup();
    
    //chack boxes for each size and topping
    JCheckBox small = new JCheckBox("Small $" + SMALL, false);
    JCheckBox medium = new JCheckBox("Medium $" + MEDIUM, false);
    JCheckBox large = new JCheckBox("Large $" + LARGE, false);
    JCheckBox xLarge = new JCheckBox("Extra Large $" + EXTRA_LARGE, false);
    JCheckBox cheese = new JCheckBox("Extra Cheese $" + CHEESE, true);
    JCheckBox pepperoni = new JCheckBox("Pepperoni $" + TOPPING, false);
    JCheckBox sausage = new JCheckBox("Sausage $" + TOPPING, false);
    JCheckBox peppers = new JCheckBox("Peppers $" + TOPPING, false);
    JCheckBox ham = new JCheckBox("Ham $" + TOPPING, false);
    JCheckBox pineapple = new JCheckBox("Pineapple $" + TOPPING, false);
    
    //labels used for displaying information and text field for the price
    JLabel pizza = new JLabel("Sister's Pizza");
    JLabel cost = new JLabel("The cost of your pizza will be");
    JTextField total = new JTextField(4);
    JLabel options = new JLabel("Select your size and topping");
    
    //JPizza constructor, sets operations and adds checkboxes to the frame and groups
    public JPizza(){
        
        super("Pizza Maker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        add(pizza);
        add(options);
        sizeGroup.add(small);
        sizeGroup.add(medium);
        sizeGroup.add(large);
        sizeGroup.add(xLarge);
        toppingGroup.add(cheese);
        toppingGroup.add(pepperoni);
        toppingGroup.add(sausage);
        toppingGroup.add(peppers);
        toppingGroup.add(ham);
        toppingGroup.add(pineapple);
        add(small);
        add(medium);
        add(large);
        add(xLarge);
        add(cheese);
        add(pepperoni);
        add(sausage);
        add(peppers);
        add(ham);
        add(pineapple);
        add(cost);
        add(total);
    
        //adds item listeners to each check box item
        total.setText("$" + totalPrice);
        small.addItemListener(this);
        medium.addItemListener(this);
        large.addItemListener(this);
        xLarge.addItemListener(this);
        cheese.addItemListener(this);
        pepperoni.addItemListener(this);
        sausage.addItemListener(this);
        peppers.addItemListener(this);
        ham.addItemListener(this);
        pineapple.addItemListener(this);
    }
    
    //method used when an item detects an event
    public void itemStateChanged(ItemEvent e){
        
        Object source = e.getSource();
        int select = e.getStateChange();
        
        //if statement series, determines price based on selections
        if(source == small){
            if(select == ItemEvent.SELECTED)
                totalPrice += SMALL;
            else
                totalPrice -= SMALL;
        }
        if(source == medium){
            if(select == ItemEvent.SELECTED)
                totalPrice += MEDIUM;
            else
                totalPrice -= MEDIUM;
        }
        if(source == large){
            if(select == ItemEvent.SELECTED)
                totalPrice += LARGE;
            else
                totalPrice -= LARGE;
        }
        if(source == xLarge){
            if(select == ItemEvent.SELECTED)
                totalPrice += EXTRA_LARGE;
            else
                totalPrice -= EXTRA_LARGE;
        }
        if (source == cheese){
            if(select == ItemEvent.SELECTED)
                totalPrice += CHEESE;
            else
                totalPrice -= CHEESE;
        }
        if(source == pepperoni){
            if(select == ItemEvent.SELECTED)
                totalPrice += TOPPING;
            else
                totalPrice -= TOPPING;
        }
        if(source == sausage){
            if(select == ItemEvent.SELECTED)
                totalPrice += TOPPING;
            else
                totalPrice -= TOPPING;
        }
        if(source == peppers){
            if(select == ItemEvent.SELECTED)
                totalPrice += TOPPING;
            else
                totalPrice -= TOPPING;
        }
        if(source == ham){
            if(select == ItemEvent.SELECTED)
                totalPrice += TOPPING;
            else
                totalPrice -= TOPPING;
        }
        if(source == pineapple){
            if(select == ItemEvent.SELECTED)
                totalPrice += TOPPING;
            else
                totalPrice -= TOPPING;
        }
        total.setText("$" + totalPrice);
    }
    
    //main method, creates frame and sets the size
    public static void main(String[] args) {
        
        JPizza frame = new JPizza();
        final int WIDTH = 300;
        final int HEIGHT = 250;
        frame.setSize(WIDTH, HEIGHT);
    }
    
}
