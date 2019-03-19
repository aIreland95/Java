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
public class Price {
    double paintGallons;
    double price;
    
    public Price(double g, double p){
        paintGallons = g;
        price = p;
        setPrice(g);
    }
    
    public void setPrice(double g){
        price = g * 32.00;
    }
    public double getPrice(){
        return price;
    }
}
