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
public class Sandwich {
    
    //attributes for sandwich, which are bread and filling class objects
    public Bread bread;
    public SandwichFilling filling;
    
    //constructor designed to accept four parameters and uses this referencing for Bread and SandwichFilling
    public Sandwich(String bread, int calories, String filling, int fillCalories){
        
        this.bread = new Bread(bread, calories);
        this.filling = new SandwichFilling(filling, fillCalories);
    }
    
    //get method for the Bread object
    public Bread getBread(){
        
        return bread;
    }
    
    //get method for the SandwichFilling object
    public SandwichFilling getSandwichFilling(){
        
        return filling;
    }
}
