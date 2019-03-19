/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoturners;

/**
 *
 * @author Aaron
 */
public class DemoTurners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 26, 2018
        //In Class Interface Exercise
        
        //three new objects for leaf, page, and pancake, exercise part a
        Leaf mapleLeaf = new Leaf();
        Page bookPage = new Page();
        Pancake flapjack = new Pancake();
        
        //calls turn methods for each object
        mapleLeaf.turn();
        bookPage.turn();
        flapjack.turn();
        
        //two new objects for tire and top, exercise part b
        Tire bridgestone = new Tire();
        Top kidstoy = new Top();
        
        //calls turn methods for each new object
        bridgestone.turn();
        kidstoy.turn();
    } 
}