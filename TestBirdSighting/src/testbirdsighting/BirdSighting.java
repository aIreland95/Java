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
public class BirdSighting {
    
    //variables for bird species, number seen, and the day of the year
    String species;
    int numberSeen;
    int dayOfYear;
    
    //default constructor, sets values to Robin, 1, and 1
    public BirdSighting(){

    species = "Robin";
    numberSeen = 1;
    dayOfYear = 1;
    }
    
    //overloaded method for passing parameters
    public BirdSighting(String bird, int number, int day){
        
        species = bird;
        numberSeen = number;
        dayOfYear = day;
    }
    
    //set method for bird species
    public void setSpecies(String bird){
        
        species = bird;
    }
    
    //get method for bird species
    public String getSpecies(){
        
        return species;
    }
    
    //set method for the number of birds seen
    public void setNumberSeen(int number){
        
        numberSeen = number;
    }
    
    //get method for the number of birds seen
    public int getNumberSeen(){
        
        return numberSeen;
    }
    
    //set method for the day of the year
    public void setDayOfYear(int day){
        
        dayOfYear = day;
    }
    
    //get method for the day of the year
    public int getDayOfYear(){
        
        return dayOfYear;
    }
}
