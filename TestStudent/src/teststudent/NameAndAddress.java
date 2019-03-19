/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststudent;

/**
 *
 * @author Aaron
 */
public class NameAndAddress {
    
    //attributes for the NameAndAddress class
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private int zip;
    
    //constructor for NameAndAddress class
    public NameAndAddress(String fName, String lName, String streetName, 
            String cityName, int zipCode){
        
        firstName = fName;
        lastName = lName;
        street = streetName;
        city = cityName;
        zip = zipCode;
    }
    
    //display method for NameAndAddress, utilizes name info and street info
    public void display(){
        
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Address: " + street + " " + city + " " + zip);
    }
}
