/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwichfilling;

/**
 *
 * @author Aaron
 */
public class SandwichFilling {
    
    //attributes for SandwichFilling class, filling type and calories
    public String fillingType;
    public int servingCalories;
    
    //constructor that accepts filling and calorie parameters
    public SandwichFilling(String filling, int calories){
        
        fillingType = filling;
        servingCalories = calories;
    }
    
    //get method for the fillingType
    public String getFilling(){
        
        return fillingType;
    }
    
    //get method for the amount of calories
    public int getCalories(){
        
        return servingCalories;
    }
}
