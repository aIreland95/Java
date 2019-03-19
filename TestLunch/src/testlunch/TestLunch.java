/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlunch;

/**
 *
 * @author Aaron
 */
public class TestLunch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 10, 2018
        //Java CLass Exam - Essay 2.
        
        //three created Lunch objects, one default, two with set values
        Lunch lunchA = new Lunch();
        Lunch lunchB = new Lunch("Turkey Sandwich", "French Fries", "Cola");
        Lunch lunchC = new Lunch("Pepperoni Pizza", "Garlic Knots", "Water");
        
        //display methods for each lunch object
        lunchA.display();
        lunchB.display();
        lunchC.display();
    }
    
}
