/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegelist;

/**
 * 
 * @author Aaron
 */
//Base class
public class Person {
    
    //person attributes; full name, address, and phone number
    protected String firstName;
    protected String lastName;
    protected String address;
    protected double zipCode;
    protected String phoneNum;
    
    //set/get for firstname
    public void setFirstName(String fN){
        this.firstName = fN;
    }
    public String getFirstName(){
        return firstName;
    }
    
    //set/get for lastname
    public void setLastName(String lN){
        this.lastName = lN;
    }
    public String getLastName(){
        return lastName;
    }
    
    //set/get for address
    public void setAddress(String add){
        this.address = add;
    }
    public String getAddress(){
        return address;
    }
    
    //set/get for zipcode
    public void setZipCode(double zip){
        this.zipCode = zip;
    }
    public double getZipCode(){
        return zipCode;
    }
    
    //set/get for phone number
    public void setPhoneNum(String phone){
        this.phoneNum = phone;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
}
