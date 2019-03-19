/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststate;

/**
 *
 * @author Aaron
 */
public class City {
    
    //attributes for individual city name and population
    private String cityName;
    private int cityPopulation;
    
    //constructor that accepts the city name and population
    public City(String cName, int cPop){
        
        cityName = cName;
        cityPopulation = cPop;
    }
    
    //method of display for printing out a city's name and population
   public void display(){
       
       System.out.println("City Name: " + cityName);
       System.out.println("Population: " + cityPopulation + "\n");
   }
   /*
   public String getName(){
   return cName;
   }
   
   public int getPopulation(){
   return cPop;
   }
   
   */
}
