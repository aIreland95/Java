/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democabinrental;

/**
 *
 * @author Aaron
 */
public class DemoCabinRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 13, 2018
        //Java Inheritance - DemoCabinRental
        
        //four objects created, two are regular cabin rentals, two are holiday rentals
        CabinRental cabin2 = new CabinRental(2);
        CabinRental cabin5 = new CabinRental(5);
        HolidayCabinRental cabin1 = new HolidayCabinRental(1);
        HolidayCabinRental cabin4 = new HolidayCabinRental(4);
        
        //display of company name
        System.out.println("Leeland Lakeside Resort\n");
        
        //four display methods called for CabinRental and HolidayCabinRental
        cabin2.display();
        cabin5.display();
        cabin1.display();
        cabin4.display();
    }
    
}
