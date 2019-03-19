/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usebook;

/**
 *
 * @author Aaron
 */
//derived class
public class NonFiction extends Book {

    //constructor for title of nonfiction book
    public NonFiction(String t) {
        
        super(t);
    }
    
    //setPrice method for nonfiction books
    public void setPrice(){
        
        price = 37.99;
    }
    
    //display method
    public void display(){
        
        System.out.println("Title: " + title + "\nPrice: " + price);
    }
}
