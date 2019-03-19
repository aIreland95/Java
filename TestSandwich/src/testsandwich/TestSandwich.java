/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwich;
//import java.util.Scanner;
/**
 *
 * @author Aaron
 */
public class TestSandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //March 26, 2018
        //TestSandwich.java - Java Programming
        
        //introductory system.out
        System.out.println("Welcome to Vincent Van Dough's Sandwich Shop!\nCheck out our best-selling sandwiches:\n");
        
        //creates new sandwich object
        Sandwich sandwich = new Sandwich();
        
        //calls set methods for first sandwich attributes
        sandwich.setIngredient("Ham");
        sandwich.setCheese("Swiss");
        sandwich.setBread("White");
        sandwich.setPrice(3.49);
        
        //print-out for the first sandwich and attributes
        System.out.println("1. " + sandwich.getIngredient() + " and " 
                + sandwich.getCheese() + " sandwich on " + 
                sandwich.getBread() + " bread - $" + sandwich.getPrice());
        
        //calls set methods for second sandwich attributes
        sandwich.setIngredient("Tuna");
        sandwich.setBread("Rye");
        sandwich.setPrice(4.99);
        
        //print-out for second sandwich and attributes
        System.out.println("2. " + sandwich.getIngredient() + " sandwich on "
                + sandwich.getBread() + " bread - $" + sandwich.getPrice());
        
        //calls set methods for third sandwich attributes
        sandwich.setIngredient("Turkey");
        sandwich.setCheese("Provologne");
        sandwich.setBread("Whole Wheat");
        sandwich.setPrice(3.99);
        
        //print-out for third sandwich and attributes
        System.out.println("3. " + sandwich.getIngredient() + " and " 
                + sandwich.getCheese() + " sandwich on " + 
                sandwich.getBread() + " bread - $" + sandwich.getPrice());
    }   
}