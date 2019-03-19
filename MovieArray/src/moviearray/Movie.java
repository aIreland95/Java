/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviearray;

/**
 *
 * @author Aaron
 */
public abstract class Movie {
    
    //general movie attributes
    protected String title;
    protected String rating;
    protected double price;
    
    //movie constructor
    public Movie(String t, String r){
        
        title = t;
        rating = r;
    }
    
    //get methods for each attribute
    public String getTitle(){
        return title;
    }
    public String getRating(){
        return rating;
    }
    public double getPrice(){
        return price;
    }
    
    //abstract method, must be used by kids
    public abstract void setPrice();
    
    //display method
    public void display(){
        
        System.out.println("Title: " + title + "\nRating: " + rating +
                "\nPrice: " + price + "\n");
    }
}
