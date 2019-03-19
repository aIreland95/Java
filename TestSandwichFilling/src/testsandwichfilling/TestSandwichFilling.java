/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwichfilling;

/**
 *
 * @author Aaron
 */
public class TestSandwichFilling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 3, 2018
        //Java Programming - Exercise 5b
        
        //objects for three different fillings, each with different names and calori values
        SandwichFilling filling1 = new SandwichFilling("Lettuce", 150);
        SandwichFilling filling2 = new SandwichFilling("Mayonnaise", 350);
        SandwichFilling filling3 = new SandwichFilling("Tomatoes", 200);
        
        //displays for each of the sandwich filling objects
        System.out.println("Filling Type: " + filling1.getFilling() + "\nCalories: " + filling1.getCalories());
        System.out.println("\nFilling Type: " + filling2.getFilling() + "\nCalories: " + filling2.getCalories());
        System.out.println("\nFilling Type: " + filling3.getFilling() + "\nCalories: " + filling3.getCalories());
    }
    
}
