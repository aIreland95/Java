/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintcalculator;
import java.util.Scanner; //utilizes scanners from the utility library
/**
 *
 * @author Aaron
 */


//Aaron Ireland
//March 22, 2018
//Java - Classes Assignment #7

public class PaintCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to our Paint Calculator.\nPlease enter the length of your room in feet."); //initial prompt, prompts user for length of room as a double
        Scanner lgth = new Scanner(System.in); //creates a new scanner for length
        double length = lgth.nextDouble(); //reads user input
        
        System.out.println("Please enter the width of your room in feet."); //prompts user for width of room as a double
        Scanner wdth = new Scanner(System.in); //creates new scanner for width
        double width = wdth.nextDouble(); //reads user input
        
        System.out.println("Now, please enter the height of your room in feet."); //prompts user for height of room as a double
        Scanner hght = new Scanner(System.in); //creates new scanner for height
        double height = hght.nextDouble(); //reads user input
        
        System.out.println("Painting your room, based on your dimensions, will cost $" + Paint.calculatePrice(length, width, height)); //prints out results of area, gallons of paint needed, and cost. Calls calculatePrice method from Paint class
    }
    
}