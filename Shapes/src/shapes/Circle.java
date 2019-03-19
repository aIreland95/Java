/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Aaron
 */
public class Circle {
    
    protected double radius;
    protected String color;
    
    public Circle(){
    }
    
    public Circle(double r){
        
        radius = r;
    }
    
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = (radius * radius) * 3.14159;
        return area;
    }
}
