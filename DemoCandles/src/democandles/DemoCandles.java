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
public class DemoCandles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 13, 2018
        //Java Inheritance - DemoCandles
        
        //two objects created, one candle and one scented candle
        Candle white = new Candle("white", 4);
        ScentedCandle pumpkin = new ScentedCandle("orange", 5, "pumpkin pie");
        
        //displays the company name
        System.out.println("Mick's Wicks Candles\n");
        
        //display methods called for each candle object
        white.display();
        pumpkin.display();
    }
    
}
