/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_class_example;

/**
 *
 * @author Aaron
 */
import java.lang.Math; //using a library and importing it
public class Circle {
    //Declarations or Attributes
    double radius;
    double diameter;
    double area;
    
    public Circle(double rad){ //constructor that creates a value and checks validity
        if(rad > 0.0){
        radius = rad;
        diameter = 2 * rad;
        setArea(rad);
        }
        else{
            radius = 1.0;
            setArea(rad);
        }
    }
    
    public void setArea(double r){
        area = Math.PI * Math.pow(r, 2);
    }
    
    public double getArea(){
        return area;
    }
}    
