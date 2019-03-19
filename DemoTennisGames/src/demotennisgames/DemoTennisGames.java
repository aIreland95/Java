/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demotennisgames;

/**
 *
 * @author Aaron
 */
public class DemoTennisGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 14, 2018
        //Java Inheritance - DemoTennisGames
        
        //four objects, two regular tennis games, two doubles games
        TennisGame singles1 = new TennisGame("Marth", "Wilma", 2, 0);
        TennisGame singles2 = new TennisGame("Peter", "Alex", 1, 4);
        DoublesTennisGame doubles1 = new DoublesTennisGame("Paul", "Jack", 2, 3, "Matthew", "Fred");
        DoublesTennisGame doubles2 = new DoublesTennisGame("Nicole", "May", 3, 1, "Jessica", "Samantha");
        
        //display for a tennis tourney introduction
        System.out.println("Today's matchups/scores on the Tennis Network:\n");
        
        //display methods for every tennis game and doubles game
        singles1.display();
        singles2.display();
        doubles1.display();
        doubles2.display();
    }
    
}
