/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcarpet;

/**
 *
 * @author Aaron
 */
public class TestCarpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 10, 2018
        //Java Class Exam - Extra Credit
        
        //three new Carpet objects, each with different quality
        Carpet good = new Carpet(16, 18, "Standard");
        Carpet better = new Carpet(10, 10, "Choice");
        Carpet best = new Carpet(12, 14, "Prime");
        
        //calls display methods for all 3 carpets
        good.display();
        better.display();
        best.display();
    }  
}
