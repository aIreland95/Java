/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsandwich;

/**
 *
 * @author Aaron
 */
//Sandwich class, contains attributes and get/set methods
public class Sandwich {
    
    //sandwich attributes, each using their own get and set methods
    private String mainIng;
    private String cheese;
    private String bread;
    private double price;
    
    //sandwich constructor method
    public Sandwich(){
        mainIng = "";
        cheese = "";
        bread = "";
        price = 0;
    }
    
    //get method for main ingredient
    public String getIngredient(){
        return mainIng;
    }
    
    //set method for main ingredient, using this for referencing
    public void setIngredient(String mainIng){
        this.mainIng = mainIng;
    }
    
    //get method for cheese
    public String getCheese(){
        return cheese;
    }
    
    //set method for cheese, using this for referencing
    public void setCheese(String cheese){
        this.cheese = cheese;
    }
    
    //get method for bread type
    public String getBread(){
        return bread;
    }
    
    //set method for the bread type, also using this
    public void setBread(String bread){
        this.bread = bread;
    }
    
    //get method for sandwich price
    public double getPrice(){
        return price;
    }
    
    //set method for price, also using this
    public void setPrice(double price){
        this.price = price;
    }
} 