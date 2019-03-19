/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summervaleresort;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Aaron
 */
public class SummervaleResort extends JFrame implements ActionListener{

    //Aaron Ireland
    //May 22, 2018
    //Exercise 10
    
    //creation of many JMenus, JMenuItems and JLabels
    JMenuBar mainBar = new JMenuBar();
    JMenu room = new JMenu("Room");
    JMenuItem bed1 = new JMenuItem("One Bedroom");
    JMenuItem bed2 = new JMenuItem("Two Bedrooms");
    JMenuItem bed3 = new JMenuItem("Three Bedrooms");
    JMenu dining = new JMenu("Dining");
    JMenuItem food1 = new JMenuItem("Spaghetti");
    JMenuItem food2 = new JMenuItem("Steak");
    JMenuItem food3 = new JMenuItem("Pizza");
    JMenu activities = new JMenu("Activities");
    JMenuItem act1 = new JMenuItem("Archery");
    JMenuItem act2 = new JMenuItem("Waterskiing");
    JMenuItem act3 = new JMenuItem("Frisbee Golf");
    JLabel instruct = new JLabel("Select a menu item to view information.");
    JLabel info = new JLabel("");
    JLabel detail = new JLabel("");
    JLabel cost = new JLabel("");
    
    //constructor for SummervaleResort, adds menus, menu items, and labels
    public SummervaleResort(){
        
        super("Summervale Resort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setJMenuBar(mainBar);
        mainBar.add(room);
        mainBar.add(dining);
        mainBar.add(activities);
        room.add(bed1);
        room.add(bed2);
        room.add(bed3);
        dining.add(food1);
        dining.add(food2);
        dining.add(food3);
        activities.add(act1);
        activities.add(act2);
        activities.add(act3);
        
        //actionlisteners added to menuitem options
        bed1.addActionListener(this);
        bed2.addActionListener(this);
        bed3.addActionListener(this);
        food1.addActionListener(this);
        food2.addActionListener(this);
        food3.addActionListener(this);
        act1.addActionListener(this);
        act2.addActionListener(this);
        act3.addActionListener(this);
        add(instruct);
        add(info);
        add(detail);
        add(cost);
    }
    
    //method for when a menu item is selected, JLabels will change text
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
        
        if (source == bed1){
            info.setText("One Bedroom");
            detail.setText("One Bathroom");
            cost.setText("Cost: $55 per night");
        }
        else if(source == bed2){
            info.setText("Two bedrooms");
            detail.setText("One Bathroom");
            cost.setText("Cost: $80 per night");
        }
        else if(source == bed3){
            info.setText("Three Bedrooms");
            detail.setText("Two Bathrooms");
            cost.setText("Cost: $100 per night");
        }
        else if(source == food1){
            info.setText("Spaghetti");
            detail.setText("Side: Garlic Knots");
            cost.setText("Cost: $3.99");
        }
        else if(source == food2){
            info.setText("Steak");
            detail.setText("Side: Mashed Potatoes");
            cost.setText("Cost: $5.99");
        }
        else if(source == food3){
            info.setText("Pizza");
            detail.setText("Side: Breadsticks");
            cost.setText("Cost: $7.99");
        }
        else if(source == act1){
            info.setText("Archery");
            detail.setText("Summervale Powerhouse Fields");
            cost.setText("Cost: $10 per day");
        }
        else if(source == act2){
            info.setText("Waterskiing");
            detail.setText("Summervale Lake");
            cost.setText("Cost: $15 per day");
        }
        else if(source == act3){
            info.setText("Frisbee Golf");
            detail.setText("Summervale Frisbee Golf Course");
            cost.setText("Cost: $10 per day");
        }
    }
    
    //main method, creates SummervaleResort object and sets the size
    public static void main(String[] args) {
        
        SummervaleResort frame = new SummervaleResort();
        final int WIDTH = 450;
        final int HEIGHT = 200;
        frame.setSize(WIDTH, HEIGHT);
    }
    
}
