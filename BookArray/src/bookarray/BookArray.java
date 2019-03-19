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
public class BookArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 21, 2018
        //Java Inheritance - 1b
        
        //new array of books in a library
        Book[] library = new Book[10];
        
        //ten book objects, eithe rfiction or nonfiction
        library[0] = new Fiction("Of Mice and Men");
        library[1] = new Fiction("East of Eden");
        library[2] = new Fiction("To Kill a Mockingbird");
        library[3] = new Fiction("The Name of the Wind");
        library[4] = new Fiction("The Alchemist");
        library[5] = new NonFiction("The Magic of Reality");
        library[6] = new NonFiction("The Glass Castle");
        library[7] = new NonFiction("The Devil in the White City");
        library[8] = new NonFiction("Into the Wild");
        library[9] = new NonFiction("The Omnivore's Dilemma");
        
        //for loop that calls setPrice methods and display methods for each book
        for(int i = 0; i < 11; ++i){
            
            library[i].setPrice();
            library[i].display();
        }
    }
}