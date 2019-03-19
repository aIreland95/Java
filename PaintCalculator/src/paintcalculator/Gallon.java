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
public class Gallon {
    public double length;
    public double width;
    public double height;
    public double area;
    public double paintGallons;
    public double price;
    
    public Gallon(double l, double w, double h, double a, double g, double p){
        length = l;
        width = w;
        height = h;
        area = a;
        paintGallons = g;
        price = p;
        setGallons(a);
    }
    
    public void setGallons(double a){
        paintGallons = a * (1 / 350);
    }
    public double getGallons(){
        return paintGallons;
    }
}
