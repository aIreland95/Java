/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintcalculator;

/**
 *
 * @author Aaron
 */
public class Gallons {
    double area;
    double paintGallons;
    
    public Gallons(double a, double g){
        area = a;
        paintGallons = g;
        setGallons(a);
    }
    
    public void setGallons(double a){
        paintGallons = a * (1 / 350);
    }
    public double getGallons(){
        return paintGallons;
    }
}
