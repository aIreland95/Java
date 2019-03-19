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
//derived class
public class DoublesTennisGame extends TennisGame{
    
    //attributes for a doubles tennis game, using partner names
    protected String partner1;
    protected String partner2;
    
    //constructor that uses super to call tennis game attributes
    public DoublesTennisGame(String p1, String p2, int po1, int po2, String pa1, String pa2){
        
        super(p1, p2, po1, po2);
        partner1 = pa1;
        partner2 = pa2;
    }
    
    //display method for presenting output for a doubles tennis game
    public void display(){
        
        System.out.println("" + player1 + " and " + partner1 + 
                " vs. " + player2 + " and " + partner2 + 
                "\nScore: " + score1 + "-" + score2 + "\n");
    }
}
