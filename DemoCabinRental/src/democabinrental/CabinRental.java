/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democabinrental;

/**
 *
 * @author Aaron
 */
//base class
public class CabinRental {
    
    //attributes that include cabin number and the weekly rental rate
    protected int cabinNum;
    protected double weeklyRate;
    
    //constructor that calculates the rate based on the cabin number
    public CabinRental(int cNum){
        
        cabinNum = cNum;
        
        //decision to determine weekly rate
        if (cabinNum <= 3){
            
            weeklyRate = 950;
        }
        else{
            
            weeklyRate = 1100;
        }
    }
    
    //display method that outputs cabin number and the calculated rate
    public void display(){
        
        System.out.println("Cabin " + cabinNum + " will cost $" + weeklyRate + " per week.");
    }
}
