/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createbuilding;

/**
 *
 * @author Aaron
 */
public class House extends building{
    
    protected int bedrooms;
    protected int bathrooms;
    
    //house constructor
    public House(double f, int s, int be, int ba){
        
        super(f, s);
        bedrooms = be;
        bathrooms = ba;
    }
    
    //get methods for house attributes
    public int getBedrooms(){
        return bedrooms;
    }
    public int getBathrooms(){
        return bathrooms;
    }
    
    //Blueprint method, displays all the information about the house
    public void Blueprint(){
        System.out.println("House features:\nSquare Footage - " + footage + 
                "\nStories - " + stories + "\nBedrooms - " + bedrooms + 
                "\nBathrooms - " + bathrooms + "\n");
    }
}
