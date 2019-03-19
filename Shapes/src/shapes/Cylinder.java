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
public class Cylinder extends Circle{
    
    protected double height;
    
    public Cylinder(){
    }
    
    public Cylinder(double r){
        
        super(r);
    }
    
    public Cylinder(double r, double h){
        
        super(r);
        height = h;
    }
    
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        
        double volume = ((radius * radius) * 3.14159) * height;
        return volume;
    }
}
