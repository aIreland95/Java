/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookarray;

/**
 *
 * @author Aaron
 */
//abstract base class
public abstract class Book {
    
    //book attributes inherited by children
    protected String title;
    protected double price;
    
    //constructor that sets the book's title
    public Book(String t){
        
        title = t;
    }
    
    //empty abstract method, must be used by all derived classes
    public abstract void setPrice();
    
    //display method for all books
    public void display(){
        
        System.out.println("Title: " + title + "\nPrice: " + price + "\n");
    }
}
