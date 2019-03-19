/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcarpet;

/**
 *
 * @author Aaron
 */
public class Carpet {
    
    //attributes for the carpet class, including length, width, quality, and cost
    private double width;
    private double length;
    private String quality;
    private double cost;
    
    //constructor for carpet class, calculates cost based on quality
    public Carpet(double carpWidth, double carpLength, String carpQuality){
        
        length = carpWidth;
        width = carpLength;
        quality = carpQuality;
        
        if (quality == "Prime"){
            
            cost = 17 * (length * width);
        }
        else if (quality == "Choice"){
            
            cost = 12 * (length * width);
        }
        else if (quality == "Standard"){
            
            cost = 10 * (length * width);
        }
        
    }
    
    //display method for outputting carpet information
    public void display(){
        
        System.out.println("Your carpet, that is " + width + "ft wide and " + length + "ft long, of quality " + quality + " will cost you " + cost);
    }
}
