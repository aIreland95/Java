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
//derived class
public class ScentedCandle extends Candle {
    
    //attribute exclusive to scented candle objects
    private String scent;
    
    //constructor that accepts color, height, and scent
    public ScentedCandle(String c, double h, String s){
        
        super(c, h);
        scent = s;
        
        //here, price is multiplied by 3 due to scent
        price = (h * 3.00);
    }
    
    //display method for scented candle ogjects
    public void display(){
        
        System.out.println("An " + color + " colored candle standing " + height + 
                " inches with a " + scent + " scent will cost $" + price);
    }
}
