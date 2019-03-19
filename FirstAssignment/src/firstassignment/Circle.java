//Circle class for First Assignment

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
public class Circle { //declarations of Circle class
    double radius;
    double diameter;
    double area;
    
    public Circle(double radius){ //constructor that sets the radius to 1
        radius = 1;
    }
    
    public static double setDiameter(double radius, double diameter){ //setDiameter method that calculates the diameter of a circle
        diameter = radius*2;
        return diameter;
    }
    
    public static double setArea(double radius, double area){ //setArea method that calculates the area of a circle
        area = (radius*radius)*3.14;
        return area;
    }
}
