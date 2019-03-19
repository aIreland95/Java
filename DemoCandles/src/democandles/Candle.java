/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democandles;

/**
 *
 * @author Aaron
 */
//base class
public class Candle {
    
    //attributes for candles, including color, height, and price
    protected String color;
    protected double height;
    protected double price;
    
    //constructor that accepts color and height, and calculates price
    public Candle(String c, double h){
        
        color = c;
        height = h;
        
        price = (h * 2.00);
    }
    
    //display method for regular candle objects
    public void display(){
        
        System.out.println("A " + color + " colored candle standing " + height + 
                " inches tall will cost $" + price);
    }
}
