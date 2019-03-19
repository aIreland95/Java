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
//base class
public class TennisGame {
    
    //six attributes for a singles tennis games, including player names, and scores
    protected String player1;
    protected String player2;
    protected int points1;
    protected int points2;
    protected String score1;
    protected String score2;
    
    //constructor that sets each attribute and String score based on the int points
    public TennisGame(String p1, String p2, int po1, int po2){
        
        player1 = p1;
        player2 = p2;
        points1 = po1;
        points2 = po2;
        
        //switch statement for player 1's score
        switch (points1){
            
            case 0: score1 = "Love";
                break;
            case 1: score1 = "15";
                break;
            case 2: score1 = "30";
                break;
            case 3: score1 = "40";
                break;
            case 4: score1 = "Game";
                break;
            default: score1 = "error";
                break;
        }
        
        //switch statement for player 2's score
        switch (points2){
            
            case 0: score2 = "Love";
                break;
            case 1: score2 = "15";
                break;
            case 2: score2 = "30";
                break;
            case 3: score2 = "40";
                break;
            case 4: score2 = "Game";
                break;
            default: score2 = "error";
                break;
        }
    }
    
    //display method that outputs player names and String scores
    public void display(){
        
        System.out.println("" + player1 + " vs. " + player2 + "\nScore: " + score1 + "-" + score2 + "\n");
    }
}
