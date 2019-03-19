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
//derived class from house
public class Apartment extends House{
    
    //additional attribute for an apartment
    protected int apartmentNum;
    
    //constructor for apartment, calls super with f, s, be, and ba
    public Apartment(double f, int s, int be, int ba, int a){
        
        super(f, s, be, ba);
        apartmentNum = a;
    }
    
    //get method for the apartment number
    public int getApartmentNum(){
        return apartmentNum;
    }
    
    //Blueprint method, displays all information about an apartment
    public void Blueprint(){
        
        System.out.println("Apartment features:\nSquare Footage - " + footage + 
                "\nBedrooms - " + bedrooms + "\nBathrooms - " + bathrooms + 
                "\nApartment Number: " + apartmentNum + "\n");
    }
}
