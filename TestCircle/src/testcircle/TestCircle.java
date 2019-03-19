/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcircle;

/**
 *
 * @author Aaron
 */
public class TestCircle { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 4, 2018
        //Java Exercise 6
        
        //creates three new Circle objects, two with defined radius, one using default constructor
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(12);
        Circle circle3 = new Circle();
        
        //displays information of each circle, the radius, diameter, and area
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
    }
    
}
