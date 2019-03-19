/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohorses;

/**
 *
 * @author Aaron
 */
//base class
public class Horse {
    
    //attributes for Horse class, including name, color, and birth year
    protected String name;
    protected String color;
    protected int birthYear;
    
    //constructor for Horse, used when values passed through
    public Horse(String horseName, String horseColor, int horseBirth){
        
        name = horseName;
        color = horseColor;
        birthYear = horseBirth;
    }
    
    //display method to output all information
    public void display(){
        
        System.out.println("Our horse, " + name + ", is " + color + " colored, and was born in the year " + birthYear);
    }
}
