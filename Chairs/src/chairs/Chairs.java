/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chairs;

/**
 *
 * @author Aaron
 */
public class Chairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new chair objects, one rocking, one office
        OfficeChair fun = new OfficeChair(1, "Plastic with cushioning", 5);
        RockingChair classic = new RockingChair(4, "Mahogany Wood", 2);
        
        //each object calling it's canRoll method
        fun.canRoll();
        classic.canRoll();
    }  
}
