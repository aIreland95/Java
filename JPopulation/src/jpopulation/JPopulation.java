/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpopulation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Aaron
 */
public class JPopulation extends JFrame implements ActionListener{
    
    //Aaron Ireland
    //May 15, 2018
    //Exercise 7

    //array of cities, will be used in the JComboBox object
    String[] cityArray = {"Anaheim", "Boston","Detroit","Los Angeles","Pittsburgh",
                      "St. Louis","Tampa Bay"};
    
    JComboBox cities = new JComboBox(cityArray);
    int population = 0;
    
    //creates labels and text field
    JLabel cityPick = new JLabel("Please select a city from the drop-down list");
    JLabel cityPop = new JLabel("This city's population is");
    JTextField total = new JTextField(8);
    
    //JPopulation constructor, adds items and characteristics to frame
    public JPopulation(){
        
        super("City Drop Down List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        add(cityPick);
        add(cities);
        add(cityPop);
        add(total);
        
        //sets the text field to the city population, listener used for combo box
        total.setText("" + population);
        cities.addActionListener(this);
    }
    
    //method for when an action is performed using the combo box
    public void actionPerformed(ActionEvent e){
        
        String data = "";
        
        //if statements with nested ifs - determines population based on the city
        if (cities.getSelectedIndex() != -1){
            data = "City Selected: " + cities.getItemAt(cities.getSelectedIndex());
            
            if (cities.getSelectedIndex() == 0){
                population = 351043;
                total.setText("" + population);
            }
            else if (cities.getSelectedIndex() == 1){
                population = 673184;
                total.setText("" + population);
            }
            else if (cities.getSelectedIndex() == 2){
                population = 672795;
                total.setText("" + population);
            }
            else if (cities.getSelectedIndex() == 3){
                population = 3976322;
                total.setText("" + population);
            }
            else if (cities.getSelectedIndex() == 4){
                population = 303625;
                total.setText("" + population);
            }
            else if (cities.getSelectedIndex() == 5){
                population = 308626;
                total.setText("" + population);
            }
            else if (cities.getSelectedIndex() == 6){
                population = 369075;
                total.setText("" + population);
            }
        }
    }
    
    //main method which creates a JPopulation object and sets the size
    public static void main(String[] args) {
        
        JPopulation cityList = new JPopulation();
        final int WIDTH = 300;
        final int HEIGHT = 200;
        cityList.setSize(WIDTH, HEIGHT);
    }
    
}
