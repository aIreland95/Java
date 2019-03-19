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
import java.lang.Math;
public class Circle {
    
    //three attributes of the circle
    public double radius;
    public double diameter;
    public double area;
    
    //default constructor when no radius value is provided, calculates diameter and area, then displays values
    public Circle(){
        
        radius = 1;
        diameter = 2 * radius;
        area = Math.round(Math.PI * Math.pow(radius, 2));
        System.out.print("\n\nCircle with radius of " + radius + " :\nDiameter - " + diameter + "\nArea - " + area + "\n\n");
    }
    
    //overloaded method for when a radius is passed through
    public Circle(double r){
        
        radius = r;
        setRadius(r);
    }
    
    //set method for the radius, calculates diameter and area, then displays values
    public void setRadius(double r){
        
        radius = r;
        diameter = 2 * r;
        area = Math.round(Math.PI * Math.pow(r, 2));
        System.out.print("\nCircle with radius of " + radius + " :\nDiameter - " + diameter + "\nArea - " + area + "\n");
    }
    
    //get method for the radius
    public double getRadius(){
        
        return radius;
    }
}
