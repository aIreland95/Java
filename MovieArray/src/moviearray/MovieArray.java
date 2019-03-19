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
public class MovieArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new array for 10 movies
        Movie[] theater = new Movie[10];
        
        theater[0] = new Horror("Nightmare on Elm Street", "R");
        theater[1] = new Horror("Friday the 13th", "R");
        theater[2] = new Horror("Night of the Living Dead", "R");
        theater[3] = new Horror("Stephen King's IT", "R");
        theater[4] = new Horror("Halloween", "R");
        theater[5] = new Romance("The Notebook", "PG-13");
        theater[6] = new Romance("Dear John", "PG-13");
        theater[7] = new Romance("The Fault in our Stars", "PG-13");
        theater[8] = new Romance("Grease", "PG-13");
        theater[9] = new Romance("Charlie St. Cloud", "PG-13");
        
        //for each entry, sets the price and displays the info
        for(int i = 0; i < 11; ++i){
            
            theater[i].setPrice();
            theater[i].display();
        }
    }
    
}
