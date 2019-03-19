//--Paint Class--

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintcalculator;

/**
 *
 * @author Aaron
 */


//Aaron Ireland
//March 22, 2018
//Java - Classes Assignment #7

public class Paint {
    
    public static double calculatePrice(double length, double width, double height){ //method that calculates area, gallons of paint needed, and the final price. returns final price
        
        final double PRICE = 32.00; //constant value of price per gallon of paint
        double area;
        area = ((2 * length) + (2 * width)) * height; //area calculation using length, width, and height
        
        double gallons = paint(area); //calculates the gallons of paint needed by calling paint method below with area parameter
        System.out.println("The area of your room is " + area + " square feet."); //results of room's area
        System.out.println(gallons + " gallons of paint will be needed to paint the area of your room."); //display of gallons of paint needed
        
        double finalPrice = PRICE * gallons; //calculation for the price of the paint needed
        return finalPrice; //price return statement
    }
    
    public static double paint(double totalArea){ //method for calculating the number of gallons needed
        final double GALLON = 350; //constant for square feet painted per one gallon
        return totalArea / GALLON; //return statement for gallon calculation
    }
}
