/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohorses;

/**
 *
 * @author Aaron
 */
public class DemoHorses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 12, 2018
        //Java - Inheritance Exercise 1.
        
        //creation of two new objects, one Horse, and one RaceHorse
        Horse prancer = new Horse("Prancer", "White", 2013);
        RaceHorse bullet = new RaceHorse("Bullet", "Amber", 2016, 14);
        
        //calls display methods for both horses
        prancer.display();
        bullet.display();
    }
    
}
