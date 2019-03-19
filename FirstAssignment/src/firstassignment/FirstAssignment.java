//Main method for First Assignment
        
        //Aaron Ireland
        //March 21, 2018
        //Java - First Assignment
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstassignment;
/**
 *
 * @author Aaron
 */
public class FirstAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] evenNum = { 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40}; //array containing even numbers
        int bigRange = 1; //first value of range between 1-100
        int value1; //first alue in addition method
        int value2; //second value in addition method
        
        System.out.println("Below, even numbers between 20 and 40 will be displayed.\n");
        for(int e : evenNum ){ //for loop to present every number in the even Num array
            System.out.println(e); //displays each number
        }
        
        System.out.println("\nNow, below will be a list of all integers between 1 and 100.\n");
        while(bigRange < 101){ //while loop that will increment bigRange until it reaches 101
            System.out.println(bigRange); //displays each number between 1-100
            bigRange++;
        }
        
        System.out.println("\nThe two numbers below are sums; 5 + 7 (int), and 6.4 + 9.1 (float)");
        System.out.println(Sum(5,7)); //calls and displays Sum method with int values of 5 and 7
        System.out.println(Sum(6.4f,9.1f)); //calls and displays Sum method with float values of 6.4f and 9.1f
        
        System.out.println("\nFinally, below is the results for calculating a circle's diameter and area with a radius of 1.\n");
        
        System.out.println("Diameter: "+Circle.setDiameter(1, 2)); //calls and displays the setDiameter method from the Circle class
        System.out.println("Area: "+Circle.setArea(1, 3.14)); //calls and displays the setArea method from the Circle class
        
    }
    public static int Sum(int value1, int value2){ //Sum method that accepts integers
        return value1+value2;
    }
    public static float Sum(float value1, float value2){ //Sum methods that accepts floats and overrides the previous Sum method
        return value1+value2;
    }
}
