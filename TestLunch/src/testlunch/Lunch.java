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
public class Lunch {
    
    //attributes for the lunch class, including entree, side, and drink
    private String entree;
    private String side;
    private String drink;
    
    //default constructor, executes if no values are provided in main
    public Lunch(){
    
        entree = "Meat Loaf";
        side = "Mashed Potatoes";
        drink = "Iced Tea";
    }
    
    //custom overload construcctor, used if values are provided
    public Lunch(String mainDish, String sideDish, String beverage){
        
        entree = mainDish;
        side = sideDish;
        drink = beverage;
    }
    
    //display method for printing out all lunch information
    public void display(){
        
        System.out.println("-Your lunch for today-\nEntree: " + entree + 
                "\nSide: " + side + "\nDrink: " + drink +"\n");
    }
}
