/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwich2;

/**
 *
 * @author Aaron
 */
public class Bread {
    
    //two bread attributes and the company motto listed below
    public String breadType;
    public int numCalories;
    public final String MOTTO = "The Staff of Life";
    
    //constructor that accepts bread and calorie parameters
    public Bread(String bread, int calories){
        
        breadType = bread;
        numCalories = calories;
    }
    
    //get method for the bread type
    public String getBreadType(){
        
        return breadType;
    }
    
    //get method for the amount of calories
    public int getNumCalories(){
        
        return numCalories;
    }
}
