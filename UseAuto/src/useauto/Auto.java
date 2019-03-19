/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useauto;

/**
 *
 * @author Aaron
 */
//abstract base class
public abstract class Auto {
    
    //attributes for auto, including make and price
    protected String make;
    protected double price;
    
    //constructor for Auto class
    public Auto(String m){
        
        make = m;
    }
    
    public String getMake(){
        return make;
    }
    public double getPrice(){
        return price;
    }
    
    //abstract method, used with Ford and Chevy
    public abstract void setPrice();
    
    //display method to output make and price
    public void display(){
        
        System.out.println("Make: " + make + "\nPrice: " + price + "\n");
    }
    
}
