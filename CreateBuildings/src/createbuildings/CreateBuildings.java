/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createbuildings;

/**
 *
 * @author Aaron
 */
public class CreateBuildings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aaron Ireland
        //April 27, 2018
        //Exercise 14 - Advanced Inheritance
        
        //three new declared ogjects, a house, a school, and an apartment
        House foursquare = new House(1250.8, 2, 4, 3);
        School jrhigh = new School(4000.50, 3, 24, "Junior High");
        Apartment studio = new Apartment(325.50, 1, 1, 1, 558);
        
        //display methods for each building object
        foursquare.Blueprint();
        jrhigh.Blueprint();
        studio.Blueprint();
    }
}