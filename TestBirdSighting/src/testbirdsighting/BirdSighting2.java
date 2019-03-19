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
public class BirdSighting2 {
    
    //variables for bird species, number seen, and the day of the year
    String species;
    int numberSeen;
    int dayOfYear;
    
    //default constructor, calls overloaded method with three values
    public BirdSighting2(){

        this("Blue Jay", 7, 83);
    }
    
    //overloaded method, called above in default
    public BirdSighting2(String bird, int number, int day){
        
        species = bird;
        numberSeen = number;
        dayOfYear = day;
    }
    
    //set method for bird species
    public void setSpecies2(String bird){
        
        species = bird;
    }
    
    //get method for bird species
    public String getSpecies2(){
        
        return species;
    }
    
    //set method for number seen
    public void setNumberSeen2(int number){
        
        numberSeen = number;
    }
    
    //get method for number seen
    public int getNumberSeen2(){
        
        return numberSeen;
    }
    
    //set method for the day of the year
    public void setDayOfYear2(int day){
        
        dayOfYear = day;
    }
    
    //get method for the day of the year
    public int getDayOfYear2(){
        
        return dayOfYear;
    }
}
