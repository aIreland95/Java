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
//derived class
public class HolidayCabinRental extends CabinRental{
    
    //attribute of holiday rental, surcharge declared as final
    protected final double surcharge = 150;
    
    //constructor that determines weekly rate of a holiday cabin
    public HolidayCabinRental(int cNum){
        
        super(cNum);
        
        //decision to determine weekly rate, adds surcharge
        if (cabinNum <= 3){
            
            weeklyRate = 950 + surcharge;
        }
        else{
            
            weeklyRate = 1100 + surcharge;
        }
    }
    
    //display method that outputs holiday cabin number and calculated rate
    public void display(){
        
        System.out.println("Cabin " + cabinNum + " will cost $" + weeklyRate + " per week for the holidays.");
    }
}
