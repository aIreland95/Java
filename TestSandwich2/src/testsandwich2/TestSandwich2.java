/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwich2;

/**
 *
 * @author Aaron
 */
public class TestSandwich2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 3, 2018
        //Java Programming - Exercise 5c
        
        //creates three new sandwich objects, all with different breads, fillings, and calorie values
        Sandwich meal1 = new Sandwich("White", 150, "Ham", 250);
        Sandwich meal2 = new Sandwich("Rye", 200, "Tuna", 400);
        Sandwich meal3 = new Sandwich("Whole Wheat", 200, "Turkey", 300);
        
        //calls new method for displaying sandwich information properly for each sandwich object
        display(meal1);
        display(meal2);
        display(meal3);
    }
    
    //method for proper sandwich display
    public static void display(Sandwich m){
            
            Bread b = m.getBread();
            SandwichFilling sf = m.getSandwichFilling();
            
            //displays message for sandwiches bread, fillings, and calories for both
            System.out.println("Sandwich:\nBread - " + b.getBreadType() + " - "
                    + b.getNumCalories() + " Calories\nFilling - " + sf.getFilling() + " - "
                    + sf.getCalories() + " Calories\n " + b.MOTTO + "\n");
        }
}
