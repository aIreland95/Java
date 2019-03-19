/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbirdsighting;

/**
 *
 * @author Aaron
 */
public class TestBirdSighting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 3 ,2018
        //Java Programming - Exercise 3
        
        //new objects, two for BirdSighting (one default, one overloaded), one for BirdSighting2 (default)
        BirdSighting bird1 = new BirdSighting();
        BirdSighting bird2 = new BirdSighting("Cardinal", 9, 152);
        BirdSighting2 bird3 = new BirdSighting2();
        
        //displays default constructor values for BirdSighting
        System.out.println("Bird Species: " + bird1.getSpecies()
                + "\nNumber Spotted: " + bird1.getNumberSeen()
                + "\nDay of Year: " + bird1.getDayOfYear());
        
        //displays overloaded constructor values for BirdSighting
        System.out.println("\nBird Species: " + bird2.getSpecies()
                + "\nNumber Spotted: " + bird2.getNumberSeen()
                + "\nDay of Year: " + bird2.getDayOfYear());
        
        //displays default constructor values for BirdSighting2
        System.out.println("\nBird Species: " + bird3.getSpecies2()
                + "\nNumber Spotted: " + bird3.getNumberSeen2()
                + "\nDay of Year: " + bird3.getDayOfYear2());
    }
    
}
