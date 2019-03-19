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
public class UseBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 20, 2018
        //Java - Advanced Inheritance
        
        //two new book objects, one fiction, one nonfiction
        Fiction scifi = new Fiction("Of Mice and Men");
        NonFiction history = new NonFiction("The Magic of Reality");
        
        //calls setPrice methods for each book
        scifi.setPrice();
        history.setPrice();
        
        //calls display method for each book
        scifi.display();
        history.display();
    }
}
