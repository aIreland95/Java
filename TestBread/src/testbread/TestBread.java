/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbread;

/**
 *
 * @author Aaron
 */
public class TestBread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 3, 2018
        //Java Programming - Exercise 5a
        
        //creates three new bread objects, all with different bread types and calories
        Bread bread1 = new Bread("White", 200);
        Bread bread2 = new Bread("Whole Wheat", 300);
        Bread bread3 = new Bread("Rye", 400);
        
        //display for bread1, white with 200 calories
        System.out.println("Bread Type: " + bread1.getBreadType() + 
                "\nCalories: " + bread1.getNumCalories() + "\nCompany Motto: "
                + bread1.MOTTO);
        
        //display for bread2, whole wheat with 300 calories
        System.out.println("\n\nBread Type: " + bread2.getBreadType() + 
                "\nCalories: " + bread2.getNumCalories() + "\nCompany Motto: "
                + bread2.MOTTO);
        
        //display for bread3, rye with 400 calories
        System.out.println("\n\nBread Type: " + bread3.getBreadType() + 
                "\nCalories: " + bread3.getNumCalories() + "\nCompany Motto: "
                + bread3.MOTTO);
    }
    
}
